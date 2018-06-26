fun main(args: Array<String>) {

    for (i in 1..10) {
        var fortune: String = getFortuneCookie()
        println("Your fortune is: $fortune")

        if (fortune.contains("Take it easy")) break
    }
}

fun getFortuneCookie() : String {
    val cookies = listOf(
        "You will have a great day!",
        "Things will go well for you today.",
        "Enjoy a wonderful day of success.",
        "Be humble and all will turn out well.",
        "Today is a good day for exercising restraint.",
        "Take it easy and enjoy life!",
        "Treasure your friends because they are your greatest fortune."
    )
    print("\nEnter your birthday: ")
    var userInput : String? = readLine()
    var birthday : Int =  userInput?.toIntOrNull() ?: 1
    birthday %= cookies.size
    return cookies[birthday]
}