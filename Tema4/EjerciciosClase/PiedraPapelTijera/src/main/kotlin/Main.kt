fun main(args: Array<String>) {
    var humano = Jugador("PEPE")
    var ordenador = Ordenador("DEEP BLUE")
    var arbitro = Arbitro ()

    do{
        arbitro.ganador(humano,ordenador)
    }while(!arbitro.hayGanador())
    arbitro.resumen()
}