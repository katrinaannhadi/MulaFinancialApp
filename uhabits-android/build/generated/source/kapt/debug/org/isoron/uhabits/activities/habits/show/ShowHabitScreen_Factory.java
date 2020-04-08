package org.isoron.uhabits.activities.habits.show;

import dagger.Lazy;
import dagger.internal.DoubleCheck;
import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;
import org.isoron.androidbase.activities.BaseActivity;
import org.isoron.uhabits.activities.common.dialogs.ConfirmDeleteDialogFactory;
import org.isoron.uhabits.activities.habits.edit.EditHabitDialogFactory;
import org.isoron.uhabits.core.models.Habit;
import org.isoron.uhabits.core.ui.screens.habits.show.ShowHabitBehavior;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class ShowHabitScreen_Factory implements Factory<ShowHabitScreen> {
  private final Provider<BaseActivity> activityProvider;

  private final Provider<Habit> habitProvider;

  private final Provider<ShowHabitRootView> viewProvider;

  private final Provider<ShowHabitsMenu> menuProvider;

  private final Provider<EditHabitDialogFactory> editHabitDialogFactoryProvider;

  private final Provider<ConfirmDeleteDialogFactory> confirmDeleteDialogFactoryProvider;

  private final Provider<ShowHabitBehavior> behaviorProvider;

  public ShowHabitScreen_Factory(Provider<BaseActivity> activityProvider,
      Provider<Habit> habitProvider, Provider<ShowHabitRootView> viewProvider,
      Provider<ShowHabitsMenu> menuProvider,
      Provider<EditHabitDialogFactory> editHabitDialogFactoryProvider,
      Provider<ConfirmDeleteDialogFactory> confirmDeleteDialogFactoryProvider,
      Provider<ShowHabitBehavior> behaviorProvider) {
    this.activityProvider = activityProvider;
    this.habitProvider = habitProvider;
    this.viewProvider = viewProvider;
    this.menuProvider = menuProvider;
    this.editHabitDialogFactoryProvider = editHabitDialogFactoryProvider;
    this.confirmDeleteDialogFactoryProvider = confirmDeleteDialogFactoryProvider;
    this.behaviorProvider = behaviorProvider;
  }

  @Override
  public ShowHabitScreen get() {
    return newInstance(activityProvider.get(), habitProvider.get(), viewProvider.get(), menuProvider.get(), editHabitDialogFactoryProvider.get(), confirmDeleteDialogFactoryProvider.get(), DoubleCheck.lazy(behaviorProvider));
  }

  public static ShowHabitScreen_Factory create(Provider<BaseActivity> activityProvider,
      Provider<Habit> habitProvider, Provider<ShowHabitRootView> viewProvider,
      Provider<ShowHabitsMenu> menuProvider,
      Provider<EditHabitDialogFactory> editHabitDialogFactoryProvider,
      Provider<ConfirmDeleteDialogFactory> confirmDeleteDialogFactoryProvider,
      Provider<ShowHabitBehavior> behaviorProvider) {
    return new ShowHabitScreen_Factory(activityProvider, habitProvider, viewProvider, menuProvider, editHabitDialogFactoryProvider, confirmDeleteDialogFactoryProvider, behaviorProvider);
  }

  public static ShowHabitScreen newInstance(BaseActivity activity, Habit habit,
      ShowHabitRootView view, ShowHabitsMenu menu, EditHabitDialogFactory editHabitDialogFactory,
      ConfirmDeleteDialogFactory confirmDeleteDialogFactory, Lazy<ShowHabitBehavior> behavior) {
    return new ShowHabitScreen(activity, habit, view, menu, editHabitDialogFactory, confirmDeleteDialogFactory, behavior);
  }
}
