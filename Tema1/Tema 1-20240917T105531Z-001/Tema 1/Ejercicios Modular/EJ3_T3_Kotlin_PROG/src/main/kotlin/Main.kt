fun main(args: Array<String>) {
    val numero = pedirNumero()
    if (esPar(numero))
        println("El $numero es par")
    else
        println("El $numero es impar")
}

fun pedirNumero(): Int {
    var x: Int? = null
    do {
        println("Introduce el número:")
        x = readln().toIntOrNull()
    }while(x == null)
    return x
}
fun esPar(r:Int):Boolean{
    return ((r%2)==0)
}