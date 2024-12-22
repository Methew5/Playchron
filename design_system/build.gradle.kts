plugins {
    id(Plugins.androidLibrary)
    id(Plugins.kotlinAndroid)
    id(Plugins.composeCompiler)
}

apply(from = "$rootDir/shared-compose-build.gradle")

android {
    namespace = "com.methew5.design_system"
}

dependencies {

    implementation(AndroidX.coreKtx)
}