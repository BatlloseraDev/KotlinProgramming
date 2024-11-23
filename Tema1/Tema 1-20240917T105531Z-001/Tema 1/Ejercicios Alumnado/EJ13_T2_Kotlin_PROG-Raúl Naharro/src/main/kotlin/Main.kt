fun main() { // EJERCICIO 13
    var num1 : Int
    var num2 : Int
    do {
        println("Introduce dos números enteros mayores que 0")
        num1 = readln().toInt()
        num2 = readln().toInt()
    } while (num1 <= 0 || num2 <= 0)

    val mayor = if (num1 > num2) num1 else num2
    val menor = if (num1 < num2) num1 else num2
    
    var resto = mayor
    var i = 0
    while (resto >= menor) {
        resto -= menor
        i++
    }

    println("El cociente de $mayor dividido entre $menor es $i y su resto es $resto")

}