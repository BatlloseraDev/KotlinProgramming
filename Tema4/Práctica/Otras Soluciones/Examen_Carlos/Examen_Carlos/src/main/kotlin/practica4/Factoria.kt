package practica4

class Factoria {
    companion object {
        fun crearJugador(nombre : String, carta1 : Carta, carta2 : Carta, carta3 : Carta, carta4 : Carta, carta5 : Carta) : Jugador {
            return Jugador(nombre, carta1, carta2, carta3, carta4, carta5)
        }

        fun crearJugador(nombre : String) : Jugador {
            val carta1 = Carta()
            val carta2 = Carta()
            val carta3 = Carta()
            val carta4 = Carta()
            val carta5 = Carta()

            return Jugador(nombre, carta1, carta2, carta3, carta4, carta5)
        }

        fun crearCarta(dado : Dado, tipo : Tipo, poder: Int, vida : Int) : Carta {
            val poderFinal = 10.coerceAtLeast(20.coerceAtMost(poder))
            val vidaFinal = 5.coerceAtLeast(100.coerceAtMost(poder))

            return Carta(dado, tipo, poderFinal, vidaFinal)
        }

        fun crearDado(numeroDeCaras : Int) : Dado {
            val numeroDeCarasFinal = 6.coerceAtLeast(12.coerceAtMost(numeroDeCaras))

            return Dado(numeroDeCarasFinal)
        }
    }
}