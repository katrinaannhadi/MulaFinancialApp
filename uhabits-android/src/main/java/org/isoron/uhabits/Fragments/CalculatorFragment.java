package org.isoron.uhabits.Fragments;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.fragment.app.Fragment;

import org.isoron.uhabits.activities.ExpenseTrackerActivity;
import org.isoron.uhabits.activities.InvestmentCalculatorActivity;
import org.isoron.uhabits.activities.TaxCalculatorActivity;
import org.isoron.uhabits.R;
import org.isoron.uhabits.activities.habits.list.ListHabitsActivity;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link CalculatorFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class CalculatorFragment extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    private View view;
    private Button investButton;
    private Button taxButton;
    private Button goalsButton;
    private Button expenseButton;

    public CalculatorFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment CalculatorFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static CalculatorFragment newInstance(String param1, String param2) {
        CalculatorFragment fragment = new CalculatorFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {

        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_calculator, container, false);
        view = inflater.inflate(R.layout.fragment_calculator, container, false);
        investButton = view.findViewById(R.id.button_invest);
        taxButton = view.findViewById(R.id.button_tax);
        goalsButton = view.findViewById(R.id.button_goals);
        expenseButton = view.findViewById(R.id.button_expense);
        investButton.setText("Investment Calculator");
        taxButton.setText("Tax Calculator");
        goalsButton.setText("Goals");
        expenseButton.setText("Expense Calculator");

        investButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Context c = view.getContext();
                Intent intent = new Intent(c, InvestmentCalculatorActivity.class);
                c.startActivity(intent);
            }
        });

        taxButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Context c = view.getContext();
                Intent intent = new Intent(c, TaxCalculatorActivity.class);
                c.startActivity(intent);
            }
        });

        goalsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Context c = view.getContext();
                Intent intent = new Intent(c, ListHabitsActivity.class);
                c.startActivity(intent);
            }
        });

        expenseButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Context c = view.getContext();
                Intent intent = new Intent(c, ExpenseTrackerActivity.class);
                c.startActivity(intent);
            }
        });

        return view;
    }
}
