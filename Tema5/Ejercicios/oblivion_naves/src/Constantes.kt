class Constantes {

    companion object{
        val CANTIDADDRONESTET= 200
        val MAXNAVESCUADRANTE = 3
        val MINNAVESCUADRANTE = 1

        fun devolverCantidadDrones():Int
        {
            return (MINNAVESCUADRANTE..MAXNAVESCUADRANTE).random()
        }
    }
}