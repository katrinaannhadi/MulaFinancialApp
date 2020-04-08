package org.isoron.uhabits.intents;

import android.app.*;
import android.content.*;
import android.util.*;
import org.isoron.androidbase.*;
import org.isoron.uhabits.*;
import org.isoron.uhabits.core.*;
import org.isoron.uhabits.core.models.*;
import org.isoron.uhabits.core.reminders.*;
import org.isoron.uhabits.core.utils.*;
import java.util.*;
import javax.inject.*;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0018\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\fH\u0016J\u0018\u0010\u000e\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0002J\u0016\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0016J \u0010\u0017\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u0012H\u0016R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0018"}, d2 = {"Lorg/isoron/uhabits/intents/IntentScheduler;", "Lorg/isoron/uhabits/core/reminders/ReminderScheduler$SystemScheduler;", "context", "Landroid/content/Context;", "pendingIntents", "Lorg/isoron/uhabits/intents/PendingIntentFactory;", "(Landroid/content/Context;Lorg/isoron/uhabits/intents/PendingIntentFactory;)V", "manager", "Landroid/app/AlarmManager;", "log", "", "componentName", "", "msg", "logReminderScheduled", "habit", "Lorg/isoron/uhabits/core/models/Habit;", "reminderTime", "", "schedule", "timestamp", "intent", "Landroid/app/PendingIntent;", "scheduleShowReminder", "uhabits-android_debug"})
@org.isoron.uhabits.core.AppScope()
public final class IntentScheduler implements org.isoron.uhabits.core.reminders.ReminderScheduler.SystemScheduler {
    private final android.app.AlarmManager manager = null;
    private final org.isoron.uhabits.intents.PendingIntentFactory pendingIntents = null;
    
    public final void schedule(long timestamp, @org.jetbrains.annotations.NotNull()
    android.app.PendingIntent intent) {
    }
    
    @java.lang.Override()
    public void scheduleShowReminder(long reminderTime, @org.jetbrains.annotations.NotNull()
    org.isoron.uhabits.core.models.Habit habit, long timestamp) {
    }
    
    @java.lang.Override()
    public void log(@org.jetbrains.annotations.NotNull()
    java.lang.String componentName, @org.jetbrains.annotations.NotNull()
    java.lang.String msg) {
    }
    
    private final void logReminderScheduled(org.isoron.uhabits.core.models.Habit habit, long reminderTime) {
    }
    
    @javax.inject.Inject()
    public IntentScheduler(@org.jetbrains.annotations.NotNull()
    @org.isoron.androidbase.AppContext()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    org.isoron.uhabits.intents.PendingIntentFactory pendingIntents) {
        super();
    }
}