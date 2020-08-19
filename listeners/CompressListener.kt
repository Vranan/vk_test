package com.travel.travasko.listeners

interface CompressListener {
    fun onExecSuccess(message: String)
    fun onExecFail(message: String)
    fun onExecProgress(message: String)
}