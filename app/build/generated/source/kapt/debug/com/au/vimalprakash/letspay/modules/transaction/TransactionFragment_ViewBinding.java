// Generated code from Butter Knife. Do not modify!
package com.au.vimalprakash.letspay.modules.transaction;

import android.support.annotation.UiThread;
import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import java.lang.IllegalStateException;
import java.lang.Override;

public final class TransactionFragment_ViewBinding implements Unbinder {
  private TransactionFragment target;

  private View view2131165331;

  @UiThread
  public TransactionFragment_ViewBinding(final TransactionFragment target, View source) {
    this.target = target;

    View view;
    view = Utils.findRequiredView(source, 2131165331, "method 'onTryAgain'");
    view2131165331 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onTryAgain();
      }
    });
  }

  @Override
  public void unbind() {
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    target = null;


    view2131165331.setOnClickListener(null);
    view2131165331 = null;
  }
}
