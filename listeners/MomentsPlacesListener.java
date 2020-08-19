package com.travel.travasko.listeners;

import com.google.gson.JsonElement;
import com.travel.travasko.models.MomentPlacePojo.MomentPlacePojo;
import com.travel.travasko.models.MomentPlacesPojo;

import java.util.List;

public abstract class MomentsPlacesListener {
    public abstract void onSuccess(String message, int pos, JsonElement momentPlacesPojo);
    public abstract void onFailure(String message, int pos);
}
