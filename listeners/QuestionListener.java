package com.travel.travasko.listeners;

import com.travel.travasko.models.Question.QuestionPojo;

import java.util.List;

public abstract class QuestionListener {
    public abstract void onSuccess(String message, int pos);
    public abstract void ongettSuccess(String message, int momentId, List<QuestionPojo> questionPojoArrayList);
    public abstract void ongettSuccessSingleQuestion(String message, int momentId, QuestionPojo questionPojo);
    public abstract void onFailure(String message, int pos);
    public abstract void onProgress(String message, int pos);
}
