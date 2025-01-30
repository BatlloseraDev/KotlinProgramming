class Persona {
    var nombre = ""
    var edad = 0

    companion object{
       var contar = 0

    }

    constructor(nombre:String,edad:Int){
        this.nombre = nombre
        this.edad = edad
        contar++
    }
    constructor(){
        contar ++
    }

    override fun toString(): String {
        //return "Persona(nombre='$nombre', edad=$edad)"
        return "hola soy $nombre una persona $contar"
    }

}