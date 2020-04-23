package org.mula.finance.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.mula.finance.Adapters.CategoryAdapter;
import org.mula.finance.AsyncTasks.ScoreAsyncTaskDelegate;
import org.mula.finance.AsyncTasks.ScoreListAsyncTaskDelegate;
import org.mula.finance.AsyncTasks.ScoreRetrieveAsyncTask;
import org.mula.finance.Databases.ScoreDatabase;
import org.mula.finance.Models.Category;
import org.mula.finance.Models.IntentLink;
import org.mula.finance.Models.Score;
import org.mula.finance.R;

import java.util.ArrayList;
import java.util.List;

public class QuizStartActivity extends AppCompatActivity implements ScoreAsyncTaskDelegate, ScoreListAsyncTaskDelegate {

    private View view;
    private RecyclerView rv;
    private ArrayList<IntentLink> calc;
    private TextView titleAverage;
    private TextView titleTopCategory;
    private TextView textAverage;
    private TextView textTopCategory;
    private ArrayList<Category> categoryList;
    private ScoreDatabase db;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz_start);



        titleAverage = findViewById(R.id.text_quiz_average);
        titleTopCategory = findViewById(R.id.text_high_score);
        textAverage = findViewById(R.id.text_score);
        textTopCategory = findViewById(R.id.text_percentage);
        titleAverage.setText("Top Score:");
        titleTopCategory.setText("Top Category:");

        calc = new ArrayList<>();
        ArrayList<Category> blank = new ArrayList<>();
        categoryList = new ArrayList<>();

        categoryList.add(new Category("Credit", 1, new Intent(this, QuizActivity.class)));
        categoryList.add(new Category("Investment", 2, new Intent(this, QuizActivity.class)));
        categoryList.add(new Category("Savings", 3, new Intent(this, QuizActivity.class)));


        CategoryAdapter categoryAdapter = new CategoryAdapter(calc);

        rv = findViewById(R.id.rv_quiz);
        rv.setHasFixedSize(true);
        mLayoutManager = new LinearLayoutManager(this);
        rv.setLayoutManager(mLayoutManager);

        rv.setAdapter(categoryAdapter);


        db = db.getInstance(this);

        retrieveScoreListFromDb();




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
        retrieveAsyncTask.setDelegate(this);
        retrieveAsyncTask.execute();
    }

    private void startQuiz(int number){
        Context c = view.getContext();
        Intent intent = new Intent(c, QuizActivity.class);
        intent.putExtra("Difficulty", number);
        c.startActivity(intent);
    }
}

