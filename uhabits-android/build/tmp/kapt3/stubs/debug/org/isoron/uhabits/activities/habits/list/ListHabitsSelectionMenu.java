package org.isoron.uhabits.activities.habits.list;

import android.view.*;
import org.isoron.androidbase.activities.*;
import org.isoron.uhabits.*;
import org.isoron.uhabits.activities.habits.list.views.*;
import org.isoron.uhabits.core.commands.*;
import org.isoron.uhabits.core.preferences.*;
import org.isoron.uhabits.core.ui.*;
import org.isoron.uhabits.core.ui.screens.habits.list.*;
import org.isoron.uhabits.core.utils.*;
import javax.inject.*;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001BE\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u00a2\u0006\u0002\u0010\u0011J\b\u0010\u0016\u001a\u00020\u0017H\u0014J\b\u0010\u0018\u001a\u00020\u0019H\u0016J\u0010\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001dH\u0016J\u0010\u0010\u001e\u001a\u00020\u001b2\u0006\u0010\u001f\u001a\u00020 H\u0016J\u0006\u0010!\u001a\u00020\u0019J\u0006\u0010\"\u001a\u00020\u0019J\u0006\u0010#\u001a\u00020\u0019R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006$"}, d2 = {"Lorg/isoron/uhabits/activities/habits/list/ListHabitsSelectionMenu;", "Lorg/isoron/androidbase/activities/BaseSelectionMenu;", "screen", "Lorg/isoron/uhabits/activities/habits/list/ListHabitsScreen;", "listAdapter", "Lorg/isoron/uhabits/activities/habits/list/views/HabitCardListAdapter;", "commandRunner", "Lorg/isoron/uhabits/core/commands/CommandRunner;", "prefs", "Lorg/isoron/uhabits/core/preferences/Preferences;", "behavior", "Lorg/isoron/uhabits/core/ui/screens/habits/list/ListHabitsSelectionMenuBehavior;", "listController", "Ldagger/Lazy;", "Lorg/isoron/uhabits/activities/habits/list/views/HabitCardListController;", "notificationTray", "Lorg/isoron/uhabits/core/ui/NotificationTray;", "(Lorg/isoron/uhabits/activities/habits/list/ListHabitsScreen;Lorg/isoron/uhabits/activities/habits/list/views/HabitCardListAdapter;Lorg/isoron/uhabits/core/commands/CommandRunner;Lorg/isoron/uhabits/core/preferences/Preferences;Lorg/isoron/uhabits/core/ui/screens/habits/list/ListHabitsSelectionMenuBehavior;Ldagger/Lazy;Lorg/isoron/uhabits/core/ui/NotificationTray;)V", "getCommandRunner", "()Lorg/isoron/uhabits/core/commands/CommandRunner;", "setCommandRunner", "(Lorg/isoron/uhabits/core/commands/CommandRunner;)V", "getResourceId", "", "onFinish", "", "onItemClicked", "", "item", "Landroid/view/MenuItem;", "onPrepare", "menu", "Landroid/view/Menu;", "onSelectionChange", "onSelectionFinish", "onSelectionStart", "uhabits-android_debug"})
@org.isoron.androidbase.activities.ActivityScope()
public final class ListHabitsSelectionMenu extends org.isoron.androidbase.activities.BaseSelectionMenu {
    private final org.isoron.uhabits.activities.habits.list.ListHabitsScreen screen = null;
    private final org.isoron.uhabits.activities.habits.list.views.HabitCardListAdapter listAdapter = null;
    @org.jetbrains.annotations.NotNull()
    private org.isoron.uhabits.core.commands.CommandRunner commandRunner;
    private final org.isoron.uhabits.core.preferences.Preferences prefs = null;
    private final org.isoron.uhabits.core.ui.screens.habits.list.ListHabitsSelectionMenuBehavior behavior = null;
    private final dagger.Lazy<org.isoron.uhabits.activities.habits.list.views.HabitCardListController> listController = null;
    private final org.isoron.uhabits.core.ui.NotificationTray notificationTray = null;
    
    @java.lang.Override()
    public void onFinish() {
    }
    
    @java.lang.Override()
    public boolean onItemClicked(@org.jetbrains.annotations.NotNull()
    android.view.MenuItem item) {
        return false;
    }
    
    @java.lang.Override()
    public boolean onPrepare(@org.jetbrains.annotations.NotNull()
    android.view.Menu menu) {
        return false;
    }
    
    public final void onSelectionStart() {
    }
    
    public final void onSelectionChange() {
    }
    
    public final void onSelectionFinish() {
    }
    
    @java.lang.Override()
    protected int getResourceId() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.isoron.uhabits.core.commands.CommandRunner getCommandRunner() {
        return null;
    }
    
    public final void setCommandRunner(@org.jetbrains.annotations.NotNull()
    org.isoron.uhabits.core.commands.CommandRunner p0) {
    }
    
    @javax.inject.Inject()
    public ListHabitsSelectionMenu(@org.jetbrains.annotations.NotNull()
    org.isoron.uhabits.activities.habits.list.ListHabitsScreen screen, @org.jetbrains.annotations.NotNull()
    org.isoron.uhabits.activities.habits.list.views.HabitCardListAdapter listAdapter, @org.jetbrains.annotations.NotNull()
    org.isoron.uhabits.core.commands.CommandRunner commandRunner, @org.jetbrains.annotations.NotNull()
    org.isoron.uhabits.core.preferences.Preferences prefs, @org.jetbrains.annotations.NotNull()
    org.isoron.uhabits.core.ui.screens.habits.list.ListHabitsSelectionMenuBehavior behavior, @org.jetbrains.annotations.NotNull()
    dagger.Lazy<org.isoron.uhabits.activities.habits.list.views.HabitCardListController> listController, @org.jetbrains.annotations.NotNull()
    org.isoron.uhabits.core.ui.NotificationTray notificationTray) {
        super();
    }
}