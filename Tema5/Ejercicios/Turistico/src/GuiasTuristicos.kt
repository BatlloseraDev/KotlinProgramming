import kotlin.random.Random

class GuiasTuristicos {

    var nombre= ""
    var rutas = ArrayList<RutasTuristicas>()
    var numRutas = Random.nextInt(1, 11)

    constructor()
    {
    }
    constructor(nombre: String, rutas: ArrayList<RutasTuristicas>) {
        this.nombre = nombre
        this.rutas = rutas
    }

    constructor(nombre: String, rutas: ArrayList<RutasTuristicas>, numRutas: Int) { //si se quiere especificar el numero de rutas
        this.nombre = nombre
        this.rutas = rutas
        this.numRutas = numRutas
    }

    fun tieneTodasLasRutas() :Boolean
    {
        return rutas.size==numRutas
    }

    override fun toString(): String {
        return "Guia(Rutas=[\n ${rutas.joinToString("\n")}\n])"
    }
}