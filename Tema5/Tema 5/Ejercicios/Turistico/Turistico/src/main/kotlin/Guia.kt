class Guia {
    var Rutas = ArrayList<RutaTuristica>()
    var cantidadRutas: Int =0


    constructor(c:Int){
        cantidadRutas = c
    }
    fun creandose():Boolean{
        return !(Rutas.size == cantidadRutas)
    }
    fun aniadirRuta(r:RutaTuristica){
        Rutas.add(r)
    }

   /* override fun toString(): String {
        return "Guia(Rutas=$Rutas)"
    }*/
    override fun toString(): String {
        return "Guia(Grupo=$Rutas)"
    }
}