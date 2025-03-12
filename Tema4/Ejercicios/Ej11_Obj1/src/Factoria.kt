import kotlin.random.Random

class Factoria {

    companion object{


        fun devolverAldeano(naciones: ArrayList<Nacion>): Aldeano?
        {
            var nRandom = (0..100).random()
            var aldeano:Aldeano?=null
            when
            {
                nRandom<=Constantes.PORCENTAJES[Constantes.NOMBRENACIONES.indexOf("ESPAÑA")]->{

                    var pos= Constantes.NOMBRENACIONES.indexOf("ESPAÑA")
                    aldeano= Aldeano(Constantes.VIDASALDEANOS[pos],naciones[pos])

                }
                nRandom<=Constantes.PORCENTAJES[Constantes.NOMBRENACIONES.indexOf("BIZANTINO")]->{
                    var pos= Constantes.NOMBRENACIONES.indexOf("BIZANTINO")
                    aldeano= Aldeano(Constantes.VIDASALDEANOS[pos],naciones[pos])
                }
            }

            return aldeano
        }

        fun devolverNacion(nombre:String,gobernador:String):Nacion
        {
            return Nacion(nombre,gobernador)
        }

        fun devolverMina(tipoMina: TipoMina,cantidad:Int): Mina
        {
            return Mina(tipoMina,cantidad)
        }
    }

}