package com.travel.travasko.listeners;

import com.travel.travasko.models.AnsweredQuestionPojo;
import com.travel.travasko.models.searchModel.SearchQuestionPojo;

import java.util.List;

public abstract  class SearchQuestionListener {

    public abstract void onSuccess(String message,  SearchQuestionPojo searchQuestionPojo);
    public abstract void onFailure(String message);
}
