import java.awt.Dimension
val DIMENSIONES = 5

fun main() {

    //el tamanio del  tablero indica la dificultad que va tener el juego de la mosca
    var tab = Tablero(DIMENSIONES)
    var jugar = true

    while(jugar)
    {
        var opc = ControlErrores.pedirPorTecladoInt("Ingresa que quieres hacer" +
                "\n\t1. Intentar Golpear a la Mosca" +
                "\n\t2. Ver tablero(eso es trampa)" +
                "\n\t3. Salir","Dato ingresado erroneo, por favor vuelvelo a intentar")
        when(opc)
        {
            1-> {
                //pedir posicion
                var pos= PedirPos("Selecciona pos para x e y\n Elije para el: ", "Error", "Fuera de los rangos");
                when(tab.comprobarHostia(pos))
                {
                    0-> {
                        println("No pasó nada")
                    }
                    1->{
                        println("Asustaste a la mosca")
                        tab.asustar()
                    }
                    2->{
                        println("Golpeaste a la mosca y perdió una vida")
                        tab.GolpearMosca()
                    }
                }
            }
            2->{
                //mostrar tablero
                tab.imprimirTableroConVision()
            }
            3->{
                println("Saliendo del programa")
                jugar=false
            }
            else->{
                println("Opcion no valida.")
            }
        }

        if(!tab.ComprobarViva())
        {
            println("Mataste a la mosca :c, has ganado")
            jugar=false
        }
        //check las vidad para acabar el juego.
    }


}

fun PedirPos(texto :String, textoError: String,textoErrorSeleccion: String): IntArray
{

    var pos= IntArray(2)


    for(i in 1..2 )
    {
        var d = -1
        while(d !in 0 until DIMENSIONES)
        {
            d= ControlErrores.pedirPorTecladoInt(texto + i,textoError)
            if(d !in 0 until DIMENSIONES)
            {
                println(textoErrorSeleccion);
            }
        }

        pos[i-1]=d
    }

    return  pos
}