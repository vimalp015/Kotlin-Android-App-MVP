// Generated code from Butter Knife. Do not modify!
package com.au.vimalprakash.letspay.modules.transaction.viewholders;

import android.support.annotation.UiThread;
import android.view.View;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import java.lang.IllegalStateException;
import java.lang.Override;

public final class TransactionDetailsViewHolder_ViewBinding implements Unbinder {
  private TransactionDetailsViewHolder target;

  private View view2131165328;

  @UiThread
  public TransactionDetailsViewHolder_ViewBinding(final TransactionDetailsViewHolder target,
      View source) {
    this.target = target;

    View view;
    target.mPendingLabelTextView = Utils.findRequiredViewAsType(source, 2131165276, "field 'mPendingLabelTextView'", TextView.class);
    target.mTransactionDescriptionTextView = Utils.findRequiredViewAsType(source, 2131165327, "field 'mTransactionDescriptionTextView'", TextView.class);
    target.mTransactionValueTextView = Utils.findRequiredViewAsType(source, 2131165330, "field 'mTransactionValueTextView'", TextView.class);
    view = Utils.findRequiredView(source, 2131165328, "method 'onRowClicked'");
    view2131165328 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onRowClicked();
      }
    });
  }

  @Override
  public void unbind() {
    TransactionDetailsViewHolder target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.mPendingLabelTextView = null;
    target.mTransactionDescriptionTextView = null;
    target.mTransactionValueTextView = null;

    view2131165328.setOnClickListener(null);
    view2131165328 = null;
  }
}
