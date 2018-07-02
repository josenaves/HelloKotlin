package spice

class SimpleSpice {
    var name : String = "curry"
    var spiciness : String = "mild"
    val heat: Int
        get()=  5

}

fun main(args: Array<String>) {
    val simpleSpice = SimpleSpice()
    println("Spice name: ${simpleSpice.name} and heat: ${simpleSpice.heat}")
}