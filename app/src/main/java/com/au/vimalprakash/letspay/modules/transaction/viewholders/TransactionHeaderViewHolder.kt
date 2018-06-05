package com.au.vimalprakash.letspay.modules.transaction.viewholders


import android.support.v7.widget.RecyclerView
import android.view.View
import com.au.vimalprakash.letspay.modules.transaction.TransactionContract
import kotlinx.android.synthetic.main.item_transaction_header.view.*

/**
 * View holder for our Transaction Header. This will display date and lapse days since the transaction was made.
 * This view is used to group our transactions based on date.
 */

class TransactionHeaderViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView), TransactionContract.TransactionHeaderViewHolder {

    override fun setTransactionDate(transactionDate: String) {
        itemView.transaction_date_text_view.text = transactionDate
    }

    override fun setTransactionDuration(transactionDuration: String) {
        itemView.transaction_duration_text_view.text = transactionDuration
    }

}
