package conditionals

fun main(){

    val x = 0
    when(x){
        5 -> println("x is 5")
        3*12 -> println("x is 3*12")
        "Hey there".length -> println("x is the length of the string 'Hey there'")
        in 1..10 -> println("x is between 1 an 10")
        in 11..20 -> println("ddd")
        !in 1..9 -> println("x is not between 1 and 9")
    }
}


//fun main() {
//    val mode: Int = 3
//
//    val result = when (mode) {
//        1 -> "The mode is lazy."
//        2 -> {
//            "The mode is 2"
//            "So the mode is busy."
//        }
//        3 -> "The mode is super-productive"
//        else -> "I don't know that mode"
//    }
//    println(result)
//
//    val X = if(mode <2) {
//        println("Mode is less than 2")
//        17
//    } else {
//        42
//    }
//    println(X)
//}

//fun main() {
//    val age: Int = 26
//    if (age < 18) {
//        println("You cannot register.")
//    } else if(age < 21) {
//        println("Well, maybe you can regsiter.")
//    }
//    else if(age < 27) {
//        println("You should be able to register.")
//    }
//    else {
//        println("You're good to go!")
//    }
//
//    println("The end.")
//}