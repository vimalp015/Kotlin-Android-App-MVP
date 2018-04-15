package com.au.vimalprakash.letspay.modules.transaction.viewholders


import android.support.v7.widget.RecyclerView
import android.view.View
import android.view.View.GONE
import android.view.View.VISIBLE
import android.widget.TextView
import butterknife.BindView
import butterknife.ButterKnife
import butterknife.OnClick
import com.au.vimalprakash.letspay.R
import com.au.vimalprakash.letspay.modules.transaction.TransactionContract

/**
 * View holder for our Transaction Details. It displayed both Pending and Completed transactions
 */

class TransactionDetailsViewHolder(itemView: View, private val mClickListener: ClickListener?) : RecyclerView.ViewHolder(itemView), TransactionContract.TransactionDetailsViewHolder {

    @BindView(R.id.pending_label_text_view)
    lateinit var mPendingLabelTextView: TextView

    @BindView(R.id.transaction_description_text_view)
    lateinit var mTransactionDescriptionTextView: TextView

    @BindView(R.id.transaction_value_text_view)
    lateinit var mTransactionValueTextView: TextView

    interface ClickListener {
        fun onClick(position: Int)
    }

    init {
        ButterKnife.bind(this, itemView)
    }

    override fun setTransactionDescription(transactionDescription: String) {
        mTransactionDescriptionTextView.text = transactionDescription
    }

    override fun setAvailableFunds(availableFunds: String) {
        mTransactionValueTextView.text = availableFunds
    }

    override fun setPendingLabelVisibility(isVisible: Boolean) {
        mPendingLabelTextView.visibility = if (isVisible) VISIBLE else GONE
    }

    override fun setAtmIconVisibility(isVisible: Boolean) {
        mTransactionDescriptionTextView.setCompoundDrawablesWithIntrinsicBounds(if (isVisible) R.drawable.marker_atm else 0, 0, 0, 0)
    }

    @OnClick(R.id.transaction_details_layout)
    fun onRowClicked() {
        mClickListener?.onClick(adapterPosition)
    }
}
