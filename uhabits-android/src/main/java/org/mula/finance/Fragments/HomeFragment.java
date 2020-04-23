package org.mula.finance.Fragments;

import android.animation.ArgbEvaluator;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.Paint;
import android.media.MediaPlayer;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.github.mikephil.charting.charts.CandleStickChart;
import com.github.mikephil.charting.components.Legend;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.components.YAxis;
import com.github.mikephil.charting.data.CandleData;
import com.github.mikephil.charting.data.CandleDataSet;
import com.github.mikephil.charting.data.CandleEntry;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import org.mula.finance.Models.Company;
import org.mula.finance.Models.DailyPrice;
import org.mula.finance.R;
import org.mula.finance.activities.ExpenseTrackerActivity;
import org.mula.finance.activities.category.CategoryAdapter;
import org.mula.finance.activities.category.GoalAdapter;
import org.mula.finance.activities.category.Model;
import org.mula.finance.activities.habits.list.ListHabitsActivity;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link HomeFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class HomeFragment extends Fragment {

    private View view;
    private Button goalsButton;
    private Button expenseButton;

    private Context context;
    private MediaPlayer mp;
    ViewPager viewPager;
    GoalAdapter mGoalAdapter;
    List<Model> mGoals;
    Integer[] colors = null;
    ArgbEvaluator argbEvaluator = new ArgbEvaluator();
    private static final String TAG = " 2 ARTICLE SELECTION ";



    public HomeFragment() {
        // Required empty public constructor
    }


    public static HomeFragment newInstance() {
        HomeFragment fragment = new HomeFragment();
        Bundle args = new Bundle();
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
        view = inflater.inflate(R.layout.fragment_article_selection_viewpager, container, false);
        context = view.getContext();

        mGoals = new ArrayList<>();
        mGoals.add(new Model(R.drawable.ic_piggy_bank, "Smash your Goals", "Use our goal tracker to keep track of smart financial habits, get reminders and more!",1));
        mGoals.add(new Model(R.drawable.ic_super, "Track your Expenses", "Use our expense tracker to help you achieve your financial goals!",2));
        mGoalAdapter = new GoalAdapter(mGoals, this);

        viewPager = view.findViewById(R.id.viewPager);
        viewPager.setAdapter(mGoalAdapter);
        viewPager.setPadding(130, 0, 130, 0);

        Integer[] colors_temp = {
                getResources().getColor(R.color.mula_yellow_500),
                getResources().getColor(R.color.green_300),

        };

        colors = colors_temp;



        viewPager.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

                if (position < (mGoalAdapter.getCount() -1) && position < (colors.length - 1)) {
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




//        goalsButton = view.findViewById(R.id.button_goals);
//        goalsButton.setText("Goals");
//        expenseButton = view.findViewById(R.id.button_expense);
//        expenseButton.setText("Expense");
//
//        goalsButton.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                mp.start();
//                Intent intent = new Intent(context, ListHabitsActivity.class);
//                context.startActivity(intent);
//            }
//        });
//
//        expenseButton.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                mp.start();
//                Intent intent = new Intent(context, ExpenseTrackerActivity.class);
//                context.startActivity(intent);
//            }
//        });


        return view;
    }

}

//TODO GET RID OF THIS
//ViewPager viewPager;
//    CategoryAdapter mCategoryAdapter;
//    List<Model> models;
//    Integer[] colors = null;
//    ArgbEvaluator argbEvaluator = new ArgbEvaluator();
//    private static final String TAG = " 2 ARTICLE SELECTION ";

//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.fragment_article_selection_viewpager);
//        Log.d(TAG,"1 This is the page to scroll through categories");

//        mGoals = new ArrayList<>();
//        mGoals.add(new Model(R.drawable.ic_piggy_bank, "Savings", "Saving and investing money wisely needn’t be confined to the experts, nor does it need to be a headache. Simplify your personal finance by setting up no-fee accounts, automating savings and bill payments, and investing a little. This will allow you to stop stressing about money and sit back and let your funds grow.",1));
//        mGoals.add(new Model(R.drawable.ic_super, "Super", "Saving and investing money wisely needn’t be confined to the experts, nor does it need to be a headache. Simplify your personal finance by setting up no-fee accounts, automating savings and bill payments, and investing a little. This will allow you to stop stressing about money and sit back and let your funds grow.",2));
//        mCategoryAdapter = new CategoryAdapter(mGoals, this);
//
//        viewPager = findViewById(R.id.viewPagerGoals);
//        viewPager.setAdapter(mCategoryAdapter);
//        viewPager.setPadding(130, 0, 130, 0);
//
//        Integer[] colors_temp = {
//                getResources().getColor(R.color.purple_300),
//                getResources().getColor(R.color.green_300),
//                getResources().getColor(R.color.pink_300),
//                getResources().getColor(R.color.purple_300),
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
//                if (position < (mCategoryAdapter.getCount() -1) && position < (colors.length - 1)) {
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
//
//    }
