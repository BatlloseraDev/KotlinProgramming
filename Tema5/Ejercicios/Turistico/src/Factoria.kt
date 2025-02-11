import kotlin.random.Random

class Factoria {
    companion object{

        fun GenerarGuia():GuiasTuristicos
        {
            var guia = GuiasTuristicos()
            guia.nombre= "Guia" //Me daba pereza generar un random de nombres
            var n= Random.nextInt(1,guia.numRutas+1)
            for(i in 1..n)
            {
                guia.rutas.add(GenerarRutaAleatoria())
            }
            return guia
        }


        fun GenerarRutaAleatoria():RutasTuristicas
        {
            var ruta= RutasTuristicas()
            var n= Random.nextInt(1,ruta.numLugares+1)
            for(i in 1.. n)
            {
                var opc= (1..3).random()
                when(opc)
                {
                    1->{
                        ruta.aniadirLugar(CrearMuseo(i))
                    }
                    2->{
                        ruta.aniadirLugar(CrearParque(i))
                    }
                    3->{
                        ruta.aniadirLugar(CrearMonumento(i))
                    }
                }
            }
            return ruta
        }


        fun CrearMuseo(num : Int): Museo
        {
            var nombre = "MU$num"
            var precioEntrada = Random.nextInt(1,101)
            var tipo = TipoLugar.Museo
            var valoracion = Random.nextInt(1,11)
            var tematicaMuseo = TematicaMuseo.entries.filter { it!=TematicaMuseo.None }.random()
            var numSalas = Random.nextInt(1,11)
            return Museo(nombre,precioEntrada,tipo,valoracion,tematicaMuseo,numSalas)
        }
        fun CrearParque(num : Int): Parque
        {
            var nombre = "PA$num"
            var precioEntrada = Random.nextInt(1,101)
            var tipo = TipoLugar.Parque
            var valoracion = Random.nextInt(1,11)
            var numAtracciones= Random.nextInt(1,11)
            var numJuegos = Random.nextInt(1,11)

            return Parque(nombre,precioEntrada,tipo,valoracion,numAtracciones,numJuegos)
        }
        fun CrearMonumento(num:Int): Monumento
        {
            var nombre = "MO$num"
            var precioEntrada = Random.nextInt(1,101)
            var tipo = TipoLugar.Monumento
            var valoracion = Random.nextInt(1,11)
            var fechaConstruccion = "${Random.nextInt(1,32)}/${Random.nextInt(1,13)}/${Random.nextInt(1500,2012)}"
            var arquitecto = Arquitectos.entries.random().toString()
            return Monumento(nombre,precioEntrada,tipo,valoracion,fechaConstruccion,arquitecto)
        }

    }

}

enum class Arquitectos
{
    FrankLloydWright, LeCorbusier, LudwigMiesVanDerRohe, ZahaHadid, FrankGehry
}