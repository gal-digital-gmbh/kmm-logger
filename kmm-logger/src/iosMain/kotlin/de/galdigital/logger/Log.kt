package de.galdigital.logger

actual fun info(message: String, loggerTag: String) {
    println("$loggerTag : $message")
}

actual fun debug(message: String, loggerTag: String) {
    println("$loggerTag : $message")
}

actual fun logError(message: String, throwable: Throwable?, loggerTag: String) {
    println("$loggerTag message : $message")
    println("$loggerTag error : ${throwable?.message}")
    print("$loggerTag stacktrace : ")
    throwable?.printStackTrace()
}
