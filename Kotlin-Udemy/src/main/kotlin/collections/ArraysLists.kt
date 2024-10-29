fun main() {

    val books = arrayListOf("Kotlin in Action", "Kotlin For Android Developers", "The Phoenix Project")

    for (book in books) {
        if(book.contains('e')) {
            for (character in books) {
                println(character)
            }
        }
        println()
    }


    // Arrays
//    val array = arrayOf("texa", "texas2", "texasss")
//    val mixed = arrayOf("Kotlin", 17, 3.0, false)
//    val numbers = intArrayOf(1, 2, 3, 4, 5)
//    println(mixed[0])
//    mixed[2] = 3.1415
//    println(mixed[2])
//    val str = "Udemy"
//    println(str[0])
//
//    val states = arrayOf("Nevada", "Florida")
//    val allStates = array + states
//
//    println(allStates.size)
//
//    val empty: Boolean = numbers.isEmpty()
//
//    if (states.contains("Nevadaa")){
//        println("It contains Nevada")
//    } else {
//        println("It does not contain Nevada")
//    }
//
//    val list = listOf("IODA", "ioda", "iodia1")

    // ArrayList
//    val arrayList = arrayListOf("Mike", "Sara", "Ana")
//    val list = arrayListOf(("Peter"))
//    println(arrayList[0])
//    println(arrayList + list)
//
//    arrayList.add("John")
//    arrayList.add(1, "Paul")
//    println(arrayList)
//    arrayList.remove("Ana")
//    println(arrayList)
//
//    val subList = arrayList.subList(1, 3)
//    println(subList)
}