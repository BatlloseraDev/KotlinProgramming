import kotlin.random.Random

class Ordenador {
    var nombre: String = ""

    //var elecccion = 0
    //var marcador = 0

    constructor(nombre:String){
        this.nombre = nombre
    }

    fun elegir():Int{
        return Random.nextInt(1,4)
    }
}