package com.au.vimalprakash.letspay.di.components;

@kotlin.Metadata(mv = {1, 1, 7}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0007H&\u00a8\u0006\b"}, d2 = {"Lcom/au/vimalprakash/letspay/di/components/ActivityComponents;", "", "inject", "", "activity", "Lcom/au/vimalprakash/letspay/modules/mainactivity/MainActivity;", "fragment", "Lcom/au/vimalprakash/letspay/modules/transaction/TransactionFragment;", "app_release"})
@dagger.Component(dependencies = {com.au.vimalprakash.letspay.di.components.SupportComponents.class}, modules = {com.au.vimalprakash.letspay.di.modules.ActivityModules.class})
@PerActivity()
public abstract interface ActivityComponents {
    
    public abstract void inject(@org.jetbrains.annotations.NotNull()
    com.au.vimalprakash.letspay.modules.mainactivity.MainActivity activity);
    
    public abstract void inject(@org.jetbrains.annotations.NotNull()
    com.au.vimalprakash.letspay.modules.transaction.TransactionFragment fragment);
}