fun main(args: Array<String>) {

    var tet = Tet()
    var tierra = Array(Constantes.CUADRANTE_MAXIMO){Array(Constantes.CUADRANTE_MAXIMO){Cuadrante()}}


    for (i in Constantes.CUADRANTE_MINIMO ..< Constantes.CUADRANTE_MAXIMO){

        for (j in Constantes.CUADRANTE_MINIMO..< Constantes.CUADRANTE_MAXIMO){

            tierra[i][j]= Factoria.crearCuadrante(i,j,tet)

        }

    }

}
