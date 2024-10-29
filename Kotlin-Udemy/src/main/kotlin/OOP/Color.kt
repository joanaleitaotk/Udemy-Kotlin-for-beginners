enum class Color(val rgb: Int) {
    RED(0xFF00000), GREEN(0x00FF00), BLUE(0x0000FF);

    fun containsRed(): Boolean {
        return this.rgb and 0xFF0000 != 0
    }
}

fun main() {
    // 0..9 -> 2137 (decimal)
    // 0..9, A, B, C, D, E, F -> 0x10 (hexadecimal)
    println(0x34) // 16
    println(0x1F) // 31
    println(0xFF) // 255
    println(0xCAFEBABE) // 3405691582

    println(0x000000) // black
    println(0xFFFFFF) // white
    print(0xFF0000) // red
    print(0x00FF00) // green
    print(0x0000FF) // blue

    // binary numbers
    // 0..1 -> 0b1010 (binary) = 10
    println(0b1010)
    println(0b11111111) // 255 = 0xFF

    // 1 and 1 = 1 == true
    // 1 and 0 = 0 == false
    //     1101
    // AND 0011
    //    ------
    //     0001
    println(0b1101 and 0b1011)

    println(Color.RED.containsRed())
    println(Color.GREEN.containsRed())

    // bitwise operators
    //    1101
    // OR 1000
    //   ------
    //    1101
    println(0b1101 or 0b1000) // 13

    //     1101
    // XOR 1000
    //   ------
    //     0101
    println(0b1101 xor 0b1000) // 5

    // inverse
    // 0b10011.inv() == 0b...01100
    println(0b10011.inv()) // 0b01100

}