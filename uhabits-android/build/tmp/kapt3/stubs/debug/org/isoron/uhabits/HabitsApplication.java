package org.isoron.uhabits;

import android.app.*;
import android.content.*;
import org.isoron.androidbase.*;
import org.isoron.uhabits.core.database.*;
import org.isoron.uhabits.core.reminders.*;
import org.isoron.uhabits.core.ui.*;
import org.isoron.uhabits.utils.*;
import org.isoron.uhabits.widgets.*;
import java.io.*;

/**
 * The Android application for Loop Habit Tracker.
 */
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u000f\u001a\u00020\u0010H\u0016J\b\u0010\u0011\u001a\u00020\u0010H\u0016R\u0011\u0010\u0003\u001a\u00020\u00048F\u00a2\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u000e\u0010\u0007\u001a\u00020\bX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0013"}, d2 = {"Lorg/isoron/uhabits/HabitsApplication;", "Landroid/app/Application;", "()V", "component", "Lorg/isoron/uhabits/HabitsApplicationComponent;", "getComponent", "()Lorg/isoron/uhabits/HabitsApplicationComponent;", "context", "Landroid/content/Context;", "notificationTray", "Lorg/isoron/uhabits/core/ui/NotificationTray;", "reminderScheduler", "Lorg/isoron/uhabits/core/reminders/ReminderScheduler;", "widgetUpdater", "Lorg/isoron/uhabits/widgets/WidgetUpdater;", "onCreate", "", "onTerminate", "Companion", "uhabits-android_debug"})
public final class HabitsApplication extends android.app.Application {
    private android.content.Context context;
    private org.isoron.uhabits.widgets.WidgetUpdater widgetUpdater;
    private org.isoron.uhabits.core.reminders.ReminderScheduler reminderScheduler;
    private org.isoron.uhabits.core.ui.NotificationTray notificationTray;
    @org.jetbrains.annotations.NotNull()
    public static org.isoron.uhabits.HabitsApplicationComponent component;
    public static final org.isoron.uhabits.HabitsApplication.Companion Companion = null;
    
    @java.lang.Override()
    public void onCreate() {
    }
    
    @java.lang.Override()
    public void onTerminate() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.isoron.uhabits.HabitsApplicationComponent getComponent() {
        return null;
    }
    
    public HabitsApplication() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\t\u001a\u00020\nR\u001a\u0010\u0003\u001a\u00020\u0004X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b\u00a8\u0006\u000b"}, d2 = {"Lorg/isoron/uhabits/HabitsApplication$Companion;", "", "()V", "component", "Lorg/isoron/uhabits/HabitsApplicationComponent;", "getComponent", "()Lorg/isoron/uhabits/HabitsApplicationComponent;", "setComponent", "(Lorg/isoron/uhabits/HabitsApplicationComponent;)V", "isTestMode", "", "uhabits-android_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final org.isoron.uhabits.HabitsApplicationComponent getComponent() {
            return null;
        }
        
        public final void setComponent(@org.jetbrains.annotations.NotNull()
        org.isoron.uhabits.HabitsApplicationComponent p0) {
        }
        
        public final boolean isTestMode() {
            return false;
        }
        
        private Companion() {
            super();
        }
    }
}