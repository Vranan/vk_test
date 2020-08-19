package com.travel.travasko.listeners;

import com.travel.travasko.models.Account.AccountPojo;
import com.travel.travasko.models.User.UserPojo;

public abstract class UserListener {
    public abstract void onSuccess(String message, int pos);
    public abstract void onFailure(String message, int pos);
    public abstract void onFetchUser(String message, AccountPojo accountPojo);
    public abstract void onFetchProfile(String message, UserPojo userPojo);
    public abstract void onProgress(String message, int pos);
}
