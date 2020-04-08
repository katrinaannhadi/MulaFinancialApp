package org.isoron.uhabits.activities.habits.list;

import android.content.*;
import org.isoron.androidbase.*;
import org.isoron.uhabits.activities.*;
import org.isoron.uhabits.activities.habits.list.views.*;
import org.isoron.uhabits.core.ui.screens.habits.list.*;
import javax.inject.*;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\'\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\'J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\'J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\'J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u000eH\'J\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u0006H\'J\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\r\u001a\u00020\u000eH\'J\u0010\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\'\u00a8\u0006\u0019"}, d2 = {"Lorg/isoron/uhabits/activities/habits/list/ListHabitsModule;", "", "()V", "getAdapter", "Lorg/isoron/uhabits/core/ui/screens/habits/list/ListHabitsMenuBehavior$Adapter;", "adapter", "Lorg/isoron/uhabits/activities/habits/list/views/HabitCardListAdapter;", "getBugReporter", "Lorg/isoron/uhabits/core/ui/screens/habits/list/ListHabitsBehavior$BugReporter;", "proxy", "Lorg/isoron/uhabits/activities/habits/list/BugReporterProxy;", "getMenuScreen", "Lorg/isoron/uhabits/core/ui/screens/habits/list/ListHabitsMenuBehavior$Screen;", "screen", "Lorg/isoron/uhabits/activities/habits/list/ListHabitsScreen;", "getScreen", "Lorg/isoron/uhabits/core/ui/screens/habits/list/ListHabitsBehavior$Screen;", "getSelMenuAdapter", "Lorg/isoron/uhabits/core/ui/screens/habits/list/ListHabitsSelectionMenuBehavior$Adapter;", "getSelMenuScreen", "Lorg/isoron/uhabits/core/ui/screens/habits/list/ListHabitsSelectionMenuBehavior$Screen;", "getSystem", "Lorg/isoron/uhabits/core/ui/screens/habits/list/ListHabitsBehavior$DirFinder;", "system", "Lorg/isoron/uhabits/activities/HabitsDirFinder;", "uhabits-android_debug"})
@dagger.Module()
public abstract class ListHabitsModule {
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Binds()
    public abstract org.isoron.uhabits.core.ui.screens.habits.list.ListHabitsMenuBehavior.Adapter getAdapter(@org.jetbrains.annotations.NotNull()
    org.isoron.uhabits.activities.habits.list.views.HabitCardListAdapter adapter);
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Binds()
    public abstract org.isoron.uhabits.core.ui.screens.habits.list.ListHabitsBehavior.BugReporter getBugReporter(@org.jetbrains.annotations.NotNull()
    org.isoron.uhabits.activities.habits.list.BugReporterProxy proxy);
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Binds()
    public abstract org.isoron.uhabits.core.ui.screens.habits.list.ListHabitsMenuBehavior.Screen getMenuScreen(@org.jetbrains.annotations.NotNull()
    org.isoron.uhabits.activities.habits.list.ListHabitsScreen screen);
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Binds()
    public abstract org.isoron.uhabits.core.ui.screens.habits.list.ListHabitsBehavior.Screen getScreen(@org.jetbrains.annotations.NotNull()
    org.isoron.uhabits.activities.habits.list.ListHabitsScreen screen);
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Binds()
    public abstract org.isoron.uhabits.core.ui.screens.habits.list.ListHabitsSelectionMenuBehavior.Adapter getSelMenuAdapter(@org.jetbrains.annotations.NotNull()
    org.isoron.uhabits.activities.habits.list.views.HabitCardListAdapter adapter);
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Binds()
    public abstract org.isoron.uhabits.core.ui.screens.habits.list.ListHabitsSelectionMenuBehavior.Screen getSelMenuScreen(@org.jetbrains.annotations.NotNull()
    org.isoron.uhabits.activities.habits.list.ListHabitsScreen screen);
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Binds()
    public abstract org.isoron.uhabits.core.ui.screens.habits.list.ListHabitsBehavior.DirFinder getSystem(@org.jetbrains.annotations.NotNull()
    org.isoron.uhabits.activities.HabitsDirFinder system);
    
    public ListHabitsModule() {
        super();
    }
}