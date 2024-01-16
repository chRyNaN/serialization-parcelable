package com.chrynan.parcelable.buildSrc

import java.lang.System

/**
 * Determines if this Gradle build is running on a Mac OSX Operating System.
 */
fun isBuildingOnOSX(): Boolean {
    val osName = System.getProperty("os.name").toLowerCase()

    return osName.contains("mac os x") || osName.contains("darwin") || osName.contains("osx")
}

/**
 * Determines if this Gradle build is running on a Linux Operating System.
 */
fun isBuildingOnLinux(): Boolean {
    val osName = System.getProperty("os.name").toLowerCase()

    return osName.contains("linux")
}

/**
 * Determines if this Gradle build is running on a Windows Operating System.
 */
fun isBuildingOnWindows(): Boolean {
    val osName = System.getProperty("os.name").toLowerCase()

    return osName.contains("windows") || osName.contains("mingw")
}
