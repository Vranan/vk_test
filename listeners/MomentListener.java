package com.travel.travasko.listeners;

import com.travel.travasko.models.Moment.MomentPojo;

import java.util.ArrayList;

public interface MomentListener {
    public void onDeleteSuccess(String message, int pos, int momentId);
    public void onPostSuccess(String message, int momentId);
    public void ongettSuccess(String message, int momentId, ArrayList<MomentPojo> momentPojo);
    public void ongettSuccessSingleMoment(String message, int momentId, MomentPojo momentPojo);
    public void onUpdateSuccess(String message, int momentId);
    public void onFailure(String message, int momentId);
}
