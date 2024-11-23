fun main() {
    if (esPrimo(pedirNumero())) {
        println("Es un número primo.")
    } else {
        println("No es un número primo.")
    }
}

fun esPrimo(numero: Int): Boolean {
    var solucion = true

    var x=2
    while (x<numero/2 && solucion){
        if (numero % x == 0) {
            solucion= false
        }
        x++
    }

    return solucion
}

fun pedirNumero(): Int {
    var x: Int? = null
    do {
        print("Dame número mayor de 1: ")
        x = readln().toIntOrNull()
    }while ((x == null) || (x<=1))
    return x
}
