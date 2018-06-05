package com.au.vimalprakash.letspay.modules.transaction.viewholders;

@kotlin.Metadata(mv = {1, 1, 7}, bv = {1, 0, 2}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0012B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\u0002\u0010\u0007J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0010\u0010\f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u0010\u0010\u000f\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0010\u0010\u0010\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u000eH\u0016R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0013"}, d2 = {"Lcom/au/vimalprakash/letspay/modules/transaction/viewholders/TransactionDetailsViewHolder;", "Landroid/support/v7/widget/RecyclerView$ViewHolder;", "Lcom/au/vimalprakash/letspay/modules/transaction/TransactionContract$TransactionDetailsViewHolder;", "itemView", "Landroid/view/View;", "mClickListener", "Lcom/au/vimalprakash/letspay/modules/transaction/viewholders/TransactionDetailsViewHolder$ClickListener;", "(Landroid/view/View;Lcom/au/vimalprakash/letspay/modules/transaction/viewholders/TransactionDetailsViewHolder$ClickListener;)V", "setAtmIconVisibility", "", "isVisible", "", "setAvailableFunds", "availableFunds", "", "setPendingLabelVisibility", "setTransactionDescription", "transactionDescription", "ClickListener", "app_debug"})
public final class TransactionDetailsViewHolder extends android.support.v7.widget.RecyclerView.ViewHolder implements com.au.vimalprakash.letspay.modules.transaction.TransactionContract.TransactionDetailsViewHolder {
    private final com.au.vimalprakash.letspay.modules.transaction.viewholders.TransactionDetailsViewHolder.ClickListener mClickListener = null;
    
    @java.lang.Override()
    public void setTransactionDescription(@org.jetbrains.annotations.NotNull()
    java.lang.String transactionDescription) {
    }
    
    @java.lang.Override()
    public void setAvailableFunds(@org.jetbrains.annotations.NotNull()
    java.lang.String availableFunds) {
    }
    
    @java.lang.Override()
    public void setPendingLabelVisibility(boolean isVisible) {
    }
    
    @java.lang.Override()
    public void setAtmIconVisibility(boolean isVisible) {
    }
    
    public TransactionDetailsViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.View itemView, @org.jetbrains.annotations.Nullable()
    com.au.vimalprakash.letspay.modules.transaction.viewholders.TransactionDetailsViewHolder.ClickListener mClickListener) {
        super(null);
    }
    
    @kotlin.Metadata(mv = {1, 1, 7}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lcom/au/vimalprakash/letspay/modules/transaction/viewholders/TransactionDetailsViewHolder$ClickListener;", "", "onClick", "", "position", "", "app_debug"})
    public static abstract interface ClickListener {
        
        public abstract void onClick(int position);
    }
}