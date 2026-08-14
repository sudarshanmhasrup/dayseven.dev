import org.jetbrains.kotlin.gradle.dsl.JvmTarget

plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.compose.compiler)
}

group = libs.versions.android.group.get()
version = libs.versions.android.version.get()


kotlin {
    compilerOptions {
        jvmTarget = JvmTarget.JVM_11
    }
}