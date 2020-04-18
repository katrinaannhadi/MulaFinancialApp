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

package org.mula.finance.widgets;

import androidx.test.filters.*;

import android.widget.*;

import androidx.test.ext.junit.runners.AndroidJUnit4;

import org.mula.finance.*;
import org.junit.*;
import org.junit.runner.*;
import org.mula.finance.core.models.Habit;

@RunWith(AndroidJUnit4.class)
@MediumTest
public class ScoreWidgetTest extends BaseViewTest
{
    private static final String PATH = "widgets/ScoreWidget/";

    private Habit habit;

    private FrameLayout view;

    @Override
    public void setUp()
    {
        super.setUp();
        setTheme(R.style.WidgetTheme);

        habit = fixtures.createLongHabit();
        ScoreWidget widget = new ScoreWidget(targetContext, 0, habit);
        view = convertToView(widget, 400, 400);
    }

    @Test
    public void testIsInstalled()
    {
        assertWidgetProviderIsInstalled(ScoreWidgetProvider.class);
    }

//    @Test
//    public void testRender() throws Exception
//    {
//        assertRenders(view, PATH + "render.png");
//    }
}
