fun main() {
    var conjunto_1 = Conjunto()

    conjunto_1.addElemento('a')
    conjunto_1.addElemento('b')
    conjunto_1.addElemento('c')

    var conjunto_2 = Conjunto()
    conjunto_2.addElemento('b')
    conjunto_2.addElemento('c')
    conjunto_2.addElemento('d')

    println("Conjunto A: $conjunto_1")
    println("Conjunto B: $conjunto_2")

    println("Interseccion: ${Conjunto.interseccion(conjunto_1,conjunto_2)}")
    println("Union: ${Conjunto.union(conjunto_1,conjunto_2)}")

    //Eliminacion de elemento
    conjunto_2.eliminarElemento('d')
    println("Conjunto B: $conjunto_2")

    println("Cardinalidad de A: ${Conjunto.cardinalidad(conjunto_1)}")
    println("Cardinalidad de B: ${Conjunto.cardinalidad(conjunto_2)}")

}