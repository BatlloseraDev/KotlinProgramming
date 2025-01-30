open class Persona {

    var nombre: String
    var edad:Int

    constructor(nombre:String, edad:Int)
    {
        this.nombre= nombre
        this.edad= edad
    }

    open fun frase(){
        println("Hola soy una persona sin genero")
    }

    open fun frase(v:String){
        println(v)
    }

    fun datos(){
        println("Me llamo $nombre y tengo edad $edad")
    }
}