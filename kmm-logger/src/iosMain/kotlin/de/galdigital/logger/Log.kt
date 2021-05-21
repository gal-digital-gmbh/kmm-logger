package de.galdigital.logger

fun info(message: String) = info(message = message, loggerTag = "logger")
actual fun info(message: String, loggerTag: String) {
    println("$loggerTag : $message")
}

fun debug(message: String) = debug(message = message, loggerTag = "logger")
actual fun debug(message: String, loggerTag: String) {
    println("$loggerTag : $message")
}

fun logError(message: String) = logError(message = message, loggerTag = "logger")
fun logError(message: String, throwable: Throwable? = null) = logError(message = message, throwable = throwable, loggerTag = "logger")
actual fun logError(message: String, throwable: Throwable?, loggerTag: String) {
    println("$loggerTag message : $message")
    println("$loggerTag error : ${throwable?.message}")
    print("$loggerTag stacktrace : ")
    throwable?.printStackTrace()
}
