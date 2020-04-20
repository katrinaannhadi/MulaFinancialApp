package org.isoron.uhabits.automation;

import android.content.Intent;
import org.isoron.uhabits.core.models.Habit;
import org.isoron.uhabits.core.models.HabitList;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001:\u0001\tB\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u001a\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007\u00a8\u0006\n"}, d2 = {"Lorg/isoron/uhabits/automation/SettingUtils;", "", "()V", "parseIntent", "Lorg/isoron/uhabits/automation/SettingUtils$Arguments;", "intent", "Landroid/content/Intent;", "allHabits", "Lorg/isoron/uhabits/core/models/HabitList;", "Arguments", "uhabits-android_debug"})
public final class SettingUtils {
    public static final org.isoron.uhabits.automation.SettingUtils INSTANCE = null;
    
    @org.jetbrains.annotations.Nullable()
    public static final org.isoron.uhabits.automation.SettingUtils.Arguments parseIntent(@org.jetbrains.annotations.NotNull()
    android.content.Intent intent, @org.jetbrains.annotations.NotNull()
    org.isoron.uhabits.core.models.HabitList allHabits) {
        return null;
    }
    
    private SettingUtils() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e\u00a8\u0006\u000f"}, d2 = {"Lorg/isoron/uhabits/automation/SettingUtils$Arguments;", "", "action", "", "habit", "Lorg/isoron/uhabits/core/models/Habit;", "(ILorg/isoron/uhabits/core/models/Habit;)V", "getAction", "()I", "setAction", "(I)V", "getHabit", "()Lorg/isoron/uhabits/core/models/Habit;", "setHabit", "(Lorg/isoron/uhabits/core/models/Habit;)V", "uhabits-android_debug"})
    public static final class Arguments {
        private int action;
        @org.jetbrains.annotations.NotNull()
        private org.isoron.uhabits.core.models.Habit habit;
        
        public final int getAction() {
            return 0;
        }
        
        public final void setAction(int p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final org.isoron.uhabits.core.models.Habit getHabit() {
            return null;
        }
        
        public final void setHabit(@org.jetbrains.annotations.NotNull()
        org.isoron.uhabits.core.models.Habit p0) {
        }
        
        public Arguments(int action, @org.jetbrains.annotations.NotNull()
        org.isoron.uhabits.core.models.Habit habit) {
            super();
        }
    }
}