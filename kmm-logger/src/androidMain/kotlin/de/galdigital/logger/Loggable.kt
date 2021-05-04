package de.galdigital.logger

import android.util.Log

actual fun info(message: String, loggerTag: String) {
    Log.i(loggerTag, message)
}

actual fun debug(message: String, loggerTag: String) {
    Log.d(loggerTag, message)
}

actual fun logError(message: String, throwable: Throwable?, loggerTag: String) {
    Log.e(loggerTag, message, throwable)
}
