package spice

import spiceDelegation.Curry

data class SpiceContainer(val spice: Spice) {
    val label = spice.name
}

fun main(args: Array<String>) {
    val spiceCabinet = listOf(
            SpiceContainer(Curry("Yellow Curry", "mild") as Spice),
            SpiceContainer(Curry("Red Curry", "medium") as Spice),
            SpiceContainer(Curry("Green Curry", "spicy") as Spice) )

    for(element in spiceCabinet) println(element.label)
}