import java.util.*

fun main(args: Array<String>) {
    dayOfWeek()
}

fun dayOfWeek() {
    println("What day is today?")
    val day = Calendar.getInstance().get(Calendar.DAY_OF_WEEK)
    when (day) {
        Calendar.MONDAY -> println("Monday")
        Calendar.TUESDAY -> println("Tuesday")
        Calendar.WEDNESDAY -> println("Wednesday")
        Calendar.THURSDAY -> println("Thursday")
        Calendar.FRIDAY -> println("Friday")
        Calendar.SATURDAY -> println("Saturday")
        Calendar.SUNDAY -> println("Sunday")
    }

}