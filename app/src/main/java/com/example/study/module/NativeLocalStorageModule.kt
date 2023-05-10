package com.example.study.module

import android.content.Context
import android.content.SharedPreferences
import android.preference.PreferenceManager
import com.facebook.react.bridge.Promise
import com.facebook.react.bridge.ReactApplicationContext
import com.facebook.react.bridge.ReactContextBaseJavaModule
import com.facebook.react.bridge.ReactMethod

class NativeLocalStorageModule(reactContext: ReactApplicationContext) : ReactContextBaseJavaModule(reactContext) {
    override fun getName() = "NativeLocalStorageModule"

    // 保存值，如果key值相同，会覆盖之前的（同步）
    @ReactMethod
    fun setItem(key: String, value: String) {
        val sharePref = currentActivity?.getSharedPreferences("earth", Context.MODE_PRIVATE)
        val edit =  sharePref?.edit()
        edit?.putString(key, value)
        edit?.apply()
    }

    // 获取值（异步）
    @ReactMethod
    fun getItem(key: String, promise: Promise) {
        val sharePref = currentActivity?.getSharedPreferences("earth", Context.MODE_PRIVATE)
        var value = sharePref?.getString(key, null)
        promise.resolve("value")
    }

    // 移除值
    @ReactMethod
    fun removeItem(key: String) {
        val sharePref = currentActivity?.getSharedPreferences("earth", Context.MODE_PRIVATE)
        val edit =  sharePref?.edit()
        edit?.remove(key)
        edit?.apply()
    }

    // 全部移除
    @ReactMethod
    fun clear() {
        val sharePref = currentActivity?.getSharedPreferences("earth", Context.MODE_PRIVATE)
        val edit =  sharePref?.edit()
        edit?.clear()
        edit?.apply()
    }
}