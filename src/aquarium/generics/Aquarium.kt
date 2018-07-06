package aquarium.generics

fun main(args: Array<String>) {
    genericExample()
}

open class WaterSupply(var needsProcessed: Boolean)

class TapWater: WaterSupply(true) {
    fun addChemicalCleaners() {
        needsProcessed = false
    }
}

class FishStoreWater: WaterSupply(false)

class LakeWater : WaterSupply(true) {
    fun filter() {
        needsProcessed = false
    }
}

interface Cleaner<in T: WaterSupply> {
    fun clean(waterSupply:  T)
}

class TapWaterCleaner : Cleaner<TapWater> {
    override fun clean(waterSupply: TapWater) {
        waterSupply.addChemicalCleaners()
    }
}
class Aquarium<out T: WaterSupply>(val waterSupply: T) {
    fun addWater(cleaner: Cleaner<T>) {
        if (waterSupply.needsProcessed) {
            cleaner.clean(waterSupply)
        }

        println("adding water from $waterSupply")
    }
}

inline fun <reified R: WaterSupply> Aquarium<*>.hasWaterSupplyOfType() = waterSupply is R

fun <T: WaterSupply> isWaterClean(aquarium: Aquarium<T>) {
    println("aquarium water is clean: ${aquarium.waterSupply.needsProcessed}")
}

inline fun <reified T: WaterSupply> WaterSupply.isOfType() = this is T

fun genericExample() {
    val aquarium = Aquarium(TapWater())
    isWaterClean(aquarium)
    aquarium.hasWaterSupplyOfType<TapWater>()
    aquarium.waterSupply.isOfType<LakeWater>()
}
