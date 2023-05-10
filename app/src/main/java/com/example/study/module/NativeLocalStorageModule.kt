package com.example.study.module

import com.facebook.react.bridge.Promise
import com.facebook.react.bridge.ReactApplicationContext
import com.facebook.react.bridge.ReactContextBaseJavaModule
import com.facebook.react.bridge.ReactMethod

class NativeLocalStorageModule(reactContext: ReactApplicationContext) : ReactContextBaseJavaModule(reactContext) {
    override fun getName() = "NativeLocalStorageModule"

    // 保存值，如果key值相同，会覆盖之前的（同步）
    @ReactMethod
    fun setItem(key: String, value: String) {

    }

    // 获取值（异步）
    @ReactMethod
    fun getItem(key: String, promise: Promise) {
        promise.resolve("")
    }

    // 移除值
    @ReactMethod
    fun removeItem(key: String) {

    }

    // 全部移除
    @ReactMethod
    fun clear() {

    }
}