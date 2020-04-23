package org.mula.finance.Adapters;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import org.mula.finance.Models.Expense;
import org.mula.finance.Models.IntentLink;
import org.mula.finance.R;

import java.util.ArrayList;

public class ExpenseListAdapter extends RecyclerView.Adapter<ExpenseListAdapter.ExpenseListViewHolder> {
    //retrieve
    private ArrayList<Expense> data;

    public ExpenseListAdapter (ArrayList<Expense> data){this.data = data;}

    public static class ExpenseListViewHolder extends RecyclerView.ViewHolder {
        private View view;

        private TextView dateText, valueText, descriptionText;


        public ExpenseListViewHolder(View view) {
            super(view);
            this.view = view;


        }
    }

    @NonNull
    @Override
    public ExpenseListAdapter.ExpenseListViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.chunk_expense, parent, false);
        ExpenseListAdapter.ExpenseListViewHolder expenseViewHolder = new ExpenseListAdapter.ExpenseListViewHolder(v);



        return expenseViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ExpenseListAdapter.ExpenseListViewHolder calcViewHolder, int position){
        final Expense expense = data.get(position);


    }

    @Override
    public int getItemCount() { return data.size();}
    public ArrayList<Expense> getData() {return this.data;}
}
