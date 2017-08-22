// Generated code from Butter Knife. Do not modify!
package com.cjy.datacollection.adapter;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.cjy.datacollection.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class DataAcq_QT_Adapter$ViewHolder_ViewBinding<T extends DataAcq_QT_Adapter.ViewHolder> implements Unbinder {
  protected T target;

  @UiThread
  public DataAcq_QT_Adapter$ViewHolder_ViewBinding(T target, View source) {
    this.target = target;

    target.ItemImage = Utils.findRequiredViewAsType(source, R.id.ItemImage, "field 'ItemImage'", ImageView.class);
    target.ItemText = Utils.findRequiredViewAsType(source, R.id.ItemText, "field 'ItemText'", TextView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    T target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");

    target.ItemImage = null;
    target.ItemText = null;

    this.target = null;
  }
}
