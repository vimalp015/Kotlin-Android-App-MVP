package com.au.vimalprakash.letspay.modules.transaction.viewholders


import android.support.v7.widget.RecyclerView
import android.view.View
import android.view.View.GONE
import android.view.View.VISIBLE
import com.au.vimalprakash.letspay.R
import com.au.vimalprakash.letspay.modules.transaction.TransactionContract
import kotlinx.android.synthetic.main.item_transaction_details.view.*

/**
 * View holder for our Transaction Details. It displayed both Pending and Completed transactions
 */

class TransactionDetailsViewHolder(itemView: View, private val mClickListener: ClickListener?) : RecyclerView.ViewHolder(itemView), TransactionContract.TransactionDetailsViewHolder {

    interface ClickListener {
        fun onClick(position: Int)
    }

    init {
        itemView.transaction_details_layout.setOnClickListener {
            mClickListener?.onClick(adapterPosition)
        }
    }

    override fun setTransactionDescription(transactionDescription: String) {
        itemView.transaction_description_text_view.text = transactionDescription
    }

    override fun setAvailableFunds(availableFunds: String) {
        itemView.transaction_value_text_view.text = availableFunds
    }

    override fun setPendingLabelVisibility(isVisible: Boolean) {
        itemView.pending_label_text_view.visibility = if (isVisible) VISIBLE else GONE
    }

    override fun setAtmIconVisibility(isVisible: Boolean) {
        itemView.transaction_description_text_view.setCompoundDrawablesWithIntrinsicBounds(if (isVisible) R.drawable.marker_atm else 0, 0, 0, 0)
    }
}
