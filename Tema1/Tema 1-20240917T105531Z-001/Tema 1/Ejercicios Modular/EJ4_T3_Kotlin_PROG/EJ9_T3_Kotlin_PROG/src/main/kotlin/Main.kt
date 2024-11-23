fun main() {

    val numero = pedirNumero()

    val cifras = contarCifras(numero)

    if (numero < 0) {
        println("El número -$numero tiene $cifras cifras.")
    } else {
        println("El número $numero tiene $cifras cifras.")
    }
}
fun contarCifras(numero: Int): Int {
    var numeroAbsoluto = Math.abs(numero)
    var cifras = 1

    while (numeroAbsoluto >= 10) {
        numeroAbsoluto /= 10
        cifras++
    }

    return cifras
}

fun pedirNumero(): Int {
    var x: Int? = null
    do {
        print("Dame número: ")
        x = readln().toIntOrNull()
    }while(x == null)
    return x
}
