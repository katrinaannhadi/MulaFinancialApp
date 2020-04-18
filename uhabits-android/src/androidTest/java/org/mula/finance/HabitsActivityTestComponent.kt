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

package org.mula.finance

import dagger.*
import org.mula.finance.activities.*
import org.mula.finance.activities.about.*
import org.mula.finance.activities.habits.list.*
import org.mula.finance.activities.habits.list.views.*
import org.mula.finance.activities.habits.show.*
import org.mockito.Mockito.*
import org.mula.androidbase.activities.ActivityContextModule
import org.mula.androidbase.activities.ActivityScope

@Module
class TestModule {
    @Provides fun ListHabitsBehavior() = mock(org.mula.finance.core.ui.screens.habits.list.ListHabitsBehavior::class.java)
}

@ActivityScope
@Component(modules = arrayOf(
        ActivityContextModule::class,
        AboutModule::class,
        HabitsActivityModule::class,
        ListHabitsModule::class,
        ShowHabitModule::class,
        HabitModule::class,
        TestModule::class
), dependencies = arrayOf(HabitsApplicationComponent::class))
interface HabitsActivityTestComponent {
    fun getCheckmarkPanelViewFactory(): CheckmarkPanelViewFactory
    fun getHabitCardViewFactory(): HabitCardViewFactory
    fun getCheckmarkButtonViewFactory(): CheckmarkButtonViewFactory
    fun getNumberButtonViewFactory(): NumberButtonViewFactory
    fun getNumberPanelViewFactory(): NumberPanelViewFactory
}