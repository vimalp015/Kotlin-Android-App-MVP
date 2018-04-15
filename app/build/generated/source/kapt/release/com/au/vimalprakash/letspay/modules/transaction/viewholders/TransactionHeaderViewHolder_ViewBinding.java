// Generated code from Butter Knife. Do not modify!
package com.au.vimalprakash.letspay.modules.transaction.viewholders;

import android.support.annotation.UiThread;
import android.view.View;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import java.lang.IllegalStateException;
import java.lang.Override;

public final class TransactionHeaderViewHolder_ViewBinding implements Unbinder {
  private TransactionHeaderViewHolder target;

  @UiThread
  public TransactionHeaderViewHolder_ViewBinding(TransactionHeaderViewHolder target, View source) {
    this.target = target;

    target.mTransactionDateTextView = Utils.findRequiredViewAsType(source, 2131165326, "field 'mTransactionDateTextView'", TextView.class);
    target.mTransactionDurationTextView = Utils.findRequiredViewAsType(source, 2131165329, "field 'mTransactionDurationTextView'", TextView.class);
  }

  @Override
  public void unbind() {
    TransactionHeaderViewHolder target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.mTransactionDateTextView = null;
    target.mTransactionDurationTextView = null;
  }
}
