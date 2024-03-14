plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
    kotlin("kapt")
    id("com.google.dagger.hilt.android")
}

android {
    namespace = "com.example.newsscrolling"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.newsscrolling"
        minSdk = 24
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        vectorDrawables {
            useSupportLibrary = true
        }
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
    kotlinOptions {
        jvmTarget = "17"
    }
    buildFeatures {
        compose = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = "1.5.1"
    }
    packaging {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }
}

dependencies {

    implementation(Dependencies.coreKtx)
    implementation(Dependencies.lifecycleRuntime)
    implementation(Dependencies.activityCompose)
    implementation(platform(Dependencies.composeBom))
    implementation(Dependencies.composeUi)
    implementation(Dependencies.composeUig)
    implementation(Dependencies.composeUitp)
    implementation(Dependencies.composeMaterial3)
    testImplementation(Dependencies.junitv)
    androidTestImplementation(Dependencies.testExtJunit)
    androidTestImplementation(Dependencies.tEspressoCore)
    androidTestImplementation(platform(Dependencies.composeComposeBom))
    androidTestImplementation(Dependencies.uiTestJunit4)
    debugImplementation(Dependencies.composeUit)
    debugImplementation(Dependencies.composeUitm)

    implementation(project(Modules.utilities))

    implementation(Dependencies.hiltAndroid)
    kapt(Dependencies.hiltCompiler)
    kapt(Dependencies.hiltAndroidCompiler)

    implementation(Dependencies.hiltNavigationCompose)

    implementation(Dependencies.retrofit)
    implementation(Dependencies.okhttp)
    implementation(Dependencies.gsonConverter)
    implementation(Dependencies.moshiConverter)
    implementation(Dependencies.moshi)
    implementation(Dependencies.loggingInterceptor)

    implementation(Dependencies.coroutinesAndroid)
    implementation(Dependencies.coroutinesCore)

    implementation(Dependencies.splashScreen)

    implementation(Dependencies.coilForImages)
}

kapt{
    correctErrorTypes = true
}