package com.travel.travasko.listeners;

import com.travel.travasko.models.NotificationPojo.NotificationPojo;
import com.travel.travasko.models.NotificationsList.NotificationsListPojo;

public abstract class NotificationListener {
    public abstract void onSuccess(String message, int pos);
    public abstract void onSuccessGettingMoments(String message, int pos, NotificationsListPojo notificationPojo);
    public abstract void onFailure(String message, int pos);
    public abstract void onProgress(String message, int pos);
}
