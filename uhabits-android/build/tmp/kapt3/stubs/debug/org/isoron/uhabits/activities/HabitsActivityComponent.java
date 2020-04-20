package org.isoron.uhabits.activities;

import org.isoron.androidbase.activities.*;
import org.isoron.uhabits.*;
import org.isoron.uhabits.activities.common.dialogs.*;
import org.isoron.uhabits.activities.habits.list.*;
import org.isoron.uhabits.activities.habits.list.views.*;
import org.isoron.uhabits.activities.habits.show.*;
import org.isoron.uhabits.core.ui.*;
import org.isoron.uhabits.core.ui.screens.habits.list.*;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001R\u0012\u0010\u0002\u001a\u00020\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0007X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0012\u0010\n\u001a\u00020\u000bX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0012\u0010\u000e\u001a\u00020\u000fX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0012\u0010\u0012\u001a\u00020\u0013X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0012\u0010\u0016\u001a\u00020\u0017X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0012\u0010\u001a\u001a\u00020\u001bX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dR\u0012\u0010\u001e\u001a\u00020\u001fX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b \u0010!R\u0012\u0010\"\u001a\u00020#X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b$\u0010%\u00a8\u0006&"}, d2 = {"Lorg/isoron/uhabits/activities/HabitsActivityComponent;", "", "colorPickerDialogFactory", "Lorg/isoron/uhabits/activities/common/dialogs/ColorPickerDialogFactory;", "getColorPickerDialogFactory", "()Lorg/isoron/uhabits/activities/common/dialogs/ColorPickerDialogFactory;", "habitCardListAdapter", "Lorg/isoron/uhabits/activities/habits/list/views/HabitCardListAdapter;", "getHabitCardListAdapter", "()Lorg/isoron/uhabits/activities/habits/list/views/HabitCardListAdapter;", "listHabitsBehavior", "Lorg/isoron/uhabits/core/ui/screens/habits/list/ListHabitsBehavior;", "getListHabitsBehavior", "()Lorg/isoron/uhabits/core/ui/screens/habits/list/ListHabitsBehavior;", "listHabitsMenu", "Lorg/isoron/uhabits/activities/habits/list/ListHabitsMenu;", "getListHabitsMenu", "()Lorg/isoron/uhabits/activities/habits/list/ListHabitsMenu;", "listHabitsRootView", "Lorg/isoron/uhabits/activities/habits/list/ListHabitsRootView;", "getListHabitsRootView", "()Lorg/isoron/uhabits/activities/habits/list/ListHabitsRootView;", "listHabitsScreen", "Lorg/isoron/uhabits/activities/habits/list/ListHabitsScreen;", "getListHabitsScreen", "()Lorg/isoron/uhabits/activities/habits/list/ListHabitsScreen;", "listHabitsSelectionMenu", "Lorg/isoron/uhabits/activities/habits/list/ListHabitsSelectionMenu;", "getListHabitsSelectionMenu", "()Lorg/isoron/uhabits/activities/habits/list/ListHabitsSelectionMenu;", "showHabitScreen", "Lorg/isoron/uhabits/activities/habits/show/ShowHabitScreen;", "getShowHabitScreen", "()Lorg/isoron/uhabits/activities/habits/show/ShowHabitScreen;", "themeSwitcher", "Lorg/isoron/uhabits/activities/AndroidThemeSwitcher;", "getThemeSwitcher", "()Lorg/isoron/uhabits/activities/AndroidThemeSwitcher;", "uhabits-android_debug"})
@dagger.Component(modules = {org.isoron.androidbase.activities.ActivityContextModule.class, org.isoron.androidbase.activities.BaseActivityModule.class, org.isoron.uhabits.activities.HabitsActivityModule.class, org.isoron.uhabits.activities.habits.list.ListHabitsModule.class, org.isoron.uhabits.activities.habits.show.ShowHabitModule.class, org.isoron.uhabits.activities.HabitModule.class}, dependencies = {org.isoron.uhabits.HabitsApplicationComponent.class})
@org.isoron.androidbase.activities.ActivityScope()
public abstract interface HabitsActivityComponent {
    
    @org.jetbrains.annotations.NotNull()
    public abstract org.isoron.uhabits.activities.common.dialogs.ColorPickerDialogFactory getColorPickerDialogFactory();
    
    @org.jetbrains.annotations.NotNull()
    public abstract org.isoron.uhabits.activities.habits.list.views.HabitCardListAdapter getHabitCardListAdapter();
    
    @org.jetbrains.annotations.NotNull()
    public abstract org.isoron.uhabits.core.ui.screens.habits.list.ListHabitsBehavior getListHabitsBehavior();
    
    @org.jetbrains.annotations.NotNull()
    public abstract org.isoron.uhabits.activities.habits.list.ListHabitsMenu getListHabitsMenu();
    
    @org.jetbrains.annotations.NotNull()
    public abstract org.isoron.uhabits.activities.habits.list.ListHabitsRootView getListHabitsRootView();
    
    @org.jetbrains.annotations.NotNull()
    public abstract org.isoron.uhabits.activities.habits.list.ListHabitsScreen getListHabitsScreen();
    
    @org.jetbrains.annotations.NotNull()
    public abstract org.isoron.uhabits.activities.habits.list.ListHabitsSelectionMenu getListHabitsSelectionMenu();
    
    @org.jetbrains.annotations.NotNull()
    public abstract org.isoron.uhabits.activities.habits.show.ShowHabitScreen getShowHabitScreen();
    
    @org.jetbrains.annotations.NotNull()
    public abstract org.isoron.uhabits.activities.AndroidThemeSwitcher getThemeSwitcher();
}