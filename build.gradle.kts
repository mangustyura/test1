plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
}

android {
    namespace = "com.test.app1"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.test.app1"
        minSdk = 21
        targetSdk = 34
        versionCode = 20
        versionName = "0.4.3"
        multiDexEnabled = true
    }
}