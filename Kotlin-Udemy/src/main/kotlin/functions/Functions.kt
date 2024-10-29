import java.util.*

fun helloWorld() {
    println("Hello, World!")
}

// "Kotlin" - > " K o t l in "
fun printWithSpace(text: String) {
    for (char in text) {
        print(char + " ")
    }
    println()
}

fun getCurrentDate(): Date {
    return Date()
}

fun max(a: Int, b: Int): Int {
    if (a >=b) {
        return a
    }
    else {
        return b
    }
}

fun main() {
    helloWorld()
    printWithSpace("Kotlin is awesome")
    println(getCurrentDate())
    println(max(17, 42))
}