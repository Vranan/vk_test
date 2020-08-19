package com.travel.travasko.listeners;

import com.travel.travasko.models.MomentSearchPojo.MomentSearchPojo;

public abstract  class SearchMomentistener {

    public abstract void onSuccess(String message,  MomentSearchPojo momentSearchPojo);
    public abstract void onFailure(String message);
}
