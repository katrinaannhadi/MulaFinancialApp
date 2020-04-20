package org.isoron.uhabits.widgets;

import android.content.*;
import android.view.*;
import org.isoron.uhabits.activities.common.views.*;
import org.isoron.uhabits.core.models.*;
import org.isoron.uhabits.utils.*;
import org.isoron.uhabits.widgets.views.*;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\b\u0010\t\u001a\u00020\nH\u0014J\b\u0010\u000b\u001a\u00020\u0005H\u0014J\b\u0010\f\u001a\u00020\u0005H\u0014J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0002\u001a\u00020\u0003H\u0016J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\nH\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"}, d2 = {"Lorg/isoron/uhabits/widgets/StreakWidget;", "Lorg/isoron/uhabits/widgets/BaseWidget;", "context", "Landroid/content/Context;", "id", "", "habit", "Lorg/isoron/uhabits/core/models/Habit;", "(Landroid/content/Context;ILorg/isoron/uhabits/core/models/Habit;)V", "buildView", "Landroid/view/View;", "getDefaultHeight", "getDefaultWidth", "getOnClickPendingIntent", "Landroid/app/PendingIntent;", "refreshData", "", "view", "uhabits-android_debug"})
public final class StreakWidget extends org.isoron.uhabits.widgets.BaseWidget {
    private final org.isoron.uhabits.core.models.Habit habit = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public android.app.PendingIntent getOnClickPendingIntent(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return null;
    }
    
    @java.lang.Override()
    public void refreshData(@org.jetbrains.annotations.NotNull()
    android.view.View view) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    protected android.view.View buildView() {
        return null;
    }
    
    @java.lang.Override()
    protected int getDefaultHeight() {
        return 0;
    }
    
    @java.lang.Override()
    protected int getDefaultWidth() {
        return 0;
    }
    
    public StreakWidget(@org.jetbrains.annotations.NotNull()
    android.content.Context context, int id, @org.jetbrains.annotations.NotNull()
    org.isoron.uhabits.core.models.Habit habit) {
        super(null, 0);
    }
}