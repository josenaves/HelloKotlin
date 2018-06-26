fun main(args: Array<String>) {
    println(whatShouldIDoToday("happy"))
}

fun whatShouldIDoToday(mood: String, weather: String = "sunny", temperature: Int = 24) : String {
    return when {
        mood == "happy" && weather == "sunny" -> "Go for a walk"
        mood == "sad" && weather == "rainy" -> "Stay home and sleep"
        mood == "sad" && weather == "sunny" -> "Go out for running"
        mood == "happy" && weather == "rainy" -> "Invite your friends for a dinner"
        else -> "Stay home and read"
    }
}