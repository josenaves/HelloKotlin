fun main(args: Array<String>) {
    println(whatShouldIDoToday("happy"))

    print("\n What is your mood today: ")
    val answer = readLine()

    println(whatShouldIDoToday(answer!!))
}

fun whatShouldIDoToday(mood: String, weather: String = "sunny", temperature: Int = 24) : String {
    return when {
        isSad(mood) && isSunny(weather) ->"Go for a walk"
        isSad(mood) && isRainy(weather) -> "Stay home and sleep"
        isSad(mood) && isSunny(weather) -> "Go out for running"
        isHappy(mood) && isRainy(weather) -> "Invite your friends for a dinner"
        isSad(mood) && isRainy(weather) && isFreezing(temperature) -> "stay in bed"
        isHot(temperature) -> "go swimming"
        else -> "Stay home and read"
    }
}

fun isSad(mood : String) = mood == "sad"

fun isHappy(mood : String) = mood == "happy"

fun isSunny(weather: String) = weather == "sunny"

fun isRainy(weather: String) = weather == "rainy"

fun isHot(temperature: Int) = temperature > 35

fun isFreezing(temperature: Int) = temperature == 0