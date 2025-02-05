fun main() {

    //el tamanio del  tablero indica la dificultad que va tener el juego de la mosca
    var tab = Tablero(5)

    tab.imprimirTableroConVision()

    var golpe= IntArray(2){0}


    when(tab.comprobarHostia(golpe))
    {
        0-> {
            println("No pasó nada")
        }
        1->{
            println("Asustaste a la mosca")
        }
        2->{
            println("Golpeaste a la mosca")
        }
    }



}