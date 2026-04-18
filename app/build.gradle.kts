plugins {
    id("com.android.application")
    id("kotlin-android")
}

android {
    compileSdk = 33

    defaultConfig {
        applicationId = "com.example.shortform"
        minSdk = 21
        targetSdk = 33
        versionCode = 1
        versionName = "1.0"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }
}

dependencies {
    implementation("androidx.core:core-ktx:1.12.0")
    implementation("androidx.appcompat:appcompat:1.7.0")
    implementation("com.google.android.material:material:1.10.0")
    implementation("org.jetbrains.kotlin:kotlin-stdlib:1.8.10")
    // Additional dependencies can be added here
}