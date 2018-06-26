// Code for Lesson 3 - Functions - Quiz 9

fun main(args: Array<String>) {
    for (i in 1..10) {
        var fortune: String = getFortuneCookie(getBirthday())
        println("Your fortune is: $fortune")
        if (fortune.contains("Take it easy")) break
    }
}

fun getFortuneCookie(birthday: Int) : String {
    val cookies = listOf(
            "You will have a great day!",
            "Things will go well for you today.",
            "Enjoy a wonderful day of success.",
            "Be humble and all will turn out well.",
            "Today is a good day for exercising restraint.",
            "Take it easy and enjoy life!",
            "Treasure your friends because they are your greatest fortune."
    )

    return when(birthday) {
        28, 31 -> cookies[0]
        in 1..7 -> cookies[1]
        else -> cookies[birthday % cookies.size]
    }
}

fun getBirthday() : Int {
    print("\nEnter your birthday: ")
    val userInput : String? = readLine()
    return userInput?.toIntOrNull() ?: 1
}