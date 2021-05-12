# kmm logger
![Maven Central](https://img.shields.io/maven-central/v/de.gal-digital/kmm-logger?style=flat-square)

simple kotlin multiplatform logger

## setup

```kotlin
kotlin {
    sourceSets {
        val commonMain by getting {
            dependencies {
                implementation("de.gal-digital:kmm-logger:x.x.x")
            }
        }
    }
}
```

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