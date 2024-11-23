import kotlin.math.sqrt

fun main(args: Array<String>) {
    var numero : Double = 0.0
    var raiz : Double = 0.0


    print("Escribe un numero")
    numero = readln().toDouble()

    if (numero<0){
        println("El ${numero} es negativo")
    }
    else{
        println("la raiz cuadrada de ${numero} es ${sqrt(numero)}")
    }
}