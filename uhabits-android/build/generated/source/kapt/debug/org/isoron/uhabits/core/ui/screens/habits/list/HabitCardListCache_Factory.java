package org.isoron.uhabits.core.ui.screens.habits.list;

import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;
import org.isoron.uhabits.core.commands.CommandRunner;
import org.isoron.uhabits.core.models.HabitList;
import org.isoron.uhabits.core.tasks.TaskRunner;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class HabitCardListCache_Factory implements Factory<HabitCardListCache> {
  private final Provider<HabitList> allHabitsProvider;

  private final Provider<CommandRunner> commandRunnerProvider;

  private final Provider<TaskRunner> taskRunnerProvider;

  public HabitCardListCache_Factory(Provider<HabitList> allHabitsProvider,
      Provider<CommandRunner> commandRunnerProvider, Provider<TaskRunner> taskRunnerProvider) {
    this.allHabitsProvider = allHabitsProvider;
    this.commandRunnerProvider = commandRunnerProvider;
    this.taskRunnerProvider = taskRunnerProvider;
  }

  @Override
  public HabitCardListCache get() {
    return newInstance(allHabitsProvider.get(), commandRunnerProvider.get(), taskRunnerProvider.get());
  }

  public static HabitCardListCache_Factory create(Provider<HabitList> allHabitsProvider,
      Provider<CommandRunner> commandRunnerProvider, Provider<TaskRunner> taskRunnerProvider) {
    return new HabitCardListCache_Factory(allHabitsProvider, commandRunnerProvider, taskRunnerProvider);
  }

  public static HabitCardListCache newInstance(HabitList allHabits, CommandRunner commandRunner,
      TaskRunner taskRunner) {
    return new HabitCardListCache(allHabits, commandRunner, taskRunner);
  }
}
