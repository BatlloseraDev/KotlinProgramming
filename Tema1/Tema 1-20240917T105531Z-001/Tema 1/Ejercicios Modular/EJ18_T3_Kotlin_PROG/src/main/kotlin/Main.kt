fun main() {

    val cantidad = pedirDinero()

    println("Para $cantidad €, se necesitan:")
    calcularMonedas(cantidad, 200)
}

fun calcularMonedas(cantidad: Double, valorMoneda: Int) {

    val centimos = (cantidad * 100).toInt()
    val cantidadMonedas = centimos / valorMoneda
    val resto = centimos % valorMoneda

    if (cantidadMonedas > 0) {
        println("$cantidadMonedas moneda(s) de ${nombreMoneda(valorMoneda)}")
    }

    if (valorMoneda > 1) {
        calcularMonedas(resto.toDouble() / 100, valorMoneda / 2)
    }
}
fun nombreMoneda(x:Int): String{
    return when (x) {
        200 -> "2€"
        100 -> "1€"
        50 -> "50cts"
        20 -> "20cts"
        10 -> "10cts"
        5 -> "5cts"
        2 -> "2cts"
        else -> "1ct"
    }
}
fun pedirDinero(): Double {
    var x: Double? = null
    do {
        print("Dame dinero: ")
        x = readln().toDoubleOrNull()
    }while(x == null)
    return x
}

