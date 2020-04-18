package org.mula.finance.core.tasks;

import java.io.File;
import java.util.List;
import javax.annotation.Generated;
import javax.inject.Inject;
import javax.inject.Provider;
import org.mula.finance.core.models.Habit;
import org.mula.finance.core.models.HabitList;

@Generated(
  value = "com.google.auto.factory.processor.AutoFactoryProcessor",
  comments = "https://github.com/google/auto/tree/master/factory"
)
public class ExportCSVTaskFactory {
  private final Provider<HabitList> habitListProvider;

  @Inject
  public ExportCSVTaskFactory(Provider<HabitList> habitListProvider) {
    this.habitListProvider = checkNotNull(habitListProvider, 1);
  }

  public ExportCSVTask create(
      List<Habit> selectedHabits, File outputDir, ExportCSVTask.Listener listener) {
    return new ExportCSVTask(
        checkNotNull(habitListProvider.get(), 1),
        checkNotNull(selectedHabits, 2),
        checkNotNull(outputDir, 3),
        checkNotNull(listener, 4));
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
