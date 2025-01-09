package practica1

class Conversion {
    companion object {
        fun divisible(num1 : Int, num2 : Int) : Boolean {
            return num1 % num2 == 0
        }

        fun aleatorio(minimo : Int, maximo : Int) : Int {
            return ((minimo + 1)..maximo).random()
        }

        fun contar(inicio : Int, maximo : Int) {
            if (inicio >= maximo) {
                println("[ERROR] Los numeros coinciden o el minimo es mayor que el maximo.")
            }else {
                var contador = inicio
                while (contador <= maximo) {
                    println(contador)
                    contador++
                }
            }
        }
    }
}