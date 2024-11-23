fun main(args: Array<String>) {

    var t=Tablero(5)
    var humano = Jugador()
    var pc = Jugador(true)
    t.imprimirTablero()

    do{

        println("******** Turno : ${Jugador.turnos++} ***********")
        do{
            pc.pedirPosicion(t.tamanio)
        }while(t.comprobarPosicion(pc.posicion))

        t.escribirCasilla(pc.pedirLetra(),pc.posicion)  //ERRORR t.m[pc.posicion.fila][pc.posicion.columna] = pc.pedirLetra()
        pc.sumarPuntos(t.puntuacion(pc.posicion))       //pc.puntos = pc. puntos + t.puntuacion(pc.posicion)
        println(pc)
        t.imprimirTablero()

        //tirada humano
        if (!t.tableroLLeno()) {
            do {
                humano.pedirPosicion(t.tamanio)
            } while (t.comprobarPosicion(humano.posicion))

            t.escribirCasilla(humano.pedirLetra(), humano.posicion)
            humano.sumarPuntos(t.puntuacion(pc.posicion))
            println(humano)
            t.imprimirTablero()
        }

    }while(!t.tableroLLeno())
    println("************** Final del Juego ****************")
    println("PC: ${pc}")
    println("Humano: ${humano}")
    t.imprimirTablero()
}