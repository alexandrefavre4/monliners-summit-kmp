package alexandrefavre4.monlinerssummit.kmp

import kotlin.js.Date

internal actual class LocalDateInternal(private val date: Date) {

    actual fun format(): String {
        return date.toLocaleDateString("fr-CH")
    }

    actual companion object {

        actual fun parse(isoString: String): LocalDateInternal {
            return LocalDateInternal(Date(isoString))
        }
    }
}