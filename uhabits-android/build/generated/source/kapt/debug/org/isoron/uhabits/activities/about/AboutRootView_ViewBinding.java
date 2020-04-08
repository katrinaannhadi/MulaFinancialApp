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

  private View view7f0901fb;

  private View view7f0901ef;

  private View view7f0901f3;

  private View view7f0901f7;

  private View view7f0901f9;

  private View view7f0901f1;

  private View view7f0901ed;

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
    view7f0901fb = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClickIcon();
      }
    });
    view = Utils.findRequiredView(source, R.id.tvFeedback, "method 'onClickFeedback'");
    view7f0901ef = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClickFeedback();
      }
    });
    view = Utils.findRequiredView(source, R.id.tvRate, "method 'onClickRate'");
    view7f0901f3 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClickRate();
      }
    });
    view = Utils.findRequiredView(source, R.id.tvSource, "method 'onClickSource'");
    view7f0901f7 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClickSource();
      }
    });
    view = Utils.findRequiredView(source, R.id.tvTranslate, "method 'onClickTranslate'");
    view7f0901f9 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClickTranslate();
      }
    });
    view = Utils.findRequiredView(source, R.id.tvPrivacy, "method 'onClickPrivacy'");
    view7f0901f1 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClickPrivacy();
      }
    });
    view = Utils.findRequiredView(source, R.id.tvContributors, "method 'onClickContributors'");
    view7f0901ed = view;
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

    view7f0901fb.setOnClickListener(null);
    view7f0901fb = null;
    view7f0901ef.setOnClickListener(null);
    view7f0901ef = null;
    view7f0901f3.setOnClickListener(null);
    view7f0901f3 = null;
    view7f0901f7.setOnClickListener(null);
    view7f0901f7 = null;
    view7f0901f9.setOnClickListener(null);
    view7f0901f9 = null;
    view7f0901f1.setOnClickListener(null);
    view7f0901f1 = null;
    view7f0901ed.setOnClickListener(null);
    view7f0901ed = null;
  }
}
