package org.mula.finance.Fragments;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import org.mula.finance.Adapters.CategoryAdapter;
import org.mula.finance.AsyncTasks.ScoreAsyncTaskDelegate;
import org.mula.finance.AsyncTasks.ScoreListAsyncTaskDelegate;
import org.mula.finance.AsyncTasks.ScoreRetrieveAsyncTask;
import org.mula.finance.Databases.ScoreDatabase;
import org.mula.finance.Models.Category;
import org.mula.finance.Models.IntentLink;
import org.mula.finance.Models.Score;
import org.mula.finance.activities.QuizActivity;
import org.mula.finance.R;
import org.mula.finance.activities.category.ArticleSelectionActivity;

import java.util.ArrayList;
import java.util.List;

//Information Fragment
public class InformationFragment extends Fragment implements ScoreAsyncTaskDelegate, ScoreListAsyncTaskDelegate {



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
    private ImageButton buttonViewPager;
    private InformationFragment infoFragment = this;

    private TextView titleAverage, titleTopCategory, textAverage, textTopCategory;

    private ScoreDatabase db;



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
        view = inflater.inflate(R.layout.fragment_information, container, false);

        rv = view.findViewById(R.id.rv_quiz);
        layoutManager = new LinearLayoutManager(view.getContext());
        rv.setLayoutManager(layoutManager);
        context = view.getContext();

        calc = new ArrayList<>();
        ArrayList<Category> blank = new ArrayList<>();
        categoryList = new ArrayList<>();
        categoryList.add(new Category("Credit", 1, new Intent(context, QuizActivity.class)));
        categoryList.add(new Category("Investment", 2, new Intent(context, QuizActivity.class)));
        categoryList.add(new Category("Savings", 3, new Intent(context, QuizActivity.class)));


        calc.add(new IntentLink("Quiz",
                new Intent(context, QuizActivity.class),
                R.drawable.ic_investment_pink, Color.parseColor("#D767CD"), categoryList));


        calc.add(new IntentLink("Articles",
                new Intent(context, ArticleSelectionActivity.class),
                R.drawable.ic_super, Color.parseColor("#48C4B6"), blank));





        CategoryAdapter categoryAdapter = new CategoryAdapter(calc);
        rv.setAdapter(categoryAdapter);

        titleAverage = view.findViewById(R.id.text_quiz_average);
        titleTopCategory = view.findViewById(R.id.text_high_score);
        textAverage = view.findViewById(R.id.text_score);
        textTopCategory = view.findViewById(R.id.text_percentage);
        titleAverage.setText("Top Score:");
        titleTopCategory.setText("Top Category:");

        db = db.getInstance(context);

        retrieveScoreListFromDb();




        return view;
    }

    @Override
    public void handleScoreReturned(List<Score> scores){
        int num = 0;
    }

    @Override
    public void handleScoreListReturned(List<Score> scores){
        try{

            int topCategory = 0;
            int highScore = 0;

            for(int i = 0; i < scores.size(); i++){
                if(highScore < scores.get(i).getScore()){
                    topCategory = scores.get(i).getCategory();
                    highScore = scores.get(i).getScore();
                }
            }


            try {
                textAverage.setText(Integer.toString(highScore));
            } catch (ArithmeticException e){
                textAverage.setText(0);
            }

            switch (topCategory){
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

        }catch(NullPointerException e) {

        }

    }

    public void retrieveScoreListFromDb(){
        ScoreRetrieveAsyncTask retrieveAsyncTask = new ScoreRetrieveAsyncTask();
        retrieveAsyncTask.setScoreDatabase(db);
        retrieveAsyncTask.setDelegate(infoFragment);
        retrieveAsyncTask.execute();
    }

    private void startQuiz(int number){
        Context c = view.getContext();
        Intent intent = new Intent(c, QuizActivity.class);
        intent.putExtra("Difficulty", number);
        c.startActivity(intent);
    }
}
