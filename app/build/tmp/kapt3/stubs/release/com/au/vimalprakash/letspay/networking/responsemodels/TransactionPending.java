package com.au.vimalprakash.letspay.networking.responsemodels;

@kotlin.Metadata(mv = {1, 1, 7}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u0000 \'2\u00020\u00012\u00020\u0002:\u0001\'B\u0007\b\u0016\u00a2\u0006\u0002\u0010\u0003B\u000f\b\u0014\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\b\u0010!\u001a\u00020\"H\u0016J\u0018\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020\u00052\u0006\u0010&\u001a\u00020\"H\u0016R\"\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010\r\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR \u0010\u000e\u001a\u0004\u0018\u00010\u000f8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R \u0010\u0014\u001a\u0004\u0018\u00010\u00158\u0016@\u0016X\u0097\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R \u0010\u001a\u001a\u0004\u0018\u00010\u000f8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0011\"\u0004\b\u001c\u0010\u0013R\u0014\u0010\u001d\u001a\u00020\u001e8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u001f\u0010 \u00a8\u0006("}, d2 = {"Lcom/au/vimalprakash/letspay/networking/responsemodels/TransactionPending;", "Landroid/os/Parcelable;", "Lcom/au/vimalprakash/letspay/networking/responsemodels/Transaction;", "()V", "in", "Landroid/os/Parcel;", "(Landroid/os/Parcel;)V", "amount", "", "getAmount", "()Ljava/lang/Double;", "setAmount", "(Ljava/lang/Double;)V", "Ljava/lang/Double;", "description", "", "getDescription", "()Ljava/lang/String;", "setDescription", "(Ljava/lang/String;)V", "effectiveDate", "Ljava/util/Date;", "getEffectiveDate", "()Ljava/util/Date;", "setEffectiveDate", "(Ljava/util/Date;)V", "id", "getId", "setId", "transactionType", "Lcom/au/vimalprakash/letspay/utils/Helper$TransactionType;", "getTransactionType", "()Lcom/au/vimalprakash/letspay/utils/Helper$TransactionType;", "describeContents", "", "writeToParcel", "", "dest", "flags", "Companion", "app_release"})
public final class TransactionPending implements android.os.Parcelable, com.au.vimalprakash.letspay.networking.responsemodels.Transaction {
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.Expose()
    @com.google.gson.annotations.SerializedName(value = "id")
    private java.lang.String id;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.Expose()
    @com.google.gson.annotations.SerializedName(value = "description")
    private java.lang.String description;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.Expose()
    @com.google.gson.annotations.SerializedName(value = "effectiveDate")
    private java.util.Date effectiveDate;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.Expose()
    @com.google.gson.annotations.SerializedName(value = "amount")
    private java.lang.Double amount;
    @org.jetbrains.annotations.NotNull()
    private static final android.os.Parcelable.Creator<com.au.vimalprakash.letspay.networking.responsemodels.TransactionPending> CREATOR = null;
    public static final com.au.vimalprakash.letspay.networking.responsemodels.TransactionPending.Companion Companion = null;
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getId() {
        return null;
    }
    
    public final void setId(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getDescription() {
        return null;
    }
    
    public final void setDescription(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.util.Date getEffectiveDate() {
        return null;
    }
    
    public void setEffectiveDate(@org.jetbrains.annotations.Nullable()
    java.util.Date p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double getAmount() {
        return null;
    }
    
    public final void setAmount(@org.jetbrains.annotations.Nullable()
    java.lang.Double p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.au.vimalprakash.letspay.utils.Helper.TransactionType getTransactionType() {
        return null;
    }
    
    @java.lang.Override()
    public void writeToParcel(@org.jetbrains.annotations.NotNull()
    android.os.Parcel dest, int flags) {
    }
    
    @java.lang.Override()
    public int describeContents() {
        return 0;
    }
    
    public TransactionPending() {
        super();
    }
    
    protected TransactionPending(@org.jetbrains.annotations.NotNull()
    android.os.Parcel in) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 7}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\b"}, d2 = {"Lcom/au/vimalprakash/letspay/networking/responsemodels/TransactionPending$Companion;", "", "()V", "CREATOR", "Landroid/os/Parcelable$Creator;", "Lcom/au/vimalprakash/letspay/networking/responsemodels/TransactionPending;", "getCREATOR", "()Landroid/os/Parcelable$Creator;", "app_release"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final android.os.Parcelable.Creator<com.au.vimalprakash.letspay.networking.responsemodels.TransactionPending> getCREATOR() {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}