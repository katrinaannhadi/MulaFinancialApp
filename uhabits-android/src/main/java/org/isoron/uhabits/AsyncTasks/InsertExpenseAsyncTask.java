package org.isoron.uhabits.AsyncTasks;

import android.os.AsyncTask;

import org.isoron.uhabits.DataAccessObjects.ExpenseDao;
import org.isoron.uhabits.Databases.AppDatabase;
import org.isoron.uhabits.Models.Expense;

public class InsertExpenseAsyncTask extends AsyncTask<Expense, Void, Void> {
    private ExpenseDao expenseDao;

    public InsertExpenseAsyncTask(AppDatabase db){
        expenseDao = db.expenseDao();
    }

    @Override
    protected Void doInBackground(Expense... expenses) {
        Expense e = expenses[0];
        expenseDao.insert(e);
        return null;
    }
}
