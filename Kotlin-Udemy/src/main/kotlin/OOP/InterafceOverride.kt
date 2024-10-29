abstract class Course(val topic: String, val price: Int) {
    open fun learn() {
        println("Learning a $topic course.")
    }
}

interface Learnable {
    fun learn() {
        println("Learning...")
    }
}

open class KotlinCourse() : Course("Kotlin", 999), Learnable {
    override final fun learn() { // use override final to prevent overriding
        super<Course>.learn() // call the super class method
        println("I'm learning Kotlin.")
    }
}

fun main() {
    val course = KotlinCourse()
    course.learn()
}