fun main() {
    Resolucion()
}

fun Resolucion() {

    if(ComprobarDecimales(devolverDouble())) println("No tiene decimales")
    else println("Tiene decimales")
}


fun ComprobarDecimales(numero: Double): Boolean {
    return numero % 1 == 0.0
}


fun devolverDouble(): Double {
    var n: Double? = null
    while (n == null) {
        println("Por favor, escribe un numero para saber si tiene decimales o no")
        n = devolverDoubleONull(readln())
    }
    return n
}

fun devolverDoubleONull(input: String): Double? {

    return try {
        input.toDouble()
    } catch (e: NumberFormatException) {
        println("Numero no reconocido o no valido, por favor ingresa un Entero")
        null
    }

}