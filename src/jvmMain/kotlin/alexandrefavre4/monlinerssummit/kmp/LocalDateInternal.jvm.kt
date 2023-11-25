package alexandrefavre4.monlinerssummit.kmp

import java.time.format.DateTimeFormatter
import java.time.LocalDate as LocalDateJVM
import java.time.LocalDateTime as LocalDateTimeJVM

internal actual class LocalDateInternal(private val localDate: LocalDateJVM) {

    actual fun format(): String {
        return DateTimeFormatter.ofPattern(DATE_PATTERN).format(localDate)
    }

    actual companion object {

        private const val DATE_PATTERN = "dd.MM.yyyy"

        actual fun parse(isoString: String): LocalDateInternal {
            return LocalDateInternal(LocalDateTimeJVM.parse(isoString).toLocalDate())
        }
    }
}