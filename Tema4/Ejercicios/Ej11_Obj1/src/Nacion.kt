
class Nacion {

    var nombre:String=""
    var gobernador:String=""
    var almacen = ArrayList<Int>() //0.  Oro, 1. Piedra
    var aldeanos= ArrayList<Aldeano>()

    constructor(nombre: String, gobernador: String)
    {
        this.nombre = nombre
        this.gobernador = gobernador
        almacen.addAll(Array<Int>(2){0})
    }


    fun addItem(tipo: Int)
    {
        almacen[tipo]++
    }
}