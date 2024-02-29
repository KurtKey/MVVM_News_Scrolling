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
    debugImplementation("androidx.compose.ui:ui-test-manifest")*/

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



}