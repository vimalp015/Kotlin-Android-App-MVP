package com.au.vimalprakash.letspay.modules.transaction;

@kotlin.Metadata(mv = {1, 1, 7}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u0000 )2\u00020\u00012\u00020\u0002:\u0001)B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\u000e\u001a\u00020\u000fH\u0016J(\u0010\u0010\u001a\u0004\u0018\u00010\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0016J\b\u0010\u0018\u001a\u00020\u000fH\u0016J\b\u0010\u0019\u001a\u00020\u000fH\u0016J\b\u0010\u001a\u001a\u00020\u000fH\u0016J\b\u0010\u001b\u001a\u00020\u000fH\u0007J\u001c\u0010\u001c\u001a\u00020\u000f2\b\u0010\u001d\u001a\u0004\u0018\u00010\u00112\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0016J\u0010\u0010\u001e\u001a\u00020\u000f2\u0006\u0010\u001f\u001a\u00020 H\u0016J \u0010!\u001a\u00020\u000f2\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020#2\u0006\u0010%\u001a\u00020#H\u0016J\b\u0010&\u001a\u00020\u000fH\u0002J\b\u0010\'\u001a\u00020\u000fH\u0016J\b\u0010(\u001a\u00020\u000fH\u0016R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u0006\u001a\u00020\u00078\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006*"}, d2 = {"Lcom/au/vimalprakash/letspay/modules/transaction/TransactionFragment;", "Landroid/support/v4/app/Fragment;", "Lcom/au/vimalprakash/letspay/modules/transaction/TransactionContract$View;", "()V", "adapter", "Lcom/au/vimalprakash/letspay/modules/transaction/TransactionAdapter;", "presenter", "Lcom/au/vimalprakash/letspay/modules/transaction/TransactionContract$Presenter;", "getPresenter", "()Lcom/au/vimalprakash/letspay/modules/transaction/TransactionContract$Presenter;", "setPresenter", "(Lcom/au/vimalprakash/letspay/modules/transaction/TransactionContract$Presenter;)V", "progress", "Landroid/app/ProgressDialog;", "hideLoading", "", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "onPause", "onResume", "onTryAgain", "onViewCreated", "view", "setCouldNotLoadLayoutVisibility", "showCouldNotLoadLayout", "", "showAtmLocationOnMap", "latitude", "", "longitude", "locationName", "showGoogleMapsNotInstalledToast", "showLoading", "updateTransactions", "Companion", "app_debug"})
public final class TransactionFragment extends android.support.v4.app.Fragment implements com.au.vimalprakash.letspay.modules.transaction.TransactionContract.View {
    private com.au.vimalprakash.letspay.modules.transaction.TransactionAdapter adapter;
    private android.app.ProgressDialog progress;
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public com.au.vimalprakash.letspay.modules.transaction.TransactionContract.Presenter presenter;
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String TAG = "transactions_fragment_tag";
    public static final com.au.vimalprakash.letspay.modules.transaction.TransactionFragment.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final com.au.vimalprakash.letspay.modules.transaction.TransactionContract.Presenter getPresenter() {
        return null;
    }
    
    public final void setPresenter(@org.jetbrains.annotations.NotNull()
    com.au.vimalprakash.letspay.modules.transaction.TransactionContract.Presenter p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.Nullable()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.Nullable()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void onResume() {
    }
    
    @java.lang.Override()
    public void onPause() {
    }
    
    @java.lang.Override()
    public void onDestroy() {
    }
    
    @java.lang.Override()
    public void updateTransactions() {
    }
    
    @java.lang.Override()
    public void showLoading() {
    }
    
    @java.lang.Override()
    public void hideLoading() {
    }
    
    @java.lang.Override()
    public void setCouldNotLoadLayoutVisibility(boolean showCouldNotLoadLayout) {
    }
    
    @java.lang.Override()
    public void showAtmLocationOnMap(@org.jetbrains.annotations.NotNull()
    java.lang.String latitude, @org.jetbrains.annotations.NotNull()
    java.lang.String longitude, @org.jetbrains.annotations.NotNull()
    java.lang.String locationName) {
    }
    
    private final void showGoogleMapsNotInstalledToast() {
    }
    
    @butterknife.OnClick(value = {2131165331})
    public final void onTryAgain() {
    }
    
    public TransactionFragment() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 7}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/au/vimalprakash/letspay/modules/transaction/TransactionFragment$Companion;", "", "()V", "TAG", "", "getTAG", "()Ljava/lang/String;", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getTAG() {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}