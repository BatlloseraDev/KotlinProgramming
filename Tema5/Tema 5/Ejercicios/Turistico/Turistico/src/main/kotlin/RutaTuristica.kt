class RutaTuristica {
    var Lugares = ArrayList<LugaresTuristicos>()
    var nombre: String=""

    var cantidadLugares:Int = 0

    companion object{
        var cantidadCreados: Int=0
    }
    constructor(c:Int, n:String){
        cantidadCreados++
        cantidadLugares=c
        nombre = n
    }
    fun creandose():Boolean{
        return (!(Lugares.size == cantidadLugares))
    }
    fun aniadirLugar(l:LugaresTuristicos){
        Lugares.add(l)
    }
    fun precioMedio():Int{
        var valor = 0
        for (i in 0 until Lugares.size){
            valor += Lugares.get(i).precio
        }
        return (valor/Lugares.size)
    }

    /*override fun toString(): String {
        return "RutaTuristica(nombre='$nombre', cantidadLugares=$cantidadLugares, Lugares=$Lugares )"
    }*/
    override fun toString(): String {
        return "Ruta Turistica(nombre='$nombre', cantidad=$cantidadLugares, Lugares=$Lugares )"
    }

}