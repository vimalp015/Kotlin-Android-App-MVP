package com.au.vimalprakash.letspay.modules.transaction.viewholders


import android.support.v7.widget.RecyclerView
import android.view.View
import android.widget.TextView
import butterknife.BindView
import butterknife.ButterKnife
import com.au.vimalprakash.letspay.R
import com.au.vimalprakash.letspay.modules.transaction.TransactionContract

/**
 * View holder for our Account Summary that is displayed as the first row in the recycler view
 */

class AccountSummaryViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView), TransactionContract.AccountSummaryViewHolder {

    @BindView(R.id.account_name_text_view)
    lateinit var mAccountNameTextView: TextView

    @BindView(R.id.account_number_text_view)
    lateinit var mAccountNumberTextView: TextView

    @BindView(R.id.available_funds_value_text_view)
    lateinit var mAvailableFundsTextView: TextView

    @BindView(R.id.account_balance_value_text_view)
    lateinit var mAccountBalanceTextView: TextView

    init {
        ButterKnife.bind(this, itemView)
    }

    override fun setAccountName(accountName: String) {
        mAccountNameTextView.text = accountName
    }

    override fun setAccountNumber(accountNumber: String) {
        mAccountNumberTextView.text = accountNumber
    }

    override fun setAvailableFunds(availableFunds: String) {
        mAvailableFundsTextView.text = availableFunds
    }

    override fun setAccountBalance(accountBalance: String) {
        mAccountBalanceTextView.text = accountBalance
    }
}
