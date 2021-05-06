package de.galdigital.logger

actual fun info(message: String, loggerTag: String) {
    console.info(message)
}

actual fun debug(message: String, loggerTag: String) {
    console.log(message)
}

actual fun logError(message: String, throwable: Throwable?, loggerTag: String) {
    console.error(loggerTag, message, throwable)
}
