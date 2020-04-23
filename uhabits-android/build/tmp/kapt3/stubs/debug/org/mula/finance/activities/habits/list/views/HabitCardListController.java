package org.mula.finance.activities.habits.list.views;

import org.mula.finance.activities.habits.list.*;
import org.mula.androidbase.activities.ActivityScope;
import org.mula.finance.core.models.Habit;
import org.mula.finance.core.models.ModelObservable;
import org.mula.finance.core.ui.screens.habits.list.ListHabitsBehavior;
import javax.inject.*;

/**
 * Controller responsible for receiving and processing the events generated by a
 * HabitListView. These include selecting and reordering items, toggling
 * checkmarks and clicking habits.
 */
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\r\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0004\u001e\u001f !B%\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b\u00a2\u0006\u0002\u0010\nJ\b\u0010\u0011\u001a\u00020\u0012H\u0002J\u0018\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0015H\u0016J\u0010\u0010\u0017\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\u0015H\u0016J\u0010\u0010\u0019\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\u0015H\u0016J\b\u0010\u001a\u001a\u00020\u0012H\u0016J\u0006\u0010\u001b\u001a\u00020\u0012J\u0010\u0010\u001c\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\u0015H\u0016J\u0010\u0010\u001d\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\u0015H\u0004R\u0012\u0010\u000b\u001a\u00060\fR\u00020\u0000X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0012\u0010\r\u001a\u00060\u000eR\u00020\u0000X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\""}, d2 = {"Lorg/mula/finance/activities/habits/list/views/HabitCardListController;", "Lorg/mula/finance/activities/habits/list/views/HabitCardListView$Controller;", "Lorg/mula/finance/core/models/ModelObservable$Listener;", "adapter", "Lorg/mula/finance/activities/habits/list/views/HabitCardListAdapter;", "behavior", "Lorg/mula/finance/core/ui/screens/habits/list/ListHabitsBehavior;", "selectionMenu", "Ldagger/Lazy;", "Lorg/mula/finance/activities/habits/list/ListHabitsSelectionMenu;", "(Lorg/mula/finance/activities/habits/list/views/HabitCardListAdapter;Lorg/mula/finance/core/ui/screens/habits/list/ListHabitsBehavior;Ldagger/Lazy;)V", "NORMAL_MODE", "Lorg/mula/finance/activities/habits/list/views/HabitCardListController$NormalMode;", "SELECTION_MODE", "Lorg/mula/finance/activities/habits/list/views/HabitCardListController$SelectionMode;", "activeMode", "Lorg/mula/finance/activities/habits/list/views/HabitCardListController$Mode;", "cancelSelection", "", "drop", "from", "", "to", "onItemClick", "position", "onItemLongClick", "onModelChange", "onSelectionFinished", "startDrag", "toggleSelection", "HabitListener", "Mode", "NormalMode", "SelectionMode", "uhabits-android_debug"})
@org.mula.androidbase.activities.ActivityScope()
public final class HabitCardListController implements org.mula.finance.activities.habits.list.views.HabitCardListView.Controller, org.mula.finance.core.models.ModelObservable.Listener {
    private final org.mula.finance.activities.habits.list.views.HabitCardListController.NormalMode NORMAL_MODE = null;
    private final org.mula.finance.activities.habits.list.views.HabitCardListController.SelectionMode SELECTION_MODE = null;
    private org.mula.finance.activities.habits.list.views.HabitCardListController.Mode activeMode;
    private final org.mula.finance.activities.habits.list.views.HabitCardListAdapter adapter = null;
    private final org.mula.finance.core.ui.screens.habits.list.ListHabitsBehavior behavior = null;
    private final dagger.Lazy<org.mula.finance.activities.habits.list.ListHabitsSelectionMenu> selectionMenu = null;
    
    @java.lang.Override()
    public void drop(int from, int to) {
    }
    
    @java.lang.Override()
    public void onItemClick(int position) {
    }
    
    @java.lang.Override()
    public void onItemLongClick(int position) {
    }
    
    @java.lang.Override()
    public void onModelChange() {
    }
    
    public final void onSelectionFinished() {
    }
    
    @java.lang.Override()
    public void startDrag(int position) {
    }
    
    protected final void toggleSelection(int position) {
    }
    
    private final void cancelSelection() {
    }
    
    @javax.inject.Inject()
    public HabitCardListController(@org.jetbrains.annotations.NotNull()
    org.mula.finance.activities.habits.list.views.HabitCardListAdapter adapter, @org.jetbrains.annotations.NotNull()
    org.mula.finance.core.ui.screens.habits.list.ListHabitsBehavior behavior, @org.jetbrains.annotations.NotNull()
    dagger.Lazy<org.mula.finance.activities.habits.list.ListHabitsSelectionMenu> selectionMenu) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0018\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0005H&\u00a8\u0006\t"}, d2 = {"Lorg/mula/finance/activities/habits/list/views/HabitCardListController$HabitListener;", "", "onHabitClick", "", "habit", "Lorg/mula/finance/core/models/Habit;", "onHabitReorder", "from", "to", "uhabits-android_debug"})
    public static abstract interface HabitListener {
        
        public abstract void onHabitClick(@org.jetbrains.annotations.NotNull()
        org.mula.finance.core.models.Habit habit);
        
        public abstract void onHabitReorder(@org.jetbrains.annotations.NotNull()
        org.mula.finance.core.models.Habit from, @org.jetbrains.annotations.NotNull()
        org.mula.finance.core.models.Habit to);
    }
    
    /**
     * A Mode describes the behavior of the list upon clicking, long clicking
     * and dragging an item. This depends on whether some items are already
     * selected or not.
     */
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\bb\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\t"}, d2 = {"Lorg/mula/finance/activities/habits/list/views/HabitCardListController$Mode;", "", "onItemClick", "", "position", "", "onItemLongClick", "", "startDrag", "uhabits-android_debug"})
    static abstract interface Mode {
        
        public abstract void onItemClick(int position);
        
        public abstract boolean onItemLongClick(int position);
        
        public abstract void startDrag(int position);
    }
    
    /**
     * Mode activated when there are no items selected. Clicks trigger habit
     * click. Long clicks start selection.
     */
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0080\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\t\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\n\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0004\u00a8\u0006\u000b"}, d2 = {"Lorg/mula/finance/activities/habits/list/views/HabitCardListController$NormalMode;", "Lorg/mula/finance/activities/habits/list/views/HabitCardListController$Mode;", "(Lorg/mula/finance/activities/habits/list/views/HabitCardListController;)V", "onItemClick", "", "position", "", "onItemLongClick", "", "startDrag", "startSelection", "uhabits-android_debug"})
    public final class NormalMode implements org.mula.finance.activities.habits.list.views.HabitCardListController.Mode {
        
        @java.lang.Override()
        public void onItemClick(int position) {
        }
        
        @java.lang.Override()
        public boolean onItemLongClick(int position) {
            return false;
        }
        
        @java.lang.Override()
        public void startDrag(int position) {
        }
        
        protected final void startSelection(int position) {
        }
        
        public NormalMode() {
            super();
        }
    }
    
    /**
     * Mode activated when some items are already selected. Clicks toggle
     * item selection. Long clicks select more items.
     */
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0080\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0004J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0010\u0010\n\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0007H\u0016\u00a8\u0006\u000b"}, d2 = {"Lorg/mula/finance/activities/habits/list/views/HabitCardListController$SelectionMode;", "Lorg/mula/finance/activities/habits/list/views/HabitCardListController$Mode;", "(Lorg/mula/finance/activities/habits/list/views/HabitCardListController;)V", "notifyListener", "", "onItemClick", "position", "", "onItemLongClick", "", "startDrag", "uhabits-android_debug"})
    public final class SelectionMode implements org.mula.finance.activities.habits.list.views.HabitCardListController.Mode {
        
        @java.lang.Override()
        public void onItemClick(int position) {
        }
        
        @java.lang.Override()
        public boolean onItemLongClick(int position) {
            return false;
        }
        
        @java.lang.Override()
        public void startDrag(int position) {
        }
        
        protected final void notifyListener() {
        }
        
        public SelectionMode() {
            super();
        }
    }
}