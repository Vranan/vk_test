package com.travel.travasko.listeners;

import com.travel.travasko.models.TravelPojo;

public abstract class TravelListener {
    public abstract void onSuccess(String message, int pos);
    public abstract void onFailure(String message, int pos);
    public abstract void onFetchTravelInfo(String message, TravelPojo travelPojo);
    public abstract void onProgress(String message, int pos);
}
