package org.mula.finance.Fragments;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import org.mula.finance.Adapters.CalculatorAdapter;
import org.mula.finance.Adapters.CategoryAdapter;
import org.mula.finance.Models.Category;
import org.mula.finance.Models.IntentLink;
import org.mula.finance.activities.InvestmentCalculatorActivity;
import org.mula.finance.activities.QuizActivity;
import org.mula.finance.R;
import org.mula.finance.activities.TaxCalculatorActivity;

import java.util.ArrayList;

//Information Fragment
public class InformationFragment extends Fragment {



    private View view;
    private RecyclerView rv;
    private ArrayList<IntentLink> calc;
    private Context context;
    private RecyclerView.LayoutManager layoutManager;
    private ArrayList<Category> categoryList;

    private TextView titleAverage, titleTopCategory, textAverage, textTopCategory;

    private SharedPreferences pref;
    private SharedPreferences.Editor editor;



    public InformationFragment() {
        // Required empty public constructor
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
        view = inflater.inflate(R.layout.fragment_start_quiz, container, false);

        rv = view.findViewById(R.id.rv_quiz);
        layoutManager = new LinearLayoutManager(view.getContext());
        rv.setLayoutManager(layoutManager);
        context = view.getContext();

        titleAverage = view.findViewById(R.id.text_quiz_average);
        titleTopCategory = view.findViewById(R.id.text_high_score);
        textAverage = view.findViewById(R.id.text_score);
        textTopCategory = view.findViewById(R.id.text_percentage);
        titleAverage.setText("Accuracy Rate:");
        titleTopCategory.setText("Top Category:");

        pref = context.getSharedPreferences("My Pref", 0);
        editor = pref.edit();

        switch (pref.getInt("CATEGORY", 0)){
            case 1:
                textTopCategory.setText("Credit");
                break;
            case 2:
                textTopCategory.setText("Investment");
                break;
            case 3:
                textTopCategory.setText("Tax");
                break;
            default:
                textTopCategory.setText("N/A");
                break;
        }

        //TODO:// change this to QuizActivity
        int total = 0;
        int divisor = 0;
        for(int i = 0; i < QuizActivity.scoreHistoryList.size(); i++){
            total += QuizActivity.scoreHistoryList.get(i);
            divisor = i;
        }

        try {
            int average = total/divisor;
            textAverage.setText(average + "%");
        } catch (ArithmeticException e){
            textAverage.setText("0%");
        }




        calc = new ArrayList<>();
        ArrayList<Category> blank = new ArrayList<>();
        categoryList = new ArrayList<>();
        categoryList.add(new Category("Credit", 1, new Intent(context, QuizActivity.class)));
        categoryList.add(new Category("Investment", 2, new Intent(context, QuizActivity.class)));
        categoryList.add(new Category("Tax", 3, new Intent(context, QuizActivity.class)));


        calc.add(new IntentLink("Quiz",
                new Intent(context, QuizActivity.class),
                R.drawable.image_quiz, R.color.dark_lilac_300, categoryList));

        //TODO:// change to articles intent
        calc.add(new IntentLink("Articles",
                new Intent(context, TaxCalculatorActivity.class),
                R.drawable.image_articles, R.color.green_300, blank));


        //CalculatorAdapter calcAdapter = new CalculatorAdapter(calc);
        CategoryAdapter categoryAdapter = new CategoryAdapter(calc);
        rv.setAdapter(categoryAdapter);

       /* categoryOne = view.findViewById(R.id.button_category_one);
        categoryTwo = view.findViewById(R.id.button_category_two);
        categoryThree = view.findViewById(R.id.button_category_three);
        categoryOne.setText("Credit");
        categoryTwo.setText("Tax");
        categoryThree.setText("Investment");*/

       /* categoryOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startQuiz(1);
            }
        });

        categoryTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startQuiz(2);
            }
        });

        categoryThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startQuiz(3);
            }
        }); */

        return view;
    }

    private void startQuiz(int number){
        Context c = view.getContext();
        Intent intent = new Intent(c, QuizActivity.class);
        intent.putExtra("Difficulty", number);
        c.startActivity(intent);
    }
}
