package com.au.vimalprakash.letspay.networking.responsemodels;

@kotlin.Metadata(mv = {1, 1, 7}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u0000 !2\u00020\u0001:\u0001!B\u0007\b\u0016\u00a2\u0006\u0002\u0010\u0002B\u000f\b\u0014\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\b\u0010\u001b\u001a\u00020\u001cH\u0016J\u0018\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u00042\u0006\u0010 \u001a\u00020\u001cH\u0016R \u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR&\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R&\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\r8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0010\"\u0004\b\u0016\u0010\u0012R&\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\r8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0010\"\u0004\b\u001a\u0010\u0012\u00a8\u0006\""}, d2 = {"Lcom/au/vimalprakash/letspay/networking/responsemodels/ServerResponse;", "Landroid/os/Parcelable;", "()V", "in", "Landroid/os/Parcel;", "(Landroid/os/Parcel;)V", "account", "Lcom/au/vimalprakash/letspay/networking/responsemodels/AccountSummary;", "getAccount", "()Lcom/au/vimalprakash/letspay/networking/responsemodels/AccountSummary;", "setAccount", "(Lcom/au/vimalprakash/letspay/networking/responsemodels/AccountSummary;)V", "atms", "", "Lcom/au/vimalprakash/letspay/networking/responsemodels/Atm;", "getAtms", "()Ljava/util/List;", "setAtms", "(Ljava/util/List;)V", "transactionCompleteds", "Lcom/au/vimalprakash/letspay/networking/responsemodels/TransactionCompleted;", "getTransactionCompleteds", "setTransactionCompleteds", "transactionPending", "Lcom/au/vimalprakash/letspay/networking/responsemodels/TransactionPending;", "getTransactionPending", "setTransactionPending", "describeContents", "", "writeToParcel", "", "dest", "flags", "Companion", "app_release"})
public final class ServerResponse implements android.os.Parcelable {
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.Expose()
    @com.google.gson.annotations.SerializedName(value = "account")
    private com.au.vimalprakash.letspay.networking.responsemodels.AccountSummary account;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.Expose()
    @com.google.gson.annotations.SerializedName(value = "transactions")
    private java.util.List<com.au.vimalprakash.letspay.networking.responsemodels.TransactionCompleted> transactionCompleteds;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.Expose()
    @com.google.gson.annotations.SerializedName(value = "pending")
    private java.util.List<com.au.vimalprakash.letspay.networking.responsemodels.TransactionPending> transactionPending;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.Expose()
    @com.google.gson.annotations.SerializedName(value = "atms")
    private java.util.List<com.au.vimalprakash.letspay.networking.responsemodels.Atm> atms;
    @org.jetbrains.annotations.NotNull()
    private static final android.os.Parcelable.Creator<com.au.vimalprakash.letspay.networking.responsemodels.ServerResponse> CREATOR = null;
    public static final com.au.vimalprakash.letspay.networking.responsemodels.ServerResponse.Companion Companion = null;
    
    @org.jetbrains.annotations.Nullable()
    public final com.au.vimalprakash.letspay.networking.responsemodels.AccountSummary getAccount() {
        return null;
    }
    
    public final void setAccount(@org.jetbrains.annotations.Nullable()
    com.au.vimalprakash.letspay.networking.responsemodels.AccountSummary p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.au.vimalprakash.letspay.networking.responsemodels.TransactionCompleted> getTransactionCompleteds() {
        return null;
    }
    
    public final void setTransactionCompleteds(@org.jetbrains.annotations.Nullable()
    java.util.List<com.au.vimalprakash.letspay.networking.responsemodels.TransactionCompleted> p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.au.vimalprakash.letspay.networking.responsemodels.TransactionPending> getTransactionPending() {
        return null;
    }
    
    public final void setTransactionPending(@org.jetbrains.annotations.Nullable()
    java.util.List<com.au.vimalprakash.letspay.networking.responsemodels.TransactionPending> p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.au.vimalprakash.letspay.networking.responsemodels.Atm> getAtms() {
        return null;
    }
    
    public final void setAtms(@org.jetbrains.annotations.Nullable()
    java.util.List<com.au.vimalprakash.letspay.networking.responsemodels.Atm> p0) {
    }
    
    @java.lang.Override()
    public void writeToParcel(@org.jetbrains.annotations.NotNull()
    android.os.Parcel dest, int flags) {
    }
    
    @java.lang.Override()
    public int describeContents() {
        return 0;
    }
    
    public ServerResponse() {
        super();
    }
    
    protected ServerResponse(@org.jetbrains.annotations.NotNull()
    android.os.Parcel in) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 7}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\b"}, d2 = {"Lcom/au/vimalprakash/letspay/networking/responsemodels/ServerResponse$Companion;", "", "()V", "CREATOR", "Landroid/os/Parcelable$Creator;", "Lcom/au/vimalprakash/letspay/networking/responsemodels/ServerResponse;", "getCREATOR", "()Landroid/os/Parcelable$Creator;", "app_release"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final android.os.Parcelable.Creator<com.au.vimalprakash.letspay.networking.responsemodels.ServerResponse> getCREATOR() {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}