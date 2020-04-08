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
public final class LoopDBImporter_Factory implements Factory<LoopDBImporter> {
  private final Provider<HabitList> habitListProvider;

  private final Provider<ModelFactory> modelFactoryProvider;

  private final Provider<DatabaseOpener> openerProvider;

  public LoopDBImporter_Factory(Provider<HabitList> habitListProvider,
      Provider<ModelFactory> modelFactoryProvider, Provider<DatabaseOpener> openerProvider) {
    this.habitListProvider = habitListProvider;
    this.modelFactoryProvider = modelFactoryProvider;
    this.openerProvider = openerProvider;
  }

  @Override
  public LoopDBImporter get() {
    return newInstance(habitListProvider.get(), modelFactoryProvider.get(), openerProvider.get());
  }

  public static LoopDBImporter_Factory create(Provider<HabitList> habitListProvider,
      Provider<ModelFactory> modelFactoryProvider, Provider<DatabaseOpener> openerProvider) {
    return new LoopDBImporter_Factory(habitListProvider, modelFactoryProvider, openerProvider);
  }

  public static LoopDBImporter newInstance(HabitList habitList, ModelFactory modelFactory,
      DatabaseOpener opener) {
    return new LoopDBImporter(habitList, modelFactory, opener);
  }
}
