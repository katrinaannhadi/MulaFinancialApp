package org.isoron.uhabits.activities.about;

import android.content.Context;
import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;
import org.isoron.uhabits.core.ui.screens.about.AboutBehavior;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class AboutRootView_Factory implements Factory<AboutRootView> {
  private final Provider<Context> contextProvider;

  private final Provider<AboutBehavior> behaviorProvider;

  public AboutRootView_Factory(Provider<Context> contextProvider,
      Provider<AboutBehavior> behaviorProvider) {
    this.contextProvider = contextProvider;
    this.behaviorProvider = behaviorProvider;
  }

  @Override
  public AboutRootView get() {
    return newInstance(contextProvider.get(), behaviorProvider.get());
  }

  public static AboutRootView_Factory create(Provider<Context> contextProvider,
      Provider<AboutBehavior> behaviorProvider) {
    return new AboutRootView_Factory(contextProvider, behaviorProvider);
  }

  public static AboutRootView newInstance(Context context, AboutBehavior behavior) {
    return new AboutRootView(context, behavior);
  }
}
