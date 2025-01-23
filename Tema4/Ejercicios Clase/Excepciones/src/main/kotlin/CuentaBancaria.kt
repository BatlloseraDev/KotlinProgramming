
//EJEMPLO DE CREAR UNA CLASE CON CONSTRUCTOR PRIMARIO Y SUS ATRIBUTOS
class CuentaBancaria(private val titular: String, private var saldo: Double) {

    // Función que lanza una excepción sin controlarla
    fun retirarSinControlar(monto: Double) {
        if (monto > saldo) {
            throw FondosInsuficientesException("Fondos insuficientes en la cuenta de $titular.")
        }
        saldo -= monto
        println("Retiro exitoso. Saldo actual: $$saldo")
    }

    // Función que controla la excepción con try-catch
    fun retirarConControl(monto: Double) {
        try {
            if (monto > saldo) {
                throw FondosInsuficientesException("Fondos insuficientes en la cuenta de $titular.")
            }
            saldo -= monto
            println("Retiro exitoso. Saldo actual: $$saldo")
        } catch (e: FondosInsuficientesException) {
            println("Error: ${e.message}")
        }
    }

    // Función con múltiples catch y un bloque finally
    fun depositarConManejoExcepciones(monto: Double) {
        try {
            if (monto <= 0) {
                throw IllegalArgumentException("El monto a depositar debe ser mayor que cero.")
            }
            saldo += monto
            println("Depósito exitoso. Saldo actual: $$saldo")
        } catch (e: IllegalArgumentException) {
            println("Error: ${e.message}")
        } catch (e: Exception) {
            println("Error inesperado: ${e.message}")
        } finally {
            println("Operación de depósito finalizada.")
        }
    }


    fun transferirA(monto: Double, cuentaDestino: CuentaBancaria) {
        if (monto <= 0) {
            throw IllegalArgumentException("El monto a transferir debe ser mayor que cero.")
        }
        if (monto > saldo) {
            throw FondosInsuficientesException("Fondos insuficientes para la transferencia.")
        }
        this.saldo -= monto
        cuentaDestino.saldo += monto
        println("Transferencia exitosa de $$monto a ${cuentaDestino.titular}. Saldo actual: $$saldo")
    }
}