plugins {
    id(Plugins.androidApplication)
    id(Plugins.kotlinAndroid)
    id(Plugins.composeCompiler)
    id(Plugins.ksp)
    id(Plugins.hiltAndroid)
    kotlin(Plugins.serializable) version Plugins.kotlinVersion
}

android {
    namespace = AppConfig.namespace
    compileSdk = AppConfig.compileSdk

    defaultConfig {
        applicationId = AppConfig.appId
        minSdk = AppConfig.minSdk
        targetSdk = AppConfig.targetSdk
        versionCode = AppConfig.versionCode
        versionName = AppConfig.versionName

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
        sourceCompatibility = JavaVersion.VERSION_21
        targetCompatibility = JavaVersion.VERSION_21
    }
    kotlinOptions {
        jvmTarget = AppConfig.jvmTarget
    }
    buildFeatures {
        compose = true
    }
    packaging {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }
}

dependencies {

    implementation(project(Modules.core))
    implementation(project(Modules.designSystem))

    implementation(project(Modules.Features.Onboarding.presentation))

    // Kotlin
//    implementation(libs.kotlinx.serialization.json)

    // Android
//    implementation(libs.androidx.core.ktx)
//    implementation(libs.androidx.lifecycle.viewmodel.compose)
//    implementation(libs.androidx.lifecycle.runtime.ktx)

    // Navigation
//    implementation(libs.androidx.navigation.compose)
//    implementation(libs.androidx.hilt.navigation.compose)

    implementation(project(Modules.designSystem))

    // Compose
    implementation(platform(Compose.composeBom))
    testImplementation(platform(Compose.composeBom))
    androidTestImplementation(platform(Compose.composeBom))

    implementation(Compose.activityCompose)
    implementation(Compose.ui)
    implementation(Compose.uiGraphics)
    implementation(Compose.uiTooling)
    implementation(Compose.uiToolingPreview)
    implementation(Compose.material3)
    implementation(Compose.materialIconsExtended)
    implementation(Compose.viewModelCompose)

    testImplementation(Compose.composeUiTestManifest)
    testImplementation(Compose.composeUiTestJunit4)
    androidTestImplementation(Compose.composeUiTestManifest)
    androidTestImplementation(Compose.composeUiTestJunit4)

    di()
    testing()
}