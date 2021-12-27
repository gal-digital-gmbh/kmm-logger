// Top-level build file where you can add configuration options common to all sub-projects/modules.
buildscript {

    repositories {
        gradlePluginPortal()
        google()
        mavenCentral()
    }
    dependencies {
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:1.6.10")
        classpath("com.android.tools.build:gradle:7.0.1")
        classpath("org.jetbrains.dokka:dokka-gradle-plugin:1.6.10")
    }
}

allprojects {
    repositories {
        google()
        mavenCentral()
    }
}

tasks.create<Delete>("clean") {
    delete = setOf(rootProject.buildDir)
}

