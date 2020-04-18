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

import android.content.*
import android.os.*
import org.mula.finance.*
import org.mula.androidbase.activities.ActivityContextModule
import org.mula.androidbase.activities.BaseActivity
import org.mula.androidbase.activities.BaseActivityModule
import org.mula.finance.core.models.Habit
import org.mula.finance.core.models.HabitList

abstract class HabitsActivity : BaseActivity() {
    lateinit var component: HabitsActivityComponent
    lateinit var appComponent: HabitsApplicationComponent

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        appComponent = (applicationContext as HabitsApplication).component

        val habit = getHabitFromIntent(appComponent.habitList)
                    ?: appComponent.modelFactory.buildHabit()

        component = DaggerHabitsActivityComponent
                .builder()
                .activityContextModule(ActivityContextModule(this))
                .baseActivityModule(BaseActivityModule(this))
                .habitModule(HabitModule(habit))
                .habitsApplicationComponent(appComponent)
                .build()

        component.themeSwitcher.apply()
    }

    private fun getHabitFromIntent(habitList: HabitList): Habit? {
        val data = intent.data ?: return null
        val habit = habitList.getById(ContentUris.parseId(data))
                    ?: throw RuntimeException("habit not found")
        return habit
    }
}
