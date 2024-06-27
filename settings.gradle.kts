pluginManagement {
    includeBuild("build-logic")
    repositories {
        gradlePluginPortal()
    }
}

dependencyResolutionManagement {
    @Suppress("UnstableApiUsage")
    repositories {
        mavenCentral()
        mavenLocal()
    }
}

rootProject.name = "protobuf-java-compatibility-issue"

enableFeaturePreview("TYPESAFE_PROJECT_ACCESSORS")

plugins {
    // Apply the foojay-resolver plugin to allow automatic download of JDKs
    id("org.gradle.toolchains.foojay-resolver-convention") version "0.8.0"
}

include("apps:app-v4-lib-v3")
include("libs:protobuf-v3")
