fun main() { // Raúl Naharro Fernández
    var j1 = Factoria.crearJugador()
    var j2 = Factoria.crearJugador()

    do { // Ejecutamos el juego hasta que uno de los dos jugadores no pueda seguir jugando (no le queden cartas utilizables). Permitirá elegir una carta a cada jugador.
        println("***********************SIGUIENTE RONDA***********************")
        j1.elegirCarta() // Permitimos que ambos jugadores escojan sus opciones.
        j2.elegirCarta()

        j1.pelear(j2) // Enfrentamos a ambos jugadores entre sí, cada uno con sus opciones escogidas.

    } while (j1.seguirJuego(j2))
}