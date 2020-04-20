package org.isoron.uhabits.activities.habits.list;

import android.content.*;
import androidx.appcompat.widget.Toolbar;
import android.widget.*;
import org.isoron.androidbase.activities.*;
import org.isoron.uhabits.*;
import org.isoron.uhabits.activities.common.views.*;
import org.isoron.uhabits.activities.habits.list.views.*;
import org.isoron.uhabits.core.models.*;
import org.isoron.uhabits.core.preferences.*;
import org.isoron.uhabits.core.tasks.*;
import org.isoron.uhabits.core.ui.screens.habits.list.*;
import org.isoron.uhabits.core.utils.*;
import org.isoron.uhabits.utils.*;
import javax.inject.*;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002BA\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u00a2\u0006\u0002\u0010\u0011J\b\u0010*\u001a\u00020+H\u0002J\b\u0010,\u001a\u00020\'H\u0016J\b\u0010-\u001a\u00020.H\u0014J\b\u0010/\u001a\u00020.H\u0014J\b\u00100\u001a\u00020.H\u0016J(\u00101\u001a\u00020.2\u0006\u00102\u001a\u00020+2\u0006\u00103\u001a\u00020+2\u0006\u00104\u001a\u00020+2\u0006\u00105\u001a\u00020+H\u0014J\b\u00106\u001a\u00020.H\u0002J\b\u00107\u001a\u00020.H\u0002R\u0011\u0010\u0012\u001a\u00020\u0013\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0016\u001a\u00020\u0017\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u001a\u001a\u00020\u001b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\u001e\u001a\u00020\u001f\u00a2\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0011\u0010\"\u001a\u00020#\u00a2\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0011\u0010&\u001a\u00020\'\u00a2\u0006\b\n\u0000\u001a\u0004\b(\u0010)\u00a8\u00068"}, d2 = {"Lorg/isoron/uhabits/activities/habits/list/ListHabitsRootView;", "Lorg/isoron/androidbase/activities/BaseRootView;", "Lorg/isoron/uhabits/core/models/ModelObservable$Listener;", "context", "Landroid/content/Context;", "hintListFactory", "Lorg/isoron/uhabits/core/ui/screens/habits/list/HintListFactory;", "preferences", "Lorg/isoron/uhabits/core/preferences/Preferences;", "midnightTimer", "Lorg/isoron/uhabits/core/utils/MidnightTimer;", "runner", "Lorg/isoron/uhabits/core/tasks/TaskRunner;", "listAdapter", "Lorg/isoron/uhabits/activities/habits/list/views/HabitCardListAdapter;", "habitCardListViewFactory", "error/NonExistentClass", "(Landroid/content/Context;Lorg/isoron/uhabits/core/ui/screens/habits/list/HintListFactory;Lorg/isoron/uhabits/core/preferences/Preferences;Lorg/isoron/uhabits/core/utils/MidnightTimer;Lorg/isoron/uhabits/core/tasks/TaskRunner;Lorg/isoron/uhabits/activities/habits/list/views/HabitCardListAdapter;Lerror/NonExistentClass;)V", "header", "Lorg/isoron/uhabits/activities/habits/list/views/HeaderView;", "getHeader", "()Lorg/isoron/uhabits/activities/habits/list/views/HeaderView;", "hintView", "Lorg/isoron/uhabits/activities/habits/list/views/HintView;", "getHintView", "()Lorg/isoron/uhabits/activities/habits/list/views/HintView;", "listView", "Lorg/isoron/uhabits/activities/habits/list/views/HabitCardListView;", "getListView", "()Lorg/isoron/uhabits/activities/habits/list/views/HabitCardListView;", "llEmpty", "Lorg/isoron/uhabits/activities/habits/list/views/EmptyListView;", "getLlEmpty", "()Lorg/isoron/uhabits/activities/habits/list/views/EmptyListView;", "progressBar", "Lorg/isoron/uhabits/activities/common/views/TaskProgressBar;", "getProgressBar", "()Lorg/isoron/uhabits/activities/common/views/TaskProgressBar;", "tbar", "Landroidx/appcompat/widget/Toolbar;", "getTbar", "()Landroidx/appcompat/widget/Toolbar;", "getCheckmarkCount", "", "getToolbar", "onAttachedToWindow", "", "onDetachedFromWindow", "onModelChange", "onSizeChanged", "w", "h", "oldw", "oldh", "setupControllers", "updateEmptyView", "uhabits-android_debug"})
@org.isoron.androidbase.activities.ActivityScope()
public final class ListHabitsRootView extends org.isoron.androidbase.activities.BaseRootView implements org.isoron.uhabits.core.models.ModelObservable.Listener {
    @org.jetbrains.annotations.NotNull()
    private final org.isoron.uhabits.activities.habits.list.views.HabitCardListView listView = null;
    @org.jetbrains.annotations.NotNull()
    private final org.isoron.uhabits.activities.habits.list.views.EmptyListView llEmpty = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.appcompat.widget.Toolbar tbar = null;
    @org.jetbrains.annotations.NotNull()
    private final org.isoron.uhabits.activities.common.views.TaskProgressBar progressBar = null;
    @org.jetbrains.annotations.NotNull()
    private final org.isoron.uhabits.activities.habits.list.views.HintView hintView = null;
    @org.jetbrains.annotations.NotNull()
    private final org.isoron.uhabits.activities.habits.list.views.HeaderView header = null;
    private final org.isoron.uhabits.activities.habits.list.views.HabitCardListAdapter listAdapter = null;
    
    @org.jetbrains.annotations.NotNull()
    public final org.isoron.uhabits.activities.habits.list.views.HabitCardListView getListView() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.isoron.uhabits.activities.habits.list.views.EmptyListView getLlEmpty() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.appcompat.widget.Toolbar getTbar() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.isoron.uhabits.activities.common.views.TaskProgressBar getProgressBar() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.isoron.uhabits.activities.habits.list.views.HintView getHintView() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.isoron.uhabits.activities.habits.list.views.HeaderView getHeader() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public androidx.appcompat.widget.Toolbar getToolbar() {
        return null;
    }
    
    @java.lang.Override()
    public void onModelChange() {
    }
    
    private final void setupControllers() {
    }
    
    @java.lang.Override()
    protected void onAttachedToWindow() {
    }
    
    @java.lang.Override()
    protected void onDetachedFromWindow() {
    }
    
    @java.lang.Override()
    protected void onSizeChanged(int w, int h, int oldw, int oldh) {
    }
    
    private final int getCheckmarkCount() {
        return 0;
    }
    
    private final void updateEmptyView() {
    }
    
    @javax.inject.Inject()
    public ListHabitsRootView(@org.jetbrains.annotations.NotNull()
    @org.isoron.androidbase.activities.ActivityContext()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    org.isoron.uhabits.core.ui.screens.habits.list.HintListFactory hintListFactory, @org.jetbrains.annotations.NotNull()
    org.isoron.uhabits.core.preferences.Preferences preferences, @org.jetbrains.annotations.NotNull()
    org.isoron.uhabits.core.utils.MidnightTimer midnightTimer, @org.jetbrains.annotations.NotNull()
    org.isoron.uhabits.core.tasks.TaskRunner runner, @org.jetbrains.annotations.NotNull()
    org.isoron.uhabits.activities.habits.list.views.HabitCardListAdapter listAdapter, @org.jetbrains.annotations.NotNull()
    HabitCardListViewFactory habitCardListViewFactory) {
        super(null);
    }
}