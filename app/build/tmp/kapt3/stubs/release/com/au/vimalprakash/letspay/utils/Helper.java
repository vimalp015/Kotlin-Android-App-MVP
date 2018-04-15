package com.au.vimalprakash.letspay.utils;

@kotlin.Metadata(mv = {1, 1, 7}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0005\b\u00c6\u0002\u0018\u00002\u00020\u0001:\u0001\u0011B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\nJ\u0015\u0010\u000b\u001a\u00020\u00042\b\u0010\f\u001a\u0004\u0018\u00010\r\u00a2\u0006\u0002\u0010\u000eJ\u000e\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u0004R\u0014\u0010\u0003\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"}, d2 = {"Lcom/au/vimalprakash/letspay/utils/Helper;", "", "()V", "DATE_FORMAT_FROM_API", "", "getDATE_FORMAT_FROM_API", "()Ljava/lang/String;", "DATE_FORMAT_TO_DISPLAY", "formatDateToDisplay", "date", "Ljava/util/Date;", "getCurrencyString", "amount", "", "(Ljava/lang/Double;)Ljava/lang/String;", "replaceHtml", "htmlString", "TransactionType", "app_release"})
public final class Helper {
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String DATE_FORMAT_FROM_API = "dd/MM/yyyy";
    private static final java.lang.String DATE_FORMAT_TO_DISPLAY = "dd MMM yyyy";
    public static final com.au.vimalprakash.letspay.utils.Helper INSTANCE = null;
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getDATE_FORMAT_FROM_API() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String formatDateToDisplay(@org.jetbrains.annotations.NotNull()
    java.util.Date date) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String replaceHtml(@org.jetbrains.annotations.NotNull()
    java.lang.String htmlString) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getCurrencyString(@org.jetbrains.annotations.Nullable()
    java.lang.Double amount) {
        return null;
    }
    
    private Helper() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 7}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\b\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n\u00a8\u0006\u000b"}, d2 = {"Lcom/au/vimalprakash/letspay/utils/Helper$TransactionType;", "", "value", "", "(Ljava/lang/String;II)V", "getValue", "()I", "ACCOUNT_SUMMARY", "TRANSACTION_HEADER", "PENDING_TRANSACTION", "COMPLETED_TRANSACTION", "app_release"})
    public static enum TransactionType {
        /*public static final*/ ACCOUNT_SUMMARY /* = new ACCOUNT_SUMMARY(0) */,
        /*public static final*/ TRANSACTION_HEADER /* = new TRANSACTION_HEADER(0) */,
        /*public static final*/ PENDING_TRANSACTION /* = new PENDING_TRANSACTION(0) */,
        /*public static final*/ COMPLETED_TRANSACTION /* = new COMPLETED_TRANSACTION(0) */;
        private final int value = 0;
        
        public final int getValue() {
            return 0;
        }
        
        TransactionType(int value) {
        }
    }
}