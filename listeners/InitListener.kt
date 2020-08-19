package com.travel.travasko.listeners

interface InitListener {
    fun onLoadSuccess();
    fun onLoadFail(reason: String);
}