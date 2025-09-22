class Aquarium(
    val width: Int = 20,
    val height: Int = 40,
    val length: Int = 100,
    val fishVolume: Int = 1000,
    val fishTankRatio: Int = 80
) {
    fun getVolume(): Int {
        return width * height * length
    }

    fun getFishTank(): Int {
        return getVolume() * fishTankRatio / 100
    }

    fun getNumberOfFish(): Int {
        return getFishTank() / fishVolume
    }
}
