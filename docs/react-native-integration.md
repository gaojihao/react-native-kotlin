# React Native集成到现有原生应用

### React Native依赖下载
在package.json的统计目录下执行yarn install，将react native的依赖下载到本地

### React Native集成
在settings.gradle文件夹添加

```
includeBuild('../node_modules/react-native-gradle-plugin')
```

然后在项目项目的build.gradle中添加

```
buildscript {
    repositories {
        maven { url 'https://maven.aliyun.com/repository/central/' }
        maven { url 'https://maven.aliyun.com/repository/public/' }
        maven { url 'https://maven.aliyun.com/repository/google/' }
        maven { url 'https://maven.aliyun.com/repository/jcenter/' }
    }
    dependencies {
+       classpath("com.facebook.react:react-native-gradle-plugin")
    }
}
```
然后执行gradle sync，确保react-native-gradle-plugin处于可用状态。然后在app目录下的build.gradle添加

```
apply plugin: "com.android.application"
+apply plugin: "com.facebook.react"

repositories {
    mavenCentral()
}

dependencies {
    // Other dependencies here
+   implementation "com.facebook.react:react-android"
+   implementation "com.facebook.react:hermes-android"
}
```

### 原生模块autolinking
在settings.gradle中添加

```
apply from: file("../node_modules/@react-native-community/cli-platform-android/native_modules.gradle"); applyNativeModulesSettingsGradle(settings)
```
并在app下的build.gradle中添加

```
apply from: file("../../node_modules/@react-native-community/cli-platform-android/native_modules.gradle"); applyNativeModulesAppBuildGradle(project)
```
node_modules的路径和项目的实际路径为准

### 配置权限

在AndroidManifest.xml中添加网络权限

```
<uses-permission android:name="android.permission.INTERNET" />
```
和

```
<!-- ... -->
<application
  android:usesCleartextTraffic="true">
  <!-- ... -->
</application>
<!-- ... -->
```

并需要在AndroidManifest.xml中添加调试视图

```
<activity android:name="com.facebook.react.devsupport.DevSettingsActivity" />
```



