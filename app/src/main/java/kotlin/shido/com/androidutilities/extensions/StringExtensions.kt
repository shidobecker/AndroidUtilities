package edu.mira.aula.shared.extensions

import java.util.*

/**
 * Created by Shido on 06/10/2017.
 */
fun String.validateAllCpfDigits(): Boolean{
    val range = 0..9
    var isSame = false
    for(x in range){
        isSame = this.all {
            it.toString() == x.toString()
        }
        if(isSame) break
    }
    return isSame
}


/**
 * Receives a String in format pattern like [dayMonthYearFormat] 'dd/MM/yyyy'  or [dayMonthFormat] 'dd/MM'
 * and returns it's day and month with the week day name
 * @return [dayMonthFormat] + complete week day
 */
fun String.getFullWeekDayFromDate(pattern: String): String{
    val dtf = DateTimeFormatter.ofPattern(pattern, Locale("pt", "BR"))
    val newDate = LocalDate.parse(this, dtf)
    return this.substringBeforeLast("/") + ", " +
            newDate.dayOfWeek.getDisplayName(TextStyle.FULL, Locale("pt", "BR"))
}

/**
 * Receives a String in format pattern like [dayMonthYearFormat] 'dd/MM/yyyy'  or  [dayMonthFormat] 'dd/MM'  and returns it's day and month with the week day name
 * @return dd/MM and the short version of week day name
 */
fun String.getShortWeekDayFromDate(pattern: String): String{
    val dtf = DateTimeFormatter.ofPattern(pattern, Locale("pt", "BR"))
    val newDate = LocalDate.parse(this, dtf)

    return this.substringBeforeLast("/") + ", " +
            newDate.dayOfWeek.getDisplayName(TextStyle.SHORT, Locale("pt", "BR"))

}