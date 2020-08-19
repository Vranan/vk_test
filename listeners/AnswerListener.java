package com.travel.travasko.listeners;

import com.travel.travasko.models.Comment.CommentUserPojo;

import java.util.ArrayList;

public abstract class AnswerListener {
    public abstract void onSuccess(String message, int pos);
    public abstract void onSuccessGettingComments(String message, int pos, ArrayList<CommentUserPojo> commentPojoArrayList);
    public abstract void onFailure(String message, int pos);
    public abstract void onProgress(String message, int pos);
}
