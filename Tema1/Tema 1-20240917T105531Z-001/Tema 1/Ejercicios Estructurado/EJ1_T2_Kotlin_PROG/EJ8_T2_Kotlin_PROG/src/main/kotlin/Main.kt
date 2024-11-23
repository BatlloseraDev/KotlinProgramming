import kotlin.math.truncate

fun main(args: Array<String>) {
    var numero : Double = 0.0

    print("Dime un numero")
    numero = readln().toDouble()

    if (numero== truncate(numero)){
        println("$numero no tiene decimales")

    }
    else{
        println("$numero tiene decimales")
    }

}