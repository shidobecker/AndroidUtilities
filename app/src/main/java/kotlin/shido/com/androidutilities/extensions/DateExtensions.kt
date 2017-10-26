package edu.mira.aula.shared.extensions

import java.text.SimpleDateFormat
import java.time.*
import java.time.format.TextStyle
import java.util.*

/**
 * Created by Shido on 03/09/2017.
 */
val dayFormat= "dd"
val dayMonthFormat= "dd/MM"
val dayMonthYearFormat = "dd/MM/yyyy"

val dateBrazilHourSecondsFormat = "dd/MM/yyyy HH:mm:ss"
val dateBrazilHourMinutesFormat = "dd/MM/yyyy HH:mm"

val dateUTCMonthYearFormat = "yyyy-MM-dd"
val dateUTCMonthFormat = "MM-dd"
val dateUTCHourSecondsFormat = "yyyy-MM-dd HH:mm:ss"
val dateUTCHourMinutesFormat = "yyyy-MM-dd HH:mm"

val brazilEastId = ZoneId.of("Brazil/East")
val brazilWestId = ZoneId.of("Brazil/West")

val americaSaoPauloId = ZoneId.of("America/Sao_Paulo")


fun Date.formatToDay():String = SimpleDateFormat(dayFormat).format(this)

fun Date.formatToDayAndMonth() =  SimpleDateFormat(dayMonthFormat).format(this)

fun Date.formatToDayMonthAndYear() =  SimpleDateFormat(dayMonthYearFormat).format(this)



/**
 * Returns a [Calendar] date of the day before a specific date at the hour 23:59:59
 */
fun Calendar.getDayBeforeDate(desiredDate: Calendar): Calendar{
    val dayBefore = desiredDate
    dayBefore.add(Calendar.DATE, -1)
    dayBefore.set(Calendar.HOUR_OF_DAY, 23)
    dayBefore.set(Calendar.MINUTE, 59)
    dayBefore.set(Calendar.SECOND, 59)
    return dayBefore
}

/**
 * Returns the [Calendar] that of the last friday at the hour 00:00:01
 */
fun Calendar.getLastFriday(): Calendar {
    val lastFridayDate = Calendar.getInstance()
    lastFridayDate.add(Calendar.WEEK_OF_YEAR, -1)
    lastFridayDate.set(Calendar.DAY_OF_WEEK, Calendar.FRIDAY)
    lastFridayDate.set(Calendar.HOUR_OF_DAY, 0)
    lastFridayDate.set(Calendar.MINUTE, 0)
    lastFridayDate.set(Calendar.SECOND, 1)
    return lastFridayDate
}

/**
 * Returns the [LocalDateTime] from a [Date]
 */
fun Date.getLocalDateTimeFromDate(zoneId: ZoneId) : LocalDateTime{
    val instant: Instant = Instant.ofEpochMilli(this.time)
    return LocalDateTime.ofInstant(instant, zoneId)
}

/**
 * Returns [ZonedDateTime] from a [Date]
 */
fun Date.getZonedDateTimeUTCFromDate(): ZonedDateTime {
    val instant: Instant = Instant.ofEpochMilli(this.time)
    return ZonedDateTime.ofInstant(instant, ZoneOffset.UTC)
}

/**
 * Returns the complete week day name from a [Date]
 */
fun Date.getFullWeekDayFromDate(): String{
    val ldt = this.getLocalDateTimeFromDate(edu.mira.aula.shared.extensions.brazilEastId)
    return ldt.dayOfWeek.getDisplayName(TextStyle.FULL, Locale("pt", "BR"))
}

/**
 * Returns the short week day name from a [Date]
 */
fun Date.getShortWeekDayFromDate(): String{
    val ldt = this.getLocalDateTimeFromDate(edu.mira.aula.shared.extensions.brazilEastId)
    return ldt.dayOfWeek.getDisplayName(TextStyle.SHORT, Locale("pt", "BR"))
}



fun main(args: Array<String>) {
    println("LOCAL DATE TIME NOW: " + LocalDateTime.now().toString())
    println("UTC FORMAT LOCAL DATE TIME NOW: " + LocalDateTime.now(Clock.systemUTC()).toString())
    println("INSTANT.NOW : " + Instant.now().toString())
    println("INSTANT NOW CLOCK SYSTEM UTC : " + Instant.now(Clock.systemUTC()))
    println("INSTANT NOW CLOCK ZONE ID AMERICA SÃO PAULO: " + Instant.now(Clock.system(ZoneId.of("America/Sao_Paulo"))))

}