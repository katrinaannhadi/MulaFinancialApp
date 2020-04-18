package org.mula.finance.Fragments;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import org.mula.finance.activities.MainActivity;
import org.mula.finance.R;


public class InvestmentCalculatorFragment extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    private MainActivity context;


    private EditText tvInvestmentAmount;
    private EditText tvAnnualInterestRate;
    private TextView tvTotalContributions;
    private TextView tvAdditionalContributions;
    private TextView tvTimesCompounded;
    private EditText tvNumberOfYears;
    private TextView tvFutureValue;
    private TextView tvInterestPrinciple;
    private TextView tvInterestContribution;
    private TextView tvTotalInterest;


    private Button btCompute;
    private Button btReset;
    private Button btGraph;

    private View view;


    private static final String TAG = "InvestmentCalculatorActivity";

    public InvestmentCalculatorFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_investment_calculator, container, false);

        tvInvestmentAmount = view.findViewById(R.id.tv_StartingAmount);
        tvNumberOfYears = view.findViewById(R.id.tv_Years);
        tvAnnualInterestRate = view.findViewById(R.id.tv_ReturnRate);
        tvFutureValue = view.findViewById(R.id.tv_FutureValue);
        tvTotalContributions = view.findViewById(R.id.tv_TimesCompounded);
        tvInterestPrinciple = view.findViewById(R.id.tv_InterestPrincipal);
        tvInterestContribution = view.findViewById(R.id.tv_InterestContributions);
        tvTotalInterest = view.findViewById(R.id.tv_TotalInterest);


        btCompute = view.findViewById(R.id.bt_calculate);
        btReset = view.findViewById(R.id.bt_refresh);

        btCompute.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                computeValue();

            }
        });


        btReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resetCalc();
            }
        });

        return view;
    }

    @SuppressLint("DefaultLocale")
    private void computeValue() {
        try {
            double r = Double.parseDouble(String.valueOf(tvAnnualInterestRate.getText()));
            double t = Double.parseDouble(String.valueOf(tvNumberOfYears.getText()));
            System.out.println("testing1 : " + t);
            double P = Double.parseDouble(String.valueOf(tvInvestmentAmount.getText()));
            double PMT = Double.parseDouble(String.valueOf(tvAdditionalContributions.getText()));
            double n = Double.parseDouble(String.valueOf(tvTimesCompounded.getText()));

            double pow = Math.pow(1+((r/100)/n),n*t);
            double A = P*pow;
            double B = PMT*((pow-1)/((r/100)))*12;
            double totalContributions = PMT*t*12;
            double futureValue = A+B;
            double interestPrincipal = A-P;
            double interestContributions = B-totalContributions;
            double totalInterest = (((interestPrincipal+interestContributions)/futureValue)*100);


            tvFutureValue.setText(String.format("%.2f", futureValue));
            tvTotalContributions.setText(String.format("%.2f", totalContributions));
            tvInterestPrinciple.setText(String.format("%.2f", interestPrincipal));
            tvInterestContribution.setText(String.format("%.2f", interestContributions));
            tvTotalInterest.setText(String.format("%.2f", totalInterest));

            FragmentManager fragmentManager = context.getSupportFragmentManager();
            FragmentTransaction transaction = fragmentManager.beginTransaction();
            Bundle arguments = new Bundle();
            arguments.putDouble("Future Value", futureValue);
            arguments.putDouble("Interest Principle", interestPrincipal);
            arguments.putDouble("Interest Contributions", interestContributions);
            PieChartFragment fragment = new PieChartFragment();
            fragment.setArguments(arguments);
            transaction.replace(R.id.pieFragment,fragment);
            transaction.commit();

            FragmentManager fragmentManager2 = context.getSupportFragmentManager();
            FragmentTransaction transaction2 = fragmentManager2.beginTransaction();
            Bundle arguments2 = new Bundle();
            arguments2.putDouble("Interest Rate", r);
            arguments2.putDouble("Year", t);
            arguments2.putDouble("Initial Investment", P);
            arguments2.putDouble("Additional Contributions", PMT);
            arguments2.putDouble("Times Compounded",n);
            LineChartFragment fragment2 = new LineChartFragment();
            fragment2.setArguments(arguments2);
            transaction2.replace(R.id.lineFragment,fragment2);
            transaction2.commit();



        } catch (Exception e) {
            Toast.makeText(getContext(), "Please enter numeric values", Toast.LENGTH_SHORT).show();

            //add no zero exception
        }
    }

    private void resetCalc() {
        tvInvestmentAmount.setText("");
        tvAnnualInterestRate.setText("");
        tvNumberOfYears.setText("");
        tvFutureValue.setText("");
        tvTimesCompounded.setText("");
        tvAdditionalContributions.setText("");
        tvTotalContributions.setText("");
        tvInterestContribution.setText("");
        tvInterestPrinciple.setText("");
        tvTotalInterest.setText("");

        double futureValue = 0;
        double interestPrincipal = 0;
        double interestContributions = 0;

        FragmentManager fragmentManager = context.getSupportFragmentManager();
        FragmentTransaction transaction = fragmentManager.beginTransaction();
        Bundle arguments = new Bundle();
        arguments.putDouble("Future Value", futureValue);
        arguments.putDouble("Interest Principle", interestPrincipal);
        arguments.putDouble("Interest Contributions", interestContributions);
        PieChartFragment fragment = new PieChartFragment();
        fragment.setArguments(arguments);
        transaction.replace(R.id.pieFragment,fragment);
        transaction.commit();

        double r = 0;
        double t = 0;
        double P = 0;
        double PMT = 0;
        double n = 0;

        FragmentManager fragmentManager2 = context.getSupportFragmentManager();
        FragmentTransaction transaction2 = fragmentManager2.beginTransaction();
        Bundle arguments2 = new Bundle();
        arguments2.putDouble("Interest Rate", r);
        arguments2.putDouble("Year", t);
        arguments2.putDouble("Initial Investment", P);
        arguments2.putDouble("Additional Contributions", PMT);
        arguments2.putDouble("Times Compounded", n);
        LineChartFragment fragment2 = new LineChartFragment();
        fragment2.setArguments(arguments2);
        transaction2.replace(R.id.lineFragment,fragment2);
        transaction2.commit();

    }

}


