package org.isoron.uhabits.AsyncTasks;

import org.isoron.uhabits.Models.Question;

public interface QuestionAsyncTaskDelegate {

    void handleQuestionReturned(Question question);
}
