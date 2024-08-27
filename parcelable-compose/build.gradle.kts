import com.chrynan.parcelable.buildSrc.LibraryConstants
import com.chrynan.parcelable.buildSrc.isBuildingOnOSX
import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("multiplatform")
    id("com.android.library")
    id("maven-publish")
    id("org.jetbrains.dokka")
    id("org.jetbrains.compose")
    id("org.jetbrains.kotlin.plugin.compose")
}

group = LibraryConstants.group
version = LibraryConstants.versionName

kotlin {
    applyDefaultHierarchyTemplate()

    androidTarget()

    jvm()

    js(IR) {
        browser()
    }

    @Suppress("OPT_IN_USAGE")
    wasmJs {
        browser()
    }

    if (isBuildingOnOSX()) {
        iosX64()
        iosArm64()
        iosSimulatorArm64()
        macosX64()
        macosArm64()
    }

    sourceSets {
        all {
            languageSettings.optIn("kotlin.RequiresOptIn")
        }

        val commonMain by getting {
            dependencies {
                implementation(project(":parcelable-core"))

                implementation("org.jetbrains.kotlinx:kotlinx-serialization-json:_")

                implementation(compose.runtime)
            }
        }

        val androidMain by getting {
            dependencies {
                implementation(compose.foundation)
            }
        }

        val jvmMain by getting {
            dependencies {
                implementation(compose.foundation)
            }
        }

        if (isBuildingOnOSX()) {
            val iosMain by sourceSets.getting
            val iosSimulatorArm64Main by sourceSets.getting
            iosSimulatorArm64Main.dependsOn(iosMain)
        }
    }
}

android {
    compileSdk = LibraryConstants.Android.compileSdkVersion
    namespace = "com.chrynan.parcelable.compose"

    defaultConfig {
        minSdk = LibraryConstants.Android.minSdkVersion
        targetSdk = LibraryConstants.Android.targetSdkVersion
        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        getByName("release") {
            proguardFiles(getDefaultProguardFile("proguard-android.txt"), "proguard-rules.pro")
        }
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }

    tasks.withType<KotlinCompile> {
        kotlinOptions {
            jvmTarget = "1.8"
            // Opt-in to experimental compose APIs
            freeCompilerArgs = listOf(
                "-Xopt-in=kotlin.RequiresOptIn"
            )
        }
    }

    sourceSets["main"].manifest.srcFile("src/androidMain/AndroidManifest.xml")
    sourceSets["main"].java.srcDirs("src/androidMain/kotlin")
    sourceSets["main"].res.srcDirs("src/androidMain/res")

    sourceSets["test"].java.srcDirs("src/androidTest/kotlin")
    sourceSets["test"].res.srcDirs("src/androidTest/res")
}

tasks.withType<Jar> { duplicatesStrategy = DuplicatesStrategy.INHERIT }

afterEvaluate {
    publishing {
        repositories {
            maven {
                url = uri("https://repo.repsy.io/mvn/chrynan/public")

                credentials {
                    username = (project.findProperty("repsyUsername")
                        ?: System.getenv("repsyUsername")) as? String
                    password = (project.findProperty("repsyToken")
                        ?: System.getenv("repsyToken")) as? String
                }
            }
        }
    }
}
