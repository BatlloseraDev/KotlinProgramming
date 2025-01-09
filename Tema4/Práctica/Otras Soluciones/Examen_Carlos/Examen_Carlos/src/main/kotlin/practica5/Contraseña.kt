package practica5

import kotlin.random.Random

class Contraseña {
    val longitud : Int
    val fuerte : Boolean

    var contraseña = ""

    constructor() {
        this.longitud = 8
        this.fuerte = false
    }

    constructor(longitud : Int, fuerte : Boolean) {
        this.longitud = longitud
        this.fuerte = fuerte
    }

    fun generarContraseña() {
        var nuevaContraseña = ""
        if (fuerte) {
            var mayusculas = 0
            var minusculas = 0
            var numeros = 0

            while (mayusculas != 2 || minusculas != 1 || numeros != 5) {
                when (Random.nextInt(1, 4)) {
                    1 -> {
                        if (mayusculas != 2) {
                            mayusculas++
                            nuevaContraseña += mayusculaAleatoria()
                        }
                    }
                    2 -> {
                        if (minusculas != 1) {
                            minusculas++
                            nuevaContraseña += minusculaAleatoria()
                        }
                    }
                    3 -> {
                        if (numeros != 5) {
                            numeros++
                            nuevaContraseña += numeroAleatorio()
                        }
                    }
                }
            }
        }else {
            for (i in 1..longitud step 1) {
                nuevaContraseña += (0..9).random()
            }
        }
        this.contraseña = nuevaContraseña
    }

    fun mayusculaAleatoria() : Char {
        return when (Random.nextInt(1, 5)) {
            1 -> 'Q'
            2 -> 'W'
            3 -> 'E'
            else -> 'R'
        }
    }

    fun minusculaAleatoria() : Char {
        return when (Random.nextInt(1, 4)) {
            1 -> 'a'
            2 -> 's'
            else -> 'd'
        }
    }

    fun numeroAleatorio() : Int {
        return (3..9).random()
    }

    override fun toString(): String {
        generarContraseña()
        return contraseña
    }
}