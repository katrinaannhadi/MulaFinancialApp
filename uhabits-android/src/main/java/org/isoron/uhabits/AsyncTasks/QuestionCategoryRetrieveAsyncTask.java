package org.isoron.uhabits.AsyncTasks;

import android.os.AsyncTask;

import org.isoron.uhabits.Databases.QuestionDatabase;
import org.isoron.uhabits.Models.Question;

import java.util.List;

public class QuestionCategoryRetrieveAsyncTask extends AsyncTask<Integer, Integer, List<Question>> {

    private QuestionCategoryAsyncTaskDelegate delegate;
    private QuestionDatabase questionDatabase;

    public void setDelegate(QuestionCategoryAsyncTaskDelegate delegate){this.delegate = delegate;}
    public void setQuestionDatabase (QuestionDatabase questionDatabase){this.questionDatabase = questionDatabase;}

    @Override
    protected List<Question> doInBackground(Integer... integers) {
        return questionDatabase.questionDao().getQuestionCategory(integers[0]);
    }

    protected void onPostExecute(List<Question> questionList){
        delegate.handleQuestionListReturned(questionList);
    }

}
