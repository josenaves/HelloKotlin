package spice

data class Spice(val name: String, var spiciness: String = "mild") {

    var heat: Int = 5
        get() {
            return when (spiciness) {
                "mild" -> 1
                "medium" -> 3
                "spicy" -> 5
                "very spicy" -> 7
                "extremely spicy" -> 10
                else -> 0
            }
        }

    init {
        println("Spice - name: $name - spiceness: $spiciness - heat: $heat")
    }
}

fun makeSalt() = Spice("salt", "zero")

fun main(args: Array<String>) {
    val listOfSpices = listOf(
            Spice("curry", "mild"),
            Spice("pepper", "medium"),
            Spice("cayenne", "spicy"),
            Spice("ginger", "mild"),
            Spice("red curry", "medium"),
            Spice("green curry", "mild"),
            Spice("hot pepper", "extremely spicy")
    )
    println("listOfSpices: $listOfSpices")

    val spice = Spice("cayenne", spiciness = "spicy")
    val spicelist = listOfSpices.filter {it.heat < 5}

    println("spicelist: $spicelist")
}
