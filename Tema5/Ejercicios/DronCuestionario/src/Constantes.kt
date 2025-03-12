class Constantes {

    companion object{

        val CANTIDADDRONESTET = 200
        val CANTIDAD_MAXIMO_DRONES_CUADRANTE = 3
        val CUADRANTE_MINIMO =0
        val CUADRANTE_MAXIMO =3

        fun devolverCantidadDrones():Int{

            return (1..3).random()
        }

    }

}