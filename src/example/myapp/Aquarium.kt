package example.myapp

import AquariumFish

open class Aquarium(
    var width: Int = 20,
    open var height: Int = 40,
    var length: Int = 100,
    val fishVolume: Int = 1000,
    val fishTankRatio: Int = 80
) {

    open val shape = "rectangle"

    fun getVolumecm3(): Int {
        return width * height * length
    }

    fun getFishTank(): Int {
        return getVolumecm3() * fishTankRatio / 100
    }

    fun getNumberOfFish(): Int {
        return getFishTank() / fishVolume
    }

    open var volume: Int
        get() = width * height * length / 1000
        set(value: Int) {
            height = (value * 1000) / (width * length)
        }

    // perbaiki bagian ini
    private val fishes = mutableListOf<AquariumFish>()
    fun addFish(fish: AquariumFish) {
        fishes.add(fish)
    }
    //cetak daftar ikan
    fun printFishes() {
        for (fish in fishes){
            println("color " + fish.color)
        }
    }
// sampai sini

    fun getWaterVolume(waterRatio:Double = 0.8):Double{
        return waterRatio * volume
    }
    fun getNumberOFish():Int{
        return (getWaterVolume()/200).toInt()
    }
    fun printSize() {
        println("Width: $width cm " +
                "Length: $length cm " +
                "Height: $height cm " +
                "Volume: $volume " +
                "Shape: $shape")
    }
}