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

import org.mula.androidbase.AppContextModule;
import org.mula.finance.core.AppScope;
import org.mula.finance.core.tasks.SingleThreadTaskRunner;
import org.mula.finance.core.tasks.TaskRunner;

import dagger.*;

@AppScope
@Component(modules = {
    AppContextModule.class,
    HabitsModule.class,
    SingleThreadModule.class,
})
public interface HabitsApplicationTestComponent
    extends HabitsApplicationComponent
{

}

@Module
class SingleThreadModule
{
    @Provides
    @AppScope
    static TaskRunner provideTaskRunner()
    {
        return new SingleThreadTaskRunner();
    }
}
