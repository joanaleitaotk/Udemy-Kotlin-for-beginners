import java.io.File

fun main(args: Array<String>) {

    val ipToCount = mutableMapOf<String, Int>()
    File("src/60.ips.txt").forEachLine {
        val previous = ipToCount.getOrDefault(it,0)
        ipToCount.put(it, previous + 1)
    }

//    var maxIp = ipToCount.keys.first()
//    var maxCount = 0
//    for ((ip, count) in ipToCount.entries) {
//        if (count > maxCount) {
//            maxCount = count
//            maxIp = ip
//        }
//    }

    val (maxIp, maxCount) = ipToCount.maxBy { it.value }!!
    
    println("Most frequent IP: $maxIp with $maxCount occurrences")


}