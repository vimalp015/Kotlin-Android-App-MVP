package com.au.vimalprakash.letspay.modules.transaction;

@kotlin.Metadata(mv = {1, 1, 7}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u00002\u00020\u0001:\u0001(B\u0017\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006B\u001f\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u000bB\u0017\b\u0016\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u000eB\u0017\b\u0016\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0011R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001c\u0010\f\u001a\u0004\u0018\u00010\rX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u001bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b$\u0010%\"\u0004\b&\u0010\'\u00a8\u0006)"}, d2 = {"Lcom/au/vimalprakash/letspay/modules/transaction/TransactionRowModel;", "", "accountSummary", "Lcom/au/vimalprakash/letspay/networking/responsemodels/AccountSummary;", "viewType", "Lcom/au/vimalprakash/letspay/utils/Helper$TransactionType;", "(Lcom/au/vimalprakash/letspay/networking/responsemodels/AccountSummary;Lcom/au/vimalprakash/letspay/utils/Helper$TransactionType;)V", "transactionDate", "Ljava/util/Date;", "transactionDuration", "", "(Ljava/util/Date;Ljava/lang/String;Lcom/au/vimalprakash/letspay/utils/Helper$TransactionType;)V", "transactionCompleted", "Lcom/au/vimalprakash/letspay/networking/responsemodels/TransactionCompleted;", "(Lcom/au/vimalprakash/letspay/networking/responsemodels/TransactionCompleted;Lcom/au/vimalprakash/letspay/utils/Helper$TransactionType;)V", "transactionPending", "Lcom/au/vimalprakash/letspay/networking/responsemodels/TransactionPending;", "(Lcom/au/vimalprakash/letspay/networking/responsemodels/TransactionPending;Lcom/au/vimalprakash/letspay/utils/Helper$TransactionType;)V", "getAccountSummary", "()Lcom/au/vimalprakash/letspay/networking/responsemodels/AccountSummary;", "setAccountSummary", "(Lcom/au/vimalprakash/letspay/networking/responsemodels/AccountSummary;)V", "getTransactionCompleted", "()Lcom/au/vimalprakash/letspay/networking/responsemodels/TransactionCompleted;", "setTransactionCompleted", "(Lcom/au/vimalprakash/letspay/networking/responsemodels/TransactionCompleted;)V", "transactionHeader", "Lcom/au/vimalprakash/letspay/modules/transaction/TransactionRowModel$TransactionHeader;", "getTransactionHeader", "()Lcom/au/vimalprakash/letspay/modules/transaction/TransactionRowModel$TransactionHeader;", "setTransactionHeader", "(Lcom/au/vimalprakash/letspay/modules/transaction/TransactionRowModel$TransactionHeader;)V", "getTransactionPending", "()Lcom/au/vimalprakash/letspay/networking/responsemodels/TransactionPending;", "setTransactionPending", "(Lcom/au/vimalprakash/letspay/networking/responsemodels/TransactionPending;)V", "getViewType", "()Lcom/au/vimalprakash/letspay/utils/Helper$TransactionType;", "setViewType", "(Lcom/au/vimalprakash/letspay/utils/Helper$TransactionType;)V", "TransactionHeader", "app_release"})
public final class TransactionRowModel {
    @org.jetbrains.annotations.NotNull()
    private com.au.vimalprakash.letspay.utils.Helper.TransactionType viewType;
    @org.jetbrains.annotations.Nullable()
    private com.au.vimalprakash.letspay.networking.responsemodels.AccountSummary accountSummary;
    @org.jetbrains.annotations.Nullable()
    private com.au.vimalprakash.letspay.modules.transaction.TransactionRowModel.TransactionHeader transactionHeader;
    @org.jetbrains.annotations.Nullable()
    private com.au.vimalprakash.letspay.networking.responsemodels.TransactionCompleted transactionCompleted;
    @org.jetbrains.annotations.Nullable()
    private com.au.vimalprakash.letspay.networking.responsemodels.TransactionPending transactionPending;
    
    @org.jetbrains.annotations.NotNull()
    public final com.au.vimalprakash.letspay.utils.Helper.TransactionType getViewType() {
        return null;
    }
    
    public final void setViewType(@org.jetbrains.annotations.NotNull()
    com.au.vimalprakash.letspay.utils.Helper.TransactionType p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.au.vimalprakash.letspay.networking.responsemodels.AccountSummary getAccountSummary() {
        return null;
    }
    
    public final void setAccountSummary(@org.jetbrains.annotations.Nullable()
    com.au.vimalprakash.letspay.networking.responsemodels.AccountSummary p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.au.vimalprakash.letspay.modules.transaction.TransactionRowModel.TransactionHeader getTransactionHeader() {
        return null;
    }
    
    public final void setTransactionHeader(@org.jetbrains.annotations.Nullable()
    com.au.vimalprakash.letspay.modules.transaction.TransactionRowModel.TransactionHeader p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.au.vimalprakash.letspay.networking.responsemodels.TransactionCompleted getTransactionCompleted() {
        return null;
    }
    
    public final void setTransactionCompleted(@org.jetbrains.annotations.Nullable()
    com.au.vimalprakash.letspay.networking.responsemodels.TransactionCompleted p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.au.vimalprakash.letspay.networking.responsemodels.TransactionPending getTransactionPending() {
        return null;
    }
    
    public final void setTransactionPending(@org.jetbrains.annotations.Nullable()
    com.au.vimalprakash.letspay.networking.responsemodels.TransactionPending p0) {
    }
    
    public TransactionRowModel(@org.jetbrains.annotations.NotNull()
    com.au.vimalprakash.letspay.networking.responsemodels.AccountSummary accountSummary, @org.jetbrains.annotations.NotNull()
    com.au.vimalprakash.letspay.utils.Helper.TransactionType viewType) {
        super();
    }
    
    public TransactionRowModel(@org.jetbrains.annotations.NotNull()
    java.util.Date transactionDate, @org.jetbrains.annotations.NotNull()
    java.lang.String transactionDuration, @org.jetbrains.annotations.NotNull()
    com.au.vimalprakash.letspay.utils.Helper.TransactionType viewType) {
        super();
    }
    
    public TransactionRowModel(@org.jetbrains.annotations.NotNull()
    com.au.vimalprakash.letspay.networking.responsemodels.TransactionCompleted transactionCompleted, @org.jetbrains.annotations.NotNull()
    com.au.vimalprakash.letspay.utils.Helper.TransactionType viewType) {
        super();
    }
    
    public TransactionRowModel(@org.jetbrains.annotations.NotNull()
    com.au.vimalprakash.letspay.networking.responsemodels.TransactionPending transactionPending, @org.jetbrains.annotations.NotNull()
    com.au.vimalprakash.letspay.utils.Helper.TransactionType viewType) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 7}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\u000b"}, d2 = {"Lcom/au/vimalprakash/letspay/modules/transaction/TransactionRowModel$TransactionHeader;", "", "transactionDate", "Ljava/util/Date;", "transactionDuration", "", "(Ljava/util/Date;Ljava/lang/String;)V", "getTransactionDate", "()Ljava/util/Date;", "getTransactionDuration", "()Ljava/lang/String;", "app_release"})
    public static final class TransactionHeader {
        @org.jetbrains.annotations.NotNull()
        private final java.util.Date transactionDate = null;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String transactionDuration = null;
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.Date getTransactionDate() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getTransactionDuration() {
            return null;
        }
        
        public TransactionHeader(@org.jetbrains.annotations.NotNull()
        java.util.Date transactionDate, @org.jetbrains.annotations.NotNull()
        java.lang.String transactionDuration) {
            super();
        }
    }
}