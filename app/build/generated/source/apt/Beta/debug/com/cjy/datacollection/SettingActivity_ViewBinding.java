// Generated code from Butter Knife. Do not modify!
package com.cjy.datacollection;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import java.lang.IllegalStateException;
import java.lang.Override;

public class SettingActivity_ViewBinding<T extends SettingActivity> implements Unbinder {
  protected T target;

  private View view2131427512;

  private View view2131427446;

  private View view2131427447;

  @UiThread
  public SettingActivity_ViewBinding(final T target, View source) {
    this.target = target;

    View view;
    view = Utils.findRequiredView(source, R.id.titleBack, "field 'titleBack' and method 'onClick'");
    target.titleBack = Utils.castView(view, R.id.titleBack, "field 'titleBack'", TextView.class);
    view2131427512 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClick(p0);
      }
    });
    target.titleText = Utils.findRequiredViewAsType(source, R.id.titleText, "field 'titleText'", TextView.class);
    target.rigthText = Utils.findRequiredViewAsType(source, R.id.rigthText, "field 'rigthText'", TextView.class);
    view = Utils.findRequiredView(source, R.id.alertBTN, "field 'alertBTN' and method 'onClick'");
    target.alertBTN = Utils.castView(view, R.id.alertBTN, "field 'alertBTN'", RelativeLayout.class);
    view2131427446 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClick(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.tuiChuBTN, "field 'tuiChuBTN' and method 'onClick'");
    target.tuiChuBTN = Utils.castView(view, R.id.tuiChuBTN, "field 'tuiChuBTN'", RelativeLayout.class);
    view2131427447 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClick(p0);
      }
    });
    target.rigthImg = Utils.findRequiredViewAsType(source, R.id.rigthImg, "field 'rigthImg'", ImageView.class);
    target.titleL = Utils.findRequiredViewAsType(source, R.id.titleL, "field 'titleL'", RelativeLayout.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    T target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");

    target.titleBack = null;
    target.titleText = null;
    target.rigthText = null;
    target.alertBTN = null;
    target.tuiChuBTN = null;
    target.rigthImg = null;
    target.titleL = null;

    view2131427512.setOnClickListener(null);
    view2131427512 = null;
    view2131427446.setOnClickListener(null);
    view2131427446 = null;
    view2131427447.setOnClickListener(null);
    view2131427447 = null;

    this.target = null;
  }
}
