package org.mula.finance.Fragments;

import android.animation.ArgbEvaluator;
import android.content.Context;
import android.content.Intent;
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
import androidx.viewpager.widget.ViewPager;

import org.mula.finance.Adapters.CategoryAdapter;
import org.mula.finance.Adapters.InformationAdapter;
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
import org.mula.finance.Adapters.GoalAdapter;
import org.mula.finance.activities.category.Model;

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
    private InformationFragment infoFragment = this;
    private TextView titleAverage, titleTopCategory, textAverage, textTopCategory;
    private ScoreDatabase db;

    private Button goalsButton;
    private Button expenseButton;

    ViewPager viewPager;
    InformationAdapter mInformationAdapter;
    List<Model> mInformation;
    Integer[] colors = null;
    ArgbEvaluator argbEvaluator = new ArgbEvaluator();
    private static final String TAG = " 2 ARTICLE SELECTION ";




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
        view = inflater.inflate(R.layout.fragment_article_selection_viewpager, container, false);
        context = view.getContext();

        mInformation = new ArrayList<>();
        mInformation.add(new Model(R.drawable.ic_piggy_bank, "Educate Yourself", "Finance shouldn't be hard! Read on for hot tips and trendy articles.",1));
        mInformation.add(new Model(R.drawable.ic_super, "Need a Challenge", "Have some fun and test yourself with our quiz!",2));
        mInformation.add(new Model(R.drawable.ic_super, "Visual Learner", "We got your back. Sit back and watch informational videos on finance curated by the team!",2));
        mInformationAdapter = new InformationAdapter(mInformation, this);

        viewPager = view.findViewById(R.id.viewPager);
        viewPager.setAdapter(mInformationAdapter);
        viewPager.setPadding(130, 0, 130, 0);

        Integer[] colors_temp = {
                getResources().getColor(R.color.mula_yellow_500),
                getResources().getColor(R.color.mula_purple_500),
                getResources().getColor(R.color.green_300),
                getResources().getColor(R.color.pink_300)

        };

        colors = colors_temp;



        viewPager.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

                if (position < (mInformationAdapter.getCount() -1) && position < (colors.length - 1)) {
                    viewPager.setBackgroundColor(

                            (Integer) argbEvaluator.evaluate(
                                    positionOffset,
                                    colors[position],
                                    colors[position + 1]
                            )
                    );
                }

                else {
                    viewPager.setBackgroundColor(colors[colors.length - 1]);
                }
            }

            @Override
            public void onPageSelected(int position) {

            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });

//        rv = view.findViewById(R.id.rv_quiz);
//        layoutManager = new LinearLayoutManager(view.getContext());
//        rv.setLayoutManager(layoutManager);
//        context = view.getContext();
//
//        calc = new ArrayList<>();
//        ArrayList<Category> blank = new ArrayList<>();
//        categoryList = new ArrayList<>();
//        categoryList.add(new Category("Credit", 1, new Intent(context, QuizActivity.class)));
//        categoryList.add(new Category("Investment", 2, new Intent(context, QuizActivity.class)));
//        categoryList.add(new Category("Savings", 3, new Intent(context, QuizActivity.class)));
//
//
//        calc.add(new IntentLink("Quiz",
//                new Intent(context, QuizActivity.class),
//                R.drawable.ic_investment_pink, Color.parseColor("#D767CD"), categoryList));
//
//
//        calc.add(new IntentLink("Articles",
//                new Intent(context, ArticleSelectionActivity.class),
//                R.drawable.ic_super, Color.parseColor("#48C4B6"), blank));
//
//
//
//
//
//        CategoryAdapter categoryAdapter = new CategoryAdapter(calc);
//        rv.setAdapter(categoryAdapter);
//TODO MOVE TO A DIFFERENT ACTIVTY
//        titleAverage = view.findViewById(R.id.text_quiz_average);
//        titleTopCategory = view.findViewById(R.id.text_high_score);
//        textAverage = view.findViewById(R.id.text_score);
//        textTopCategory = view.findViewById(R.id.text_percentage);
//        titleAverage.setText("Top Score:");
//        titleTopCategory.setText("Top Category:");
//
//        db = db.getInstance(context);
//
//        retrieveScoreListFromDb();
//
//

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

//TODO GET RID OF THIS PART DOWN

//    private View view;
//    private Button goalsButton;
//    private Button expenseButton;
//
//    private Context context;
//    private MediaPlayer mp;
//    ViewPager viewPager;
//    GoalAdapter mGoalAdapter;
//    List<Model> mGoals;
//    Integer[] colors = null;
//    ArgbEvaluator argbEvaluator = new ArgbEvaluator();
//    private static final String TAG = " 2 ARTICLE SELECTION ";



//    public HomeFragment() {
//        // Required empty public constructor
//    }

//
//    public static HomeFragment newInstance() {
//        HomeFragment fragment = new HomeFragment();
//        Bundle args = new Bundle();
//        return fragment;
//    }

//    @Override
//    public void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        if (getArguments() != null) {
//
//        }
//    }

//    @Override
//    public View onCreateView(LayoutInflater inflater, ViewGroup container,
//                             Bundle savedInstanceState) {
//        view = inflater.inflate(R.layout.fragment_article_selection_viewpager, container, false);
//        context = view.getContext();
//
//        mGoals = new ArrayList<>();
//        mGoals.add(new Model(R.drawable.ic_piggy_bank, "Smash your Goals", "Use our goal tracker to keep track of smart financial habits, get reminders and more!",1));
//        mGoals.add(new Model(R.drawable.ic_super, "Track your Expenses", "Use our expense tracker to help you achieve your financial goals!",2));
//        mGoalAdapter = new GoalAdapter(mGoals, this);
//
//        viewPager = view.findViewById(R.id.viewPager);
//        viewPager.setAdapter(mGoalAdapter);
//        viewPager.setPadding(130, 0, 130, 0);
//
//        Integer[] colors_temp = {
//                getResources().getColor(R.color.mula_yellow_500),
//                getResources().getColor(R.color.green_300),
//
//        };
//
//        colors = colors_temp;
//
//
//
//        viewPager.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {
//            @Override
//            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
//
//                if (position < (mGoalAdapter.getCount() -1) && position < (colors.length - 1)) {
//                    viewPager.setBackgroundColor(
//
//                            (Integer) argbEvaluator.evaluate(
//                                    positionOffset,
//                                    colors[position],
//                                    colors[position + 1]
//                            )
//                    );
//                }
//
//                else {
//                    viewPager.setBackgroundColor(colors[colors.length - 1]);
//                }
//            }
//
//            @Override
//            public void onPageSelected(int position) {
//
//            }
//
//            @Override
//            public void onPageScrollStateChanged(int state) {
//
//            }
//        });

