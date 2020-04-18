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

package org.mula.finance.activities.habits.show.views;

import android.view.LayoutInflater;

import androidx.test.ext.junit.runners.AndroidJUnit4;
import androidx.test.filters.MediumTest;

import org.mula.finance.BaseViewTest;
import org.mula.finance.R;
import org.mula.finance.core.models.Habit;
import org.mula.finance.core.models.Reminder;
import org.mula.finance.core.models.WeekdayList;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
@MediumTest
public class NotesCardTest extends BaseViewTest
{
    public static final String PATH = "habits/show/NotesCard/";

    private NotesCard view;

    private Habit habit;

    @Before
    @Override
    public void setUp()
    {
        super.setUp();

        habit = fixtures.createLongHabit();
        habit.setReminder(new Reminder(8, 30, WeekdayList.EVERY_DAY));

        view = LayoutInflater
            .from(targetContext)
            .inflate(R.layout.show_habit, null)
            .findViewById(R.id.notesCard);

        view.setHabit(habit);
        view.refreshData();

        measureView(view, 800, 200);
    }

    @Test
    public void testRender() throws Exception
    {
        assertRenders(view, PATH + "render.png");
    }

    @Test
    public void testRenderEmptyDescription() throws Exception
    {
        habit.setDescription("");
        view.refreshData();
        assertRenders(view, PATH + "render-empty-description.png");
    }
}
