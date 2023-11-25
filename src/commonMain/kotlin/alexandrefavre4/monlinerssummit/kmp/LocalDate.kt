package alexandrefavre4.monlinerssummit.kmp

import kotlin.js.JsExport
import kotlin.jvm.JvmStatic

@JsExport
class LocalDate private constructor(private val localDate: LocalDateInternal) {

    fun format() = localDate.format()

    companion object {

        @JvmStatic
        fun parse(isoString: String) = LocalDate(LocalDateInternal.parse(isoString))
    }
}
