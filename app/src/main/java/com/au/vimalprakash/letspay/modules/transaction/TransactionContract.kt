package com.au.vimalprakash.letspay.modules.transaction

/**
 * We are using MVP and hence we need to define contract that views and presenters adhere to
 * We have also defined contract for our view holders
 */

interface TransactionContract {

    interface View {

        fun updateTransactions()

        fun showLoading()

        fun hideLoading()

        fun setCouldNotLoadLayoutVisibility(showCouldNotLoadLayout: Boolean)

        fun showAtmLocationOnMap(latitude: String, longitude: String, locationName: String)
    }

    interface Presenter {

        val itemCount: Int

        fun onBindViewHolderAtPosition(holder: BaseViewHolder, position: Int)

        fun getAccountDetails()

        fun attachView(view: View)

        fun detachView()

        fun clearDisposables()

        fun showAtmLocation(position: Int)

        fun getItemViewType(position: Int): Int
    }

    //We need a base view holder to use in our RecyclerView Adapter. This will allow us to display different views in the same RecyclerView.
    interface BaseViewHolder

    interface AccountSummaryViewHolder : BaseViewHolder {

        fun setAccountName(accountName: String)

        fun setAccountNumber(accountNumber: String)

        fun setAvailableFunds(availableFunds: String)

        fun setAccountBalance(accountBalance: String)
    }

    interface TransactionDetailsViewHolder : BaseViewHolder {

        fun setTransactionDescription(transactionDescription: String)

        fun setAvailableFunds(availableFunds: String)

        fun setPendingLabelVisibility(isVisible: Boolean)

        fun setAtmIconVisibility(isVisible: Boolean)
    }

    interface TransactionHeaderViewHolder : BaseViewHolder {

        fun setTransactionDate(transactionDate: String)

        fun setTransactionDuration(transactionDuration: String)
    }
}
