class Alumno {
    var nombre:Nombre = Nombre("Pepe","Garcia","Garcia")
    var edad:Int = 0

    constructor(nombre:Nombre,edad:Int){
        ////
        this.nombre = nombre
        this.edad = edad
    }

    fun presentarse(){
        println("Hola soy el mejor del mundo y me llamo ${this.nombre} y mi edad es $edad")
    }
}