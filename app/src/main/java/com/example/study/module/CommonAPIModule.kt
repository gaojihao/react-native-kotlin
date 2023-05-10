package com.example.study.module

import com.facebook.react.bridge.ReactApplicationContext
import com.facebook.react.bridge.ReactContextBaseJavaModule
import com.facebook.react.bridge.ReactMethod

class CommonAPIModule(reactContext: ReactApplicationContext) : ReactContextBaseJavaModule(reactContext) {
    override fun getName() = "CommonAPIModule"

    /**
     * 关闭RN容器【同步】
     * @param needRefresh RN关闭时，通知原生页面是否需要刷新
     */
    @ReactMethod
    fun back(needRefresh: Boolean) {
        currentActivity?.finish()
    }

    /**
     * 跳转原生页面【同步】
     * @param url 跳转原生页面的url
     */
    @ReactMethod
    fun jump(url: String) {

    }

    /**
     * 通知原生，用户的登录态失效【同步】
     */
    @ReactMethod
    fun tokenExpired() {

    }
}