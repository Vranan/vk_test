package com.travel.travasko.listeners;

import com.travel.travasko.models.FollowReqPojo.FollowRequestPojo;
import com.travel.travasko.models.NotificationsList.NotificationsListPojo;

public abstract class FollowReqListener {
    public abstract void onSuccess(String message, int pos);
    public abstract void onSuccessGettingMoments(String message, int pos, FollowRequestPojo followRequestPojo);
    public abstract void onFailure(String message, int pos);
    public abstract void onProgress(String message, int pos);
}
