import java.util.*

fun main(args: Array<String>) {
    val rollDice = { Random().nextInt(12 ) + 1 }
    println ("Roll dice: " + rollDice())

    val rollDiceSide = { sides: Int ->  if (sides == 0) 0 else Random().nextInt(sides) + 1  }

    println ("rollDiceSide: " + rollDiceSide(0))
    println ("rollDiceSide: " + rollDiceSide(2))
    println ("rollDiceSide: " + rollDiceSide(12))
    println ("rollDiceSide: " + rollDiceSide(6))

    // lambda function type notation
    val rollDice2 : (Int) -> Int = { sides -> if (sides == 0) 0 else Random().nextInt(sides) + 1 }
    println ("rollDice2: " + rollDice2(6))

    gamePlay(rollDice2(4))
}

// Function type notation is more readable, which reduces errors,
// clearly showing the what type is passed in and what type is returned.
fun gamePlay(diceRoll: Int) {
    println(diceRoll)
}