plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
}

android {
    namespace = "ir.gholaknovin.aibot"
    compileSdk = 35

    defaultConfig {
        applicationId = "ir.gholaknovin.aibot"
        minSdk = 26
        targetSdk = 35
        versionCode = 1
        versionName = "0.2"
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
    kotlinOptions {
        jvmTarget = "17"
    }
}
