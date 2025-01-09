class Factoria {
    companion object {
        fun crearJugador() : Jugador {
            var carta1 = crearCarta()
            var carta2 = crearCarta()
            var carta3 = crearCarta()
            var carta4 = crearCarta()
            var carta5 = crearCarta()
            return Jugador(carta1, carta2, carta3, carta4, carta5)
        }

        private fun crearCarta() : Carta {
            var tipo = TipoCarta.entries.toTypedArray().random()
            var poder = (5..20).random()
            var vida = (15..100).random()
            return Carta(tipo, poder, vida)
        }

        fun crearDado() : Dado {
            var caras = (6..14).random()
            return Dado(caras)
        }
    }
}