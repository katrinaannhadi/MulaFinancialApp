package org.isoron.uhabits;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import javax.inject.Provider;
import org.isoron.uhabits.core.commands.CommandRunner;
import org.isoron.uhabits.core.models.HabitList;
import org.isoron.uhabits.core.preferences.WidgetPreferences;
import org.isoron.uhabits.core.reminders.ReminderScheduler;
import org.isoron.uhabits.intents.IntentScheduler;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class HabitsModule_GetReminderSchedulerFactory implements Factory<ReminderScheduler> {
  private final HabitsModule module;

  private final Provider<IntentScheduler> sysProvider;

  private final Provider<CommandRunner> commandRunnerProvider;

  private final Provider<HabitList> habitListProvider;

  private final Provider<WidgetPreferences> widgetPreferencesProvider;

  public HabitsModule_GetReminderSchedulerFactory(HabitsModule module,
      Provider<IntentScheduler> sysProvider, Provider<CommandRunner> commandRunnerProvider,
      Provider<HabitList> habitListProvider,
      Provider<WidgetPreferences> widgetPreferencesProvider) {
    this.module = module;
    this.sysProvider = sysProvider;
    this.commandRunnerProvider = commandRunnerProvider;
    this.habitListProvider = habitListProvider;
    this.widgetPreferencesProvider = widgetPreferencesProvider;
  }

  @Override
  public ReminderScheduler get() {
    return getReminderScheduler(module, sysProvider.get(), commandRunnerProvider.get(), habitListProvider.get(), widgetPreferencesProvider.get());
  }

  public static HabitsModule_GetReminderSchedulerFactory create(HabitsModule module,
      Provider<IntentScheduler> sysProvider, Provider<CommandRunner> commandRunnerProvider,
      Provider<HabitList> habitListProvider,
      Provider<WidgetPreferences> widgetPreferencesProvider) {
    return new HabitsModule_GetReminderSchedulerFactory(module, sysProvider, commandRunnerProvider, habitListProvider, widgetPreferencesProvider);
  }

  public static ReminderScheduler getReminderScheduler(HabitsModule instance, IntentScheduler sys,
      CommandRunner commandRunner, HabitList habitList, WidgetPreferences widgetPreferences) {
    return Preconditions.checkNotNull(instance.getReminderScheduler(sys, commandRunner, habitList, widgetPreferences), "Cannot return null from a non-@Nullable @Provides method");
  }
}
