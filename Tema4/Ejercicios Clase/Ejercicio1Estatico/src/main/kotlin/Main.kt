fun main(args: Array<String>) {
  var persona1 = Persona()
    var ana = Persona("Ana",25)
    var pepe = Persona("Juan",34)

    println(Persona.contar)
    println(pepe)
    println(ana)
    Persona.contar = 0
    println(ana)
    println(pepe)
}