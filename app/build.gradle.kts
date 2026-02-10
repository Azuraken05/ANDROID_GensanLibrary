plugins {
    alias(libs.plugins.android.application)
}

android {
    namespace = "com.example.taskperf1"
    compileSdk {
        version = release(36)
    }

    defaultConfig {
        applicationId = "com.example.taskperf1"
        minSdk = 27
        targetSdk = 36
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
}

dependencies {
    implementation(libs.appcompat)
    implementation(libs.material)
    implementation(libs.activity)
    implementation(libs.constraintlayout)
    testImplementation(libs.junit)
    androidTestImplementation(libs.ext.junit)
    androidTestImplementation(libs.espresso.core)
    implementation("org.imaginativeworld.whynotimagecarousel:whynotimagecarousel:2.1.1")
    implementation("me.relex:circleindicator:2.1.6")
}