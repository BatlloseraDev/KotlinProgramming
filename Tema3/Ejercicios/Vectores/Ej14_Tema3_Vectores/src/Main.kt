import kotlin.random.Random

fun main() {

    var tablero: Array<Int> = Array(10){0}
    PonerMosca(tablero)
    var seguir=true
    var intento =0
    var maxIntentos= 3
    var ganar= false
    while(seguir && intento<maxIntentos)
    {
        for(i in tablero.indices)
        {
            print("_ ")
        }
        println("\nElije posicion en la que crees que esta la mosca del 0 al ${tablero.size-1}")
        var pos= readln().toInt()
        when(Comprobar(pos, tablero))
        {
            0-> println("No paso nada")
            1->{
                println("Mataste a la mosca\n")
                for (i in tablero.indices)
                {
                    if(i==pos) print("x ")
                    else print("_ ")
                }
                seguir=false
                ganar = true
            }
            2->{
                println("Le diste cerca, la mosca cambió de posicion")
                PonerMosca(tablero)
            }
        }



        if(seguir)
        {
            println("quieres seguir (0) si, (1)no")
            var opc = readln().toInt()
            if(opc==1)
            {
                seguir=false
            }
        }

        intento++
    }
    if(!ganar) println("La mosca se escapó")
}




fun Comprobar(trypos: Int, t: Array<Int>): Int
{
    var hacer= 0// no hace nada
    var posMosca = t.indexOf(1)
    if(trypos== posMosca)
    {
        hacer=1//mato a la mosca
    }

    when(posMosca)
    {
        0->{
            if(trypos == (posMosca+1))
            {
                hacer=2//cambia posicion
            }
        }
        (t.size-1)->{
            if(trypos==(posMosca-1))
            {
                hacer=2//cambia posicion
            }
        }
        else->
        {
            if(trypos==(posMosca+1)||trypos==(posMosca-1))
            {
                hacer=2
            }
        }
    }

    return hacer
}


fun PonerMosca(t: Array<Int>)
{
    var sitioNuevo= false
    var sitio= 0
    while(!sitioNuevo)
    {
        sitio= Random.nextInt(0, t.size)
        when(sitio)
        {
            0->{
                if(t[sitio]!=1 && t[sitio+1]!=1) sitioNuevo=true

            }
            (t.size-1)->{
                if(t[sitio]!=1 && t[sitio-1]!=1) sitioNuevo=true
            }
            else->{
                if(t[sitio]!=1&&t[sitio+1]!=1&&t[sitio-1]!=1)
                {
                    sitioNuevo=true
                }
            }
        }


    }
    for(i in t.indices)
    {
        if(i==sitio) t[i]=1
        else t[i]=0
    }

}