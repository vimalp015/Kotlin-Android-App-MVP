package com.au.vimalprakash.letspay.di.components;

@kotlin.Metadata(mv = {1, 1, 7}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001R\u0012\u0010\u0002\u001a\u00020\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0007X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0012\u0010\n\u001a\u00020\u000bX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\f\u0010\r\u00a8\u0006\u000e"}, d2 = {"Lcom/au/vimalprakash/letspay/di/components/SupportComponents;", "", "accountDetailsApi", "Lcom/au/vimalprakash/letspay/networking/LetsPayApi;", "getAccountDetailsApi", "()Lcom/au/vimalprakash/letspay/networking/LetsPayApi;", "gson", "Lcom/google/gson/Gson;", "getGson", "()Lcom/google/gson/Gson;", "schedulersProvider", "Lcom/au/vimalprakash/letspay/utils/SchedulersProvider;", "getSchedulersProvider", "()Lcom/au/vimalprakash/letspay/utils/SchedulersProvider;", "app_release"})
@dagger.Component(modules = {com.au.vimalprakash.letspay.di.modules.SupportModules.class})
@javax.inject.Singleton()
public abstract interface SupportComponents {
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.au.vimalprakash.letspay.networking.LetsPayApi getAccountDetailsApi();
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.google.gson.Gson getGson();
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.au.vimalprakash.letspay.utils.SchedulersProvider getSchedulersProvider();
}