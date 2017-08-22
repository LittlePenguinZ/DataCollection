// Generated code from Butter Knife. Do not modify!
package com.cjy.datacollection;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import java.lang.IllegalStateException;
import java.lang.Override;

public class LoginActivity_ViewBinding<T extends LoginActivity> implements Unbinder {
  protected T target;

  private View view2131427434;

  private View view2131427435;

  private View view2131427436;

  @UiThread
  public LoginActivity_ViewBinding(final T target, View source) {
    this.target = target;

    View view;
    target.userName = Utils.findRequiredViewAsType(source, R.id.userName, "field 'userName'", EditText.class);
    target.password = Utils.findRequiredViewAsType(source, R.id.password, "field 'password'", EditText.class);
    view = Utils.findRequiredView(source, R.id.checkBox, "field 'checkBox' and method 'onClick'");
    target.checkBox = Utils.castView(view, R.id.checkBox, "field 'checkBox'", CheckBox.class);
    view2131427434 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClick(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.dengLuBox, "field 'dengLuBox' and method 'onClick'");
    target.dengLuBox = Utils.castView(view, R.id.dengLuBox, "field 'dengLuBox'", CheckBox.class);
    view2131427435 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClick(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.loginBTN, "field 'loginBTN' and method 'onClick'");
    target.loginBTN = Utils.castView(view, R.id.loginBTN, "field 'loginBTN'", Button.class);
    view2131427436 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClick(p0);
      }
    });
  }

  @Override
  @CallSuper
  public void unbind() {
    T target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");

    target.userName = null;
    target.password = null;
    target.checkBox = null;
    target.dengLuBox = null;
    target.loginBTN = null;

    view2131427434.setOnClickListener(null);
    view2131427434 = null;
    view2131427435.setOnClickListener(null);
    view2131427435 = null;
    view2131427436.setOnClickListener(null);
    view2131427436 = null;

    this.target = null;
  }
}
