package org.mula.finance.core.ui.screens.habits.list;

import javax.annotation.Generated;
import javax.inject.Inject;
import javax.inject.Provider;
import org.mula.finance.core.preferences.Preferences;

@Generated(
  value = "com.google.auto.factory.processor.AutoFactoryProcessor",
  comments = "https://github.com/google/auto/tree/master/factory"
)
public final class HintListFactory {
  private final Provider<Preferences> prefsProvider;

  @Inject
  public HintListFactory(Provider<Preferences> prefsProvider) {
    this.prefsProvider = checkNotNull(prefsProvider, 1);
  }

  public HintList create(String[] hints) {
    return new HintList(checkNotNull(prefsProvider.get(), 1), checkNotNull(hints, 2));
  }

  private static <T> T checkNotNull(T reference, int argumentIndex) {
    if (reference == null) {
      throw new NullPointerException(
          "@AutoFactory method argument is null but is not marked @Nullable. Argument index: "
              + argumentIndex);
    }
    return reference;
  }
}
