package com.au.vimalprakash.letspay.networking.responsemodels;

@kotlin.Metadata(mv = {1, 1, 7}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001R\u0014\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0007X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\b\u0010\t\u00a8\u0006\n"}, d2 = {"Lcom/au/vimalprakash/letspay/networking/responsemodels/Transaction;", "", "effectiveDate", "Ljava/util/Date;", "getEffectiveDate", "()Ljava/util/Date;", "transactionType", "Lcom/au/vimalprakash/letspay/utils/Helper$TransactionType;", "getTransactionType", "()Lcom/au/vimalprakash/letspay/utils/Helper$TransactionType;", "app_release"})
public abstract interface Transaction {
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.au.vimalprakash.letspay.utils.Helper.TransactionType getTransactionType();
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.util.Date getEffectiveDate();
}