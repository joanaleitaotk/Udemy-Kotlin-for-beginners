//open class Person(open val name: String, open var age: Int) { // with open we can inherit from this class
abstract class Person(open val name: String, open var age: Int) { // with abstract opens we can inherit from this class
//    var name: String
//    var age: Int

    init { //initlaize when the object is created
//        this.name = name // this refers to the current object
//        this.age = age
        println("Object was created")
    }

//    var name: String = "Sarah" // property
//    var age: Int = 42

    abstract fun speak()
//    fun speak() {
//        println("Hello!")
//    }

    fun greet(name: String) {
        println("Good morning $name!")
    }

//    fun getYearOfBirth(): Int{
//        return 2016 - age
//    }

    fun getYearOfBirth() = 2016 - age
}

// inheritance
class Student(override val name: String, override var age: Int, val studentID: Long) : Person(name, age) {

    fun isIntelligent() = true
    override fun speak() {
        println("Hi there, I'm a student")
    }

    class Employee(override val name: String, override var age: Int) : Person(name, age) {

        fun receivePayment() {
            println("sfaf")
        }

        override fun speak() {
            println("Hi there, I'm an employee")
        }

    }

//    fun greet(name: String) {
//        println("Good morning $name")
//    }

}
fun main() {
    val student = Student("John", 25, 1234)
    student.speak()
    student.isIntelligent()

    val employee = Student.Employee("Mary", 32)
    employee.getYearOfBirth()
    employee.receivePayment()

    employee.speak()

//    val person = Person("Jack", 17) // initialize the object
//
//    person.speak()
//    person.greet("John2")
//    println(person.getYearOfBirth())
//
//    println("Name: ${person.name}")
//    println("Age: ${person.age}")

    // person.name = "John"
    // println("Name: ${person.name}")
}