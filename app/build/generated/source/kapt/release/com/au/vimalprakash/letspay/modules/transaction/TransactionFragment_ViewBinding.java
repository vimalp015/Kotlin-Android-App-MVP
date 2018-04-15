// Generated code from Butter Knife. Do not modify!
package com.au.vimalprakash.letspay.modules.transaction;

import android.support.annotation.UiThread;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.widget.RecyclerView;
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
    target.mSwipeContainer = Utils.findRequiredViewAsType(source, 2131165313, "field 'mSwipeContainer'", SwipeRefreshLayout.class);
    target.mRecyclerView = Utils.findRequiredViewAsType(source, 2131165280, "field 'mRecyclerView'", RecyclerView.class);
    target.mErrorLoadingLayout = Utils.findRequiredView(source, 2131165244, "field 'mErrorLoadingLayout'");
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
    TransactionFragment target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.mSwipeContainer = null;
    target.mRecyclerView = null;
    target.mErrorLoadingLayout = null;

    view2131165331.setOnClickListener(null);
    view2131165331 = null;
  }
}
