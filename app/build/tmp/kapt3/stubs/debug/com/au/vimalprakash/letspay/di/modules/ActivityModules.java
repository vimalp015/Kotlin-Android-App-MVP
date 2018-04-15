package com.au.vimalprakash.letspay.di.modules;

@kotlin.Metadata(mv = {1, 1, 7}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007J\b\u0010\t\u001a\u00020\nH\u0007\u00a8\u0006\u000b"}, d2 = {"Lcom/au/vimalprakash/letspay/di/modules/ActivityModules;", "", "()V", "getTransactionPresenter", "Lcom/au/vimalprakash/letspay/modules/transaction/TransactionContract$Presenter;", "letsPayApi", "Lcom/au/vimalprakash/letspay/networking/LetsPayApi;", "schedulersProvider", "Lcom/au/vimalprakash/letspay/utils/SchedulersProvider;", "provideMainActivityPresenter", "Lcom/au/vimalprakash/letspay/modules/mainactivity/MainAcivityContract$Presenter;", "app_debug"})
@dagger.Module()
public final class ActivityModules {
    
    @org.jetbrains.annotations.NotNull()
    @com.au.vimalprakash.letspay.di.components.PerActivity()
    @dagger.Provides()
    public final com.au.vimalprakash.letspay.modules.mainactivity.MainAcivityContract.Presenter provideMainActivityPresenter() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @com.au.vimalprakash.letspay.di.components.PerActivity()
    @dagger.Provides()
    public final com.au.vimalprakash.letspay.modules.transaction.TransactionContract.Presenter getTransactionPresenter(@org.jetbrains.annotations.NotNull()
    com.au.vimalprakash.letspay.networking.LetsPayApi letsPayApi, @org.jetbrains.annotations.NotNull()
    com.au.vimalprakash.letspay.utils.SchedulersProvider schedulersProvider) {
        return null;
    }
    
    public ActivityModules() {
        super();
    }
}