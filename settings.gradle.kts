rootProject.name = "DaySeven"
enableFeaturePreview("TYPESAFE_PROJECT_ACCESSORS")

@Suppress("UnstableApiUsage")
pluginManagement {
    repositories {
        google {
            mavenContent {
                includeGroupAndSubgroups("androidx")
                includeGroupAndSubgroups("com.android")
                includeGroupAndSubgroups("com.google")
            }
        }
        mavenCentral()
        gradlePluginPortal()
    }
}

plugins {
    id("org.gradle.toolchains.foojay-resolver-convention") version "1.0.0"
}

@Suppress("UnstableApiUsage")
dependencyResolutionManagement {
    repositories {
        google {
            mavenContent {
                includeGroupAndSubgroups("androidx")
                includeGroupAndSubgroups("com.android")
                includeGroupAndSubgroups("com.google")
            }
        }
        mavenCentral()
    }
}

gradle.beforeProject {
    if (name == rootProject.name) {
        layout.buildDirectory.set(rootProject.layout.projectDirectory.dir(".build/project"))
    }
}

val appModules = setOf("android", "desktop")
appModules.forEach { module ->
    include(":$module")
}

gradle.beforeProject {
    if (name in appModules) {
        layout.buildDirectory.set(rootProject.layout.projectDirectory.dir(".build/$name"))
    }
}

val individualModules = setOf("compose", "design-system")
individualModules.forEach { module ->
    include(":$module")
}

gradle.beforeProject {
    if (name in individualModules) {
        layout.buildDirectory.set(rootProject.layout.projectDirectory.dir(".build/$name"))
    }
}