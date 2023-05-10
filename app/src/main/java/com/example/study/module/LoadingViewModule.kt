package com.example.study.module

import com.facebook.react.bridge.ReactApplicationContext
import com.facebook.react.bridge.ReactContextBaseJavaModule
import com.facebook.react.bridge.ReactMethod

class LoadingViewModule(reactContext: ReactApplicationContext) : ReactContextBaseJavaModule(reactContext) {
    override fun getName() = "LoadingViewModule"

    @ReactMethod
    fun showLoading() {

    }

    @ReactMethod
    fun showToast(text: String, duration: Number) {

    }

    @ReactMethod
    fun hideLoading() {

    }
}