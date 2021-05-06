package de.galdigital.logger

import java.util.logging.Logger

private val logger: Logger = Logger.getLogger(Loggable::class.java.getName())

actual fun info(message: String, loggerTag: String) {
    logger.info(message)
}

actual fun debug(message: String, loggerTag: String) {
    logger.info(message)
}

actual fun logError(message: String, throwable: Throwable?, loggerTag: String) {
    logger.info(message)
    throwable?.printStackTrace()
}
