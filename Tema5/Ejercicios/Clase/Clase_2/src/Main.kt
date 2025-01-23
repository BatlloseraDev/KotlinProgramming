fun main() {
    println("Hello World!")
}

abstract class Person {
    abstract val name: String
    abstract val age: Int

    fun sayHello() {
        println("Hello, my name is $name and I am $age years old.")
    }
}

class Student(override val name: String, override val age: Int, val studentId: String) : Person() {
    fun attendClass() {
        println("$name is attending class with student ID $studentId.")
    }
}