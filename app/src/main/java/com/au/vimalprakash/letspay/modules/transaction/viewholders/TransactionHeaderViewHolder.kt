package com.au.vimalprakash.letspay.modules.transaction.viewholders


import android.support.v7.widget.RecyclerView
import android.view.View
import android.widget.TextView
import butterknife.BindView
import butterknife.ButterKnife
import com.au.vimalprakash.letspay.R
import com.au.vimalprakash.letspay.modules.transaction.TransactionContract

/**
 * View holder for our Transaction Header. This will display date and lapse days since the transaction was made.
 * This view is used to group our transactions based on date.
 */

class TransactionHeaderViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView), TransactionContract.TransactionHeaderViewHolder {


    @BindView(R.id.transaction_date_text_view)
    lateinit var mTransactionDateTextView: TextView

    @BindView(R.id.transaction_duration_text_view)
    lateinit var mTransactionDurationTextView: TextView

    init {
        ButterKnife.bind(this, itemView)
    }

    override fun setTransactionDate(transactionDate: String) {
        mTransactionDateTextView.text = transactionDate
    }

    override fun setTransactionDuration(transactionDuration: String) {
        mTransactionDurationTextView.text = transactionDuration
    }

}
