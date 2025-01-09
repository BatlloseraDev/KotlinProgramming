class Jugador {
    var carta1 : Carta
    var carta2 : Carta
    var carta3 : Carta
    var carta4 : Carta
    var carta5 : Carta
    lateinit var cartaEscogida : Carta
    var fuerzaTotal : Int
    private var cartasRestantes = 5

    constructor(carta1 : Carta, carta2 : Carta, carta3 : Carta, carta4 : Carta, carta5 : Carta) {
        this.carta1 = carta1
        this.carta2 = carta2
        this.carta3 = carta3
        this.carta4 = carta4
        this.carta5 = carta5
        this.fuerzaTotal = carta1.vida + carta2.vida + carta3.vida + carta4.vida + carta5.vida
    }

    fun elegirCarta() : Carta{ // Muestra la lista de las cartas del jugador, mostrando los atributos de cada una.
        var opcion : Int
        println("========= Jugador, escoge tu carta =========")
        println("====== POTENCIA RESTANTE: $fuerzaTotal ======")
        println("1: $carta1")
        println("2: $carta2")
        println("3: $carta3")
        println("4: $carta4")
        println("5: $carta5")
        println("===============================================")
        do {
            opcion = (1..5).random() // La opción se escoge de forma aleatoria. Cambiando esto por readln permitimos que lo escoja el usuario.
            when(opcion) {
                1 -> cartaEscogida = carta1
                2 -> cartaEscogida = carta2
                3 -> cartaEscogida = carta3
                4 -> cartaEscogida = carta4
                5 -> cartaEscogida = carta5
            }
        } while (!cartaEscogida.puedeUsarse())
        println("Se ha escogido la carta $opcion")

        return cartaEscogida
    }

    fun pelear(enemigo : Jugador) {
        cartaEscogida.enfrentar(enemigo.cartaEscogida)
        if(!cartaEscogida.puedeUsarse()) cartasRestantes--
        if(!enemigo.cartaEscogida.puedeUsarse()) enemigo.cartasRestantes--
    }

    fun seguirJuego(enemigo : Jugador):Boolean { // Comprueba que el jugador tenga alguna carta con vida. En caso contrario, acaba el juego.
        var seguir = true
        if (this.cartasRestantes + enemigo.cartasRestantes < 7){
            seguir = false
            println("No hay suficientes cartas para continuar. Finalizando el juego.")
        }
        return seguir
    }
}