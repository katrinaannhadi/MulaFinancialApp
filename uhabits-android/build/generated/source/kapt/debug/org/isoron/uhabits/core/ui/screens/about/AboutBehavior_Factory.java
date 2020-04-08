package org.isoron.uhabits.core.ui.screens.about;

import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;
import org.isoron.uhabits.core.preferences.Preferences;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class AboutBehavior_Factory implements Factory<AboutBehavior> {
  private final Provider<Preferences> prefsProvider;

  private final Provider<AboutBehavior.Screen> screenProvider;

  public AboutBehavior_Factory(Provider<Preferences> prefsProvider,
      Provider<AboutBehavior.Screen> screenProvider) {
    this.prefsProvider = prefsProvider;
    this.screenProvider = screenProvider;
  }

  @Override
  public AboutBehavior get() {
    return newInstance(prefsProvider.get(), screenProvider.get());
  }

  public static AboutBehavior_Factory create(Provider<Preferences> prefsProvider,
      Provider<AboutBehavior.Screen> screenProvider) {
    return new AboutBehavior_Factory(prefsProvider, screenProvider);
  }

  public static AboutBehavior newInstance(Preferences prefs, AboutBehavior.Screen screen) {
    return new AboutBehavior(prefs, screen);
  }
}
