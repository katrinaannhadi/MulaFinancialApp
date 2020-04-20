package org.isoron.uhabits.activities;

import androidx.core.content.*;
import org.isoron.androidbase.activities.*;
import org.isoron.uhabits.*;
import org.isoron.uhabits.core.preferences.*;
import org.isoron.uhabits.core.ui.*;
import javax.inject.*;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\b\u0010\u0007\u001a\u00020\bH\u0016J\b\u0010\t\u001a\u00020\bH\u0016J\b\u0010\n\u001a\u00020\bH\u0016J\u0006\u0010\u000b\u001a\u00020\fJ\b\u0010\r\u001a\u00020\fH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000e"}, d2 = {"Lorg/isoron/uhabits/activities/AndroidThemeSwitcher;", "Lorg/isoron/uhabits/core/ui/ThemeSwitcher;", "activity", "Lorg/isoron/androidbase/activities/BaseActivity;", "preferences", "Lorg/isoron/uhabits/core/preferences/Preferences;", "(Lorg/isoron/androidbase/activities/BaseActivity;Lorg/isoron/uhabits/core/preferences/Preferences;)V", "applyDarkTheme", "", "applyLightTheme", "applyPureBlackTheme", "getDialogTheme", "", "getSystemTheme", "uhabits-android_debug"})
@org.isoron.androidbase.activities.ActivityScope()
public final class AndroidThemeSwitcher extends org.isoron.uhabits.core.ui.ThemeSwitcher {
    private final org.isoron.androidbase.activities.BaseActivity activity = null;
    
    @java.lang.Override()
    public int getSystemTheme() {
        return 0;
    }
    
    @java.lang.Override()
    public void applyDarkTheme() {
    }
    
    @java.lang.Override()
    public void applyLightTheme() {
    }
    
    @java.lang.Override()
    public void applyPureBlackTheme() {
    }
    
    public final int getDialogTheme() {
        return 0;
    }
    
    @javax.inject.Inject()
    public AndroidThemeSwitcher(@org.jetbrains.annotations.NotNull()
    org.isoron.androidbase.activities.BaseActivity activity, @org.jetbrains.annotations.NotNull()
    org.isoron.uhabits.core.preferences.Preferences preferences) {
        super(null);
    }
}