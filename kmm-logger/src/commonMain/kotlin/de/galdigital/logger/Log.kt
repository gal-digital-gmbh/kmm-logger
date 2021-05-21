package de.galdigital.logger

expect fun info(message: String, loggerTag: String = "logger")

expect fun debug(message: String, loggerTag: String = "logger")

expect fun logError(message: String, throwable: Throwable? = null, loggerTag: String = "logger")
