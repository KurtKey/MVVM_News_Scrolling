object Dependencies {
/*
    implementation("androidx.compose.ui:ui")
    implementation("androidx.compose.ui:ui-graphics")
    implementation("androidx.compose.ui:ui-tooling-preview")
    implementation("androidx.compose.material3:material3")
    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.1.5")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")
    androidTestImplementation(platform("androidx.compose:compose-bom:2023.08.00"))
    androidTestImplementation("androidx.compose.ui:ui-test-junit4")
    debugImplementation("androidx.compose.ui:ui-tooling")
    debugImplementation("androidx.compose.ui:ui-test-manifest")
    //
    implementation("androidx.appcompat:appcompat:1.6.1")
    implementation("com.google.android.material:material:1.9.0")
    */

    val coreKtx by lazy { "androidx.core:core-ktx:${Versions.coreKtx}" }
    val lifecycleRuntime by lazy { "androidx.lifecycle:lifecycle-runtime:${Versions.lifecycleRuntime}" }
    val activityCompose by lazy { "androidx.activity:activity-compose:${Versions.activityCompose}" }
    val composeBom by lazy {"androidx.compose:compose-bom:${Versions.composeBom}"}
    val composeUi by lazy {"androidx.compose.ui:${Versions.composeUi}"}
    val composeUig by lazy {"androidx.compose.ui:${Versions.composeUig}"}
    val composeUitp by lazy {"androidx.compose.ui:${Versions.composeUitp}"}
    val composeMaterial3 by lazy {"androidx.compose.material3:${Versions.composeMaterial3}"}
    val junitv by lazy {"junit:junit:${Versions.junitv}"}
    val testExtJunit by lazy {"androidx.test.ext:junit:${Versions.testExtJunit}"}
    val tEspressoCore by lazy {"androidx.test.espresso:espresso-core:${Versions.tEspressoCore}"}
    val composeComposeBom by lazy {"androidx.compose:compose-bom:${Versions.composeComposeBom}"}
    val uiTestJunit4 by lazy {"androidx.compose.ui:${Versions.uiTestJunit4}"}
    val composeUit by lazy {"androidx.compose.ui:${Versions.composeUit}"}
    val composeUitm by lazy {"androidx.compose.ui:${Versions.composeUitm}"}
    val appcompact by lazy {"androidx.appcompat:appcompat:${Versions.appcompact}"}
    val material by lazy {"com.google.android.material:material:${Versions.material}"}

    val hiltAndroid by lazy { "com.google.dagger:hilt-android:${Versions.hiltAndroid}" }
    val hiltAndroidCompiler by lazy { "com.google.dagger:hilt-android-compiler:${Versions.hiltAndroidCompiler}" }
    val hiltCompiler by lazy { "androidx.hilt:hilt-compiler:${Versions.hiltCompiler}" }

    val hiltNavigationCompose by lazy { "androidx.hilt:hilt-navigation-compose:${Versions.hiltNavigationCompose}" }

    val retrofit by lazy { "com.squareup.retrofit2:retrofit:${Versions.retrofit}" }
    val okhttp by lazy { "com.squareup.okhttp3:okhttp:${Versions.okhttp}" }
    val gsonConverter by lazy { "com.squareup.retrofit2:converter-gson:${Versions.gsonConverter}" }
    val moshi by lazy { "com.squareup.moshi:moshi-kotlin:${Versions.moshi}" }
    val moshiConverter by lazy { "com.squareup.retrofit2:converter-moshi:${Versions.moshiConverter}" }
    val loggingInterceptor by lazy { "com.squareup.okhttp3:logging-interceptor:${Versions.loggingInterceptor}" }

    val coroutinesAndroid by lazy { "org.jetbrains.kotlinx:kotlinx-coroutines-android:${Versions.coroutinesAndroid}" }
    val coroutinesCore by lazy { "org.jetbrains.kotlinx:kotlinx-coroutines-core:${Versions.coroutinesCore}" }

    val splashScreen by lazy { "androidx.core:core-splashscreen:${Versions.splashScreen}" }

    val coilForImages by lazy { "io.coil-kt:coil-compose:${Versions.coilForImages}" }

}


object Modules {
    const val utilities = ":utilities"
}