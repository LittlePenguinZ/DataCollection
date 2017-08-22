// Generated code from Butter Knife. Do not modify!
package com.cjy.datacollection;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import java.lang.IllegalStateException;
import java.lang.Override;

public class MainActivity_ViewBinding<T extends MainActivity> implements Unbinder {
  protected T target;

  @UiThread
  public MainActivity_ViewBinding(T target, View source) {
    this.target = target;

    target.username = Utils.findRequiredViewAsType(source, R.id.username, "field 'username'", TextView.class);
    target.titleText = Utils.findRequiredViewAsType(source, R.id.titleText, "field 'titleText'", TextView.class);
    target.rigthImg = Utils.findRequiredViewAsType(source, R.id.rigthImg, "field 'rigthImg'", ImageView.class);
    target.titleL = Utils.findRequiredViewAsType(source, R.id.titleL, "field 'titleL'", RelativeLayout.class);
    target.gridView = Utils.findRequiredViewAsType(source, R.id.gridView, "field 'gridView'", GridView.class);
    target.bannerID1 = Utils.findRequiredViewAsType(source, R.id.bannerID1, "field 'bannerID1'", ImageView.class);
    target.bannerID0 = Utils.findRequiredViewAsType(source, R.id.bannerID0, "field 'bannerID0'", ImageView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    T target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");

    target.username = null;
    target.titleText = null;
    target.rigthImg = null;
    target.titleL = null;
    target.gridView = null;
    target.bannerID1 = null;
    target.bannerID0 = null;

    this.target = null;
  }
}
