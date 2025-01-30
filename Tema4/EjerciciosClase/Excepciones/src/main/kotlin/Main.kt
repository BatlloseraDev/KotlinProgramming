fun main(args: Array<String>) {
    val cuenta1 = CuentaBancaria("Pepe", 100.0)
    val cuenta2 = CuentaBancaria("Ana", 50.0)

    println("Ejemplo de excepción sin control:")
    try {
        cuenta1.retirarSinControlar(150.0)
    } catch (e: Exception) {
        println("Excepción capturada en main: ${e.message}")
    }

    println("\nEjemplo de excepción con control:")
    cuenta1.retirarConControl(150.0)

    println("\nEjemplo con múltiples catch y finally:")
    cuenta1.depositarConManejoExcepciones(-20.0) // Esto lanzará una IllegalArgumentException

    println("\nEjemplo de transferencia con throw de excepciones personalizadas:")
    try {
        cuenta1.transferirA(200.0, cuenta2) // Esto lanzará una FondosInsuficientesException
    } catch (e: IllegalArgumentException) {
        println("Error: ${e.message}")
    } catch (e: FondosInsuficientesException) {
        println("Error: ${e.message}")
    }
}