package com.travel.travasko.listeners;

public abstract class ReportAndFeedbackListener {
    public abstract void onSuccess(String message, int pos);
    public abstract void onFailure(String message, int pos);
    public abstract void onProgress(String message, int pos);
}
