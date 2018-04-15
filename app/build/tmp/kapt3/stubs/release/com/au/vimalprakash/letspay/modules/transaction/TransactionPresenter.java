package com.au.vimalprakash.letspay.modules.transaction;

@kotlin.Metadata(mv = {1, 1, 7}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \'2\u00020\u0001:\u0001\'B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0010\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0016H\u0016J\b\u0010\u001a\u001a\u00020\u0018H\u0016J\b\u0010\u001b\u001a\u00020\u0018H\u0016J\b\u0010\u001c\u001a\u00020\u0018H\u0016J\u0010\u0010\u001d\u001a\u00020\u000b2\u0006\u0010\u001e\u001a\u00020\u000bH\u0016J\u0010\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"H\u0002J\u0018\u0010#\u001a\u00020\u00182\u0006\u0010$\u001a\u00020%2\u0006\u0010\u001e\u001a\u00020\u000bH\u0016J\u0010\u0010&\u001a\u00020\u00182\u0006\u0010\u001e\u001a\u00020\u000bH\u0016R\u0014\u0010\u0007\u001a\u00020\b8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0007\u0010\tR\u0014\u0010\n\u001a\u00020\u000b8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006("}, d2 = {"Lcom/au/vimalprakash/letspay/modules/transaction/TransactionPresenter;", "Lcom/au/vimalprakash/letspay/modules/transaction/TransactionContract$Presenter;", "mLetsPayApi", "Lcom/au/vimalprakash/letspay/networking/LetsPayApi;", "mSchedulersProvider", "Lcom/au/vimalprakash/letspay/utils/SchedulersProvider;", "(Lcom/au/vimalprakash/letspay/networking/LetsPayApi;Lcom/au/vimalprakash/letspay/utils/SchedulersProvider;)V", "isViewAttached", "", "()Z", "itemCount", "", "getItemCount", "()I", "mAtms", "Ljava/util/ArrayList;", "Lcom/au/vimalprakash/letspay/networking/responsemodels/Atm;", "mDisposables", "Lio/reactivex/disposables/CompositeDisposable;", "mTransactionRowModels", "Lcom/au/vimalprakash/letspay/modules/transaction/TransactionRowModel;", "mView", "Lcom/au/vimalprakash/letspay/modules/transaction/TransactionContract$View;", "attachView", "", "view", "clearDisposables", "detachView", "getAccountDetails", "getItemViewType", "position", "getTransactionDurationText", "", "transaction", "Lcom/au/vimalprakash/letspay/networking/responsemodels/Transaction;", "onBindViewHolderAtPosition", "holder", "Lcom/au/vimalprakash/letspay/modules/transaction/TransactionContract$BaseViewHolder;", "showAtmLocation", "Companion", "app_release"})
public final class TransactionPresenter implements com.au.vimalprakash.letspay.modules.transaction.TransactionContract.Presenter {
    private com.au.vimalprakash.letspay.modules.transaction.TransactionContract.View mView;
    private final io.reactivex.disposables.CompositeDisposable mDisposables = null;
    private final java.util.ArrayList<com.au.vimalprakash.letspay.networking.responsemodels.Atm> mAtms = null;
    private final java.util.ArrayList<com.au.vimalprakash.letspay.modules.transaction.TransactionRowModel> mTransactionRowModels = null;
    private final com.au.vimalprakash.letspay.networking.LetsPayApi mLetsPayApi = null;
    private final com.au.vimalprakash.letspay.utils.SchedulersProvider mSchedulersProvider = null;
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
    com.au.vimalprakash.letspay.networking.LetsPayApi mLetsPayApi, @org.jetbrains.annotations.NotNull()
    com.au.vimalprakash.letspay.utils.SchedulersProvider mSchedulersProvider) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 7}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002R\u0014\u0010\u0003\u001a\u00020\u0004X\u0082D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u0004X\u0082D\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u0004X\u0082D\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0006\u00a8\u0006\u0010"}, d2 = {"Lcom/au/vimalprakash/letspay/modules/transaction/TransactionPresenter$Companion;", "", "()V", "DAYS_AGO", "", "getDAYS_AGO", "()Ljava/lang/String;", "ONE_DAY_AGO", "getONE_DAY_AGO", "TODAY", "getTODAY", "getDifferenceDays", "", "d1", "Ljava/util/Date;", "d2", "app_release"})
    public static final class Companion {
        
        private final java.lang.String getTODAY() {
            return null;
        }
        
        private final java.lang.String getONE_DAY_AGO() {
            return null;
        }
        
        private final java.lang.String getDAYS_AGO() {
            return null;
        }
        
        private final long getDifferenceDays(java.util.Date d1, java.util.Date d2) {
            return 0L;
        }
        
        private Companion() {
            super();
        }
    }
}