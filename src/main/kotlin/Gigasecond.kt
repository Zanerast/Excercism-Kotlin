import java.time.LocalDate
import java.time.LocalDateTime
import java.time.OffsetTime
import java.time.ZoneOffset

class Gigasecond(private val localDateTime: LocalDateTime) {

    constructor(localDate: LocalDate) : this(localDate.atStartOfDay())

    var date: LocalDateTime = localDateTime.plusSeconds(1000000000)
}
