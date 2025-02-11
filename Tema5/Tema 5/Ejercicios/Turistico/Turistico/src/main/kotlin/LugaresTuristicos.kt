open class LugaresTuristicos {
    var nombre:String = ""
    var precio:Int = 0
    var valoracion = 0

    constructor(){}

    constructor(n:String, p:Int,v:Int){
        nombre = n
        precio = p
        valoracion = v
    }
    open fun mediaCalidad():Int{
        try{
            return precio/valoracion
        }catch (e:Exception){
            return 0
        }
    }

    override fun toString(): String {
        return " nombre='$nombre', precio=$precio, valoracion=$valoracion"
    }

}