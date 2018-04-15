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

class TransactionPresenter(private val mLetsPayApi: LetsPayApi, private val mSchedulersProvider: SchedulersProvider) : TransactionContract.Presenter {

    private var mView: TransactionContract.View? = null

    private val mDisposables = CompositeDisposable()

    private val mAtms = ArrayList<Atm>()

    private val mTransactionRowModels = ArrayList<TransactionRowModel>()

    override val itemCount: Int
        get() = mTransactionRowModels.size

    /**
     * The presenter sets the view holder and hence we can write Unit Tests for the below logic since it does not depend on Android framework
     */
    override fun onBindViewHolderAtPosition(holder: BaseViewHolder, position: Int) {
        when (getItemViewType(position)) {
            ACCOUNT_SUMMARY.value -> {
                val accountSummaryViewHolder = holder as AccountSummaryViewHolder
                val accountSummary = mTransactionRowModels[position].accountSummary
                accountSummaryViewHolder.setAccountName(accountSummary?.accountName!!)
                accountSummaryViewHolder.setAccountNumber(accountSummary.accountNumber.toString())
                accountSummaryViewHolder.setAvailableFunds(getCurrencyString(accountSummary.available))
                accountSummaryViewHolder.setAccountBalance(getCurrencyString(accountSummary.balance))
            }

            TRANSACTION_HEADER.value -> {
                val transactionHeaderViewHolder = holder as TransactionHeaderViewHolder
                val transactionHeader = mTransactionRowModels[position].transactionHeader
                transactionHeaderViewHolder.setTransactionDate(formatDateToDisplay(transactionHeader?.transactionDate!!))
                transactionHeaderViewHolder.setTransactionDuration(transactionHeader.transactionDuration)
            }

            COMPLETED_TRANSACTION.value -> {
                val transactionCompletedDetailsViewHolder = holder as TransactionDetailsViewHolder
                val transactionCompleted = mTransactionRowModels[position].transactionCompleted
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
                val transactionPending = mTransactionRowModels[position].transactionPending
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
            mView!!.showLoading()
        }

        mDisposables.add(mLetsPayApi.accountDetails
                .subscribeOn(mSchedulersProvider.io())
                .observeOn(mSchedulersProvider.mainUiThread())
                .subscribeWith(object : DisposableSingleObserver<ServerResponse>() {

                    override fun onSuccess(response: ServerResponse) {
                        mTransactionRowModels.clear()
                        mAtms.clear()
                        mAtms.addAll(response.atms!!)
                        val mSortedTransaction = ArrayList<Transaction>()

                        if(response.transactionCompleteds != null) {
                            mSortedTransaction.addAll(response.transactionCompleteds!!)
                        }
                        if(response.transactionPending != null) {
                            mSortedTransaction.addAll(response.transactionPending!!)
                        }

                        //Let us sort the transaction on effective date (pending + completed)
                        Collections.sort(mSortedTransaction) { feed1, feed2 ->
                            if (feed1.effectiveDate?.after(feed2.effectiveDate)!!) {
                                -1
                            } else if (feed1.effectiveDate?.after(feed2.effectiveDate)!!) {
                                1
                            } else {
                                0
                            }
                        }

                        //once we have the sorted transaction, we need to populate mTransactionRowModels that we will use for recycler view
                        for (i in mSortedTransaction.indices) {
                            val transaction = mSortedTransaction[i]


                            if (i == 0) {
                                mTransactionRowModels.add(TransactionRowModel(response.account!!, ACCOUNT_SUMMARY))
                                mTransactionRowModels.add(TransactionRowModel(transaction.effectiveDate!!, getTransactionDurationText(transaction),
                                        TRANSACTION_HEADER))
                            } else if (transaction.effectiveDate!!.compareTo(mSortedTransaction[i - 1].effectiveDate) != 0) {
                                mTransactionRowModels.add(TransactionRowModel(transaction.effectiveDate!!, getTransactionDurationText(transaction),
                                        TRANSACTION_HEADER))
                            }

                            //we need to set the row according to the transaction type. Either completed or pending
                            if (transaction.transactionType == PENDING_TRANSACTION) {
                                mTransactionRowModels.add(TransactionRowModel(transaction as TransactionPending, PENDING_TRANSACTION))
                            } else {
                                mTransactionRowModels.add(TransactionRowModel(transaction as TransactionCompleted, COMPLETED_TRANSACTION))
                            }
                        }

                        //update view with the latest transactions
                        if (isViewAttached) {
                            mView!!.hideLoading()
                            mView!!.updateTransactions()
                            mView!!.setCouldNotLoadLayoutVisibility(false)
                        }
                    }

                    override fun onError(e: Throwable) {
                        if (isViewAttached) {
                            mView!!.hideLoading()
                            mView!!.setCouldNotLoadLayoutVisibility(true)
                        }
                    }
                }))
    }

    override fun attachView(view: TransactionContract.View) {
        mView = view
        getAccountDetails()
    }

    override fun detachView() {
        mView = null
    }

    override fun clearDisposables() {
        mDisposables.clear()
    }

    override fun showAtmLocation(position: Int) {
        if (isViewAttached && position >= 0 && position < mTransactionRowModels.size) {
            when (getItemViewType(position)) {
                COMPLETED_TRANSACTION.value -> {
                    val transactionCompleted = mTransactionRowModels[position].transactionCompleted
                    //if the selection transaction do not have a ATM, then break
                    if (transactionCompleted?.atmId == null) {
                        return
                    }

                    //Get the selected ATM detail and if we could not get the detail of selected ATM, then break
                    var atmToDisplay: Atm? = null
                    for (atm in mAtms) {
                        if (atm.id == transactionCompleted.atmId) {
                            atmToDisplay = atm
                            break
                        }
                    }
                    if (atmToDisplay == null) {
                        return
                    }

                    val location = atmToDisplay.location
                    mView!!.showAtmLocationOnMap(location!!.lat!!.toString(), location.lng!!.toString(), atmToDisplay.name.toString())
                }
            }
        }
    }

    override fun getItemViewType(position: Int): Int {
        return mTransactionRowModels[position].viewType.value
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
        get() = mView != null

    companion object {

        private val TODAY = "Today"
        private val ONE_DAY_AGO = "1 day ago"
        private val DAYS_AGO = "%s days ago"

        private fun getDifferenceDays(d1: Date, d2: Date): Long {
            val diff = d2.time - d1.time
            return TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS)
        }
    }
}
