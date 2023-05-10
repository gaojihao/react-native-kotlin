package com.example.study.module

import android.view.View
import com.facebook.react.ReactPackage
import com.facebook.react.bridge.NativeModule
import com.facebook.react.bridge.ReactApplicationContext
import com.facebook.react.uimanager.ReactShadowNode
import com.facebook.react.uimanager.ViewManager

class ReactNativePackage : ReactPackage {
    override fun createViewManagers(p0: ReactApplicationContext): MutableList<ViewManager<View, ReactShadowNode<*>>> = mutableListOf()

    override fun createNativeModules(p0: ReactApplicationContext): MutableList<NativeModule> {
        return listOf(CommonAPIModule(p0), DeviceInfoModule(p0), LoadingViewModule(p0), NativeLocalStorageModule(p0)).toMutableList()
    }
}