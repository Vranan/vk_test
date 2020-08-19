package com.travel.travasko.listeners;

public abstract class ChangeListener {
    public abstract void onItemChangeSuccess(String message, int pos);
    public abstract void onItemChangeFailed(String message, int pos);
}
