import example.myapp.Aquarium

fun addFishToAquarium() {
    val shark = Shark()
    val pleco = Plecostomus()
    val aquarium5 = TowerTank(height = 100, diameter = 35)
    aquarium5.addFish(shark)
    aquarium5.addFish(pleco)
    aquarium5.printFishes()
}

fun main() {
    val aquarium = Aquarium()
    aquarium.printSize()

    println("Volume akuarium (cm³): ${aquarium.getVolumecm3()}")
    println("Kapasitas efektif (cm³): ${aquarium.getFishTank()}")
    println("Jumlah maksimal ikan (versi lama): ${aquarium.getNumberOfFish()} ekor")
    println("Jumlah maksimal ikan (versi baru): ${aquarium.getNumberOFish()} ekor")

    addFishToAquarium()
}