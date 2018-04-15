package com.au.vimalprakash.letspay.utils;

@kotlin.Metadata(mv = {1, 1, 7}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&J\b\u0010\u0005\u001a\u00020\u0003H&J\b\u0010\u0006\u001a\u00020\u0003H&\u00a8\u0006\u0007"}, d2 = {"Lcom/au/vimalprakash/letspay/utils/SchedulersProvider;", "", "computation", "Lio/reactivex/Scheduler;", "immediate", "io", "mainUiThread", "app_release"})
public abstract interface SchedulersProvider {
    
    @org.jetbrains.annotations.NotNull()
    public abstract io.reactivex.Scheduler mainUiThread();
    
    @org.jetbrains.annotations.NotNull()
    public abstract io.reactivex.Scheduler io();
    
    @org.jetbrains.annotations.NotNull()
    public abstract io.reactivex.Scheduler computation();
    
    @org.jetbrains.annotations.NotNull()
    public abstract io.reactivex.Scheduler immediate();
}