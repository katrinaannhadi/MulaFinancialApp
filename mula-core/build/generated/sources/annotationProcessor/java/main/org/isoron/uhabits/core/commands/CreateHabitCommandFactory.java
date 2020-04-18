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
public final class CreateHabitCommandFactory {
  private final Provider<ModelFactory> modelFactoryProvider;

  @Inject
  public CreateHabitCommandFactory(Provider<ModelFactory> modelFactoryProvider) {
    this.modelFactoryProvider = checkNotNull(modelFactoryProvider, 1);
  }

  public CreateHabitCommand create(HabitList habitList, Habit model) {
    return new CreateHabitCommand(
        checkNotNull(modelFactoryProvider.get(), 1),
        checkNotNull(habitList, 2),
        checkNotNull(model, 3));
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
