package org.isoron.uhabits.AsyncTasks;

import org.isoron.uhabits.Models.Question;

import java.util.List;

public interface QuestionCategoryAsyncTaskDelegate {
    void handleQuestionListReturned(List<Question> questionList);
}
