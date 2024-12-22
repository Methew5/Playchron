object AndroidX {

    private const val coreKtxVersion = "1.15.0"
    const val coreKtx = "androidx.core:core-ktx:$coreKtxVersion"
}

object Coil {

    private const val version = "3.0.4"
    const val coilCompose = "io.coil-kt:coil-compose:$version"
}

object Compose {

    const val composeBomVersion = "2024.12.01"

    const val composeBom = "androidx.compose:compose-bom:$composeBomVersion"
    const val ui = "androidx.compose.ui:ui"
    const val uiGraphics = "androidx.compose.ui:ui-graphics"
    const val uiTooling = "androidx.compose.ui:ui-tooling"
    const val uiToolingPreview = "androidx.compose.ui:ui-tooling-preview"
    const val material3 = "androidx.compose.material3:material3"
    const val materialIconsExtended = "androidx.compose.material:material-icons-extended"

    private const val activityComposeVersion = "1.9.3"
    const val activityCompose = "androidx.activity:activity-compose:$activityComposeVersion"

    private const val navigationVersion = "2.8.5"
    const val navigation = "androidx.navigation:navigation-compose:$navigationVersion"

    private const val hiltNavigationComposeVersion = "1.2.0"
    const val hiltNavigationCompose = "androidx.hilt:hilt-navigation-compose:$hiltNavigationComposeVersion"

    private const val lifecycleVersion = "2.8.7"
    const val viewModelCompose = "androidx.lifecycle:lifecycle-viewmodel-compose:$lifecycleVersion"

    const val composeUiTestManifest = "androidx.compose.ui:ui-test-manifest"
    const val composeUiTestJunit4 = "androidx.compose.ui:ui-test-junit4"
}

object Hilt {

    const val version = "2.51.1"
    const val hiltAndroid = "com.google.dagger:hilt-android:$version"
    const val hiltCompiler = "com.google.dagger:hilt-compiler:$version"
}

object KotlinxSerialization {

    const val version = "1.7.3"
    const val kotlinxSerializationJson = "org.jetbrains.kotlinx:kotlinx-serialization-json:$version"
}

object Retrofit {

    private const val version = "2.11.0"
    const val retrofit = "com.squareup.retrofit2:retrofit:$version"
    const val gsonConverter = "com.squareup.retrofit2:converter-gson:$version"

    private const val okHttpVersion = "4.12.0"
    const val okHttp = "com.squareup.okhttp3:okhttp:$okHttpVersion"
    const val okHttpLoggingInterceptor = "com.squareup.okhttp3:logging-interceptor:$okHttpVersion"
}

object Testing {

    private const val junitVersion = "4.13.2"
    const val junit4 = "junit:junit:$junitVersion"

    private const val junitAndroidExtVersion = "1.1.3"
    const val junitAndroidExt = "androidx.test.ext:junit:$junitAndroidExtVersion"

    private const val coroutinesTestVersion = "1.5.1"
    const val coroutines = "org.jetbrains.kotlinx:kotlinx-coroutines-test:$coroutinesTestVersion"

    private const val truthVersion = "1.1.3"
    const val truth = "com.google.truth:truth:$truthVersion"

    private const val mockkVersion = "1.10.0"
    const val mockk = "io.mockk:mockk:$mockkVersion"
    const val mockkAndroid = "io.mockk:mockk-android:$mockkVersion"

    private const val turbineVersion = "0.7.0"
    const val turbine = "app.cash.turbine:turbine:$turbineVersion"

    private const val mockWebServerVersion = "4.9.3"
    const val mockWebServer = "com.squareup.okhttp3:mockwebserver:$mockWebServerVersion"

    const val hiltTesting = "com.google.dagger:hilt-android-testing:${Hilt.version}"

    private const val testRunnerVersion = "1.4.0"
    const val testRunner = "androidx.test:runner:$testRunnerVersion"
}