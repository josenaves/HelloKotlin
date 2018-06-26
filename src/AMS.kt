import java.util.*

fun main(args: Array<String>) {
    println("Hello, ${args[0]} !")
    feedTheFish()
}

fun feedTheFish() {
    val day = randomDay()
    val food = fishFood(day)
    println("Today is $day and the fish eat $food")
}

fun randomDay() : String {
    val week = listOf("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday" )
    return week[Random().nextInt(7)]
}

fun fishFood(day: String) : String {
    return when(day) {
        "Monday" -> "flakes"
        "Tuesday" -> "pellets"
        "Wednesday" -> "redworms"
        "Thursday" -> "granules"
        "Friday" -> "mosquitoes"
        "Saturday" -> "letuce"
        "Sunday" -> "plankton"
        else -> "fasting"
    }
}