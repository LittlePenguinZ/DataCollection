// Generated code from Butter Knife. Do not modify!
package com.cjy.datacollection.view;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.cjy.datacollection.R;
import com.cjy.datacollection.xlistview.XListView;
import java.lang.IllegalStateException;
import java.lang.Override;

public class QiYeDataRecordListActivity_ViewBinding<T extends QiYeDataRecordListActivity> implements Unbinder {
  protected T target;

  private View view2131427512;

  @UiThread
  public QiYeDataRecordListActivity_ViewBinding(final T target, View source) {
    this.target = target;

    View view;
    view = Utils.findRequiredView(source, R.id.titleBack, "field 'titleBack' and method 'onClick'");
    target.titleBack = Utils.castView(view, R.id.titleBack, "field 'titleBack'", TextView.class);
    view2131427512 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClick();
      }
    });
    target.titleText = Utils.findRequiredViewAsType(source, R.id.titleText, "field 'titleText'", TextView.class);
    target.rigthImg = Utils.findRequiredViewAsType(source, R.id.rigthImg, "field 'rigthImg'", ImageView.class);
    target.rigthText = Utils.findRequiredViewAsType(source, R.id.rigthText, "field 'rigthText'", TextView.class);
    target.titleL = Utils.findRequiredViewAsType(source, R.id.titleL, "field 'titleL'", RelativeLayout.class);
    target.xListView = Utils.findRequiredViewAsType(source, R.id.xListView, "field 'xListView'", XListView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    T target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");

    target.titleBack = null;
    target.titleText = null;
    target.rigthImg = null;
    target.rigthText = null;
    target.titleL = null;
    target.xListView = null;

    view2131427512.setOnClickListener(null);
    view2131427512 = null;

    this.target = null;
  }
}
