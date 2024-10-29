class House(val height: Double, val color: String, val price: Int = 50000){

    fun print(){
        println("House [height=$height, color=$color, price=$price]")
    }
}

fun main() {
    val house = House(4.5, "blue", 200000)
    val redHouse = House(color = "red", price = 2000, height = 5.0)
    val yellowHouse = House(color = "Yellow", height = 2.5)
    house.print()
    redHouse.print()
    yellowHouse.print()
}