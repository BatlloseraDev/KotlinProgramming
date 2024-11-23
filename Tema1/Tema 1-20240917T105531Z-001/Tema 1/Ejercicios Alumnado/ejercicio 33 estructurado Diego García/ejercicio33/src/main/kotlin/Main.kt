fun main() {
    println("Ingrese un número para verificar si es primo:")
    val num = readLine()?.toIntOrNull()

    if (num != null) {
        if (esPrimo(num)) {
            println("$num es un número primo")
        } else {
            println("$num no es un número primo")
        }
    } else {
        println("Entrada no válida. Por favor, ingrese un número válido")
    }
}

fun esPrimo(num: Int): Boolean {
    var c = true
    if (num <= 1) {
        c = false
    }

    val limite = num / 2 + 1
    var i = 2

    while (i < limite && c) {
        if (num % i == 0) {
            c = false
        }
        i++
    }
    return c
}