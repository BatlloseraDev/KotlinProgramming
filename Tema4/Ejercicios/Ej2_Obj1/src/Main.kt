import kotlin.random.Random

fun main() {

    /*//pruebo que funcione bien
    var fraccion1 = Racional(2,4)
    var fraccion2 = Racional(3, 6)

    println("Fraccion 1: $fraccion1")
    println("Fraccion 2: ${fraccion2.toString()}")

    var suma= Racional.sumar(fraccion1,fraccion2) //podria crearlo como parte del companion
    println("Suma: $suma")

    var mult = Racional.multiplicar(fraccion1,fraccion2)
    println("Multiplicacion: $mult")

    var fraccion3 = Racional(5,10)
    println("Fraccion 3: $fraccion3")
    fraccion3.leer() //pido una nueva fraccion
    println("Fraccion 3: $fraccion3")

    var simplificada = Racional.simplificar(fraccion1)
    println("Fraccion simplificada: $simplificada")
    */
    //

    var conjuntoRacionales= Array<Racional>(5){Racional()}

    var n= 0
    while(n<conjuntoRacionales.size)
    {
        conjuntoRacionales[n].numerador=Random.nextInt(0,100)
        conjuntoRacionales[n].denominador=Random.nextInt(1,100)
        n++
    }
    println()
    var suma = conjuntoRacionales[0].sumar(conjuntoRacionales[1])

}