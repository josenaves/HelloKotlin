import kotlin.test.assertFalse
import kotlin.test.assertTrue

fun main(args: Array<String>) {
    assertFalse( canAddFish(10.0, listOf(3,3,3)) ) // ---> false
    assertTrue( canAddFish(8.0, listOf(2,2,2), hasDecorations = false) )// ---> true
    assertFalse( canAddFish(9.0, listOf(1,1,3), 3) ) // ---> false
    assertTrue( canAddFish(10.0, listOf(), 7, true) )// ---> true
}

fun canAddFish(tankSize: Double, // in gallons
               currentFish: List<Int>,
               fishSize: Int = 2,  // in inches
               hasDecorations: Boolean = true) : Boolean {

    var tankSizeAdjusted = if (hasDecorations) tankSize * 0.8 else tankSize

    var totalLengthOfFish = 0
    for (length in currentFish) totalLengthOfFish += length

    return totalLengthOfFish + fishSize <=  tankSizeAdjusted
}