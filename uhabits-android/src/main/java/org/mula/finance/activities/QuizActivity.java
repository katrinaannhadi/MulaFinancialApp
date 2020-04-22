package org.mula.finance.activities;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import org.mula.finance.AsyncTasks.QuestionAsyncTaskDelegate;
import org.mula.finance.AsyncTasks.QuestionCategoryAsyncTaskDelegate;
import org.mula.finance.AsyncTasks.QuestionCategoryRetrieveAsyncTask;
import org.mula.finance.AsyncTasks.QuestionInsertAsyncTask;
import org.mula.finance.AsyncTasks.ScoreAsyncTaskDelegate;
import org.mula.finance.AsyncTasks.ScoreInsertAsyncTask;
import org.mula.finance.AsyncTasks.ScoreListAsyncTaskDelegate;
import org.mula.finance.AsyncTasks.ScoreRetrieveAsyncTask;
import org.mula.finance.Databases.QuestionDatabase;
import org.mula.finance.Databases.ScoreDatabase;
import org.mula.finance.Models.Question;
import org.mula.finance.Models.Score;
import org.mula.finance.R;

import java.util.ArrayList;
import java.util.List;

public class QuizActivity extends AppCompatActivity implements QuestionCategoryAsyncTaskDelegate, QuestionAsyncTaskDelegate, ScoreAsyncTaskDelegate, ScoreListAsyncTaskDelegate {

    private Button continueBtn;
    private TextView questionText;
    private RadioButton optionA;
    private RadioButton optionB;
    private RadioButton optionC;
    private TextView scoreText;
    // private QuizActivity quizActivity = this;

    private MediaPlayer mp;

    private String TAG = "QuizActivity";
    private QuestionDatabase db;
    private ScoreDatabase scoreDb;

    private int score = 0;
    private int questionNum = 0;
    private Question currentQuestion;
    private List<Question> questionList;
    private QuizActivity quizActivity = this;

    private int difficulty;
    private List<Score> scoreCheck;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);

        Log.d(TAG, "QuizActivity: SUCCESS");

        ConstraintLayout quizConstraintLayout = findViewById(R.id.quiz_constraint_layout);

        questionText = quizConstraintLayout.findViewById(R.id.text_question);
        scoreText = quizConstraintLayout.findViewById(R.id.text_score);

        optionA = quizConstraintLayout.findViewById(R.id.radio_quiz_a);
        optionB = quizConstraintLayout.findViewById(R.id.radio_quiz_b);
        optionC = quizConstraintLayout.findViewById(R.id.radio_quiz_c);

        mp = MediaPlayer.create(getApplicationContext(), R.raw.notification_high_intensity);

        continueBtn = quizConstraintLayout.findViewById(R.id.button_continue);
        continueBtn.setText("Continue");

        //TODO:: change to category
        Intent quizIntent = getIntent();
        difficulty = quizIntent.getIntExtra("Difficulty", 1);

        db = db.getInstance(this);
        scoreDb = scoreDb.getInstance(this);

        insertQuestionListInDatabase(getQuestionList());
        retrieveQuestionListFromDatabase(difficulty);



    }

    public void setQuestion(Question question, int score){

        scoreText.setText("Score: " + score);
        questionText.setText(" " + question.getQuestion()+ " ");
        optionA.setText(question.getOptionA());
        optionB.setText(question.getOptionB());
        optionC.setText(question.getOptionC());
    }



    @Override
    public void handleQuestionListReturned(List<Question> questionList) {
        currentQuestion = questionList.get(0);
        setQuestion(currentQuestion, score);
        final List<Question> questions = questionList;


        continueBtn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                RadioGroup radioGroup = findViewById(R.id.options_quiz);
                if (radioGroup.getCheckedRadioButtonId() == -1) {
                } else {
                    RadioButton answer = findViewById(radioGroup.getCheckedRadioButtonId());
                    if (currentQuestion.getAnswer().equals(answer.getText())) {

                        score++;
                    }
                    answer.setChecked(false);
                    Toast.makeText(getApplicationContext(), Integer.toString(questionNum), Toast.LENGTH_LONG).show();

                    // Below code is to make sure that the button text changes to finish quiz on final question, and to
                    // record the final score in an ArrayList
                    if (questionNum < questions.size() - 2) {
                        questionNum++;

                        setQuestion(questions.get(questionNum),score);

                    } else if (questionNum == questions.size() - 2) {
                        questionNum++;
                        setQuestion(questions.get(questionNum),score);

                        continueBtn.setText("Finish Quiz");
                    } else {
                        try {

                            retrieveScoreListFromDb();


                        } catch (NullPointerException e) {
                            Score currentScore = new Score(0, score, difficulty);
                            insertScoreInDB(currentScore);
                        }

                        Toast.makeText(getApplicationContext(), Integer.toString(score), Toast.LENGTH_LONG).show();
                        mp.start();
                        finish();
                    }

                }
            }
        });

    }

    //to prevent errors, need to do clean up
    @Override
    public void handleQuestionReturned(Question question){
        int num = question.getId();
        System.out.println(num);
    }

    @Override
    public void handleScoreReturned(List<Score> scores){

    }

    @Override
    public void handleScoreListReturned(List<Score> scores){
        scoreCheck = scores;
        int id = scoreCheck.size();
        Score currentScore = new Score(id, score, difficulty);
        insertScoreInDB(currentScore);
    }

    public void insertScoreInDB(Score score){
        ScoreInsertAsyncTask insertScoreAsyncTask = new ScoreInsertAsyncTask();
        insertScoreAsyncTask.setScoreDatabase(scoreDb);
        insertScoreAsyncTask.setDelegate(quizActivity);
        insertScoreAsyncTask.execute(score);
    }

    public void retrieveScoreListFromDb(){
        ScoreRetrieveAsyncTask retrieveAsyncTask = new ScoreRetrieveAsyncTask();
        retrieveAsyncTask.setScoreDatabase(scoreDb);
        retrieveAsyncTask.setDelegate(quizActivity);
        retrieveAsyncTask.execute();
    }




    public void insertQuestionListInDatabase(List<Question> questionList){
        QuestionInsertAsyncTask insertAsyncTask = new QuestionInsertAsyncTask();
        insertAsyncTask.setQuestionDatabase(db);
        insertAsyncTask.setDelegate(quizActivity);
        insertAsyncTask.execute(questionList);

    }

    public void retrieveQuestionListFromDatabase(int questionCategory){
        QuestionCategoryRetrieveAsyncTask questionRetrieveAsyncTask = new QuestionCategoryRetrieveAsyncTask();
        questionRetrieveAsyncTask.setQuestionDatabase(db);
        questionRetrieveAsyncTask.setDelegate(quizActivity);
        questionRetrieveAsyncTask.execute(questionCategory);
    }




    public static List<Question> getQuestionList(){
        //TODO:: to put this somewhere that's not here
        //TODO:: add url from api, not sure we can find relevant data in our APIs for these questions
        //questions and answers from https://www.sageadvice.eu/2017/11/27/trivia-quiz-on-5th-edition-dd-rules/
        List<Question> questionList = new ArrayList<>();
        questionList.add(0, new Question(0,
                "Do online banks offer better interest rates? If so, then why?",
                "No",
                "Yes, because they don't exist",
                "Yes, because they have minimal overhead costs.",
                "Yes, because they have minimal overhead costs.",
                3));
        questionList.add(1, new Question(1,
                "Why is it good to have a good credit score?",
                "Because it serves you better in the long run.",
                "Because lenders will offer you better interest rates, saving you money.",
                "You will receive a cheaper loan.",
                "Because lenders will offer you better interest rates, saving you money.",
                1));
        questionList.add(2, new Question(2,
                "Imagine an investment pyramid, what's at the bottom? (Which investments are more complicated?)",
                "Stocks, bonds and cash",
                "Index and mutual funds",
                "Lifecycle funds",
                "Stock, bonds and cash",
                2));
        questionList.add(3, new Question(3,
                "What's one of the most effective ways to save?",
                "Using this app.",
                "Giving your savings to your parents for safe keep.",
                "Making a plan consisting of your expenditure and laying down clear goals.",
                "Making a plan consisting of your expenditure and laying down clear goals.",
                3));
        questionList.add(4, new Question(4,
                "How can a credit card save you money?",
                "Yes, but has resistance to damage.",
                "No, fall is a bludgeoning damage.",
                "Yes, fall is not a weapon.",
                "Yes, fall is not a weapon.",
                1));
        questionList.add(5, new Question(5,
                "If a 5th level wizard casts a Fireball during surprise, do the enemies get disadvantage on their saving throw?",
                "No",
                "Only if wizard has with War Caster feat.",
                "Yes",
                "No",
                1));
        questionList.add(6, new Question(6,
                "Is a 1 on an ability check an automatic failure?",
                "No",
                "Yes.",
                "Yes and roll a d10 on Fumble table.",
                "No",
                2));
        questionList.add(7, new Question(7,
                "Can rogue get sneak attack damage against undead?",
                "Yes, Sneak Attack works against Undead.",
                "No, undeads have resistance to sneak attack.",
                "Only if you use a bludgeoning weapon.",
                "Yes, Sneak Attack works against Undead.",
                1));
        questionList.add(8, new Question(8,
                "If you have a creature between you and the target...",
                "Target has cover +4 bonus to AC.",
                "Target has half-cover +2 bonus to AC.",
                "You have disadvantage.",
                "Target has half-cover +2 bonus to AC.",
                2));
        questionList.add(9, new Question(9,
                "Can you make an attack action from Prone condition?",
                "Yes, but you have disadvantage on attack rolls.",
                "No, you must stand up (half movement) and attack.",
                "Only with a weapon with reach property.",
                "Yes, but you have disadvantage on attack rolls.",
                3));

        return questionList;
    }
}

