fun main() {

/*
    var conjunto= ArrayList<Persona>()

    conjunto.add(Hombre("Juan","Ignacio"))
    conjunto.add(Mujer("Ana","Bohuele"))

    for(i in conjunto)
    {
        println("--${i.fullName()}--")
    }*/
    var m= Animal()
    var p= Dog()
    var g= Cat()

    m.makeSound()
    p.makeSound()
    g.makeSound()


    var an = ArrayList<Animal>()
    an.add(m)
    an.add(p)
    an.add(g)

    an.forEach{it.makeSound()}

}

open class Animal {
    open fun makeSound() {
        println("El animal hace un sonido")
    }
}
class Dog: Animal() {
    override fun makeSound() {
        println("El perro ladra")
    }
}
final class Cat: Animal() {
    override fun makeSound() {
        println("El gato maulla")
    }
}

/*
* Clase persona-> mujer hombre
* sacar clase de hombre y mujer
* (abuelo) (padre) (hijo)
* 1 sobrecarga en persona
* 1 sobrescritura en hombre y mujer
* prog principal array persona y polimorfismo.
* */
