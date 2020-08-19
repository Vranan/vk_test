package com.travel.travasko.listeners;

import com.travel.travasko.models.MomentSearchPojo.MomentSearchPojo;
import com.travel.travasko.models.UserSearchPojo.UserSearchPojo;

public abstract  class SearchUserListener {

    public abstract void onSuccess(String message,  UserSearchPojo userSearchPojo);
    public abstract void onFailure(String message);
}
