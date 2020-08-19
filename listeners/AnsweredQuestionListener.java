package com.travel.travasko.listeners;

import com.travel.travasko.models.AnsweredQuestionPojo;
import com.travel.travasko.models.Question.QuestionPojo;

import java.util.List;

public abstract class AnsweredQuestionListener {
    public abstract void onSuccess(String message, int pos, List<AnsweredQuestionPojo> questionPojoArrayList);
    public abstract void onFailure(String message, int pos);
}
