import kotlin.math.pow

fun main() { // Raúl Naharro Fernández
    var num : Int
    do {
        do {
            println("Introduce un número (10.000 - 99.999)")
            num = readln().toInt()
        } while (num !in 10000..99999)
        var cond1 = comprobarDigito(num, 3, 3)
        var cond2 = sumaMultiplos(num, 3)
        var cond3 = coincidenDigitos(num, 1, 5)

        var seCumple = (cond1 && cond2 && cond3)
        if (!seCumple) println("No se han cumplido las comprobaciones. Introduce otro número")
    } while (!seCumple)

    println("Número invertido: ${invertirNumero(num)}")
    var num2 = (10000..99999).random()
    println("Numero aleatorio: $num2")
    coincidenDigitosNumeros(num, num2)
}

fun comprobarDigito(numero : Int, posicion : Int, valor : Int) : Boolean {
    return ((numero / (10.0.pow(5 - posicion)) % 10).toInt() == valor)
}

fun sumaMultiplos(numero : Int, valor : Int) : Boolean {
    var suma = 0
    var i = numero
    while (i > 0) {
        suma += i % 10
        i /= 10
    }
    return (suma % valor == 0)
}

fun coincidenDigitos(numero : Int, pos1 : Int, pos2 : Int) : Boolean {
    var digito1 = (numero / (10.0.pow(5 - pos1)) % 10).toInt()
    var digito2 = (numero / (10.0.pow(5 - pos2)) % 10).toInt()
    return (digito1 == digito2)
}

// Comprueba si las cifras de cada posición de dos números distintos coinciden. Imprime la cifra menor tantas veces como equivalga el valor de la mayor.
fun coincidenDigitosNumeros(numero1 : Int,  numero2: Int) : Boolean { 
    var digitoCifra1 = 0
    var digitoCifra2 = 0
    for (i in 1..5){
        digitoCifra1 = (numero1 / (10.0.pow(5 - i)) % 10).toInt()
        digitoCifra2 = (numero2 / (10.0.pow(5 - i)) % 10).toInt()

        var menor = if(digitoCifra1 <= digitoCifra2) digitoCifra1 else digitoCifra2 // En caso de que sean iguales se elige el primer número como el menor.
        var mayor = if(digitoCifra1 > digitoCifra2) digitoCifra1 else digitoCifra2
        var n = 1
        while (n <= mayor) {
            print(menor)
            n++
        }
    }
    return (digitoCifra1 == digitoCifra2)
}

fun invertirNumero(numero: Int): Int {
    var numeroInvertido = 0
    var numeroOriginal = numero

    while (numeroOriginal != 0) {
        numeroInvertido = numeroInvertido * 10 + numeroOriginal % 10
        numeroOriginal /= 10
    }
    return numeroInvertido
}
