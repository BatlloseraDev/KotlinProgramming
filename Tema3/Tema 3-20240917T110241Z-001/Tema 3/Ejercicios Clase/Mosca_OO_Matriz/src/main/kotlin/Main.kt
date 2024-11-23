fun main(args: Array<String>) {
    var j = Jugador("Pedro")
    j.pedirTamanioTablero()
    j.pedirIntentos()
    var t= Tablero(j.fila,j.columna)
    //t.imprimirTablero()
    var m = Mosca()
    m.volar(t)
    do{
        t.imprimirTablero()
        j.elegirPosicion()
        m.comprobarGolpe(j.posicion,t)
        j.intentos --
    }while(j.intentos!=0 && m.estaViva)
}