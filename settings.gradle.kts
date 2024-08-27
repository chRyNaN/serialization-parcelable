pluginManagement {
    repositories {
        gradlePluginPortal()
        google()
        mavenCentral()
        maven("https://maven.pkg.jetbrains.space/public/p/compose/dev")
        maven("https://maven.pkg.jetbrains.space/kotlin/p/wasm/experimental")
        maven("https://repo.repsy.io/mvn/chrynan/public")
        maven("https://repo.repsy.io/mvn/mooncloak/public")
    }

    includeBuild("build-logic")
}

dependencyResolutionManagement {
    @Suppress("UnstableApiUsage")
    repositories {
        mavenCentral()
        google()
        maven("https://maven.pkg.jetbrains.space/public/p/compose/dev")
        maven("https://maven.pkg.jetbrains.space/kotlin/p/wasm/experimental")
        maven("https://repo.repsy.io/mvn/chrynan/public")
        maven("https://repo.repsy.io/mvn/mooncloak/public")
    }
}

plugins {
    // Apply the foojay-resolver plugin to allow automatic download of JDKs
    id("org.gradle.toolchains.foojay-resolver-convention") version "0.8.0"

    // See https://jmfayard.github.io/refreshVersions
    id("de.fayard.refreshVersions") version "0.60.5"
}

rootProject.name = "parcelable"

include(":parcelable-core")
include(":parcelable-compose")
// TODO: Enable: include(":sample-core")
// TODO: Enable: include(":sample-android")
// TODO: Enable: include(":sample-compose")
