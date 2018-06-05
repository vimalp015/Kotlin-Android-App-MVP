package com.au.vimalprakash.letspay.modules.transaction;

@kotlin.Metadata(mv = {1, 1, 7}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 &2\u00020\u0001:\u0001&B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0010\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0015\u001a\u00020\u0016H\u0016J\b\u0010\u0019\u001a\u00020\u0018H\u0016J\b\u0010\u001a\u001a\u00020\u0018H\u0016J\b\u0010\u001b\u001a\u00020\u0018H\u0016J\u0010\u0010\u001c\u001a\u00020\u00102\u0006\u0010\u001d\u001a\u00020\u0010H\u0016J\u0010\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!H\u0002J\u0018\u0010\"\u001a\u00020\u00182\u0006\u0010#\u001a\u00020$2\u0006\u0010\u001d\u001a\u00020\u0010H\u0016J\u0010\u0010%\u001a\u00020\u00182\u0006\u0010\u001d\u001a\u00020\u0010H\u0016R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\u00020\r8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\f\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\u00108VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\'"}, d2 = {"Lcom/au/vimalprakash/letspay/modules/transaction/TransactionPresenter;", "Lcom/au/vimalprakash/letspay/modules/transaction/TransactionContract$Presenter;", "letsPayApi", "Lcom/au/vimalprakash/letspay/networking/LetsPayApi;", "schedulersProvider", "Lcom/au/vimalprakash/letspay/utils/SchedulersProvider;", "(Lcom/au/vimalprakash/letspay/networking/LetsPayApi;Lcom/au/vimalprakash/letspay/utils/SchedulersProvider;)V", "atms", "Ljava/util/ArrayList;", "Lcom/au/vimalprakash/letspay/networking/responsemodels/Atm;", "disposables", "Lio/reactivex/disposables/CompositeDisposable;", "isViewAttached", "", "()Z", "itemCount", "", "getItemCount", "()I", "transactionRowModels", "Lcom/au/vimalprakash/letspay/modules/transaction/TransactionRowModel;", "view", "Lcom/au/vimalprakash/letspay/modules/transaction/TransactionContract$View;", "attachView", "", "clearDisposables", "detachView", "getAccountDetails", "getItemViewType", "position", "getTransactionDurationText", "", "transaction", "Lcom/au/vimalprakash/letspay/networking/responsemodels/Transaction;", "onBindViewHolderAtPosition", "holder", "Lcom/au/vimalprakash/letspay/modules/transaction/TransactionContract$BaseViewHolder;", "showAtmLocation", "Companion", "app_debug"})
public final class TransactionPresenter implements com.au.vimalprakash.letspay.modules.transaction.TransactionContract.Presenter {
    private com.au.vimalprakash.letspay.modules.transaction.TransactionContract.View view;
    private final io.reactivex.disposables.CompositeDisposable disposables = null;
    private final java.util.ArrayList<com.au.vimalprakash.letspay.networking.responsemodels.Atm> atms = null;
    private final java.util.ArrayList<com.au.vimalprakash.letspay.modules.transaction.TransactionRowModel> transactionRowModels = null;
    private final com.au.vimalprakash.letspay.networking.LetsPayApi letsPayApi = null;
    private final com.au.vimalprakash.letspay.utils.SchedulersProvider schedulersProvider = null;
    private static final java.lang.String TODAY = "Today";
    private static final java.lang.String ONE_DAY_AGO = "1 day ago";
    private static final java.lang.String DAYS_AGO = "%s days ago";
    public static final com.au.vimalprakash.letspay.modules.transaction.TransactionPresenter.Companion Companion = null;
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @java.lang.Override()
    public void onBindViewHolderAtPosition(@org.jetbrains.annotations.NotNull()
    com.au.vimalprakash.letspay.modules.transaction.TransactionContract.BaseViewHolder holder, int position) {
    }
    
    @java.lang.Override()
    public void getAccountDetails() {
    }
    
    @java.lang.Override()
    public void attachView(@org.jetbrains.annotations.NotNull()
    com.au.vimalprakash.letspay.modules.transaction.TransactionContract.View view) {
    }
    
    @java.lang.Override()
    public void detachView() {
    }
    
    @java.lang.Override()
    public void clearDisposables() {
    }
    
    @java.lang.Override()
    public void showAtmLocation(int position) {
    }
    
    @java.lang.Override()
    public int getItemViewType(int position) {
        return 0;
    }
    
    private final java.lang.String getTransactionDurationText(com.au.vimalprakash.letspay.networking.responsemodels.Transaction transaction) {
        return null;
    }
    
    private final boolean isViewAttached() {
        return false;
    }
    
    public TransactionPresenter(@org.jetbrains.annotations.NotNull()
    com.au.vimalprakash.letspay.networking.LetsPayApi letsPayApi, @org.jetbrains.annotations.NotNull()
    com.au.vimalprakash.letspay.utils.SchedulersProvider schedulersProvider) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 7}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\f"}, d2 = {"Lcom/au/vimalprakash/letspay/modules/transaction/TransactionPresenter$Companion;", "", "()V", "DAYS_AGO", "", "ONE_DAY_AGO", "TODAY", "getDifferenceDays", "", "d1", "Ljava/util/Date;", "d2", "app_debug"})
    public static final class Companion {
        
        private final long getDifferenceDays(java.util.Date d1, java.util.Date d2) {
            return 0L;
        }
        
        private Companion() {
            super();
        }
    }
}