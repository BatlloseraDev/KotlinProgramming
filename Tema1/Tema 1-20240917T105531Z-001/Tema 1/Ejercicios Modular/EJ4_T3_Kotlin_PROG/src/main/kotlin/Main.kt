import kotlin.math.sqrt

fun main(args: Array<String>) {
    val numero = pedirNumero()
    if (esPosivito(numero))
        //println("El ${Math.sqrt(numero.toDouble())} es par") Orientado a objetos
        println("El ${sqrt(numero.toDouble())} es par") //estructurado y modular
    else
        println("El $numero, operación no posible")
}

fun pedirNumero(): Int {
    var x: Int? = null
    do {
        println("Introduce el número:")
        x = readln().toIntOrNull()
    }while(x == null)
    return x
}
fun esPosivito(r:Int):Boolean{
    return (r>=0)
}