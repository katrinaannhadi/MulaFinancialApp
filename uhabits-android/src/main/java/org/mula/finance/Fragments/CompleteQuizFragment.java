package org.mula.finance.Fragments;

import android.os.Bundle;

import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import org.mula.finance.R;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link CompleteQuizFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class CompleteQuizFragment extends DialogFragment {

    public CompleteQuizFragment() {
        // Required empty public constructor
    }


        private View view;
        private Button endButton;
        private TextView newHighScore;

    public static CompleteQuizFragment newInstance(String param1, String param2) {
        CompleteQuizFragment fragment = new CompleteQuizFragment();
        Bundle args = new Bundle();

        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
           // mParam1 = getArguments().getString(ARG_PARAM1);
           // mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_complete_quiz, container, false);
        endButton = view.findViewById(R.id.button_end);
        newHighScore = view.findViewById(R.id.text_new_high_score);
        newHighScore.setText("Congratulations! \nA new high score!");

        endButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                getActivity().getSupportFragmentManager().beginTransaction()
                        .remove(CompleteQuizFragment.this).commit();
            }
        });

        return view;
    }
}
