plugins {
    id("com.android.application") version "8.0.0" apply false
    id("kotlin-android") version "1.7.10" apply false
}

android {
    compileSdk = 33

    defaultConfig {
        applicationId = "com.example.shortformai"
        minSdk = 21
        targetSdk = 33
        versionCode = 1
        versionName = "1.0"
    }
}

dependencies {
    implementation("org.jetbrains.kotlin:kotlin-stdlib:1.7.10")
}