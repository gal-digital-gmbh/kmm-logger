# kmm logger
![Maven Central](https://img.shields.io/maven-central/v/de.gal-digital/kmm-logger?style=flat-square)

simple kotlin multiplatform logger

## setup

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
```

use `implementation` instead of `api` if you don't want logger to be public from your shared module

## usage

```
info("this is a log message")
debug("this is a debug message")
logError("log error", throwable)
```

## platform support

* android
* ios
* js
* jvm