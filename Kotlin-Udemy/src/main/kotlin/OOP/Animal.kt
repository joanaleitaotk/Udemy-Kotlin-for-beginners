package OOP

open class Animal {
    private var age: Int = 10
    protected var name: String = "Rover"
    internal val isDangerous = true

    public fun isOld(): Boolean{
        return age > 12
    }
//        get() = field
//        set(value) {
//            if (value >= 0) {
//                field = value
//            }
//        }
}

class Vertebrae: Animal() {
    fun introduceYourself() {
        println(this.name)
    }
}

fun main() {
    val animal = Animal()
//    animal.age = 8
//    animal.age = -2
//    println(animal.age)
}