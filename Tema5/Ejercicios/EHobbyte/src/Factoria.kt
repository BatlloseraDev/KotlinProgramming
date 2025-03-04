import kotlin.random.Random

class Factoria {

    companion object{

        //fun generarTablero
        fun generarTablero():Tablero //predefinido
        {
            var t= Tablero()
            for(i in 1..t.longitud)
            {
                t.addQuest(generarQuest())
            }
            return t
        }

        fun generarTablero(l:Int):Tablero //con longitud variable
        {
            var t= Tablero(l)
            for(i in 1..l)
            {
                t.addQuest(generarQuest())
            }
            return t
        }

        //fun generarPersonaje
        fun generarPersonaje(n:String,t:TipoHabilidad):Personaje
        {
            return Personaje(n,t)
        }

        //fun generar quest
        fun generarQuest():Quest
        {
            var prob= Random.nextFloat()
            var esfuerzo= 0
            when
            {
                prob<=Constantes._5TO20_PROB->{
                    esfuerzo=Constantes._5TO20.random()
                }
                prob<=Constantes._25TO40_PROB ->{
                    esfuerzo=Constantes._25TO40.random()
                }
                else->{
                    esfuerzo=Constantes._40TO50.random()
                }
            }

            return  Quest(esfuerzo, TipoHabilidad.entries.random())
        }

    }
}