import kotlin.math.truncate

fun main() {

    val numero = pedirNumero()

    if (esDecimal(numero)){
        println("$numero no tiene decimales")
    }
    else{
        println("$numero tiene decimales")
    }
}

fun pedirNumero(): Double {
    var x: Double? = null
    do {
        println("Introduce el número:")
        x = readln().toDoubleOrNull()
    }while(x == null)
    return x
}

fun esDecimal(x:Double):Boolean{
    return (x== truncate(x))
}