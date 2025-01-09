package practica3

import kotlin.math.nextUp
import kotlin.math.truncate

class Sucursal {
    companion object {
        fun pedirNumero() : Int {
            var numero : Int?
            do {
                println("Por favor, introduzca un numero de cinco cifras.")
                numero = readln().toIntOrNull()
            }while (numero == null || numero !in 10000..99999)
            return numero
        }

        fun hayTres(loteria : Int) : Boolean {
            return (loteria - ((loteria / 1000) * 1000)) / 100 == 3
        }

        fun multiploDeDos(loteria : Int) : Boolean {
            var suma = 0
            var mult = 10
            do {
                suma += ((loteria - ((loteria / mult) * mult)) - (loteria - ((loteria / (mult / 10)) * (mult / 10)))) / (mult / 10)
                mult *= 10
            }while (mult < 1000000)

            return suma.toInt() % 2 == 0
        }

        fun primeroUltimoCoinciden(loteria : Int) : Boolean {
            val primero = loteria / 10000
            val ultimo = loteria - ((loteria / 10) * 10)
            println("$primero - $ultimo")
            return primero == ultimo
        }

        fun imprimirBucle(loteria: Int) {

        }
    }
}