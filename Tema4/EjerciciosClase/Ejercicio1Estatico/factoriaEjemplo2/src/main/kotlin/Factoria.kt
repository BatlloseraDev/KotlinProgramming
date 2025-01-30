import kotlin.random.Random

class Factoria {
    //Una clase factoria se encarga de crear instancias de una clase determinada.
    //Es un patron de diseño
    companion object {

        fun devolverVehiculo():Vehiculo{
            var i = Random.nextInt(1,4)
            return when (i){
                1 -> {crearBarco()}
                2 -> {crearCoche()}
                3 -> {crearBicicletas()}
                else-> {crearIndeterminado()}
            }
        }

        fun crearBarco(): Vehiculo {
            var tipo=Tipo.BARCO
            var modelo= Modelo.entries.toTypedArray().random()
            var velocidad: Int  = Random.nextInt(1,100)

            return Vehiculo (tipo,modelo,velocidad)
        }

        fun crearCoche(): Vehiculo {
            var tipo=Tipo.COCHE
            var modelo= Modelo.entries.toTypedArray().random()
            var velocidad: Int  = Random.nextInt(1,100)

            return Vehiculo (tipo,modelo,velocidad)
        }

        fun crearBicicletas(): Vehiculo {
            var tipo=Tipo.BICICLETA
            var modelo= Modelo.entries.toTypedArray().random()
            var velocidad: Int  = Random.nextInt(1,100)

            return Vehiculo (tipo,modelo,velocidad)
        }

        fun crearIndeterminado(): Vehiculo {
            var tipo=Tipo.SINDEFINIR
            var modelo= Modelo.SINMODELO
            var velocidad: Int  = 0

            return Vehiculo (tipo,modelo,velocidad)
        }
    }
}