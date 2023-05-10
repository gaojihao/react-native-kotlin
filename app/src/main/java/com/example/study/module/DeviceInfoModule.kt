package com.example.study.module

import com.facebook.react.bridge.ReactApplicationContext
import com.facebook.react.bridge.ReactContextBaseJavaModule

class DeviceInfoModule(reactContext: ReactApplicationContext) : ReactContextBaseJavaModule(reactContext) {
    override fun getName() = "DeviceInfoModule"

    override fun getConstants(): MutableMap<String, Any>? {
        return hashMapOf("osType" to "", "sysVersion" to "","appPlatform" to "","storeChanel" to "","appVersion" to "","buildVersion" to "","uuid" to "")
    }
}