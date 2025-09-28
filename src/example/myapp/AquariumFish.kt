import example.myapp.Aquarium

// Abstract class ikan
abstract class AquariumFish(val color: String)

class Shark : AquariumFish("gray")
class Plecostomus : AquariumFish("gold")

// Bentuk tank lain
class TowerTank(
    override var height: Int,
    var diameter: Int
) : Aquarium(height = height, width = diameter, length = diameter) {
    override val shape = "cylinder"

    override var volume: Int
        get() = (3.14 * (diameter / 2) * (diameter / 2) * height / 1000).toInt()
        set(value) {
            height = ((value * 1000) / (3.14 * (diameter / 2) * (diameter / 2))).toInt()
        }
}
