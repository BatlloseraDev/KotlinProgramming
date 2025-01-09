package practica2

class Piramide {

    companion object {
        fun pedirNumeroImpar() : Int {
            var numero : Int?
            do {
                println("Por favor, introduzca un numero impar.")
                numero = readln().toIntOrNull()
            }while (numero == null || numero % 2 == 0)
            return numero
        }

        fun crearPiramide(altura : Int) {
            var ancho = altura
            while (ancho > 0) {
                var pisoActual = ""
                for (i in 1..ancho step 1) {
                    pisoActual += '*'
                }

                val cantidadEspacios = (altura - ancho) / 2
                for (i in 1..cantidadEspacios step 1) {
                    pisoActual = " $pisoActual"
                }

                println(pisoActual)
                ancho -= 2
            }
        }
    }
}