package org.isoron.uhabits.Fragments;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.fragment.app.Fragment;

import org.isoron.uhabits.activities.QuizActivity;
import org.isoron.uhabits.R;


public class StartQuizFragment extends Fragment {



    private View view;
    private Button categoryOne;
    private Button categoryTwo;
    private Button categoryThree;
    private int value;

    public StartQuizFragment() {
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

        categoryOne = view.findViewById(R.id.button_category_one);
        categoryTwo = view.findViewById(R.id.button_category_two);
        categoryThree = view.findViewById(R.id.button_category_three);
        categoryOne.setText("Credit");
        categoryTwo.setText("Tax");
        categoryThree.setText("Investment");

        categoryOne.setOnClickListener(new View.OnClickListener() {
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
        });

        return view;
    }

    private void startQuiz(int number){
        Context c = view.getContext();
        Intent intent = new Intent(c, QuizActivity.class);
        intent.putExtra("Difficulty", number);
        c.startActivity(intent);
    }
}
