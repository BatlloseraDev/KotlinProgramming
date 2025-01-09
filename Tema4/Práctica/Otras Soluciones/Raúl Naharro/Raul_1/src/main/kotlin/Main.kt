fun main() { // Raúl Naharro Fernández
    var num1 = aleatorio(2,99)
    var num2 = aleatorio(2,99)

    if (divisible(num1, num2)) println("$num1 es divisible entre $num2") else println("$num1 no es divisible entre $num2")
    contar(num1, num2)
}

fun divisible (num1 : Int, num2 : Int) : Boolean {
    return num1 % num2 == 0
}

fun aleatorio(min : Int, max : Int) : Int {
    return (min+1..max).random()
}

fun contar(min : Int, max : Int) {

    var menor = if(min <= max) min else max // En caso de que sean iguales se elige el primer número como el menor.
    var mayor = if(min > max) min else max
    var i = menor
    while (i <= mayor) {
        println(i)
        i++
    }
}