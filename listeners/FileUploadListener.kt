package com.travel.travasko.listeners

interface FileUploadListener {
    fun onUploadSuccess(message: String)
    fun onUploadFail(message: String)
    fun onUploadProgress(uploadedSize: String, totalSize: String)
}