package spiceDelegation

fun main(args: Array<String>) {
    val curry = Curry("curry", "mild")
    println("Curry color: ${curry.color}")
}

interface Grinder {
    fun grind()
}

interface SpiceColor {
    val color: String
}

object YellowSpiceColor : SpiceColor {
    override val color = "Yellow"
}

abstract class Spice(val name: String, val spiciness: String = "mild", color: SpiceColor) : SpiceColor by color {
    abstract fun prepareSpice()
}


class Curry(name: String, spiciness: String, color: SpiceColor = YellowSpiceColor) : Spice(name, spiciness, color),
        Grinder {

    override fun grind() {
    }

    override fun prepareSpice() {
        grind()
    }

}