// Generated code from Butter Knife. Do not modify!
package com.cjy.datacollection.adapter;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.cjy.datacollection.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class DataAcqRecordListAdapter$ViewHolder_ViewBinding<T extends DataAcqRecordListAdapter.ViewHolder> implements Unbinder {
  protected T target;

  @UiThread
  public DataAcqRecordListAdapter$ViewHolder_ViewBinding(T target, View source) {
    this.target = target;

    target.catalog = Utils.findRequiredViewAsType(source, R.id.catalog, "field 'catalog'", TextView.class);
    target.linePhoneBook = Utils.findRequiredView(source, R.id.linePhoneBook, "field 'linePhoneBook'");
    target.userImg = Utils.findRequiredViewAsType(source, R.id.userImg, "field 'userImg'", ImageView.class);
    target.progress = Utils.findRequiredViewAsType(source, R.id.progress, "field 'progress'", ProgressBar.class);
    target.fl = Utils.findRequiredViewAsType(source, R.id.fl, "field 'fl'", FrameLayout.class);
    target.unameText = Utils.findRequiredViewAsType(source, R.id.unameText, "field 'unameText'", TextView.class);
    target.timeText = Utils.findRequiredViewAsType(source, R.id.timeText, "field 'timeText'", TextView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    T target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");

    target.catalog = null;
    target.linePhoneBook = null;
    target.userImg = null;
    target.progress = null;
    target.fl = null;
    target.unameText = null;
    target.timeText = null;

    this.target = null;
  }
}
