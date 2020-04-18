package org.mula.finance.core.commands;

import javax.annotation.Generated;
import javax.inject.Inject;
import javax.inject.Provider;
import org.mula.finance.core.models.Habit;
import org.mula.finance.core.models.HabitList;
import org.mula.finance.core.models.ModelFactory;

@Generated(
  value = "com.google.auto.factory.processor.AutoFactoryProcessor",
  comments = "https://github.com/google/auto/tree/master/factory"
)
public final class EditHabitCommandFactory {
  private final Provider<ModelFactory> modelFactoryProvider;

  @Inject
  public EditHabitCommandFactory(Provider<ModelFactory> modelFactoryProvider) {
    this.modelFactoryProvider = checkNotNull(modelFactoryProvider, 1);
  }

  public EditHabitCommand create(HabitList habitList, Habit original, Habit modified) {
    return new EditHabitCommand(
        checkNotNull(modelFactoryProvider.get(), 1),
        checkNotNull(habitList, 2),
        checkNotNull(original, 3),
        checkNotNull(modified, 4));
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
