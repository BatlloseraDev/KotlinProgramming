fun main() { // Raúl Naharro Fernández
    var altura : Int
    do {
        println("Introduce la altura de la pirámide (SOLO IMPARES):")
        altura = readln().toInt()
    } while (altura % 2 == 0)

    dibujarPiramide(altura)
}

// Funciona con la altura de la pirámide. Hará tantas filas de asteriscos como se le introduzcan por teclado
fun dibujarPiramide(altura : Int) {
    var i = altura
    while(i >= 1) {
        print(" ".repeat(altura - i))
        print("*".repeat(i * 2 - 1))
        println()
        i--
    }
}
