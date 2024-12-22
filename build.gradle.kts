plugins {
    id(Plugins.androidApplication) version Plugins.agpVersion apply false
    id(Plugins.androidLibrary) version Plugins.agpVersion apply false
    id(Plugins.kotlinAndroid) version Plugins.kotlinVersion apply false
    id(Plugins.composeCompiler) version Plugins.kotlinVersion apply false
    id(Plugins.kotlinJvm) version Plugins.kotlinVersion apply false
    id(Plugins.ksp) version Plugins.kspVersion apply false
    id(Plugins.hiltAndroid) version Hilt.version apply false
    kotlin(Plugins.serializable) version Plugins.kotlinVersion apply false
}