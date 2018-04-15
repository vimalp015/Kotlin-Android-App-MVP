package com.au.vimalprakash.letspay.modules.mainactivity;

@kotlin.Metadata(mv = {1, 1, 7}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u00a8\u0006\u0004"}, d2 = {"Lcom/au/vimalprakash/letspay/modules/mainactivity/MainAcivityContract;", "", "Presenter", "View", "app_release"})
public abstract interface MainAcivityContract {
    
    @kotlin.Metadata(mv = {1, 1, 7}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001\u00a8\u0006\u0002"}, d2 = {"Lcom/au/vimalprakash/letspay/modules/mainactivity/MainAcivityContract$View;", "", "app_release"})
    public static abstract interface View {
    }
    
    @kotlin.Metadata(mv = {1, 1, 7}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0003H&\u00a8\u0006\u0007"}, d2 = {"Lcom/au/vimalprakash/letspay/modules/mainactivity/MainAcivityContract$Presenter;", "", "attachView", "", "view", "Lcom/au/vimalprakash/letspay/modules/mainactivity/MainAcivityContract$View;", "detachView", "app_release"})
    public static abstract interface Presenter {
        
        public abstract void attachView(@org.jetbrains.annotations.NotNull()
        com.au.vimalprakash.letspay.modules.mainactivity.MainAcivityContract.View view);
        
        public abstract void detachView();
    }
}