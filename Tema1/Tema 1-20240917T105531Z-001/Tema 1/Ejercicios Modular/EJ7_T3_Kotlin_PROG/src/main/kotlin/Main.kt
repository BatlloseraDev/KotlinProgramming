fun main(args: Array<String>) {
    var seleccion: Int

    do {

        seleccion = pedirDatos()

        when (seleccion) {
            1 -> {
                print("Ingresa la temperatura en grados Celsius: ")
                val celsius = readLine()?.toDoubleOrNull() ?: 0.0
                val fahrenheit = centigradosaFahrenheit(celsius)
                println("$celsius grados Celsius son equivalentes a $fahrenheit grados Fahrenheit.")
            }
            2 -> {
                print("Ingresa la temperatura en grados Fahrenheit: ")
                val fahrenheit = readLine()?.toDoubleOrNull() ?: 0.0
                val celsius = fahrenheitacentigrados(fahrenheit)
                println("$fahrenheit grados Fahrenheit son equivalentes a $celsius grados Celsius.")
            }
            3 -> {
                println("Terminado")
            }
            else -> {
                println("Opción no válida. Por favor, selecciona una opción válida.")
            }
        }
    } while (seleccion != 3)
}

fun pedirDatos(): Int {
    println("Selecciona una opción:")
    println("1. Convertir de Celsius a Fahrenheit")
    println("2. Convertir de Fahrenheit a Celsius")
    println("3. Salir")

    return readLine()?.toIntOrNull() ?: 0
}

fun centigradosaFahrenheit(celsius: Double): Double {
    return (celsius * 9 / 5) + 32
}

fun fahrenheitacentigrados(fahrenheit: Double): Double {
    return (fahrenheit - 32) * 5 / 9
}