package org.mula.finance.Fragments;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

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

    private Button categoryOne;
    private Button categoryTwo;
    private Button categoryThree;
    private int value;



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

        calc = new ArrayList<>();
        ArrayList<Category> blank = new ArrayList<>();
        categoryList = new ArrayList<>();
        categoryList.add(new Category("Credit", 1));
        categoryList.add(new Category("Investment", 2));
        categoryList.add(new Category("Tax", 3));


        calc.add(new IntentLink("Quiz",
                new Intent(context, QuizActivity.class),
                R.drawable.image_investment, Color.parseColor("#B233FF"), categoryList));

        //TODO:// change to articles intent
        calc.add(new IntentLink("Articles",
                new Intent(context, TaxCalculatorActivity.class),
                R.drawable.image_investment, Color.parseColor("#69FA8F"), blank));


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
