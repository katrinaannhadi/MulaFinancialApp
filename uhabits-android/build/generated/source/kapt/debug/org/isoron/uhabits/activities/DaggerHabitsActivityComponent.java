package org.isoron.uhabits.activities;

import android.content.Context;
import dagger.internal.DelegateFactory;
import dagger.internal.DoubleCheck;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import javax.inject.Provider;
import org.isoron.androidbase.AndroidDirFinder;
import org.isoron.androidbase.AndroidDirFinder_Factory;
import org.isoron.androidbase.activities.ActivityContextModule;
import org.isoron.androidbase.activities.ActivityContextModule_GetContextFactory;
import org.isoron.androidbase.activities.BaseActivity;
import org.isoron.androidbase.activities.BaseActivityModule;
import org.isoron.androidbase.activities.BaseActivityModule_GetBaseActivityFactory;
import org.isoron.uhabits.HabitsApplicationComponent;
import org.isoron.uhabits.activities.about.AboutRootView;
import org.isoron.uhabits.activities.about.AboutScreen;
import org.isoron.uhabits.activities.common.dialogs.ColorPickerDialogFactory;
import org.isoron.uhabits.activities.common.dialogs.ColorPickerDialogFactory_Factory;
import org.isoron.uhabits.activities.common.dialogs.ConfirmDeleteDialogFactory;
import org.isoron.uhabits.activities.common.dialogs.ConfirmDeleteDialogFactory_Factory;
import org.isoron.uhabits.activities.common.dialogs.NumberPickerFactory;
import org.isoron.uhabits.activities.common.dialogs.NumberPickerFactory_Factory;
import org.isoron.uhabits.activities.habits.edit.EditHabitDialogFactory_Factory;
import org.isoron.uhabits.activities.habits.list.BugReporterProxy;
import org.isoron.uhabits.activities.habits.list.BugReporterProxy_Factory;
import org.isoron.uhabits.activities.habits.list.ListHabitsMenu;
import org.isoron.uhabits.activities.habits.list.ListHabitsMenu_Factory;
import org.isoron.uhabits.activities.habits.list.ListHabitsRootView;
import org.isoron.uhabits.activities.habits.list.ListHabitsRootView_Factory;
import org.isoron.uhabits.activities.habits.list.ListHabitsScreen;
import org.isoron.uhabits.activities.habits.list.ListHabitsScreen_Factory;
import org.isoron.uhabits.activities.habits.list.ListHabitsSelectionMenu;
import org.isoron.uhabits.activities.habits.list.ListHabitsSelectionMenu_Factory;
import org.isoron.uhabits.activities.habits.list.views.CheckmarkButtonViewFactory;
import org.isoron.uhabits.activities.habits.list.views.CheckmarkButtonViewFactory_Factory;
import org.isoron.uhabits.activities.habits.list.views.CheckmarkPanelViewFactory;
import org.isoron.uhabits.activities.habits.list.views.CheckmarkPanelViewFactory_Factory;
import org.isoron.uhabits.activities.habits.list.views.HabitCardListAdapter;
import org.isoron.uhabits.activities.habits.list.views.HabitCardListAdapter_Factory;
import org.isoron.uhabits.activities.habits.list.views.HabitCardListController;
import org.isoron.uhabits.activities.habits.list.views.HabitCardListController_Factory;
import org.isoron.uhabits.activities.habits.list.views.HabitCardListViewFactory;
import org.isoron.uhabits.activities.habits.list.views.HabitCardListViewFactory_Factory;
import org.isoron.uhabits.activities.habits.list.views.HabitCardViewFactory;
import org.isoron.uhabits.activities.habits.list.views.HabitCardViewFactory_Factory;
import org.isoron.uhabits.activities.habits.list.views.NumberButtonViewFactory;
import org.isoron.uhabits.activities.habits.list.views.NumberButtonViewFactory_Factory;
import org.isoron.uhabits.activities.habits.list.views.NumberPanelViewFactory;
import org.isoron.uhabits.activities.habits.list.views.NumberPanelViewFactory_Factory;
import org.isoron.uhabits.activities.habits.show.ShowHabitRootView;
import org.isoron.uhabits.activities.habits.show.ShowHabitRootView_Factory;
import org.isoron.uhabits.activities.habits.show.ShowHabitScreen;
import org.isoron.uhabits.activities.habits.show.ShowHabitScreen_Factory;
import org.isoron.uhabits.activities.habits.show.ShowHabitsMenu;
import org.isoron.uhabits.activities.habits.show.ShowHabitsMenu_Factory;
import org.isoron.uhabits.core.commands.CommandRunner;
import org.isoron.uhabits.core.io.GenericImporter;
import org.isoron.uhabits.core.models.Habit;
import org.isoron.uhabits.core.models.HabitList;
import org.isoron.uhabits.core.models.ModelFactory;
import org.isoron.uhabits.core.preferences.Preferences;
import org.isoron.uhabits.core.tasks.TaskRunner;
import org.isoron.uhabits.core.ui.NotificationTray;
import org.isoron.uhabits.core.ui.screens.about.AboutBehavior;
import org.isoron.uhabits.core.ui.screens.habits.list.HabitCardListCache;
import org.isoron.uhabits.core.ui.screens.habits.list.HintListFactory;
import org.isoron.uhabits.core.ui.screens.habits.list.HintListFactory_Factory;
import org.isoron.uhabits.core.ui.screens.habits.list.ListHabitsBehavior;
import org.isoron.uhabits.core.ui.screens.habits.list.ListHabitsBehavior_Factory;
import org.isoron.uhabits.core.ui.screens.habits.list.ListHabitsMenuBehavior;
import org.isoron.uhabits.core.ui.screens.habits.list.ListHabitsMenuBehavior_Factory;
import org.isoron.uhabits.core.ui.screens.habits.list.ListHabitsSelectionMenuBehavior;
import org.isoron.uhabits.core.ui.screens.habits.list.ListHabitsSelectionMenuBehavior_Factory;
import org.isoron.uhabits.core.ui.screens.habits.show.ShowHabitBehavior;
import org.isoron.uhabits.core.ui.screens.habits.show.ShowHabitBehavior_Factory;
import org.isoron.uhabits.core.ui.screens.habits.show.ShowHabitMenuBehavior;
import org.isoron.uhabits.core.ui.screens.habits.show.ShowHabitMenuBehavior_Factory;
import org.isoron.uhabits.core.utils.MidnightTimer;
import org.isoron.uhabits.intents.IntentFactory;
import org.isoron.uhabits.tasks.ExportDBTaskFactory;
import org.isoron.uhabits.tasks.ExportDBTaskFactory_Factory;
import org.isoron.uhabits.tasks.ImportDataTaskFactory;
import org.isoron.uhabits.tasks.ImportDataTaskFactory_Factory;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class DaggerHabitsActivityComponent implements HabitsActivityComponent {
  private final ActivityContextModule activityContextModule;

  private final HabitsApplicationComponent habitsApplicationComponent;

  private final BaseActivityModule baseActivityModule;

  private Provider<Context> getContextProvider;

  private Provider<ColorPickerDialogFactory> colorPickerDialogFactoryProvider;

  private Provider<HabitCardListCache> getHabitCardListCacheProvider;

  private Provider<Preferences> getPreferencesProvider;

  private Provider<MidnightTimer> getMidnightTimerProvider;

  private Provider<HabitCardListAdapter> habitCardListAdapterProvider;

  private Provider<BaseActivity> getBaseActivityProvider;

  private Provider<HintListFactory> hintListFactoryProvider;

  private Provider<TaskRunner> getTaskRunnerProvider;

  private Provider<CheckmarkButtonViewFactory> checkmarkButtonViewFactoryProvider;

  private Provider<CheckmarkPanelViewFactory> checkmarkPanelViewFactoryProvider;

  private Provider<NumberButtonViewFactory> numberButtonViewFactoryProvider;

  private Provider<NumberPanelViewFactory> numberPanelViewFactoryProvider;

  private Provider<HabitList> getHabitListProvider;

  private Provider<Context> getContextProvider2;

  private Provider<AndroidDirFinder> androidDirFinderProvider;

  private Provider<HabitsDirFinder> habitsDirFinderProvider;

  private Provider<ListHabitsScreen> listHabitsScreenProvider;

  private Provider<CommandRunner> getCommandRunnerProvider;

  private Provider<BugReporterProxy> bugReporterProxyProvider;

  private Provider<ListHabitsBehavior> listHabitsBehaviorProvider;

  private Provider<HabitCardViewFactory> habitCardViewFactoryProvider;

  private Provider<ListHabitsSelectionMenuBehavior> listHabitsSelectionMenuBehaviorProvider;

  private Provider<HabitCardListController> habitCardListControllerProvider;

  private Provider<NotificationTray> getNotificationTrayProvider;

  private Provider<ListHabitsSelectionMenu> listHabitsSelectionMenuProvider;

  private Provider<HabitCardListViewFactory> habitCardListViewFactoryProvider;

  private Provider<ListHabitsRootView> listHabitsRootViewProvider;

  private Provider<IntentFactory> getIntentFactoryProvider;

  private Provider<AndroidThemeSwitcher> androidThemeSwitcherProvider;

  private Provider<ExportDBTaskFactory> exportDBTaskFactoryProvider;

  private Provider<GenericImporter> getGenericImporterProvider;

  private Provider<ModelFactory> getModelFactoryProvider;

  private Provider<ImportDataTaskFactory> importDataTaskFactoryProvider;

  private Provider<ConfirmDeleteDialogFactory> confirmDeleteDialogFactoryProvider;

  private Provider<NumberPickerFactory> numberPickerFactoryProvider;

  private Provider<ListHabitsMenuBehavior> listHabitsMenuBehaviorProvider;

  private Provider<ListHabitsMenu> listHabitsMenuProvider;

  private Provider<Habit> getHabitProvider;

  private Provider<ShowHabitRootView> showHabitRootViewProvider;

  private Provider<ShowHabitScreen> showHabitScreenProvider;

  private Provider<ShowHabitMenuBehavior> showHabitMenuBehaviorProvider;

  private Provider<ShowHabitsMenu> showHabitsMenuProvider;

  private Provider<ShowHabitBehavior> showHabitBehaviorProvider;

  private DaggerHabitsActivityComponent(ActivityContextModule activityContextModuleParam,
      BaseActivityModule baseActivityModuleParam, HabitModule habitModuleParam,
      HabitsApplicationComponent habitsApplicationComponentParam) {
    this.activityContextModule = activityContextModuleParam;
    this.habitsApplicationComponent = habitsApplicationComponentParam;
    this.baseActivityModule = baseActivityModuleParam;
    initialize(activityContextModuleParam, baseActivityModuleParam, habitModuleParam, habitsApplicationComponentParam);
  }

  public static Builder builder() {
    return new Builder();
  }

  private AboutBehavior getAboutBehavior() {
    return new AboutBehavior(Preconditions.checkNotNull(habitsApplicationComponent.getPreferences(), "Cannot return null from a non-@Nullable component method"), getAboutScreen());}

  private AndroidDirFinder getAndroidDirFinder() {
    return new AndroidDirFinder(Preconditions.checkNotNull(habitsApplicationComponent.getContext(), "Cannot return null from a non-@Nullable component method"));}

  private HabitsDirFinder getHabitsDirFinder() {
    return new HabitsDirFinder(getAndroidDirFinder());}

  private BugReporterProxy getBugReporterProxy() {
    return new BugReporterProxy(Preconditions.checkNotNull(habitsApplicationComponent.getContext(), "Cannot return null from a non-@Nullable component method"));}

  @SuppressWarnings("unchecked")
  private void initialize(final ActivityContextModule activityContextModuleParam,
      final BaseActivityModule baseActivityModuleParam, final HabitModule habitModuleParam,
      final HabitsApplicationComponent habitsApplicationComponentParam) {
    this.getContextProvider = ActivityContextModule_GetContextFactory.create(activityContextModuleParam);
    this.colorPickerDialogFactoryProvider = DoubleCheck.provider(ColorPickerDialogFactory_Factory.create(getContextProvider));
    this.getHabitCardListCacheProvider = new org_isoron_uhabits_HabitsApplicationComponent_getHabitCardListCache(habitsApplicationComponentParam);
    this.getPreferencesProvider = new org_isoron_uhabits_HabitsApplicationComponent_getPreferences(habitsApplicationComponentParam);
    this.getMidnightTimerProvider = new org_isoron_uhabits_HabitsApplicationComponent_getMidnightTimer(habitsApplicationComponentParam);
    this.habitCardListAdapterProvider = DoubleCheck.provider(HabitCardListAdapter_Factory.create(getHabitCardListCacheProvider, getPreferencesProvider, getMidnightTimerProvider));
    this.getBaseActivityProvider = BaseActivityModule_GetBaseActivityFactory.create(baseActivityModuleParam);
    this.hintListFactoryProvider = HintListFactory_Factory.create(getPreferencesProvider);
    this.getTaskRunnerProvider = new org_isoron_uhabits_HabitsApplicationComponent_getTaskRunner(habitsApplicationComponentParam);
    this.checkmarkButtonViewFactoryProvider = CheckmarkButtonViewFactory_Factory.create(getContextProvider, getPreferencesProvider);
    this.checkmarkPanelViewFactoryProvider = CheckmarkPanelViewFactory_Factory.create(getContextProvider, getPreferencesProvider, checkmarkButtonViewFactoryProvider);
    this.numberButtonViewFactoryProvider = NumberButtonViewFactory_Factory.create(getContextProvider, getPreferencesProvider);
    this.numberPanelViewFactoryProvider = NumberPanelViewFactory_Factory.create(getContextProvider, getPreferencesProvider, numberButtonViewFactoryProvider);
    this.getHabitListProvider = new org_isoron_uhabits_HabitsApplicationComponent_getHabitList(habitsApplicationComponentParam);
    this.getContextProvider2 = new org_isoron_uhabits_HabitsApplicationComponent_getContext(habitsApplicationComponentParam);
    this.androidDirFinderProvider = AndroidDirFinder_Factory.create(getContextProvider2);
    this.habitsDirFinderProvider = HabitsDirFinder_Factory.create(androidDirFinderProvider);
    this.listHabitsScreenProvider = new DelegateFactory<>();
    this.getCommandRunnerProvider = new org_isoron_uhabits_HabitsApplicationComponent_getCommandRunner(habitsApplicationComponentParam);
    this.bugReporterProxyProvider = BugReporterProxy_Factory.create(getContextProvider2);
    this.listHabitsBehaviorProvider = ListHabitsBehavior_Factory.create(getHabitListProvider, (Provider) habitsDirFinderProvider, getTaskRunnerProvider, (Provider) listHabitsScreenProvider, getCommandRunnerProvider, getPreferencesProvider, (Provider) bugReporterProxyProvider);
    this.habitCardViewFactoryProvider = HabitCardViewFactory_Factory.create(getContextProvider, checkmarkPanelViewFactoryProvider, numberPanelViewFactoryProvider, listHabitsBehaviorProvider);
    this.listHabitsSelectionMenuBehaviorProvider = ListHabitsSelectionMenuBehavior_Factory.create(getHabitListProvider, (Provider) listHabitsScreenProvider, (Provider) habitCardListAdapterProvider, getCommandRunnerProvider);
    this.habitCardListControllerProvider = new DelegateFactory<>();
    this.getNotificationTrayProvider = new org_isoron_uhabits_HabitsApplicationComponent_getNotificationTray(habitsApplicationComponentParam);
    this.listHabitsSelectionMenuProvider = DoubleCheck.provider(ListHabitsSelectionMenu_Factory.create(listHabitsScreenProvider, habitCardListAdapterProvider, getCommandRunnerProvider, getPreferencesProvider, listHabitsSelectionMenuBehaviorProvider, habitCardListControllerProvider, getNotificationTrayProvider));
    DelegateFactory.setDelegate(habitCardListControllerProvider, DoubleCheck.provider(HabitCardListController_Factory.create(habitCardListAdapterProvider, listHabitsBehaviorProvider, listHabitsSelectionMenuProvider)));
    this.habitCardListViewFactoryProvider = HabitCardListViewFactory_Factory.create(getContextProvider, habitCardListAdapterProvider, habitCardViewFactoryProvider, habitCardListControllerProvider);
    this.listHabitsRootViewProvider = DoubleCheck.provider(ListHabitsRootView_Factory.create(getContextProvider, hintListFactoryProvider, getPreferencesProvider, getMidnightTimerProvider, getTaskRunnerProvider, habitCardListAdapterProvider, habitCardListViewFactoryProvider));
    this.getIntentFactoryProvider = new org_isoron_uhabits_HabitsApplicationComponent_getIntentFactory(habitsApplicationComponentParam);
    this.androidThemeSwitcherProvider = DoubleCheck.provider(AndroidThemeSwitcher_Factory.create(getBaseActivityProvider, getPreferencesProvider));
    this.exportDBTaskFactoryProvider = ExportDBTaskFactory_Factory.create(getContextProvider2, androidDirFinderProvider);
    this.getGenericImporterProvider = new org_isoron_uhabits_HabitsApplicationComponent_getGenericImporter(habitsApplicationComponentParam);
    this.getModelFactoryProvider = new org_isoron_uhabits_HabitsApplicationComponent_getModelFactory(habitsApplicationComponentParam);
    this.importDataTaskFactoryProvider = ImportDataTaskFactory_Factory.create(getGenericImporterProvider, getModelFactoryProvider);
    this.confirmDeleteDialogFactoryProvider = ConfirmDeleteDialogFactory_Factory.create(getContextProvider);
    this.numberPickerFactoryProvider = NumberPickerFactory_Factory.create(getContextProvider);
    this.listHabitsMenuBehaviorProvider = ListHabitsMenuBehavior_Factory.create((Provider) listHabitsScreenProvider, (Provider) habitCardListAdapterProvider, getPreferencesProvider, (Provider) androidThemeSwitcherProvider);
    this.listHabitsMenuProvider = DoubleCheck.provider(ListHabitsMenu_Factory.create(getBaseActivityProvider, getPreferencesProvider, (Provider) androidThemeSwitcherProvider, listHabitsMenuBehaviorProvider));
    DelegateFactory.setDelegate(listHabitsScreenProvider, DoubleCheck.provider(ListHabitsScreen_Factory.create(getBaseActivityProvider, listHabitsRootViewProvider, getCommandRunnerProvider, getIntentFactoryProvider, (Provider) androidThemeSwitcherProvider, getPreferencesProvider, habitCardListAdapterProvider, getTaskRunnerProvider, exportDBTaskFactoryProvider, importDataTaskFactoryProvider, confirmDeleteDialogFactoryProvider, colorPickerDialogFactoryProvider, EditHabitDialogFactory_Factory.create(), numberPickerFactoryProvider, listHabitsBehaviorProvider, listHabitsMenuProvider, listHabitsSelectionMenuProvider)));
    this.getHabitProvider = HabitModule_GetHabitFactory.create(habitModuleParam);
    this.showHabitRootViewProvider = DoubleCheck.provider(ShowHabitRootView_Factory.create(getContextProvider, getHabitProvider));
    this.showHabitScreenProvider = new DelegateFactory<>();
    this.showHabitMenuBehaviorProvider = ShowHabitMenuBehavior_Factory.create(getHabitListProvider, getHabitProvider, getTaskRunnerProvider, (Provider) showHabitScreenProvider, (Provider) habitsDirFinderProvider, getCommandRunnerProvider);
    this.showHabitsMenuProvider = DoubleCheck.provider(ShowHabitsMenu_Factory.create(getBaseActivityProvider, showHabitMenuBehaviorProvider, getPreferencesProvider));
    this.showHabitBehaviorProvider = ShowHabitBehavior_Factory.create(getHabitListProvider, getCommandRunnerProvider, getHabitProvider, (Provider) showHabitScreenProvider);
    DelegateFactory.setDelegate(showHabitScreenProvider, DoubleCheck.provider(ShowHabitScreen_Factory.create(getBaseActivityProvider, getHabitProvider, showHabitRootViewProvider, showHabitsMenuProvider, EditHabitDialogFactory_Factory.create(), confirmDeleteDialogFactoryProvider, showHabitBehaviorProvider)));
  }

  @Override
  public AboutRootView getAboutRootView() {
    return new AboutRootView(ActivityContextModule_GetContextFactory.getContext(activityContextModule), getAboutBehavior());}

  @Override
  public AboutScreen getAboutScreen() {
    return new AboutScreen(BaseActivityModule_GetBaseActivityFactory.getBaseActivity(baseActivityModule), Preconditions.checkNotNull(habitsApplicationComponent.getIntentFactory(), "Cannot return null from a non-@Nullable component method"));}

  @Override
  public ColorPickerDialogFactory getColorPickerDialogFactory() {
    return colorPickerDialogFactoryProvider.get();}

  @Override
  public HabitCardListAdapter getHabitCardListAdapter() {
    return habitCardListAdapterProvider.get();}

  @Override
  public ListHabitsBehavior getListHabitsBehavior() {
    return new ListHabitsBehavior(Preconditions.checkNotNull(habitsApplicationComponent.getHabitList(), "Cannot return null from a non-@Nullable component method"), getHabitsDirFinder(), Preconditions.checkNotNull(habitsApplicationComponent.getTaskRunner(), "Cannot return null from a non-@Nullable component method"), listHabitsScreenProvider.get(), Preconditions.checkNotNull(habitsApplicationComponent.getCommandRunner(), "Cannot return null from a non-@Nullable component method"), Preconditions.checkNotNull(habitsApplicationComponent.getPreferences(), "Cannot return null from a non-@Nullable component method"), getBugReporterProxy());}

  @Override
  public ListHabitsMenu getListHabitsMenu() {
    return listHabitsMenuProvider.get();}

  @Override
  public ListHabitsRootView getListHabitsRootView() {
    return listHabitsRootViewProvider.get();}

  @Override
  public ListHabitsScreen getListHabitsScreen() {
    return listHabitsScreenProvider.get();}

  @Override
  public ListHabitsSelectionMenu getListHabitsSelectionMenu() {
    return listHabitsSelectionMenuProvider.get();}

  @Override
  public ShowHabitScreen getShowHabitScreen() {
    return showHabitScreenProvider.get();}

  @Override
  public AndroidThemeSwitcher getThemeSwitcher() {
    return androidThemeSwitcherProvider.get();}

  public static final class Builder {
    private ActivityContextModule activityContextModule;

    private BaseActivityModule baseActivityModule;

    private HabitModule habitModule;

    private HabitsApplicationComponent habitsApplicationComponent;

    private Builder() {
    }

    public Builder activityContextModule(ActivityContextModule activityContextModule) {
      this.activityContextModule = Preconditions.checkNotNull(activityContextModule);
      return this;
    }

    public Builder baseActivityModule(BaseActivityModule baseActivityModule) {
      this.baseActivityModule = Preconditions.checkNotNull(baseActivityModule);
      return this;
    }

    public Builder habitModule(HabitModule habitModule) {
      this.habitModule = Preconditions.checkNotNull(habitModule);
      return this;
    }

    public Builder habitsApplicationComponent(
        HabitsApplicationComponent habitsApplicationComponent) {
      this.habitsApplicationComponent = Preconditions.checkNotNull(habitsApplicationComponent);
      return this;
    }

    public HabitsActivityComponent build() {
      Preconditions.checkBuilderRequirement(activityContextModule, ActivityContextModule.class);
      Preconditions.checkBuilderRequirement(baseActivityModule, BaseActivityModule.class);
      Preconditions.checkBuilderRequirement(habitModule, HabitModule.class);
      Preconditions.checkBuilderRequirement(habitsApplicationComponent, HabitsApplicationComponent.class);
      return new DaggerHabitsActivityComponent(activityContextModule, baseActivityModule, habitModule, habitsApplicationComponent);
    }
  }

  private static class org_isoron_uhabits_HabitsApplicationComponent_getHabitCardListCache implements Provider<HabitCardListCache> {
    private final HabitsApplicationComponent habitsApplicationComponent;

    org_isoron_uhabits_HabitsApplicationComponent_getHabitCardListCache(
        HabitsApplicationComponent habitsApplicationComponent) {
      this.habitsApplicationComponent = habitsApplicationComponent;
    }

    @Override
    public HabitCardListCache get() {
      return Preconditions.checkNotNull(habitsApplicationComponent.getHabitCardListCache(), "Cannot return null from a non-@Nullable component method");
    }
  }

  private static class org_isoron_uhabits_HabitsApplicationComponent_getPreferences implements Provider<Preferences> {
    private final HabitsApplicationComponent habitsApplicationComponent;

    org_isoron_uhabits_HabitsApplicationComponent_getPreferences(
        HabitsApplicationComponent habitsApplicationComponent) {
      this.habitsApplicationComponent = habitsApplicationComponent;
    }

    @Override
    public Preferences get() {
      return Preconditions.checkNotNull(habitsApplicationComponent.getPreferences(), "Cannot return null from a non-@Nullable component method");
    }
  }

  private static class org_isoron_uhabits_HabitsApplicationComponent_getMidnightTimer implements Provider<MidnightTimer> {
    private final HabitsApplicationComponent habitsApplicationComponent;

    org_isoron_uhabits_HabitsApplicationComponent_getMidnightTimer(
        HabitsApplicationComponent habitsApplicationComponent) {
      this.habitsApplicationComponent = habitsApplicationComponent;
    }

    @Override
    public MidnightTimer get() {
      return Preconditions.checkNotNull(habitsApplicationComponent.getMidnightTimer(), "Cannot return null from a non-@Nullable component method");
    }
  }

  private static class org_isoron_uhabits_HabitsApplicationComponent_getTaskRunner implements Provider<TaskRunner> {
    private final HabitsApplicationComponent habitsApplicationComponent;

    org_isoron_uhabits_HabitsApplicationComponent_getTaskRunner(
        HabitsApplicationComponent habitsApplicationComponent) {
      this.habitsApplicationComponent = habitsApplicationComponent;
    }

    @Override
    public TaskRunner get() {
      return Preconditions.checkNotNull(habitsApplicationComponent.getTaskRunner(), "Cannot return null from a non-@Nullable component method");
    }
  }

  private static class org_isoron_uhabits_HabitsApplicationComponent_getHabitList implements Provider<HabitList> {
    private final HabitsApplicationComponent habitsApplicationComponent;

    org_isoron_uhabits_HabitsApplicationComponent_getHabitList(
        HabitsApplicationComponent habitsApplicationComponent) {
      this.habitsApplicationComponent = habitsApplicationComponent;
    }

    @Override
    public HabitList get() {
      return Preconditions.checkNotNull(habitsApplicationComponent.getHabitList(), "Cannot return null from a non-@Nullable component method");
    }
  }

  private static class org_isoron_uhabits_HabitsApplicationComponent_getContext implements Provider<Context> {
    private final HabitsApplicationComponent habitsApplicationComponent;

    org_isoron_uhabits_HabitsApplicationComponent_getContext(
        HabitsApplicationComponent habitsApplicationComponent) {
      this.habitsApplicationComponent = habitsApplicationComponent;
    }

    @Override
    public Context get() {
      return Preconditions.checkNotNull(habitsApplicationComponent.getContext(), "Cannot return null from a non-@Nullable component method");
    }
  }

  private static class org_isoron_uhabits_HabitsApplicationComponent_getCommandRunner implements Provider<CommandRunner> {
    private final HabitsApplicationComponent habitsApplicationComponent;

    org_isoron_uhabits_HabitsApplicationComponent_getCommandRunner(
        HabitsApplicationComponent habitsApplicationComponent) {
      this.habitsApplicationComponent = habitsApplicationComponent;
    }

    @Override
    public CommandRunner get() {
      return Preconditions.checkNotNull(habitsApplicationComponent.getCommandRunner(), "Cannot return null from a non-@Nullable component method");
    }
  }

  private static class org_isoron_uhabits_HabitsApplicationComponent_getNotificationTray implements Provider<NotificationTray> {
    private final HabitsApplicationComponent habitsApplicationComponent;

    org_isoron_uhabits_HabitsApplicationComponent_getNotificationTray(
        HabitsApplicationComponent habitsApplicationComponent) {
      this.habitsApplicationComponent = habitsApplicationComponent;
    }

    @Override
    public NotificationTray get() {
      return Preconditions.checkNotNull(habitsApplicationComponent.getNotificationTray(), "Cannot return null from a non-@Nullable component method");
    }
  }

  private static class org_isoron_uhabits_HabitsApplicationComponent_getIntentFactory implements Provider<IntentFactory> {
    private final HabitsApplicationComponent habitsApplicationComponent;

    org_isoron_uhabits_HabitsApplicationComponent_getIntentFactory(
        HabitsApplicationComponent habitsApplicationComponent) {
      this.habitsApplicationComponent = habitsApplicationComponent;
    }

    @Override
    public IntentFactory get() {
      return Preconditions.checkNotNull(habitsApplicationComponent.getIntentFactory(), "Cannot return null from a non-@Nullable component method");
    }
  }

  private static class org_isoron_uhabits_HabitsApplicationComponent_getGenericImporter implements Provider<GenericImporter> {
    private final HabitsApplicationComponent habitsApplicationComponent;

    org_isoron_uhabits_HabitsApplicationComponent_getGenericImporter(
        HabitsApplicationComponent habitsApplicationComponent) {
      this.habitsApplicationComponent = habitsApplicationComponent;
    }

    @Override
    public GenericImporter get() {
      return Preconditions.checkNotNull(habitsApplicationComponent.getGenericImporter(), "Cannot return null from a non-@Nullable component method");
    }
  }

  private static class org_isoron_uhabits_HabitsApplicationComponent_getModelFactory implements Provider<ModelFactory> {
    private final HabitsApplicationComponent habitsApplicationComponent;

    org_isoron_uhabits_HabitsApplicationComponent_getModelFactory(
        HabitsApplicationComponent habitsApplicationComponent) {
      this.habitsApplicationComponent = habitsApplicationComponent;
    }

    @Override
    public ModelFactory get() {
      return Preconditions.checkNotNull(habitsApplicationComponent.getModelFactory(), "Cannot return null from a non-@Nullable component method");
    }
  }
}
