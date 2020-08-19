package com.travel.travasko.listeners;

import com.travel.travasko.models.Follow.FollowPojo;

public abstract class FollowListener {
    public abstract void onSuccess(String message, int pos);
    public abstract void onSuccessGettingFollowers(String message, int pos, FollowPojo followPojo);
    public abstract void onFailure(String message, int pos);
    public abstract void onProgress(String message, int pos);
}
