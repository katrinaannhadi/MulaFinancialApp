package org.isoron.uhabits.activities.about;

import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;
import org.isoron.androidbase.activities.BaseActivity;
import org.isoron.uhabits.intents.IntentFactory;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class AboutScreen_Factory implements Factory<AboutScreen> {
  private final Provider<BaseActivity> activityProvider;

  private final Provider<IntentFactory> intentsProvider;

  public AboutScreen_Factory(Provider<BaseActivity> activityProvider,
      Provider<IntentFactory> intentsProvider) {
    this.activityProvider = activityProvider;
    this.intentsProvider = intentsProvider;
  }

  @Override
  public AboutScreen get() {
    return newInstance(activityProvider.get(), intentsProvider.get());
  }

  public static AboutScreen_Factory create(Provider<BaseActivity> activityProvider,
      Provider<IntentFactory> intentsProvider) {
    return new AboutScreen_Factory(activityProvider, intentsProvider);
  }

  public static AboutScreen newInstance(BaseActivity activity, IntentFactory intents) {
    return new AboutScreen(activity, intents);
  }
}
