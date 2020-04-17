package org.isoron.uhabits.activities;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import org.isoron.uhabits.Databases.QuestionDatabase;
import org.isoron.uhabits.Fragments.CalculatorFragment;
import org.isoron.uhabits.Fragments.DailyQuizFragment;
import org.isoron.uhabits.Fragments.HomeFragment;
import org.isoron.uhabits.Fragments.InvestmentCalculatorFragment;
import org.isoron.uhabits.Fragments.StartQuizFragment;
import org.isoron.uhabits.Fragments.TaxCalculatorFragment;
import org.isoron.uhabits.R;
import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.util.Calendar;
import java.util.Random;

public class MainActivity extends AppCompatActivity implements DailyQuizFragment.OnFragmentInteractionListener {



    //TODO:// to remove
    private Button tax;
    private Button temp;
    private Button temp2;
    private EditText difficulty;
    private String TAG = "MainActivity";

    //keep
    private View popupView;

    private Fragment startQuizFragment;
    private Fragment calculatorFragment;
    private Fragment homeFragment;

    private BottomNavigationView bottomNav;

    private DailyQuizFragment quizPopup;
    private QuestionDatabase db;

    //for the question num
    private Random random;
    private int randomNum;
    private SharedPreferences pref;
    private SharedPreferences.Editor editor;
    private Calendar calendar;

    private int today;
    private int lastDay;
    private int streak;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bottomNav = findViewById(R.id.navigation_view);
        startQuizFragment = new StartQuizFragment();
        homeFragment = new HomeFragment();
        calculatorFragment = new CalculatorFragment();


        pref = this.getSharedPreferences("My Pref", 0);
        editor = pref.edit();
        calendar = Calendar.getInstance();
        random = new Random();

        today = calendar.get(Calendar.DAY_OF_YEAR); // today in year
        lastDay = pref.getInt("LAST_DATE", 0);
        streak = pref.getInt("QUIZ_STREAK", 0);

        Log.d(TAG, "MainActivity: SUCCESS");

        swapMenuFragment(calculatorFragment);



        bottomNav.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {

            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                switch (menuItem.getItemId()){
                    case R.id.nav_investment:
                        swapMenuFragment(calculatorFragment);
                        break;
                    case R.id.nav_home:
                        swapMenuFragment(homeFragment);
                        break;
                    case R.id.nav_startquiz:
                        swapMenuFragment(startQuizFragment);
                        break;

                }
                return true;
            }
        });



        quizPopup = new DailyQuizFragment();
        setQuizPopup();


    }

    @Override
    public void onStart() {
        super.onStart();
        setQuizPopup();
    }

    @Override
    public void onResume(){
        super.onResume();
        setQuizPopup();
    }



    private void swapMenuFragment(Fragment fragment) {
        FragmentManager fragmentManager =  getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.fragment_layout, fragment);
        fragmentTransaction.commit();
    }

    @Override
    public void onFragmentInteraction(int num) {
        // Question question = db.questionDao().getQuestion(num);
        // quizPopup.setQuestion(question);
    }


    private void swapFragment(Fragment fragment) {
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.container_popup, fragment);
        fragmentTransaction.commit();
    }

    private void setQuizPopup(){
        if (pref.getInt("ANSWERED", 0) == 0) {
            if (lastDay != today - 1) {
                streak = 0;
                editor.putInt("QUIZ_STREAK", streak);
            }
            //TODO::// change to method
            Bundle bundle = new Bundle();
            randomNum = random.nextInt(10);
            bundle.putInt("question", randomNum);
            quizPopup.setArguments(bundle);
            swapFragment(quizPopup);
            editor.putInt("LAST_DATE", today);
            editor.commit();

        } else if (lastDay != today) {
            if (lastDay != today - 1) {
                streak = 0;
                editor.putInt("QUIZ_STREAK", streak);
            }
            Bundle bundle = new Bundle();
            randomNum = random.nextInt(10);
            bundle.putInt("question", randomNum);
            quizPopup.setArguments(bundle);
            swapFragment(quizPopup);
            editor.putInt("LAST_DATE", today);
            editor.commit();
        }
    }


}
