package org.isoron.uhabits.notifications;

import android.app.*;
import android.content.*;
import android.graphics.*;
import android.os.*;
import androidx.core.app.*;
import android.util.*;
import org.isoron.androidbase.*;
import org.isoron.uhabits.R;
import org.isoron.uhabits.core.*;
import org.isoron.uhabits.core.models.*;
import org.isoron.uhabits.core.preferences.*;
import org.isoron.uhabits.core.ui.*;
import org.isoron.uhabits.intents.*;
import javax.inject.*;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0007\u0018\u0000 !2\u00020\u0001:\u0001!B)\b\u0007\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ(\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\b\b\u0002\u0010\u0016\u001a\u00020\u0017J\u0018\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0002J\u0010\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001cH\u0016J\u0010\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u001e\u001a\u00020\rH\u0016J(\u0010\u001f\u001a\u00020\u001a2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010 \u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0012\u001a\u00020\u0013H\u0016R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\""}, d2 = {"Lorg/isoron/uhabits/notifications/AndroidNotificationTray;", "Lorg/isoron/uhabits/core/ui/NotificationTray$SystemTray;", "context", "Landroid/content/Context;", "pendingIntents", "Lorg/isoron/uhabits/intents/PendingIntentFactory;", "preferences", "Lorg/isoron/uhabits/core/preferences/Preferences;", "ringtoneManager", "Lorg/isoron/uhabits/notifications/RingtoneManager;", "(Landroid/content/Context;Lorg/isoron/uhabits/intents/PendingIntentFactory;Lorg/isoron/uhabits/core/preferences/Preferences;Lorg/isoron/uhabits/notifications/RingtoneManager;)V", "active", "Ljava/util/HashSet;", "", "buildNotification", "Landroid/app/Notification;", "habit", "Lorg/isoron/uhabits/core/models/Habit;", "reminderTime", "", "timestamp", "Lorg/isoron/uhabits/core/models/Timestamp;", "disableSound", "", "buildSummary", "log", "", "msg", "", "removeNotification", "id", "showNotification", "notificationId", "Companion", "uhabits-android_debug"})
@org.isoron.uhabits.core.AppScope()
public final class AndroidNotificationTray implements org.isoron.uhabits.core.ui.NotificationTray.SystemTray {
    private java.util.HashSet<java.lang.Integer> active;
    private final android.content.Context context = null;
    private final org.isoron.uhabits.intents.PendingIntentFactory pendingIntents = null;
    private final org.isoron.uhabits.core.preferences.Preferences preferences = null;
    private final org.isoron.uhabits.notifications.RingtoneManager ringtoneManager = null;
    private static final java.lang.String REMINDERS_CHANNEL_ID = "REMINDERS";
    public static final org.isoron.uhabits.notifications.AndroidNotificationTray.Companion Companion = null;
    
    @java.lang.Override()
    public void log(@org.jetbrains.annotations.NotNull()
    java.lang.String msg) {
    }
    
    @java.lang.Override()
    public void removeNotification(int id) {
    }
    
    @java.lang.Override()
    public void showNotification(@org.jetbrains.annotations.NotNull()
    org.isoron.uhabits.core.models.Habit habit, int notificationId, @org.jetbrains.annotations.NotNull()
    org.isoron.uhabits.core.models.Timestamp timestamp, long reminderTime) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.app.Notification buildNotification(@org.jetbrains.annotations.NotNull()
    org.isoron.uhabits.core.models.Habit habit, long reminderTime, @org.jetbrains.annotations.NotNull()
    org.isoron.uhabits.core.models.Timestamp timestamp, boolean disableSound) {
        return null;
    }
    
    private final android.app.Notification buildSummary(org.isoron.uhabits.core.models.Habit habit, long reminderTime) {
        return null;
    }
    
    @javax.inject.Inject()
    public AndroidNotificationTray(@org.jetbrains.annotations.NotNull()
    @org.isoron.androidbase.AppContext()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    org.isoron.uhabits.intents.PendingIntentFactory pendingIntents, @org.jetbrains.annotations.NotNull()
    org.isoron.uhabits.core.preferences.Preferences preferences, @org.jetbrains.annotations.NotNull()
    org.isoron.uhabits.notifications.RingtoneManager ringtoneManager) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lorg/isoron/uhabits/notifications/AndroidNotificationTray$Companion;", "", "()V", "REMINDERS_CHANNEL_ID", "", "createAndroidNotificationChannel", "", "context", "Landroid/content/Context;", "uhabits-android_debug"})
    public static final class Companion {
        
        public final void createAndroidNotificationChannel(@org.jetbrains.annotations.NotNull()
        android.content.Context context) {
        }
        
        private Companion() {
            super();
        }
    }
}