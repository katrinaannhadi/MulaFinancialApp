package org.isoron.uhabits.activities;

import android.content.*;
import android.os.*;
import org.isoron.androidbase.activities.*;
import org.isoron.uhabits.*;
import org.isoron.uhabits.core.models.*;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b&\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0002J\u0012\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0014R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e\u00a8\u0006\u0017"}, d2 = {"Lorg/isoron/uhabits/activities/HabitsActivity;", "Lorg/isoron/androidbase/activities/BaseActivity;", "()V", "appComponent", "Lorg/isoron/uhabits/HabitsApplicationComponent;", "getAppComponent", "()Lorg/isoron/uhabits/HabitsApplicationComponent;", "setAppComponent", "(Lorg/isoron/uhabits/HabitsApplicationComponent;)V", "component", "Lorg/isoron/uhabits/activities/HabitsActivityComponent;", "getComponent", "()Lorg/isoron/uhabits/activities/HabitsActivityComponent;", "setComponent", "(Lorg/isoron/uhabits/activities/HabitsActivityComponent;)V", "getHabitFromIntent", "Lorg/isoron/uhabits/core/models/Habit;", "habitList", "Lorg/isoron/uhabits/core/models/HabitList;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "uhabits-android_debug"})
public abstract class HabitsActivity extends org.isoron.androidbase.activities.BaseActivity {
    @org.jetbrains.annotations.NotNull()
    public org.isoron.uhabits.activities.HabitsActivityComponent component;
    @org.jetbrains.annotations.NotNull()
    public org.isoron.uhabits.HabitsApplicationComponent appComponent;
    
    @org.jetbrains.annotations.NotNull()
    public final org.isoron.uhabits.activities.HabitsActivityComponent getComponent() {
        return null;
    }
    
    public final void setComponent(@org.jetbrains.annotations.NotNull()
    org.isoron.uhabits.activities.HabitsActivityComponent p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.isoron.uhabits.HabitsApplicationComponent getAppComponent() {
        return null;
    }
    
    public final void setAppComponent(@org.jetbrains.annotations.NotNull()
    org.isoron.uhabits.HabitsApplicationComponent p0) {
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final org.isoron.uhabits.core.models.Habit getHabitFromIntent(org.isoron.uhabits.core.models.HabitList habitList) {
        return null;
    }
    
    public HabitsActivity() {
        super();
    }
}