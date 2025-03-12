fun main() {

    var tablero= Tablero(10,50)

    tablero.imprimirTablero()

    var turnos= 0
    while(turnos<20)
    {
        turnos++

        var x= ControlErrores.pedirPorTecladoInt("Introduce un valor para x","Introducce un numero")
        var y = ControlErrores.pedirPorTecladoInt("Introduce un valor para y", "Introduce un numero")

        tablero.descubrirCasillas(x,y)


        tablero.imprimirTablero()
        tablero.imprimirTableroTrampa()
    }

}