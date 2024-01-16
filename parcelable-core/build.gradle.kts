import com.chrynan.parcelable.buildSrc.LibraryConstants
import com.chrynan.parcelable.buildSrc.isBuildingOnOSX
import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("multiplatform")
    id("com.android.library")
    id("maven-publish")
    id("org.jetbrains.dokka")
}

group = LibraryConstants.group
version = LibraryConstants.versionName

kotlin {
    android {
        publishAllLibraryVariants()
    }
    targets {
        android()
        jvm()
        js(IR) {
            browser {
                testTask {
                    enabled = false
                }
            }
            nodejs {
                testTask {
                    enabled = false
                }
            }
        }
        if (isBuildingOnOSX()) {
            ios()
            iosSimulatorArm64()
        }
    }
    sourceSets {
        val commonMain by getting {
            dependencies {
                // kotlinx.serialization
                api("org.jetbrains.kotlinx:kotlinx-serialization-core:_")
                implementation("org.jetbrains.kotlinx:kotlinx-serialization-json:_")
            }
        }
        val commonTest by getting {
            dependencies {
                implementation(kotlin("test"))
            }
        }
        if (isBuildingOnOSX()) {
            val iosMain by sourceSets.getting
            val iosSimulatorArm64Main by sourceSets.getting
            iosSimulatorArm64Main.dependsOn(iosMain)
        }
    }
}

dependencies {
    androidTestImplementation("androidx.test:rules:_")
    androidTestImplementation("androidx.test:runner:_")
    androidTestImplementation("androidx.test.ext:junit:_")
}

android {
    compileSdk = LibraryConstants.Android.compileSdkVersion
    namespace = "com.chrynan.parcelable.core"

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
                    username = (project.findProperty("repsyUsername") ?: System.getenv("repsyUsername")) as? String
                    password = (project.findProperty("repsyToken") ?: System.getenv("repsyToken")) as? String
                }
            }
        }
    }
}
