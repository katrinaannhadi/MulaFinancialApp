package org.mula.finance.activities.habits.list;

import android.content.*;
import androidx.appcompat.widget.Toolbar;
import android.widget.*;
import org.mula.finance.*;
import org.mula.finance.activities.common.views.*;
import org.mula.finance.activities.habits.list.views.*;
import org.mula.finance.utils.*;
import org.mula.androidbase.activities.ActivityContext;
import org.mula.androidbase.activities.ActivityScope;
import org.mula.androidbase.activities.BaseRootView;
import org.mula.finance.core.models.ModelObservable;
import org.mula.finance.core.preferences.Preferences;
import org.mula.finance.core.tasks.TaskRunner;
import org.mula.finance.core.utils.MidnightTimer;
import javax.inject.*;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 2, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\b\n\u0000\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0002"}, d2 = {"MAX_CHECKMARK_COUNT", "", "uhabits-android_debug"})
public final class ListHabitsRootViewKt {
    public static final int MAX_CHECKMARK_COUNT = 60;
}