class Jugador {

    var fuerzaTotal: Int = 0
    var cartas: String = ""

    fun mostrarFuerzaTotal() {
           println("Fuerza total: $fuerzaTotal")
    }

    fun mostrarCartas() {
            println("Cartas del jugador:\n$cartas")
    }

     fun sumarFuerzaCartas(cartasJugador: Array<Carta>) {
            fuerzaTotal = cartasJugador.sumBy { it.indiceVida }
     }

     fun listarCartas(cartasJugador: Array<Carta>) {
         val listaCartas = cartasJugador.joinToString("\n") { "Tipo: ${it.tipo}, Índice de vida: ${it.indiceVida}, Poder: ${it.poder}" }
         cartas = listaCartas
     }
}