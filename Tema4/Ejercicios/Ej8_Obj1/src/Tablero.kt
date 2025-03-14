import kotlin.random.Random

class Tablero {

    var tablero : Array<Array<Cuadrante>>
    var tamanio: Int
    var numBombas :Int


    constructor(tamanio:Int, numBombas: Int)
    {
        this.tablero= Array<Array<Cuadrante>>(tamanio){Array<Cuadrante>(tamanio){Cuadrante()}}
        this.tamanio=tamanio
        this.numBombas=numBombas
        generarBombas(numBombas)
        actualizarValores()
    }



    fun generarBombas(numBombas:Int)
    {

        var bombasColocadas= 0
        while(bombasColocadas<numBombas )
        {
            //tablero[randomX][randomY].tipo!=TipoCuadrado.MINA
            colocarBomba()
            bombasColocadas++
        }

    }

    fun actualizarValores()
    {
        for (i in 0..<tamanio)
        {
            for(j in 0..<tamanio)
            {
                if(tablero[i] [j].tipo==TipoCuadrado.NUMERO)
                {
                    var nBombasCerca = 0
                    for(x in -1..1)
                    {
                        for(y in -1 ..1)
                        {
                            if(i+x in 0..<tamanio && j+y in 0..<tamanio)
                            {
                                if(tablero[i+x][j+y].tipo==TipoCuadrado.MINA)
                                {
                                    nBombasCerca++
                                }
                            }

                        }
                    }
                    tablero[i][j].valor=nBombasCerca
                }
            }
        }
    }

    fun colocarBomba()
    {
        var randomX = (0..<tamanio).random()
        var randomY = (0..<tamanio).random()
        var colocada= false
        while(!colocada)
        {
            if(tablero[randomX][randomY].tipo!=TipoCuadrado.MINA)
            {
                tablero[randomX][randomY].cambiarTipo()
                tablero[randomX][randomY].valor=9
                colocada=true
            }
            else{

                randomY++
                if(randomY==tamanio)
                {
                    randomY=0
                    randomX++
                    if(randomX==tamanio)
                    {
                        randomX=0
                    }
                }
            }
        }

    }



    fun imprimirTablero()
    {
        for(i in tablero.indices)
        {
            for(j in tablero[i].indices)
            {
                if(!tablero[i][j].descubierta && tablero[i][j].senialada)
                {
                    print("[${String.format("%1s", "*")}]")
                    //print("   [🚩]")
                }
                else if(!tablero[i][j].descubierta )
                {
                    print("[${String.format("%1s", "_")}]")
                    //print("[🟪]")
                }
                else{
                    print("[${String.format("%1s", tablero[i][j].valor)}]")

                    //print("[${tablero[i][j].valor}]")
                }
            }
            println()
        }
    }

    fun descubrirCasillas(i:Int,j:Int): Boolean {
        var perder= false

        if (tablero[i][j].tipo != TipoCuadrado.MINA && !tablero[i][j].descubierta) {
            if (tablero[i][j].valor == 0) {
                tablero[i][j].descubierta = true
                for (x in -1..1) {
                    for (y in -1..1) {
                        if ((i + x) in 0..<tamanio && (j + y) in 0..<tamanio )
                        {
                            descubrirCasillas(i + x, j + y)

                        }
                    }
                }
            }
            else{
                tablero[i][j].descubierta = true
            }
        }
        else if(tablero[i][j].tipo == TipoCuadrado.MINA)
        {
            println("Has seleccionado una mina!")
            perder= true

        }
        return perder
    }

    fun marcarCasilla(i:Int,j:Int)
    {
        if(!tablero[i][j].descubierta)
        {
            tablero[i][j].senialada= !tablero[i][j].senialada
        }

    }

    fun comprobarVictoria():Boolean
    {
        var victoria= false
        var nAux = 0

        for(i in tablero.indices)
        {
            for(j in tablero[i].indices)
            {
                if(tablero[i][j].valor==9 && tablero[i][j].senialada)
                {
                    nAux++
                }
            }
        }
        victoria= nAux==numBombas

        return victoria
    }


    fun imprimirTableroTrampa()
    {
        for(i in tablero.indices)
        {
            for(j in tablero[i].indices)
            {
                print("[${tablero[i][j].valor}]")
            }
            println()
        }
    }

}