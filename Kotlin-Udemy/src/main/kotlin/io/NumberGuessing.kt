import kotlin.random.Random

fun main (args: Array<String>) {
    val number = Random.nextInt(0, 10)
    var input: String?
    var guess = -1

    while(guess != number) {
        print("Guess a number between 0 and 100: ")
        input = readLine()

        if(input != null) {
          guess = input.toInt()
        }
        if (guess < number) {
            println("Too low")
        } else if (guess > number) {
            println("Too high")
        } else {
            println("You guessed it!")
        }
        println("You guessed: $guess")
    }
}