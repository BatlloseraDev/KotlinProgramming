import kotlin.random.Random

class Constantes {

    companion object{
        val CANTIDADDRONESTET= 200
        val MAXNAVESCUADRANTE = 3
        val MINNAVESCUADRANTE = 1

        val PORCENTAJEROTURA = 0.2;

        fun devolverCantidadDrones():Int
        {
            return (MINNAVESCUADRANTE..MAXNAVESCUADRANTE).random()
        }

        fun devolverNumArea():Int
        {
            return (1..20).random()
        }

        fun devolverAllazgo():TipoAllazgo
        {
            return TipoAllazgo.entries.filter { it != TipoAllazgo.Null }.random()
        }

        fun devolverCantidadObservacion():Int
        {
            return (5..10).random()
        }

        fun devolverReparacionNave():Boolean
        {
            //como next boolean ya es 50% lo genero asi
            return Random.nextBoolean()
        }
    }
}

enum class TipoAllazgo{
    ANIMALES,
    VEGETALES,
    RADIACION,
    Null
}