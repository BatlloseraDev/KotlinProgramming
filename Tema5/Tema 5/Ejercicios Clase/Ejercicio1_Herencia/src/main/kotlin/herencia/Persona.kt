package herencia

open class Persona {
    var nombre:String =""
    var edad: Int =0
    var altura: Double =0.0

    constructor(nombre:String, edad:Int, altura:Double){
        this.nombre = nombre
        this.edad=edad
        this.altura = altura
    }

    fun saludar(){
        println("Soy una persona")
    }
}