package alexandrefavre4.monlinerssummit.kmp

internal expect class LocalDateInternal {

    fun format(): String

    companion object {
        fun parse(isoString: String): LocalDateInternal
    }
}
