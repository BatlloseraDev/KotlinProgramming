fun main() {

    var tablero= Tablero(10,15)

    tablero.imprimirTablero()

    var turnos= 0
    var jugar= true
    var victoria = false
    while(jugar)
    {
        turnos++

        var opc= 0
        do {
            opc = ControlErrores.pedirPorTecladoInt("Elige:\n(1)Descubrir Casilla\n(2)Marcar Casilla\n(3) rendirse","Elige un numero")
            if(opc<1 || opc >3) println("Elige una opción valida")
        }while (opc<1 || opc>3)

        when(opc){
            1->{

                var x= ControlErrores.pedirPorTecladoInt("Introduce un valor para x","Introducce un numero")
                var y = ControlErrores.pedirPorTecladoInt("Introduce un valor para y", "Introduce un numero")
               if(tablero.descubrirCasillas(x,y)) jugar= false

            }
            2->{
                var x= ControlErrores.pedirPorTecladoInt("Introduce un valor para x","Introducce un numero")
                var y = ControlErrores.pedirPorTecladoInt("Introduce un valor para y", "Introduce un numero")
                tablero.marcarCasilla(x,y)

            }
            3->{
                jugar= false
            }

        }

        tablero.imprimirTablero()


        if(tablero.comprobarVictoria())
        {
            println("Has ganado en $turnos turnos")
            jugar= false
        }

    }

    println("Resultado del tablero:")
    tablero.imprimirTableroTrampa()

}

