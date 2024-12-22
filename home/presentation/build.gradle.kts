plugins {
    id(Plugins.androidLibrary)
    id(Plugins.kotlinAndroid)
    id(Plugins.hiltAndroid)
    id(Plugins.composeCompiler)
}

apply(from = "$rootDir/shared-compose-build.gradle")

android {
    namespace = "com.methew5.home.presentation"
}

dependencies {

    implementation(project(Modules.core))

    implementation(Compose.hiltNavigationCompose)
    implementation(AndroidX.coreKtx)
}