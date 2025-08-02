import org.jetbrains.kotlin.gradle.ExperimentalKotlinGradlePluginApi
import org.jetbrains.kotlin.gradle.ExperimentalWasmDsl
import org.jetbrains.kotlin.gradle.dsl.JvmTarget

plugins {
    alias(libs.plugins.kotlinMultiplatform)
    alias(libs.plugins.androidLibrary)
    alias(libs.plugins.vanniktech.mavenPublish)

    alias(libs.plugins.composeMultiplatform)
    alias(libs.plugins.composeCompiler)
}

group = "dev.yuyuyuyuyu"
version = "0.3.0"

kotlin {
    jvm("desktop")

    androidTarget {
        publishLibraryVariants("release")
        @OptIn(ExperimentalKotlinGradlePluginApi::class)
        compilerOptions {
            jvmTarget.set(JvmTarget.JVM_11)
        }
    }

    iosX64()
    iosArm64()
    iosSimulatorArm64()

    @OptIn(ExperimentalWasmDsl::class)
    wasmJs {
        browser()
    }

    sourceSets {
        commonMain.dependencies {
            implementation(compose.material3)
            implementation(compose.components.resources)
            implementation(libs.createTypography)
        }
        commonTest.dependencies {
            implementation(libs.kotlin.test)
        }
    }
}

android {
    namespace = "dev.yuyuyuyuyu.mymaterialtheme"
    compileSdk = libs.versions.android.compileSdk.get().toInt()
    defaultConfig {
        minSdk = libs.versions.android.minSdk.get().toInt()
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
}

mavenPublishing {
    publishToMavenCentral(automaticRelease = true)

    signAllPublications()

    coordinates(group.toString(), "mymaterialtheme", version.toString())

    pom {
        name = "MyMaterialTheme"
        description = "My custom MaterialTheme."
        inceptionYear = "2025"
        url = "https://github.com/yuyuyuyuyu-dev/MyMaterialTheme#readme"
        licenses {
            license {
                name = "The Apache License, Version 2.0"
                url = "https://www.apache.org/licenses/LICENSE-2.0.txt"
                distribution = "https://www.apache.org/licenses/LICENSE-2.0.txt"
            }
        }
        developers {
            developer {
                id = "dev.yuyuyuyuyu"
                name = "yu"
                url = "https://yuyuyuyuyu.dev"
            }
        }
        scm {
            url = "https://github.com/yuyuyuyuyu-dev/MyMaterialTheme"
            connection = "scm:git:git://github.com/yuyuyuyuyu-dev/MyMaterialTheme.git"
            developerConnection = "scm:git:ssh://git@github.com:yuyuyuyuyu-dev/MyMaterialTheme.git"
        }
    }
}
