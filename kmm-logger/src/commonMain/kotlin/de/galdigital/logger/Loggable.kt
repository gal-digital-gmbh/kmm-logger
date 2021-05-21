package de.galdigital.logger

import kotlin.reflect.KClass

interface Loggable {
    /**
     * The logger tag used in extension functions for the [Loggable].
     * Note that the tag length should not be more than 23 symbols.
     */
    val loggerTag: String
        get() = this::class.tag()

    fun info(message: String) {
        info(message, loggerTag)
    }

    fun debug(message: String) {
        debug(message, loggerTag)
    }

    fun error(message: String, throwable: Throwable? = null) {
        logError(message, throwable, loggerTag)
    }

    private fun KClass<*>.tag() : String {
        val tag = this.simpleName.orEmpty()
        return when {
            tag.length <= 23 -> tag
            else -> tag.substring(0, 23)
        }
    }
}
