
plugins {
    kotlin("multiplatform")
    kotlin("native.cocoapods")
    id("com.android.library")
    id("maven-publish")
    id("signing")
}

group = "de.gal-digital"
version = Version.logger

repositories {
    gradlePluginPortal()
    google()
    jcenter()
    mavenCentral()
}

kotlin {
    android {
        publishLibraryVariants("release")
    }
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

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
}
val sonaTypeUrl = (properties["sonatypeUrl"] as String?)!!
println("sonatypeUrl: $sonaTypeUrl")
publishing {
    repositories {
        maven {
            name = "OSSRH"
            url = uri(sonaTypeUrl)
            credentials {
                username = properties["sonatypeUsername"] as String?
                password =  properties["sonatypePassword"] as String?
            }
        }
    }
}
signing {
    sign(publishing.publications)
}
