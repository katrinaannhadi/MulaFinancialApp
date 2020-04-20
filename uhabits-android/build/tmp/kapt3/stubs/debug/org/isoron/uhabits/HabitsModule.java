package org.isoron.uhabits;

import org.isoron.uhabits.core.*;
import org.isoron.uhabits.core.commands.*;
import org.isoron.uhabits.core.database.*;
import org.isoron.uhabits.core.models.*;
import org.isoron.uhabits.core.models.sqlite.*;
import org.isoron.uhabits.core.preferences.*;
import org.isoron.uhabits.core.reminders.*;
import org.isoron.uhabits.core.tasks.*;
import org.isoron.uhabits.core.ui.*;
import org.isoron.uhabits.database.*;
import org.isoron.uhabits.intents.*;
import org.isoron.uhabits.notifications.*;
import org.isoron.uhabits.preferences.*;
import org.isoron.uhabits.utils.*;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0007J\b\u0010\u000b\u001a\u00020\fH\u0007J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0007J(\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\u0019H\u0007J(\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u001e\u001a\u00020\u000e2\u0006\u0010\u001f\u001a\u00020 H\u0007J\u0010\u0010!\u001a\u00020\u00192\u0006\u0010\u000f\u001a\u00020\u0010H\u0007\u00a8\u0006\""}, d2 = {"Lorg/isoron/uhabits/HabitsModule;", "", "()V", "getDatabaseOpener", "Lorg/isoron/uhabits/core/database/DatabaseOpener;", "opener", "Lorg/isoron/uhabits/database/AndroidDatabaseOpener;", "getHabitList", "Lorg/isoron/uhabits/core/models/HabitList;", "list", "Lorg/isoron/uhabits/core/models/sqlite/SQLiteHabitList;", "getModelFactory", "Lorg/isoron/uhabits/core/models/ModelFactory;", "getPreferences", "Lorg/isoron/uhabits/core/preferences/Preferences;", "storage", "Lorg/isoron/uhabits/preferences/SharedPreferencesStorage;", "getReminderScheduler", "Lorg/isoron/uhabits/core/reminders/ReminderScheduler;", "sys", "Lorg/isoron/uhabits/intents/IntentScheduler;", "commandRunner", "Lorg/isoron/uhabits/core/commands/CommandRunner;", "habitList", "widgetPreferences", "Lorg/isoron/uhabits/core/preferences/WidgetPreferences;", "getTray", "Lorg/isoron/uhabits/core/ui/NotificationTray;", "taskRunner", "Lorg/isoron/uhabits/core/tasks/TaskRunner;", "preferences", "screen", "Lorg/isoron/uhabits/notifications/AndroidNotificationTray;", "getWidgetPreferences", "uhabits-android_debug"})
@dagger.Module()
public final class HabitsModule {
    
    @org.jetbrains.annotations.NotNull()
    @org.isoron.uhabits.core.AppScope()
    @dagger.Provides()
    public final org.isoron.uhabits.core.preferences.Preferences getPreferences(@org.jetbrains.annotations.NotNull()
    org.isoron.uhabits.preferences.SharedPreferencesStorage storage) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @org.isoron.uhabits.core.AppScope()
    @dagger.Provides()
    public final org.isoron.uhabits.core.reminders.ReminderScheduler getReminderScheduler(@org.jetbrains.annotations.NotNull()
    org.isoron.uhabits.intents.IntentScheduler sys, @org.jetbrains.annotations.NotNull()
    org.isoron.uhabits.core.commands.CommandRunner commandRunner, @org.jetbrains.annotations.NotNull()
    org.isoron.uhabits.core.models.HabitList habitList, @org.jetbrains.annotations.NotNull()
    org.isoron.uhabits.core.preferences.WidgetPreferences widgetPreferences) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @org.isoron.uhabits.core.AppScope()
    @dagger.Provides()
    public final org.isoron.uhabits.core.ui.NotificationTray getTray(@org.jetbrains.annotations.NotNull()
    org.isoron.uhabits.core.tasks.TaskRunner taskRunner, @org.jetbrains.annotations.NotNull()
    org.isoron.uhabits.core.commands.CommandRunner commandRunner, @org.jetbrains.annotations.NotNull()
    org.isoron.uhabits.core.preferences.Preferences preferences, @org.jetbrains.annotations.NotNull()
    org.isoron.uhabits.notifications.AndroidNotificationTray screen) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @org.isoron.uhabits.core.AppScope()
    @dagger.Provides()
    public final org.isoron.uhabits.core.preferences.WidgetPreferences getWidgetPreferences(@org.jetbrains.annotations.NotNull()
    org.isoron.uhabits.preferences.SharedPreferencesStorage storage) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @org.isoron.uhabits.core.AppScope()
    @dagger.Provides()
    public final org.isoron.uhabits.core.models.ModelFactory getModelFactory() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @org.isoron.uhabits.core.AppScope()
    @dagger.Provides()
    public final org.isoron.uhabits.core.models.HabitList getHabitList(@org.jetbrains.annotations.NotNull()
    org.isoron.uhabits.core.models.sqlite.SQLiteHabitList list) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @org.isoron.uhabits.core.AppScope()
    @dagger.Provides()
    public final org.isoron.uhabits.core.database.DatabaseOpener getDatabaseOpener(@org.jetbrains.annotations.NotNull()
    org.isoron.uhabits.database.AndroidDatabaseOpener opener) {
        return null;
    }
    
    public HabitsModule() {
        super();
    }
}