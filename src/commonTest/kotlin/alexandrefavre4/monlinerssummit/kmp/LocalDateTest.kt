package alexandrefavre4.monlinerssummit.kmp

import kotlin.test.Test
import kotlin.test.assertEquals

class LocalDateTest {

    @Test
    fun test() {
        // Given
        val isoString = "2023-11-30T14:35:00.000"

        // When
        val formattedDate = LocalDate.parse(isoString).format()

        // Then
        assertEquals("30.11.2023", formattedDate)
    }
}