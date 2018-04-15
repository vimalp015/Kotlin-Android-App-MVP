// Generated code from Butter Knife. Do not modify!
package com.au.vimalprakash.letspay.modules.transaction.viewholders;

import android.support.annotation.UiThread;
import android.view.View;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import java.lang.IllegalStateException;
import java.lang.Override;

public final class AccountSummaryViewHolder_ViewBinding implements Unbinder {
  private AccountSummaryViewHolder target;

  @UiThread
  public AccountSummaryViewHolder_ViewBinding(AccountSummaryViewHolder target, View source) {
    this.target = target;

    target.mAccountNameTextView = Utils.findRequiredViewAsType(source, 2131165192, "field 'mAccountNameTextView'", TextView.class);
    target.mAccountNumberTextView = Utils.findRequiredViewAsType(source, 2131165193, "field 'mAccountNumberTextView'", TextView.class);
    target.mAvailableFundsTextView = Utils.findRequiredViewAsType(source, 2131165221, "field 'mAvailableFundsTextView'", TextView.class);
    target.mAccountBalanceTextView = Utils.findRequiredViewAsType(source, 2131165191, "field 'mAccountBalanceTextView'", TextView.class);
  }

  @Override
  public void unbind() {
    AccountSummaryViewHolder target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.mAccountNameTextView = null;
    target.mAccountNumberTextView = null;
    target.mAvailableFundsTextView = null;
    target.mAccountBalanceTextView = null;
  }
}
