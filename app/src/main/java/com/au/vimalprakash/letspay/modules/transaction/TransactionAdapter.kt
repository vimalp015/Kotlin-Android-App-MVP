package com.au.vimalprakash.letspay.modules.transaction


import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import com.au.vimalprakash.letspay.R
import com.au.vimalprakash.letspay.modules.transaction.viewholders.AccountSummaryViewHolder
import com.au.vimalprakash.letspay.modules.transaction.viewholders.TransactionDetailsViewHolder
import com.au.vimalprakash.letspay.modules.transaction.viewholders.TransactionHeaderViewHolder
import com.au.vimalprakash.letspay.utils.Helper.TransactionType.*

class TransactionAdapter(private val mPresenter: TransactionContract.Presenter?) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    private val mClickListener = object : TransactionDetailsViewHolder.ClickListener {
        override fun onClick(position: Int) {
            mPresenter?.showAtmLocation(position)!!
        }
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        when (viewType) {
            ACCOUNT_SUMMARY.value -> {
                val acountSummaryView = LayoutInflater.from(parent.context).inflate(R.layout.item_account_summary, parent, false)
                return AccountSummaryViewHolder(acountSummaryView)
            }

            TRANSACTION_HEADER.value -> {
                val transactionHeaderView = LayoutInflater.from(parent.context).inflate(R.layout.item_transaction_header, parent, false)
                return TransactionHeaderViewHolder(transactionHeaderView)
            }

            COMPLETED_TRANSACTION.value, PENDING_TRANSACTION.value -> {
                val transactionDetailsView = LayoutInflater.from(parent.context).inflate(R.layout.item_transaction_details, parent, false)
                return TransactionDetailsViewHolder(transactionDetailsView, mClickListener)
            }

            else -> throw IllegalArgumentException("Invalid view type received exception")
        }
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        //We want the data to be handled by the presenter using the view holder contract
        //this will also allow us to unit test the data being set to view holder
        mPresenter?.onBindViewHolderAtPosition(holder as TransactionContract.BaseViewHolder, position)
    }

    override fun getItemCount(): Int {
        return mPresenter?.itemCount!!
    }

    override fun getItemViewType(position: Int): Int {
        return mPresenter?.getItemViewType(position)!!
    }
}
