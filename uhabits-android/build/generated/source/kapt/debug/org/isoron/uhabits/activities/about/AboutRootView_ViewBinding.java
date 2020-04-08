// Generated code from Butter Knife. Do not modify!
package org.isoron.uhabits.activities.about;

import android.view.View;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import java.lang.IllegalStateException;
import java.lang.Override;
import org.isoron.uhabits.R;

public class AboutRootView_ViewBinding implements Unbinder {
  private AboutRootView target;

  private View view7f0901be;

  private View view7f0901b2;

  private View view7f0901b6;

  private View view7f0901ba;

  private View view7f0901bc;

  private View view7f0901b4;

  private View view7f0901b0;

  @UiThread
  public AboutRootView_ViewBinding(AboutRootView target) {
    this(target, target);
  }

  @UiThread
  public AboutRootView_ViewBinding(final AboutRootView target, View source) {
    this.target = target;

    View view;
    view = Utils.findRequiredView(source, R.id.tvVersion, "field 'tvVersion' and method 'onClickIcon'");
    target.tvVersion = Utils.castView(view, R.id.tvVersion, "field 'tvVersion'", TextView.class);
    view7f0901be = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClickIcon();
      }
    });
    view = Utils.findRequiredView(source, R.id.tvFeedback, "method 'onClickFeedback'");
    view7f0901b2 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClickFeedback();
      }
    });
    view = Utils.findRequiredView(source, R.id.tvRate, "method 'onClickRate'");
    view7f0901b6 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClickRate();
      }
    });
    view = Utils.findRequiredView(source, R.id.tvSource, "method 'onClickSource'");
    view7f0901ba = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClickSource();
      }
    });
    view = Utils.findRequiredView(source, R.id.tvTranslate, "method 'onClickTranslate'");
    view7f0901bc = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClickTranslate();
      }
    });
    view = Utils.findRequiredView(source, R.id.tvPrivacy, "method 'onClickPrivacy'");
    view7f0901b4 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClickPrivacy();
      }
    });
    view = Utils.findRequiredView(source, R.id.tvContributors, "method 'onClickContributors'");
    view7f0901b0 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClickContributors();
      }
    });
  }

  @Override
  @CallSuper
  public void unbind() {
    AboutRootView target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.tvVersion = null;

    view7f0901be.setOnClickListener(null);
    view7f0901be = null;
    view7f0901b2.setOnClickListener(null);
    view7f0901b2 = null;
    view7f0901b6.setOnClickListener(null);
    view7f0901b6 = null;
    view7f0901ba.setOnClickListener(null);
    view7f0901ba = null;
    view7f0901bc.setOnClickListener(null);
    view7f0901bc = null;
    view7f0901b4.setOnClickListener(null);
    view7f0901b4 = null;
    view7f0901b0.setOnClickListener(null);
    view7f0901b0 = null;
  }
}
