package org.isoron.uhabits.automation;

import android.content.*;
import org.isoron.uhabits.*;
import org.isoron.uhabits.core.models.*;
import org.isoron.uhabits.core.ui.widgets.*;
import org.isoron.uhabits.core.utils.*;
import org.isoron.uhabits.receivers.*;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u000bB\u0005\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\f"}, d2 = {"Lorg/isoron/uhabits/automation/FireSettingReceiver;", "Landroid/content/BroadcastReceiver;", "()V", "allHabits", "Lorg/isoron/uhabits/core/models/HabitList;", "onReceive", "", "context", "Landroid/content/Context;", "intent", "Landroid/content/Intent;", "ReceiverComponent", "uhabits-android_debug"})
public final class FireSettingReceiver extends android.content.BroadcastReceiver {
    private org.isoron.uhabits.core.models.HabitList allHabits;
    
    @java.lang.Override()
    public void onReceive(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    android.content.Intent intent) {
    }
    
    public FireSettingReceiver() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\ba\u0018\u00002\u00020\u0001R\u0012\u0010\u0002\u001a\u00020\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005\u00a8\u0006\u0006"}, d2 = {"Lorg/isoron/uhabits/automation/FireSettingReceiver$ReceiverComponent;", "", "widgetController", "Lorg/isoron/uhabits/core/ui/widgets/WidgetBehavior;", "getWidgetController", "()Lorg/isoron/uhabits/core/ui/widgets/WidgetBehavior;", "uhabits-android_debug"})
    @dagger.Component(dependencies = {org.isoron.uhabits.HabitsApplicationComponent.class})
    @org.isoron.uhabits.receivers.ReceiverScope()
    public static abstract interface ReceiverComponent {
        
        @org.jetbrains.annotations.NotNull()
        public abstract org.isoron.uhabits.core.ui.widgets.WidgetBehavior getWidgetController();
    }
}