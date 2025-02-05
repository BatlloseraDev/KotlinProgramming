class Tablero {


    var dimensiones= 3;
    var m = Array<IntArray>(dimensiones){IntArray(dimensiones)}
    var mosca = Mosca()

    constructor()
    {
        ponerMoscaTablero(mosca.MoveMosca(dimensiones))
    }
    constructor(dimensiones: Int)
    {
        this.dimensiones = dimensiones
        m = Array<IntArray>(dimensiones){IntArray(dimensiones)}
        ponerMoscaTablero(mosca.MoveMosca(dimensiones))
    }

    fun asustar()
    {
        limpiarTablero()
        ponerMoscaTablero(mosca.MoveMosca(dimensiones))
    }

    private fun limpiarTablero()
    {
        for(i in m.indices)
        {
            for(j in m.indices)
            {
                m[i][j]=0
            }
        }
    }

    fun ponerMoscaTablero(pos:IntArray)
    {
        m[pos[0]][pos[1]]= 1
    }


    fun imprimirTableroConVision()
    {
        for(i in m.indices)
        {
            for(j in m.indices)
            {
                print("[${m[i][j]}]")
            }
            println()
        }
    }

    fun imprimirTableroOfuscado()
    {
        for(i in m.indices)
        {
            for(j in m.indices)
            {
                print("[x]")
            }
            println()
        }
    }



    fun comprobarHostia(h: IntArray):Int
    {
        var situacion = 0 // 0 es nada, 1 es asustar , 2 es golpear
        //comprobar la hostia del jugador.
        if(m[h[0]][h[1]]==1)
        {
            //golpea a la mosca
            situacion=2
        }
        else if(checkAdyacente(h))
        {
            //asusta a la mosca

            situacion= 1
        }


        return situacion
    }

    private fun checkAdyacente(pos: IntArray):Boolean
    {
        var cerca = false

        for(i in -1..1)
        {
            var deltaX = i + pos[0]


            for(j in -1..1)
            {
                var deltaY = j + pos[1]


                if(deltaX in 0 until dimensiones && deltaY in 0 until dimensiones )// me aseguro no salirme de la matriz
                {
                    if(m[deltaX][deltaY]==1)
                    {
                        cerca=true
                    }
                }
            }

        }

        return cerca
    }

    fun GolpearMosca(){
        limpiarTablero()
        ponerMoscaTablero(mosca.MoveMosca(dimensiones))
        mosca.perderVida()

    }

    fun ComprobarViva():Boolean
    {
        return mosca.vida>0
    }
}