package org.isoron.uhabits.activities.habits.list;

import android.os.*;
import org.isoron.uhabits.*;
import org.isoron.uhabits.activities.*;
import org.isoron.uhabits.activities.habits.list.views.*;
import org.isoron.uhabits.core.preferences.*;
import org.isoron.uhabits.core.utils.*;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\'\u001a\u00020(2\b\u0010)\u001a\u0004\u0018\u00010*H\u0014J\b\u0010+\u001a\u00020(H\u0014J\b\u0010,\u001a\u00020(H\u0014R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\u0010X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0015\u001a\u00020\u0016X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001b\u001a\u00020\u001cX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u001a\u0010!\u001a\u00020\"X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&\u00a8\u0006-"}, d2 = {"Lorg/isoron/uhabits/activities/habits/list/ListHabitsActivity;", "Lorg/isoron/uhabits/activities/HabitsActivity;", "()V", "adapter", "Lorg/isoron/uhabits/activities/habits/list/views/HabitCardListAdapter;", "getAdapter", "()Lorg/isoron/uhabits/activities/habits/list/views/HabitCardListAdapter;", "setAdapter", "(Lorg/isoron/uhabits/activities/habits/list/views/HabitCardListAdapter;)V", "midnightTimer", "Lorg/isoron/uhabits/core/utils/MidnightTimer;", "getMidnightTimer", "()Lorg/isoron/uhabits/core/utils/MidnightTimer;", "setMidnightTimer", "(Lorg/isoron/uhabits/core/utils/MidnightTimer;)V", "prefs", "Lorg/isoron/uhabits/core/preferences/Preferences;", "getPrefs", "()Lorg/isoron/uhabits/core/preferences/Preferences;", "setPrefs", "(Lorg/isoron/uhabits/core/preferences/Preferences;)V", "pureBlack", "", "getPureBlack", "()Z", "setPureBlack", "(Z)V", "rootView", "Lorg/isoron/uhabits/activities/habits/list/ListHabitsRootView;", "getRootView", "()Lorg/isoron/uhabits/activities/habits/list/ListHabitsRootView;", "setRootView", "(Lorg/isoron/uhabits/activities/habits/list/ListHabitsRootView;)V", "screen", "Lorg/isoron/uhabits/activities/habits/list/ListHabitsScreen;", "getScreen", "()Lorg/isoron/uhabits/activities/habits/list/ListHabitsScreen;", "setScreen", "(Lorg/isoron/uhabits/activities/habits/list/ListHabitsScreen;)V", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onPause", "onResume", "uhabits-android_debug"})
public final class ListHabitsActivity extends org.isoron.uhabits.activities.HabitsActivity {
    private boolean pureBlack;
    @org.jetbrains.annotations.NotNull()
    public org.isoron.uhabits.activities.habits.list.views.HabitCardListAdapter adapter;
    @org.jetbrains.annotations.NotNull()
    public org.isoron.uhabits.activities.habits.list.ListHabitsRootView rootView;
    @org.jetbrains.annotations.NotNull()
    public org.isoron.uhabits.activities.habits.list.ListHabitsScreen screen;
    @org.jetbrains.annotations.NotNull()
    public org.isoron.uhabits.core.preferences.Preferences prefs;
    @org.jetbrains.annotations.NotNull()
    public org.isoron.uhabits.core.utils.MidnightTimer midnightTimer;
    
    public final boolean getPureBlack() {
        return false;
    }
    
    public final void setPureBlack(boolean p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.isoron.uhabits.activities.habits.list.views.HabitCardListAdapter getAdapter() {
        return null;
    }
    
    public final void setAdapter(@org.jetbrains.annotations.NotNull()
    org.isoron.uhabits.activities.habits.list.views.HabitCardListAdapter p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.isoron.uhabits.activities.habits.list.ListHabitsRootView getRootView() {
        return null;
    }
    
    public final void setRootView(@org.jetbrains.annotations.NotNull()
    org.isoron.uhabits.activities.habits.list.ListHabitsRootView p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.isoron.uhabits.activities.habits.list.ListHabitsScreen getScreen() {
        return null;
    }
    
    public final void setScreen(@org.jetbrains.annotations.NotNull()
    org.isoron.uhabits.activities.habits.list.ListHabitsScreen p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.isoron.uhabits.core.preferences.Preferences getPrefs() {
        return null;
    }
    
    public final void setPrefs(@org.jetbrains.annotations.NotNull()
    org.isoron.uhabits.core.preferences.Preferences p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.isoron.uhabits.core.utils.MidnightTimer getMidnightTimer() {
        return null;
    }
    
    public final void setMidnightTimer(@org.jetbrains.annotations.NotNull()
    org.isoron.uhabits.core.utils.MidnightTimer p0) {
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    protected void onPause() {
    }
    
    @java.lang.Override()
    protected void onResume() {
    }
    
    public ListHabitsActivity() {
        super();
    }
}