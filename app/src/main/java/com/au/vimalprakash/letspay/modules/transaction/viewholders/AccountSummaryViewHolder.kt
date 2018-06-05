package com.au.vimalprakash.letspay.modules.transaction.viewholders


import android.support.v7.widget.RecyclerView
import android.view.View
import com.au.vimalprakash.letspay.modules.transaction.TransactionContract
import kotlinx.android.synthetic.main.item_account_summary.view.*

/**
 * View holder for our Account Summary that is displayed as the first row in the recycler view
 */

class AccountSummaryViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView), TransactionContract.AccountSummaryViewHolder {

    override fun setAccountName(accountName: String) {
        itemView.account_name_text_view.text = accountName
    }

    override fun setAccountNumber(accountNumber: String) {
        itemView.account_number_text_view.text = accountNumber
    }

    override fun setAvailableFunds(availableFunds: String) {
        itemView.available_funds_value_text_view.text = availableFunds
    }

    override fun setAccountBalance(accountBalance: String) {
        itemView.account_balance_value_text_view.text = accountBalance
    }
}
