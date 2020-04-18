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

package org.mula.finance.activities

import dagger.*
import org.mula.finance.*
import org.mula.finance.activities.common.dialogs.*
import org.mula.finance.activities.habits.list.*
import org.mula.finance.activities.habits.list.views.*
import org.mula.finance.activities.habits.show.*
import org.mula.androidbase.activities.ActivityContextModule
import org.mula.androidbase.activities.ActivityScope
import org.mula.androidbase.activities.BaseActivityModule
import org.mula.finance.core.ui.screens.habits.list.ListHabitsBehavior

@ActivityScope
@Component(modules = arrayOf(
        ActivityContextModule::class,
        BaseActivityModule::class,
        HabitsActivityModule::class,
        ListHabitsModule::class,
        ShowHabitModule::class,
        HabitModule::class
), dependencies = arrayOf(HabitsApplicationComponent::class))
interface HabitsActivityComponent {
    val colorPickerDialogFactory: ColorPickerDialogFactory
    val habitCardListAdapter: HabitCardListAdapter
    val listHabitsBehavior: ListHabitsBehavior
    val listHabitsMenu: ListHabitsMenu
    val listHabitsRootView: ListHabitsRootView
    val listHabitsScreen: ListHabitsScreen
    val listHabitsSelectionMenu: ListHabitsSelectionMenu
    val showHabitScreen: ShowHabitScreen
    val themeSwitcher: AndroidThemeSwitcher
}
