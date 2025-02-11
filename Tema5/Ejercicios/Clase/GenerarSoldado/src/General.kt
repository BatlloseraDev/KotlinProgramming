open class General {
    var nombre:String="G1"
    var ejercito = ArrayList<Soldado>()
    //var ejercito = Array<Soldado>(5){Soldado()}

    constructor()
    {

    }

    constructor(nombre: String) {
        this.nombre = nombre
    }


    fun aniadirSoldado(soldado: Soldado){
       ejercito.add(soldado)

        //ejercito[0]= soldado
    }

    fun aniadirEjercito(ejercito:ArrayList<Soldado>)
    {
        //this.ejercito=ejercito
    }


    fun dameSoldado():Soldado?
    {

        return try {
            ejercito[0]
        }
        catch (e:Exception){
            null
        }

    }

}