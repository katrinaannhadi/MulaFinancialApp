package org.isoron.uhabits.core.io;

import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;
import org.isoron.uhabits.core.database.DatabaseOpener;
import org.isoron.uhabits.core.models.HabitList;
import org.isoron.uhabits.core.models.ModelFactory;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class RewireDBImporter_Factory implements Factory<RewireDBImporter> {
  private final Provider<HabitList> habitsProvider;

  private final Provider<ModelFactory> modelFactoryProvider;

  private final Provider<DatabaseOpener> openerProvider;

  public RewireDBImporter_Factory(Provider<HabitList> habitsProvider,
      Provider<ModelFactory> modelFactoryProvider, Provider<DatabaseOpener> openerProvider) {
    this.habitsProvider = habitsProvider;
    this.modelFactoryProvider = modelFactoryProvider;
    this.openerProvider = openerProvider;
  }

  @Override
  public RewireDBImporter get() {
    return newInstance(habitsProvider.get(), modelFactoryProvider.get(), openerProvider.get());
  }

  public static RewireDBImporter_Factory create(Provider<HabitList> habitsProvider,
      Provider<ModelFactory> modelFactoryProvider, Provider<DatabaseOpener> openerProvider) {
    return new RewireDBImporter_Factory(habitsProvider, modelFactoryProvider, openerProvider);
  }

  public static RewireDBImporter newInstance(HabitList habits, ModelFactory modelFactory,
      DatabaseOpener opener) {
    return new RewireDBImporter(habits, modelFactory, opener);
  }
}
