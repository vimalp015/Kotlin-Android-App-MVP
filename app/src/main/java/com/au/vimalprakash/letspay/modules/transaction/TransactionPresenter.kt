package com.au.vimalprakash.letspay.modules.transaction

import com.au.vimalprakash.letspay.modules.transaction.TransactionContract.*
import com.au.vimalprakash.letspay.networking.LetsPayApi
import com.au.vimalprakash.letspay.networking.responsemodels.*
import com.au.vimalprakash.letspay.utils.Helper.TransactionType.*
import com.au.vimalprakash.letspay.utils.Helper.formatDateToDisplay
import com.au.vimalprakash.letspay.utils.Helper.getCurrencyString
import com.au.vimalprakash.letspay.utils.Helper.replaceHtml
import com.au.vimalprakash.letspay.utils.SchedulersProvider
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.observers.DisposableSingleObserver
import java.util.*
import java.util.concurrent.TimeUnit

class TransactionPresenter(private val letsPayApi: LetsPayApi, private val schedulersProvider: SchedulersProvider) : TransactionContract.Presenter {

    private var view: TransactionContract.View? = null

    private val disposables = CompositeDisposable()

    private val atms = ArrayList<Atm>()

    private val transactionRowModels = ArrayList<TransactionRowModel>()

    override val itemCount: Int
        get() = transactionRowModels.size

    /**
     * The presenter sets the view holder and hence we can write Unit Tests for the below logic since it does not depend on Android framework
     */
    override fun onBindViewHolderAtPosition(holder: BaseViewHolder, position: Int) {
        when (getItemViewType(position)) {
            ACCOUNT_SUMMARY.value -> {
                val accountSummaryViewHolder = holder as AccountSummaryViewHolder
                val accountSummary = transactionRowModels[position].accountSummary
                accountSummaryViewHolder.setAccountName(accountSummary?.accountName!!)
                accountSummaryViewHolder.setAccountNumber(accountSummary.accountNumber.toString())
                accountSummaryViewHolder.setAvailableFunds(getCurrencyString(accountSummary.available))
                accountSummaryViewHolder.setAccountBalance(getCurrencyString(accountSummary.balance))
            }

            TRANSACTION_HEADER.value -> {
                val transactionHeaderViewHolder = holder as TransactionHeaderViewHolder
                val transactionHeader = transactionRowModels[position].transactionHeader
                transactionHeaderViewHolder.setTransactionDate(formatDateToDisplay(transactionHeader?.transactionDate!!))
                transactionHeaderViewHolder.setTransactionDuration(transactionHeader.transactionDuration)
            }

            COMPLETED_TRANSACTION.value -> {
                val transactionCompletedDetailsViewHolder = holder as TransactionDetailsViewHolder
                val transactionCompleted = transactionRowModels[position].transactionCompleted
                transactionCompletedDetailsViewHolder.setTransactionDescription(replaceHtml(transactionCompleted?.description!!))
                transactionCompletedDetailsViewHolder.setAvailableFunds(getCurrencyString(transactionCompleted.amount))
                transactionCompletedDetailsViewHolder.setPendingLabelVisibility(false)
                if (transactionCompleted.atmId != null && transactionCompleted.atmId!!.trim { it <= ' ' }.isNotEmpty()) {
                    transactionCompletedDetailsViewHolder.setAtmIconVisibility(true)
                } else {
                    transactionCompletedDetailsViewHolder.setAtmIconVisibility(false)
                }
            }

            PENDING_TRANSACTION.value -> {
                val transactionPendingDetailsViewHolder = holder as TransactionDetailsViewHolder
                val transactionPending = transactionRowModels[position].transactionPending
                transactionPendingDetailsViewHolder.setTransactionDescription(replaceHtml(transactionPending?.description!!))
                transactionPendingDetailsViewHolder.setAvailableFunds(getCurrencyString(transactionPending.amount))
                transactionPendingDetailsViewHolder.setPendingLabelVisibility(true)
            }

            else -> throw IllegalArgumentException("Invalid view type received exception")
        }
    }

    /**
     * This method loads Account Transactions from the Server
     */
    override fun getAccountDetails() {

        if (isViewAttached) {
            view?.showLoading()
        }

        disposables.add(letsPayApi.accountDetails
                .subscribeOn(schedulersProvider.io())
                .observeOn(schedulersProvider.mainUiThread())
                .subscribeWith(object : DisposableSingleObserver<ServerResponse>() {

                    override fun onSuccess(response: ServerResponse) {
                        transactionRowModels.clear()
                        atms.clear()
                        atms.addAll(response.atms!!)
                        val sortedTransaction = ArrayList<Transaction>()

                        if(response.transactionCompleteds != null) {
                            sortedTransaction.addAll(response.transactionCompleteds!!)
                        }
                        if(response.transactionPending != null) {
                            sortedTransaction.addAll(response.transactionPending!!)
                        }

                        //Let us sort the transaction on effective date (pending + completed)
                        sortedTransaction.sortWith(Comparator { feed1, feed2 ->
                            when {
                                feed1.effectiveDate?.after(feed2.effectiveDate)!! -> -1
                                feed1.effectiveDate?.after(feed2.effectiveDate)!! -> 1
                                else -> 0
                            }
                        })

                        //once we have the sorted transaction, we need to populate transactionRowModels that we will use for recycler view
                        for (i in sortedTransaction.indices) {
                            val transaction = sortedTransaction[i]


                            if (i == 0) {
                                transactionRowModels.add(TransactionRowModel(response.account!!, ACCOUNT_SUMMARY))
                                transactionRowModels.add(TransactionRowModel(transaction.effectiveDate!!, getTransactionDurationText(transaction),
                                        TRANSACTION_HEADER))
                            } else if (transaction.effectiveDate!!.compareTo(sortedTransaction[i - 1].effectiveDate) != 0) {
                                transactionRowModels.add(TransactionRowModel(transaction.effectiveDate!!, getTransactionDurationText(transaction),
                                        TRANSACTION_HEADER))
                            }

                            //we need to set the row according to the transaction type. Either completed or pending
                            if (transaction.transactionType == PENDING_TRANSACTION) {
                                transactionRowModels.add(TransactionRowModel(transaction as TransactionPending, PENDING_TRANSACTION))
                            } else {
                                transactionRowModels.add(TransactionRowModel(transaction as TransactionCompleted, COMPLETED_TRANSACTION))
                            }
                        }

                        //update view with the latest transactions
                        if (isViewAttached) {
                            view!!.hideLoading()
                            view!!.updateTransactions()
                            view!!.setCouldNotLoadLayoutVisibility(false)
                        }
                    }

                    override fun onError(e: Throwable) {
                        if (isViewAttached) {
                            view!!.hideLoading()
                            view!!.setCouldNotLoadLayoutVisibility(true)
                        }
                    }
                }))
    }

    override fun attachView(view: TransactionContract.View) {
        this.view = view
        getAccountDetails()
    }

    override fun detachView() {
        view = null
    }

    override fun clearDisposables() {
        disposables.clear()
    }

    override fun showAtmLocation(position: Int) {
        if (isViewAttached && position >= 0 && position < transactionRowModels.size) {
            when (getItemViewType(position)) {
                COMPLETED_TRANSACTION.value -> {
                    val transactionCompleted = transactionRowModels[position].transactionCompleted
                    //if the selection transaction do not have a ATM, then break
                    if (transactionCompleted?.atmId == null) {
                        return
                    }

                    //Get the selected ATM detail and if we could not get the detail of selected ATM, then break
                    var atmToDisplay: Atm? = null
                    for (atm in atms) {
                        if (atm.id == transactionCompleted.atmId) {
                            atmToDisplay = atm
                            break
                        }
                    }
                    if (atmToDisplay == null) {
                        return
                    }

                    val location = atmToDisplay.location
                    view!!.showAtmLocationOnMap(location!!.lat!!.toString(), location.lng!!.toString(), atmToDisplay.name.toString())
                }
            }
        }
    }

    override fun getItemViewType(position: Int): Int {
        return transactionRowModels[position].viewType.value
    }

    private fun getTransactionDurationText(transaction: Transaction): String {
        val duration = getDifferenceDays(transaction.effectiveDate!!, Calendar.getInstance().time)
        val transactionDurationText: String
        if (duration == 0L) {
            transactionDurationText = TODAY
        } else if (duration == 1L) {
            transactionDurationText = ONE_DAY_AGO
        } else {
            transactionDurationText = String.format(DAYS_AGO, duration)
        }
        return transactionDurationText
    }

    private val isViewAttached: Boolean
        get() = view != null

    companion object {

        private const val TODAY = "Today"
        private const val ONE_DAY_AGO = "1 day ago"
        private const val DAYS_AGO = "%s days ago"

        private fun getDifferenceDays(d1: Date, d2: Date): Long {
            val diff = d2.time - d1.time
            return TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS)
        }
    }
}
