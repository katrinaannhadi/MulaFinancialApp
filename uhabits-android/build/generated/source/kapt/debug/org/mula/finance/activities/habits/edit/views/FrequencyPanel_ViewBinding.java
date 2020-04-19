// Generated code from Butter Knife. Do not modify!
package org.mula.finance.activities.habits.edit.views;

import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Spinner;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import java.lang.IllegalStateException;
import java.lang.Override;
import org.mula.finance.R;

public class FrequencyPanel_ViewBinding implements Unbinder {
  private FrequencyPanel target;

  private View view7f09018c;

  @UiThread
  public FrequencyPanel_ViewBinding(FrequencyPanel target) {
    this(target, target);
  }

  @UiThread
  public FrequencyPanel_ViewBinding(final FrequencyPanel target, View source) {
    this.target = target;

    View view;
    target.tvNumerator = Utils.findRequiredViewAsType(source, R.id.numerator, "field 'tvNumerator'", TextView.class);
    target.tvDenominator = Utils.findRequiredViewAsType(source, R.id.denominator, "field 'tvDenominator'", TextView.class);
    view = Utils.findRequiredView(source, R.id.spinner, "field 'spinner' and method 'onFrequencySelected'");
    target.spinner = Utils.castView(view, R.id.spinner, "field 'spinner'", Spinner.class);
    view7f09018c = view;
    ((AdapterView<?>) view).setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
      @Override
      public void onItemSelected(AdapterView<?> p0, View p1, int p2, long p3) {
        target.onFrequencySelected(p2);
      }

      @Override
      public void onNothingSelected(AdapterView<?> p0) {
      }
    });
    target.customFreqPanel = Utils.findRequiredViewAsType(source, R.id.customFreqPanel, "field 'customFreqPanel'", ViewGroup.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    FrequencyPanel target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.tvNumerator = null;
    target.tvDenominator = null;
    target.spinner = null;
    target.customFreqPanel = null;

    ((AdapterView<?>) view7f09018c).setOnItemSelectedListener(null);
    view7f09018c = null;
  }
}
