package de.galdigital.logger

fun info(message: String) = info(message = message, loggerTag = "logger")
expect fun info(message: String, loggerTag: String = "logger")

fun debug(message: String) = debug(message = message, loggerTag = "logger")
expect fun debug(message: String, loggerTag: String = "logger")


fun logError(message: String) = logError(message = message, loggerTag = "logger")
fun logError(message: String, throwable: Throwable? = null) = logError(message = message, throwable = throwable, loggerTag = "logger")
expect fun logError(message: String, throwable: Throwable? = null, loggerTag: String = "logger")
