pluginManagement {
    repositories {
        gradlePluginPortal()
        maven("https://plugins.gradle.org/m2/")
        mavenCentral()
        google()
    }
}

dependencyResolutionManagement {
    @Suppress("UnstableApiUsage")
    repositories {
        mavenCentral()
        google()
        gradlePluginPortal()
        maven("https://repo.repsy.io/mvn/mooncloak/public")
    }
}

plugins {
    // This is the plugin we use to handle our dependency versions. See the versions.properties file for the latest versions.
    // See https://jmfayard.github.io/refreshVersions
    id("de.fayard.refreshVersions") version "0.60.5"

    // See root build.gradle.kts file for the rest of the plugins applied.
}

rootProject.name = "build-logic"
