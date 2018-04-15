package com.au.vimalprakash.letspay.utils;

@kotlin.Metadata(mv = {1, 1, 7}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\u0006\u001a\u00020\u0004H\u0016J\b\u0010\u0007\u001a\u00020\u0004H\u0016\u00a8\u0006\b"}, d2 = {"Lcom/au/vimalprakash/letspay/utils/AndroidSchedulersProvider;", "Lcom/au/vimalprakash/letspay/utils/SchedulersProvider;", "()V", "computation", "Lio/reactivex/Scheduler;", "immediate", "io", "mainUiThread", "app_release"})
public final class AndroidSchedulersProvider implements com.au.vimalprakash.letspay.utils.SchedulersProvider {
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.reactivex.Scheduler mainUiThread() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.reactivex.Scheduler io() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.reactivex.Scheduler computation() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.reactivex.Scheduler immediate() {
        return null;
    }
    
    public AndroidSchedulersProvider() {
        super();
    }
}