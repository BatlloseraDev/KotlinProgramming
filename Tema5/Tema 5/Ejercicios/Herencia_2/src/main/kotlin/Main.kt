fun main(args: Array<String>) {
    var a1 = Animal()
    var d1 = Dog()
    var c1 = Cat()

    a1.makeSound()
    d1.makeSound()
    c1.makeSound()

    //Ejemplo polimorfismo

    val animals = arrayOf(Dog(), Cat(), Animal())
    for (animal in animals) {
        animal.makeSound()
    }
    //fin ejemplo
}