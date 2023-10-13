plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
    id("kotlin-kapt")
    id("com.google.devtools.ksp")
    id("dagger.hilt.android.plugin")
    id("kotlin-parcelize")
}

android {
    namespace = "com.tryden.dogbreeds"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.tryden.dogbreeds"
        minSdk = 24
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        vectorDrawables {
            useSupportLibrary = true
        }
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
    kotlinOptions {
        jvmTarget = "17"
    }
    buildFeatures {
        compose = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = "1.4.3"
    }
    packaging {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }
}

dependencies {


    // Coroutines
    implementation ("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.7.1")

    // Dagger - Hilt
    implementation ("com.google.dagger:hilt-android:2.44")
    ksp("com.google.dagger:hilt-android-compiler:2.44")

    kapt("androidx.hilt:hilt-compiler:1.0.0")
    implementation ("androidx.hilt:hilt-navigation-compose:1.0.0")
    implementation ("androidx.navigation:navigation-compose:2.7.4")

    // Material design
    implementation ("androidx.compose.material:material:1.5.3")
    implementation ("androidx.compose.material:material-icons-extended:1.5.3")
    implementation ("com.google.android.material:material:1.10.0")

    // For Okhttp3
    implementation ("com.squareup.okhttp3:okhttp:4.10.0")
    api ("com.squareup.okhttp3:logging-interceptor:4.10.0")

    // For Retrofit2 and Moshi
    api ("com.squareup.retrofit2:retrofit:2.9.0")
    implementation ("com.squareup.retrofit2:converter-moshi:2.9.0")

    // For Room Persistence
    implementation ("androidx.room:room-ktx:2.5.2")
    ksp ("androidx.room:room-compiler:2.5.2")

    // For Compose navigation
    implementation ("androidx.navigation:navigation-compose:2.7.4")

    // For Navigation animation
    implementation ("com.google.accompanist:accompanist-navigation-animation:0.25.1")

    // For View pager
    implementation ("com.google.accompanist:accompanist-pager:0.25.1")

    // For Coil
    implementation ("io.coil-kt:coil:2.2.2")
    implementation ("io.coil-kt:coil-compose:2.2.2")
    implementation ("io.coil-kt:coil-svg:2.2.0")

    // For Mockk
    testImplementation ("io.mockk:mockk:$1.12.5")

    // For Coroutines testing
    testImplementation ("org.jetbrains.kotlinx:kotlinx-coroutines-test:$1.6.4")
    testImplementation ("androidx.arch.core:core-testing:2.2.0")

    // For Kotest
    testImplementation ("io.kotest:kotest-assertions-core:5.4.2")
    testApi ("org.jetbrains.kotlin:kotlin-test")

    // For Junit
    testImplementation ("junit:junit:4.13.2")
    androidTestImplementation ("androidx.test.ext:junit:1.1.5")

    // For Espresso
    androidTestImplementation ("androidx.test.espresso:espresso-core:3.5.1")
    androidTestImplementation ("com.google.truth:truth:1.1")



    implementation("androidx.core:core-ktx:1.12.0")
    implementation("androidx.lifecycle:lifecycle-runtime-ktx:2.6.2")
    implementation("androidx.activity:activity-compose:1.8.0")
    implementation(platform("androidx.compose:compose-bom:2023.03.00"))
    implementation("androidx.compose.ui:ui")
    implementation("androidx.compose.ui:ui-graphics")
    implementation("androidx.compose.ui:ui-tooling-preview")
    implementation("androidx.compose.material3:material3")
    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.1.5")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")
    androidTestImplementation(platform("androidx.compose:compose-bom:2023.03.00"))
    androidTestImplementation("androidx.compose.ui:ui-test-junit4")
    debugImplementation("androidx.compose.ui:ui-tooling")
    debugImplementation("androidx.compose.ui:ui-test-manifest")
}