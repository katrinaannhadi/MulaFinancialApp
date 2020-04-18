/*
 * Copyright (C) 2017 Álinson Santos Xavier <mula@gmail.com>
 *
 * This file is part of Loop Habit Tracker.
 *
 * Loop Habit Tracker is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by the
 * Free Software Foundation, either version 3 of the License, or (at your
 * option) any later version.
 *
 * Loop Habit Tracker is distributed in the hope that it will be useful, but
 * WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY
 * or FITNESS FOR A PARTICULAR PURPOSE. See the GNU General Public License for
 * more details.
 *
 * You should have received a copy of the GNU General Public License along
 * with this program. If not, see <http://www.gnu.org/licenses/>.
 */

package org.mula.finance

import dagger.*
import org.mula.finance.database.*
import org.mula.finance.intents.*
import org.mula.finance.notifications.*
import org.mula.finance.preferences.*
import org.mula.finance.utils.*
import org.mula.finance.core.AppScope
import org.mula.finance.core.commands.CommandRunner
import org.mula.finance.core.database.DatabaseOpener
import org.mula.finance.core.models.HabitList
import org.mula.finance.core.models.ModelFactory
import org.mula.finance.core.models.sqlite.SQLModelFactory
import org.mula.finance.core.models.sqlite.SQLiteHabitList
import org.mula.finance.core.preferences.Preferences
import org.mula.finance.core.preferences.WidgetPreferences
import org.mula.finance.core.reminders.ReminderScheduler
import org.mula.finance.core.tasks.TaskRunner
import org.mula.finance.core.ui.NotificationTray

@Module
class HabitsModule {
    @Provides
    @AppScope
    fun getPreferences(storage: SharedPreferencesStorage): Preferences {
        return Preferences(storage)
    }

    @Provides
    @AppScope
    fun getReminderScheduler(
            sys: IntentScheduler,
            commandRunner: CommandRunner,
            habitList: HabitList,
            widgetPreferences: WidgetPreferences
    ): ReminderScheduler {
        return ReminderScheduler(commandRunner, habitList, sys, widgetPreferences)
    }

    @Provides
    @AppScope
    fun getTray(
            taskRunner: TaskRunner,
            commandRunner: CommandRunner,
            preferences: Preferences,
            screen: AndroidNotificationTray
    ): NotificationTray {
        return NotificationTray(taskRunner, commandRunner, preferences, screen)
    }

    @Provides
    @AppScope
    fun getWidgetPreferences(
            storage: SharedPreferencesStorage
    ): WidgetPreferences {
        return WidgetPreferences(storage)
    }

    @Provides
    @AppScope
    fun getModelFactory(): ModelFactory {
        return SQLModelFactory(AndroidDatabase(DatabaseUtils.openDatabase()))
    }

    @Provides
    @AppScope
    fun getHabitList(list: SQLiteHabitList): HabitList {
        return list
    }

    @Provides
    @AppScope
    fun getDatabaseOpener(opener: AndroidDatabaseOpener): DatabaseOpener {
        return opener
    }
}

