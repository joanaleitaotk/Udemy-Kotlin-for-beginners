// DRY don't repeat yourself

class Stack<E>(vararg val items: E){ // permite meter o nº de argumentos que quisermos

    val elements = items.toMutableList()

    fun push(element: E){
        elements.add(element)
    }

    fun pop(): E? {
        if (!isEmpty()) {
            return elements.removeAt(elements.size - 1)
        }
       return null

    }

    fun isEmpty(): Boolean {
        return elements.isEmpty()
    }
}

fun <T> stackOf(vararg element: T): Stack<T> {
    return Stack(*element)
}

fun main() {
    val stack = Stack(3,5,2, 8)
    stack.push(11)

    val stack2 = stackOf("Hi", "Hello", "Hey")
    for(i in 1..3){
        println(stack2.pop())
    }

    println(stack.pop())
    println(stack.pop())
    println(stack.pop())
    println(stack.pop())
    println(stack.pop())

}
