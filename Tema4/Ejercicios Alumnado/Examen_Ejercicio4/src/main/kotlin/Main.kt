import practica4.Factoria

fun main() {
    val jugador1 = Factoria.crearJugador("Pepe")
    val jugador2 = Factoria.crearJugador("Juan")

    do {
        print("$jugador1 ")
        val cartaJugador1 = jugador1.seleccionarCarta()

        print("$jugador2 ")
        val cartaJugador2 = jugador2.seleccionarCarta()

        println("\n=====================")
        cartaJugador1.enfrentarse(cartaJugador2)
        println("=====================\n")
    }while (jugador1.puedeContinuarLaPartida())
}