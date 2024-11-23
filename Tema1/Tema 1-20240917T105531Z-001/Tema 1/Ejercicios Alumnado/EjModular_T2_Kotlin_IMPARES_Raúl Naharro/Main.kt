import kotlin.math.abs

fun main() {

    println("Introduce un número")
    val num = readln().toInt()

    contarParImpar(num)
}

fun contarParImpar(num : Int) {

    val numAbs = abs(num) // Valor absoluto del número, para evitar que el símbolo negativo pase como texto y rompa la función
    var par = 0
    var impar = 0

    for(c in numAbs.toString()){ // Recorremos individualmente cada caracter para comprobar si es par o no.
        if (c.code() % 2 == 0) { // Comprobamos si el número, convertido nuevamente a Int (mediante code), es par o no
            par++
        }
        else {
            impar++
        }
    }

    println("$num tiene $par pares y $impar impares")
}