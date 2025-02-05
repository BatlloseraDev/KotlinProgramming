import kotlin.random.Random

class RutasTuristicas
{
    var nombre = ""
    var lugaresTuristicos = ArrayList<LugarTuristico>()
    var numLugares = Random.nextInt(1, 11)

    companion object{
        var numeroRutas = 0
    }

    constructor()
    {
        this.nombre = "RU${numeroRutas+1}"
        numeroRutas++
    }
    constructor( lugaresTuristicos: ArrayList<LugarTuristico>) {
        this.nombre = "RU${numeroRutas+1}"
        this.lugaresTuristicos = lugaresTuristicos
        numeroRutas++
    }

    constructor( lugaresTuristicos: ArrayList<LugarTuristico>, numLugares: Int) {
        this.nombre = "RU${numeroRutas+1}"
        this.lugaresTuristicos = lugaresTuristicos
        this.numLugares = numLugares
        numeroRutas++
    }

    fun estaTerminada():Boolean
    {
        return lugaresTuristicos.size==numLugares
    }

    fun precioMedio():Double
    {
        var precio = 0.0

        for(i in lugaresTuristicos.indices)
        {
            precio+= lugaresTuristicos[i].precioEntrada
        }

        return precio/lugaresTuristicos.size
    }

    override fun toString(): String {
        return "RutaTuristica(nombre=$nombre,\n" +
                "cantidadLugares=${lugaresTuristicos.size}, \n" +
                "Lugares=[\n ${lugaresTuristicos.joinToString ( "\n\t" )}])"
    }
}