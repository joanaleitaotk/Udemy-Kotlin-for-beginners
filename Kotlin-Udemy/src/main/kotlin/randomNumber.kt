import java.util.*


fun main() {
    val random = Random().nextInt(50) +1
    println("random is " + random)
    when (random) {
        in 1..10 -> println("The random number is between 1 and 10")
        in 11..20 -> println("The random number is between 11 and 20")
        in 21..30 -> println("The random number is between 21 and 30")
        in 31..40 -> println("The random number is between 31 and 40")
        in 41..50 -> println("The random number is between 41 and 50")
    }
}