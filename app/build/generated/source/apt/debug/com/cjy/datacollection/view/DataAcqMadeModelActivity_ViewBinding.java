// Generated code from Butter Knife. Do not modify!
package com.cjy.datacollection.view;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.cjy.datacollection.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class DataAcqMadeModelActivity_ViewBinding<T extends DataAcqMadeModelActivity> implements Unbinder {
  protected T target;

  private View view2131427512;

  private View view2131427513;

  @UiThread
  public DataAcqMadeModelActivity_ViewBinding(final T target, View source) {
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
    target.rigthImg = Utils.findRequiredViewAsType(source, R.id.rigthImg, "field 'rigthImg'", ImageView.class);
    view = Utils.findRequiredView(source, R.id.rigthText, "field 'rigthText' and method 'onClick'");
    target.rigthText = Utils.castView(view, R.id.rigthText, "field 'rigthText'", TextView.class);
    view2131427513 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClick(p0);
      }
    });
    target.titleL = Utils.findRequiredViewAsType(source, R.id.titleL, "field 'titleL'", RelativeLayout.class);
    target.madeModel = Utils.findRequiredViewAsType(source, R.id.madeModel, "field 'madeModel'", LinearLayout.class);
    target.scv = Utils.findRequiredViewAsType(source, R.id.scv, "field 'scv'", ScrollView.class);
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
    target.madeModel = null;
    target.scv = null;

    view2131427512.setOnClickListener(null);
    view2131427512 = null;
    view2131427513.setOnClickListener(null);
    view2131427513 = null;

    this.target = null;
  }
}
