open class Persona {
    open var nombre: String = ""
    constructor(nombre:String,x:Int,y:Int){
        this.nombre = nombre+"_"+ x + "_" + y
    }

    override fun toString(): String {
        return "Persona(nombre='$nombre')"
    }

}