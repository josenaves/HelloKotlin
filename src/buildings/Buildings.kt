package buildings

open class BaseBuildingMaterial {
   open val numberNeeded = 1
}

class Wood : BaseBuildingMaterial() {
    override val numberNeeded = 4
}

class Brick : BaseBuildingMaterial() {
    override val numberNeeded = 8
}

class Building<out T: BaseBuildingMaterial>(val buildingMaterial : T) {

    val baseMaterialsNeeded = 100
    val actualMaterialsNeeded = buildingMaterial.numberNeeded * baseMaterialsNeeded

    fun build() {
        println(" $actualMaterialsNeeded ${buildingMaterial::class.simpleName} required")
    }
}

fun <T: BaseBuildingMaterial> isSmallBuilding(building : Building<T>) {
    if (building.actualMaterialsNeeded < 500) println("small building") else println("large building")

}

//inline fun <reified R: WaterSupply> Aquarium<*>.hasWaterSupplyOfType() = waterSupply is R

//
//fun <T: WaterSupply> isWaterClean(aquarium: Aquarium<T>) {
//    println("aquarium water is clean: ${aquarium.waterSupply.needsProcessed}")
//}
//
//inline fun <reified T: WaterSupply> WaterSupply.isOfType() = this is T
//

fun main(args: Array<String>){
    Building(Wood()).build()

    isSmallBuilding(Building(Wood()))
    isSmallBuilding(Building(Brick()))
}