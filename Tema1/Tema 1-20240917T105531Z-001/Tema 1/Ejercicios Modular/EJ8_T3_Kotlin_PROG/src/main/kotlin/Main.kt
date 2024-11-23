
fun main() {
    println("Ingresa tres números enteros:")
    val num1 = pedirNumero(1)
    val num2 = pedirNumero(2)
    val num3 = pedirNumero(3)

    if (estanOrdeados(num1, num2, num3)) {
        println("Los números $num1, $num2 y $num3 están ordenados de menor a mayor.")
    } else {
        println("Los números $num1, $num2 y $num3 no están ordenados de menor a mayor.")
    }
}

fun pedirNumero(x:Int): Int {
    var x: Int? = null
    do {
        print("Número $x: ")
        x = readln().toIntOrNull()
    }while(x == null)
    return x
}
fun estanOrdeados(a: Int, b: Int, c: Int): Boolean {
    return a <= b && b <= c
}