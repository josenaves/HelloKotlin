fun main(args: Array<String>) {
    val spices = listOf("curry", "pepper", "cayenne", "ginger", "red curry", "green curry", "red pepper" )
    val curries = spices.filter { it.contains("curry") }
    println("Curries by length: " + curries.sortedBy { it.length })

    val spicesCE = spices.filter { it[0] == 'c' && it[it.length-1] == 'e' }
    println("Spices starting with c and ending with e: $spicesCE")

    val spicesCE2 = spices.filter { it.startsWith('c') && it.endsWith('e') }
    println("Spices starting with c and ending with e: $spicesCE2")

    val spicesCE3 = spices.filter { it.startsWith('c') }.filter { it.endsWith('e') }
    println("Spices starting with c and ending with e: $spicesCE3")

    val spicesFirst3 = spices.take(3).filter { it.startsWith('c')}
    println("Spices first 3 starting with c: $spicesFirst3")
}