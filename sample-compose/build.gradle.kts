import com.chrynan.parcelable.buildSrc.LibraryConstants
import org.jetbrains.kotlin.gradle.tasks.KotlinCompile
import org.jetbrains.compose.compose

plugins {
    kotlin("multiplatform") // kotlin("jvm") doesn't work well in IDEA/AndroidStudio (https://github.com/JetBrains/compose-jb/issues/22)
    id("kotlinx-serialization")
    id("org.jetbrains.compose")
    id("com.android.application")
}

group = LibraryConstants.group
version = LibraryConstants.versionName

kotlin {
    targets {
        android()
        jvm()
    }
    sourceSets {
        val commonMain by getting {
            dependencies {
                implementation(project(":parcelable-compose"))
                implementation(project(":sample-core"))

                implementation(compose.runtime)
                implementation(compose.foundation)
                implementation(compose.material)
            }
        }
        val androidMain by getting {
            dependencies {
                implementation("androidx.activity:activity-compose:1.6.1")

                implementation("androidx.appcompat:appcompat:1.6.1")

                // Syntax highlighting
                implementation("io.noties:prism4j:2.0.0")
            }
        }
        val jvmMain by getting {
            dependencies {
                implementation(compose.desktop.currentOs)

                // Syntax highlighting
                implementation("io.noties:prism4j:2.0.0")
            }
        }
    }
}

android {
    compileSdk = LibraryConstants.Android.compileSdkVersion

    defaultConfig {
        minSdk = 26
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

tasks.withType<Jar> { duplicatesStrategy = DuplicatesStrategy.WARN }

configurations.filter { it.name == "implementation" }.forEach {
    it.exclude(group = "org.jetbrains", module = "annotations")
}
