fun main(args: Array<String>) {

    //inicio Ejemplo 1
    val ejemplo1 = Ejemplo()
    val ejemplo2 = Ejemplo()
    println(ejemplo1.toString())
    println(ejemplo1.hashCode())
    println(ejemplo1.equals(ejemplo2))
    // ejemplo 1

    //Ejemplo 2

    val ancestro1 = Ancestro(false)
    val descendiente = Descendiente(true)
    println(ancestro1.toString())
    println(descendiente.toString())

    //Ejemplo 2

    //Ejemplo 3
    val personaje = Character("personaje")
    val jaina = Mage("Jaina")
    personaje.die()
    jaina.die()
    //Ejemplo 3

    //Ejemplo 4
    val notebook = BaseItem("Cuaderno")
    val pencil = PopularItem("Lapicero")
    println("${notebook.name} x ${notebook.quantity}")
    println("${pencil.name} x ${pencil.quantity}")
    //Ejemplo 4

}