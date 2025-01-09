package practica4

class Jugador {
    val nombre : String

    val carta1 : Carta
    val carta2 : Carta
    val carta3 : Carta
    val carta4 : Carta
    val carta5 : Carta

    constructor() {
        this.nombre = "Jugador${(100..999).random()}"
        this.carta1 = Carta()
        this.carta2 = Carta()
        this.carta3 = Carta()
        this.carta4 = Carta()
        this.carta5 = Carta()
    }

    constructor(nombre : String, carta1 : Carta, carta2 : Carta, carta3 : Carta, carta4 : Carta, carta5 : Carta) {
        this.nombre = nombre
        this.carta1 = carta1
        this.carta2 = carta2
        this.carta3 = carta3
        this.carta4 = carta4
        this.carta5 = carta5
    }

    fun seleccionarCarta() : Carta {
        var cartaElegida : Carta?
        do {
            println("Selecciona una de tus cartas:")
            println("[1] $carta1 \n[2] $carta2 \n[3] $carta3 \n[4] $carta4 \n[5] $carta5")
            cartaElegida = when (readln().toIntOrNull()) {
                1 -> carta1
                2 -> carta2
                3 -> carta3
                4 -> carta4
                5 -> carta5
                else -> null
            }

            if (cartaElegida == null) {
                println("Debes elegir una carta valida")
            }else if (cartaElegida.vida <= 0) {
                println("Esta carta esta derribada, debes elegir otra.")
            }
        }while (cartaElegida == null || cartaElegida.vida <= 0)
        return cartaElegida
    }

    fun puedeContinuarLaPartida() : Boolean {
        return Carta.cartasEnPie >= 7
    }

    fun fuerzaDelJugador() : Int {
        return this.carta1.vida + this.carta2.vida + this.carta3.vida + this.carta4.vida + this.carta5.vida
    }

    override fun toString(): String {
        return "$nombre (${fuerzaDelJugador()})"
    }
}