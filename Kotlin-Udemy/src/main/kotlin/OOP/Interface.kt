interface Driveable {
    fun drive()
}

interface Buildable {
    val timeRequired: Int
    fun build()
}

class Car(val color: Color): Driveable, Buildable {
    override val timeRequired = 120

    override fun drive() {
        println("Driving car")
    }

    override fun build() {
        println("Building car")
    }
}

class MotorCycle(val color: String): Driveable {
    override fun drive() {
        println("Driving motorcycle")
    }
}

fun main() {
    val car = Car(Color.BLUE)
    println(car.color)
    car.drive()
    val motorCycle: Driveable = MotorCycle("red")
    motorCycle.drive()
}