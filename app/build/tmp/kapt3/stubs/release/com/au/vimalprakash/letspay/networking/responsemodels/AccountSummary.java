package com.au.vimalprakash.letspay.networking.responsemodels;

@kotlin.Metadata(mv = {1, 1, 7}, bv = {1, 0, 2}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u0006\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fB\u0007\b\u0016\u00a2\u0006\u0002\u0010\u0002B\u000f\b\u0014\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\b\u0010\u0019\u001a\u00020\u001aH\u0016J\u0018\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\u001aH\u0016R \u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR \u0010\f\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\t\"\u0004\b\u000e\u0010\u000bR\"\u0010\u000f\u001a\u0004\u0018\u00010\u00108\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010\u0015\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\"\u0010\u0016\u001a\u0004\u0018\u00010\u00108\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010\u0015\u001a\u0004\b\u0017\u0010\u0012\"\u0004\b\u0018\u0010\u0014\u00a8\u0006 "}, d2 = {"Lcom/au/vimalprakash/letspay/networking/responsemodels/AccountSummary;", "Landroid/os/Parcelable;", "()V", "in", "Landroid/os/Parcel;", "(Landroid/os/Parcel;)V", "accountName", "", "getAccountName", "()Ljava/lang/String;", "setAccountName", "(Ljava/lang/String;)V", "accountNumber", "getAccountNumber", "setAccountNumber", "available", "", "getAvailable", "()Ljava/lang/Double;", "setAvailable", "(Ljava/lang/Double;)V", "Ljava/lang/Double;", "balance", "getBalance", "setBalance", "describeContents", "", "writeToParcel", "", "dest", "flags", "Companion", "app_release"})
public final class AccountSummary implements android.os.Parcelable {
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.Expose()
    @com.google.gson.annotations.SerializedName(value = "accountName")
    private java.lang.String accountName;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.Expose()
    @com.google.gson.annotations.SerializedName(value = "accountNumber")
    private java.lang.String accountNumber;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.Expose()
    @com.google.gson.annotations.SerializedName(value = "available")
    private java.lang.Double available;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.Expose()
    @com.google.gson.annotations.SerializedName(value = "balance")
    private java.lang.Double balance;
    @org.jetbrains.annotations.NotNull()
    private static final android.os.Parcelable.Creator<com.au.vimalprakash.letspay.networking.responsemodels.AccountSummary> CREATOR = null;
    public static final com.au.vimalprakash.letspay.networking.responsemodels.AccountSummary.Companion Companion = null;
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getAccountName() {
        return null;
    }
    
    public final void setAccountName(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getAccountNumber() {
        return null;
    }
    
    public final void setAccountNumber(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double getAvailable() {
        return null;
    }
    
    public final void setAvailable(@org.jetbrains.annotations.Nullable()
    java.lang.Double p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double getBalance() {
        return null;
    }
    
    public final void setBalance(@org.jetbrains.annotations.Nullable()
    java.lang.Double p0) {
    }
    
    @java.lang.Override()
    public void writeToParcel(@org.jetbrains.annotations.NotNull()
    android.os.Parcel dest, int flags) {
    }
    
    @java.lang.Override()
    public int describeContents() {
        return 0;
    }
    
    public AccountSummary() {
        super();
    }
    
    protected AccountSummary(@org.jetbrains.annotations.NotNull()
    android.os.Parcel in) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 7}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\b"}, d2 = {"Lcom/au/vimalprakash/letspay/networking/responsemodels/AccountSummary$Companion;", "", "()V", "CREATOR", "Landroid/os/Parcelable$Creator;", "Lcom/au/vimalprakash/letspay/networking/responsemodels/AccountSummary;", "getCREATOR", "()Landroid/os/Parcelable$Creator;", "app_release"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final android.os.Parcelable.Creator<com.au.vimalprakash.letspay.networking.responsemodels.AccountSummary> getCREATOR() {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}