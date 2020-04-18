/*
 * Copyright (C) 2016 Álinson Santos Xavier <mula@gmail.com>
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

package org.mula.finance;

import android.content.*;

import org.mula.androidbase.*;

import org.mula.androidbase.*;
import org.mula.finance.core.*;
import org.mula.finance.core.commands.*;
import org.mula.finance.core.io.*;
import org.mula.finance.core.models.*;
import org.mula.finance.core.preferences.*;
import org.mula.finance.core.reminders.*;
import org.mula.finance.core.tasks.*;
import org.mula.finance.core.ui.*;
import org.mula.finance.core.ui.screens.habits.list.*;
import org.mula.finance.core.utils.*;
import org.mula.finance.intents.*;
import org.mula.finance.receivers.*;
import org.mula.finance.sync.*;
import org.mula.finance.tasks.*;
import org.mula.finance.widgets.*;

import dagger.*;

@AppScope
@Component(modules = {
    AppContextModule.class,
    HabitsModule.class,
    AndroidTaskRunner.class,
})
public interface HabitsApplicationComponent
{
    CommandRunner getCommandRunner();

    @AppContext
    Context getContext();

    CreateHabitCommandFactory getCreateHabitCommandFactory();

    EditHabitCommandFactory getEditHabitCommandFactory();

    GenericImporter getGenericImporter();

    HabitCardListCache getHabitCardListCache();

    HabitList getHabitList();

    IntentFactory getIntentFactory();

    IntentParser getIntentParser();

    MidnightTimer getMidnightTimer();

    ModelFactory getModelFactory();

    NotificationTray getNotificationTray();

    PendingIntentFactory getPendingIntentFactory();

    Preferences getPreferences();

    ReminderScheduler getReminderScheduler();

    ReminderController getReminderController();

    SyncManager getSyncManager();

    TaskRunner getTaskRunner();

    WidgetPreferences getWidgetPreferences();

    WidgetUpdater getWidgetUpdater();
}
