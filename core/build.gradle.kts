plugins {
    id(Plugins.androidLibrary)
    id(Plugins.kotlinAndroid)
}

apply(from = "$rootDir/shared-build.gradle")

android {

    namespace = "com.methew5.core"
}