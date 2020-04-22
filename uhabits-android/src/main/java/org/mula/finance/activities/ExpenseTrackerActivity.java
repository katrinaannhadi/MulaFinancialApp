package org.mula.finance.activities;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import org.mula.finance.Databases.AppDatabase;
import org.mula.finance.Fragments.ExpenseLineChartFragment;
import org.mula.finance.Fragments.ExpensePieChartFragment;
import org.mula.finance.Models.Expense;
import org.mula.finance.R;
import org.mula.finance.utils.Constants;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class ExpenseTrackerActivity extends AppCompatActivity {

    private String[] categories;
    private final static String HEADING = "Previous 30 Days Of Expenses";
    private HashMap<String, Double> pieChartValueMap;
    private HashMap<Integer, Double> lineChartValueMap;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_expense_tracker);
        this.categories = Constants.categories;

        getValues();

        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction transaction = fragmentManager.beginTransaction();
        Bundle arguments = new Bundle();
        for(String category : categories){
            arguments.putDouble(category, pieChartValueMap.get(category));
        }
        ExpensePieChartFragment fragment = new ExpensePieChartFragment(HEADING);
        fragment.setArguments(arguments);
        transaction.replace(R.id.pieFragment,fragment);
        transaction.commit();

        FragmentManager fragmentManager2 = getSupportFragmentManager();
        FragmentTransaction transaction2 = fragmentManager2.beginTransaction();
        Bundle arguments2 = new Bundle();
        arguments2.putSerializable("keyValues", lineChartValueMap);
        ExpenseLineChartFragment fragment2 = new ExpenseLineChartFragment();
        fragment2.setArguments(arguments2);
        transaction2.replace(R.id.lineFragment,fragment2);
        transaction2.commit();
    }

    public void getValues(){
        AppDatabase db = AppDatabase.getInstance(getApplicationContext());
        List<Expense> expenses = db.expenseDao().getAll();
        removeInvalidDates(expenses);
        getPieChartValues(expenses);
        getLineChartValues(expenses);
    }

    private void removeInvalidDates(List<Expense> expenses){
        Date thirtyDaysAgo = getThirtyDaysAgo();
        List<Expense> toRemove = new ArrayList<>();
        for(Expense e : expenses){
            Date expenseDate = new Date(e.date);
            if(!expenseDate.equals(thirtyDaysAgo) && !expenseDate.after(thirtyDaysAgo)){
                toRemove.add(e);
            }
        }
        expenses.removeAll(toRemove);
    }

    private void getLineChartValues(List<Expense> expenses) {
        Collections.sort(expenses, new Comparator<Expense>() {
            @Override
            public int compare(Expense o1, Expense o2) {
                return o1.date.compareTo(o2.date);
            }
        });

        lineChartValueMap = new HashMap<>();
        double sum = 0;
        Date current = new Date();
        for(Expense e : expenses){
            Date expenseDate = new Date(e.date);
            long diff = current.getTime() - expenseDate.getTime();
            long days =  -TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);

            double value = Double.valueOf(e.value);
            sum += value;
            lineChartValueMap.put((int) days, sum);
        }
    }

    private void getPieChartValues(List<Expense> expenses) {
        pieChartValueMap = new HashMap<>();
        for(String category : categories){
            pieChartValueMap.put(category, Double.valueOf(0));
        }
        for(Expense e : expenses){
            pieChartValueMap.put(e.category, Double.valueOf(e.value) + pieChartValueMap.get(e.category));
        }
    }

    public Date getThirtyDaysAgo(){
        Calendar cal = Calendar.getInstance();
        cal.add(Calendar.DAY_OF_MONTH, -30);
        cal.set(Calendar.HOUR_OF_DAY, 0);
        cal.set(Calendar.MINUTE, 0);
        cal.set(Calendar.SECOND, 0);
        cal.set(Calendar.MILLISECOND, 0);
        return cal.getTime();
    }

    public void launchAddExpenseActivity(View view) {
        Intent intent = new Intent(this, AddExpenseActivity.class);
        startActivity(intent);
    }
}
