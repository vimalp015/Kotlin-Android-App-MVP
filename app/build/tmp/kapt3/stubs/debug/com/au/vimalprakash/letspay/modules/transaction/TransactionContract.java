package com.au.vimalprakash.letspay.modules.transaction;

@kotlin.Metadata(mv = {1, 1, 7}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\bf\u0018\u00002\u00020\u0001:\u0006\u0002\u0003\u0004\u0005\u0006\u0007\u00a8\u0006\b"}, d2 = {"Lcom/au/vimalprakash/letspay/modules/transaction/TransactionContract;", "", "AccountSummaryViewHolder", "BaseViewHolder", "Presenter", "TransactionDetailsViewHolder", "TransactionHeaderViewHolder", "View", "app_debug"})
public abstract interface TransactionContract {
    
    @kotlin.Metadata(mv = {1, 1, 7}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&J \u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH&J\b\u0010\f\u001a\u00020\u0003H&J\b\u0010\r\u001a\u00020\u0003H&\u00a8\u0006\u000e"}, d2 = {"Lcom/au/vimalprakash/letspay/modules/transaction/TransactionContract$View;", "", "hideLoading", "", "setCouldNotLoadLayoutVisibility", "showCouldNotLoadLayout", "", "showAtmLocationOnMap", "latitude", "", "longitude", "locationName", "showLoading", "updateTransactions", "app_debug"})
    public static abstract interface View {
        
        public abstract void updateTransactions();
        
        public abstract void showLoading();
        
        public abstract void hideLoading();
        
        public abstract void setCouldNotLoadLayoutVisibility(boolean showCouldNotLoadLayout);
        
        public abstract void showAtmLocationOnMap(@org.jetbrains.annotations.NotNull()
        java.lang.String latitude, @org.jetbrains.annotations.NotNull()
        java.lang.String longitude, @org.jetbrains.annotations.NotNull()
        java.lang.String locationName);
    }
    
    @kotlin.Metadata(mv = {1, 1, 7}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH&J\b\u0010\n\u001a\u00020\u0007H&J\b\u0010\u000b\u001a\u00020\u0007H&J\b\u0010\f\u001a\u00020\u0007H&J\u0010\u0010\r\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u0003H&J\u0018\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\u0003H&J\u0010\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u0003H&R\u0012\u0010\u0002\u001a\u00020\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005\u00a8\u0006\u0013"}, d2 = {"Lcom/au/vimalprakash/letspay/modules/transaction/TransactionContract$Presenter;", "", "itemCount", "", "getItemCount", "()I", "attachView", "", "view", "Lcom/au/vimalprakash/letspay/modules/transaction/TransactionContract$View;", "clearDisposables", "detachView", "getAccountDetails", "getItemViewType", "position", "onBindViewHolderAtPosition", "holder", "Lcom/au/vimalprakash/letspay/modules/transaction/TransactionContract$BaseViewHolder;", "showAtmLocation", "app_debug"})
    public static abstract interface Presenter {
        
        public abstract int getItemCount();
        
        public abstract void onBindViewHolderAtPosition(@org.jetbrains.annotations.NotNull()
        com.au.vimalprakash.letspay.modules.transaction.TransactionContract.BaseViewHolder holder, int position);
        
        public abstract void getAccountDetails();
        
        public abstract void attachView(@org.jetbrains.annotations.NotNull()
        com.au.vimalprakash.letspay.modules.transaction.TransactionContract.View view);
        
        public abstract void detachView();
        
        public abstract void clearDisposables();
        
        public abstract void showAtmLocation(int position);
        
        public abstract int getItemViewType(int position);
    }
    
    @kotlin.Metadata(mv = {1, 1, 7}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001\u00a8\u0006\u0002"}, d2 = {"Lcom/au/vimalprakash/letspay/modules/transaction/TransactionContract$BaseViewHolder;", "", "app_debug"})
    public static abstract interface BaseViewHolder {
    }
    
    @kotlin.Metadata(mv = {1, 1, 7}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0005H&J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u0005H&J\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u0005H&\u00a8\u0006\f"}, d2 = {"Lcom/au/vimalprakash/letspay/modules/transaction/TransactionContract$AccountSummaryViewHolder;", "Lcom/au/vimalprakash/letspay/modules/transaction/TransactionContract$BaseViewHolder;", "setAccountBalance", "", "accountBalance", "", "setAccountName", "accountName", "setAccountNumber", "accountNumber", "setAvailableFunds", "availableFunds", "app_debug"})
    public static abstract interface AccountSummaryViewHolder extends com.au.vimalprakash.letspay.modules.transaction.TransactionContract.BaseViewHolder {
        
        public abstract void setAccountName(@org.jetbrains.annotations.NotNull()
        java.lang.String accountName);
        
        public abstract void setAccountNumber(@org.jetbrains.annotations.NotNull()
        java.lang.String accountNumber);
        
        public abstract void setAvailableFunds(@org.jetbrains.annotations.NotNull()
        java.lang.String availableFunds);
        
        public abstract void setAccountBalance(@org.jetbrains.annotations.NotNull()
        java.lang.String accountBalance);
    }
    
    @kotlin.Metadata(mv = {1, 1, 7}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH&J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\bH&\u00a8\u0006\f"}, d2 = {"Lcom/au/vimalprakash/letspay/modules/transaction/TransactionContract$TransactionDetailsViewHolder;", "Lcom/au/vimalprakash/letspay/modules/transaction/TransactionContract$BaseViewHolder;", "setAtmIconVisibility", "", "isVisible", "", "setAvailableFunds", "availableFunds", "", "setPendingLabelVisibility", "setTransactionDescription", "transactionDescription", "app_debug"})
    public static abstract interface TransactionDetailsViewHolder extends com.au.vimalprakash.letspay.modules.transaction.TransactionContract.BaseViewHolder {
        
        public abstract void setTransactionDescription(@org.jetbrains.annotations.NotNull()
        java.lang.String transactionDescription);
        
        public abstract void setAvailableFunds(@org.jetbrains.annotations.NotNull()
        java.lang.String availableFunds);
        
        public abstract void setPendingLabelVisibility(boolean isVisible);
        
        public abstract void setAtmIconVisibility(boolean isVisible);
    }
    
    @kotlin.Metadata(mv = {1, 1, 7}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0005H&\u00a8\u0006\b"}, d2 = {"Lcom/au/vimalprakash/letspay/modules/transaction/TransactionContract$TransactionHeaderViewHolder;", "Lcom/au/vimalprakash/letspay/modules/transaction/TransactionContract$BaseViewHolder;", "setTransactionDate", "", "transactionDate", "", "setTransactionDuration", "transactionDuration", "app_debug"})
    public static abstract interface TransactionHeaderViewHolder extends com.au.vimalprakash.letspay.modules.transaction.TransactionContract.BaseViewHolder {
        
        public abstract void setTransactionDate(@org.jetbrains.annotations.NotNull()
        java.lang.String transactionDate);
        
        public abstract void setTransactionDuration(@org.jetbrains.annotations.NotNull()
        java.lang.String transactionDuration);
    }
}