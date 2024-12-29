plugins {
    id(Plugins.androidLibrary)
//    id(Plugins.kotlinAndroid)
    id(Plugins.hiltAndroid)
    id(Plugins.composeCompiler)
    id("org.jetbrains.kotlin.android")
}

apply(from = "$rootDir/shared-compose-build.gradle")

android {
    namespace = "com.methew5.onboarding_presentation"
}

dependencies {

    implementation(project(Modules.core))
    implementation(project(Modules.designSystem))

    implementation(Compose.hiltNavigationCompose)
    implementation(AndroidX.coreKtx)
}

