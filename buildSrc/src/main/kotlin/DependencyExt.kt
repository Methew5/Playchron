import org.gradle.kotlin.dsl.DependencyHandlerScope

fun DependencyHandlerScope.network() {
    add(
        configurationName = "implementation",
        dependencyNotation = Retrofit.retrofit
    )
    add(
        configurationName = "implementation",
        dependencyNotation = Retrofit.gsonConverter
    )
    add(
        configurationName = "implementation",
        dependencyNotation = Retrofit.okHttp
    )
    add(
        configurationName = "implementation",
        dependencyNotation = Retrofit.okHttpLoggingInterceptor
    )
}

fun DependencyHandlerScope.di() {
    add(
        configurationName = "implementation",
        dependencyNotation = Hilt.hiltAndroid
    )
    add(
        configurationName = "ksp",
        dependencyNotation = Hilt.hiltCompiler
    )
}

fun DependencyHandlerScope.testing() {
    add(
        configurationName = "testImplementation",
        dependencyNotation = Testing.junit4
    )
    add(
        configurationName = "testImplementation",
        dependencyNotation = Testing.truth
    )
    add(
        configurationName = "testImplementation",
        dependencyNotation = Testing.junitAndroidExt
    )
    add(
        configurationName = "testImplementation",
        dependencyNotation = Testing.coroutines
    )
    add(
        configurationName = "testImplementation",
        dependencyNotation = Testing.turbine
    )
    add(
        configurationName = "testImplementation",
        dependencyNotation = Testing.mockk
    )
    add(
        configurationName = "testImplementation",
        dependencyNotation = Testing.mockWebServer
    )

    // android testing
    add(
        configurationName = "androidTestImplementation",
        dependencyNotation = Testing.junit4
    )
    add(
        configurationName = "androidTestImplementation",
        dependencyNotation = Testing.truth
    )
    add(
        configurationName = "androidTestImplementation",
        dependencyNotation = Testing.junitAndroidExt
    )
    add(
        configurationName = "androidTestImplementation",
        dependencyNotation = Testing.coroutines
    )
    add(
        configurationName = "androidTestImplementation",
        dependencyNotation = Testing.turbine
    )
    add(
        configurationName = "androidTestImplementation",
        dependencyNotation = Testing.mockk
    )
    add(
        configurationName = "androidTestImplementation",
        dependencyNotation = Testing.mockWebServer
    )
    add(
        configurationName = "androidTestImplementation",
        dependencyNotation = Testing.hiltTesting
    )
}