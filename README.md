# kmm logger
![Maven Central](https://img.shields.io/maven-central/v/de.gal-digital/kmm-logger?style=flat-square)

simple kotlin multiplatform logger

## setup

```kotlin
kotlin {
    ios {
        binaries
            .filterIsInstance<Framework>()
            .forEach {
                it.transitiveExport = true
                it.export("de.gal-digital:kmm-logger:x.x.x")
            }
    }
    sourceSets {
        val commonMain by getting {
            dependencies {
                api("de.gal-digital:kmm-logger:x.x.x")
            }
        }
    }
}
```

or in cocoapods since kotlin 1.5.30
```kotlin
kotlin {
    sourceSets {
        val commonMain by getting {
            dependencies {
                api("de.gal-digital:kmm-logger:x.x.x")
            }
        }
    }
}
cocoapods {
    framework {
        // Dynamic framework support
        isStatic = false
        // Dependency export
        export("de.gal-digital:kmm-logger:x.x.x")
        transitiveExport = true
        // Bitcode embedding
        embedBitcode(BITCODE)
    }
}
```

use `implementation` instead of `api` if you don't want logger to be public from your shared module

## usage

```kotlin
info("this is a log message")
debug("this is a debug message")
logError("log error", throwable)

// auto provide loggerTag from classname
class Sample : Loggable {
    fun infoLog() {
        info("test")
    }
}

```

In Swift
```swift
LogKt.info("this is a log message")
LogKt.debug("this is a log message")
LogKt.logError("this is a log message")
```

## platform support

* android
* ios
* js
* jvm