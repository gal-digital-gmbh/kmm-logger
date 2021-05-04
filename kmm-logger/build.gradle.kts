plugins {
    kotlin("multiplatform")
    kotlin("native.cocoapods")
    id("com.android.library")
}

group = "de.galdigital.logger"
version = Version.logger

repositories {
    gradlePluginPortal()
    google()
    jcenter()
    mavenCentral()
}

kotlin {
    android()
    ios()
    cocoapods {
        homepage = "https://www.gal-digital.de/"
        summary = "kotlin multiplatform logger"
        frameworkName = "logger"
    }

    sourceSets {
        val commonMain by getting {
            dependencies {
            }
        }
        val androidMain by getting {
            dependencies {
                dependsOn(commonMain)
            }
        }
        val iosMain by getting {
            dependencies {
                dependsOn(commonMain)
            }
        }
    }
}
android {
    compileSdkVersion(Version.Android.targetSdk)
    sourceSets["main"].manifest.srcFile("src/androidMain/AndroidManifest.xml")
    defaultConfig {
        minSdkVersion(Version.Android.minSdk)
        targetSdkVersion(Version.Android.targetSdk)
    }
    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
        }

    }
}
