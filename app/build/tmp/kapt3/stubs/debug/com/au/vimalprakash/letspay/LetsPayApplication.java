package com.au.vimalprakash.letspay;

@kotlin.Metadata(mv = {1, 1, 7}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\f\u001a\u00020\rH\u0016R\u0011\u0010\u0003\u001a\u00020\u00048F\u00a2\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\bX\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0010\u0010\u000b\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000f"}, d2 = {"Lcom/au/vimalprakash/letspay/LetsPayApplication;", "Landroid/app/Application;", "()V", "activityComponents", "Lcom/au/vimalprakash/letspay/di/components/ActivityComponents;", "getActivityComponents", "()Lcom/au/vimalprakash/letspay/di/components/ActivityComponents;", "baseURL", "", "getBaseURL", "()Ljava/lang/String;", "mActivityComponents", "onCreate", "", "Companion", "app_debug"})
public final class LetsPayApplication extends android.app.Application {
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String baseURL = "https://raw.githubusercontent.com/vimalp015/";
    private com.au.vimalprakash.letspay.di.components.ActivityComponents mActivityComponents;
    @org.jetbrains.annotations.Nullable()
    private static com.au.vimalprakash.letspay.LetsPayApplication instance;
    public static final com.au.vimalprakash.letspay.LetsPayApplication.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getBaseURL() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.au.vimalprakash.letspay.di.components.ActivityComponents getActivityComponents() {
        return null;
    }
    
    @java.lang.Override()
    public void onCreate() {
    }
    
    public LetsPayApplication() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 7}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R(\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004@BX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t\u00a8\u0006\n"}, d2 = {"Lcom/au/vimalprakash/letspay/LetsPayApplication$Companion;", "", "()V", "<set-?>", "Lcom/au/vimalprakash/letspay/LetsPayApplication;", "instance", "getInstance", "()Lcom/au/vimalprakash/letspay/LetsPayApplication;", "setInstance", "(Lcom/au/vimalprakash/letspay/LetsPayApplication;)V", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.Nullable()
        public final com.au.vimalprakash.letspay.LetsPayApplication getInstance() {
            return null;
        }
        
        private final void setInstance(com.au.vimalprakash.letspay.LetsPayApplication p0) {
        }
        
        private Companion() {
            super();
        }
    }
}