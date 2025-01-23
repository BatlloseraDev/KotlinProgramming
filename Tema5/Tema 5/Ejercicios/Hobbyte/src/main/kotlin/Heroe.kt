class Heroe {
    var nombre=""
    var capacidad = (1..50).random()
    var fuerza = (500..1000).random()
    var tipo:Especialidad
    var historial = ArrayList<Prueba>()

    companion object{
        var perdidas = 0
    }

    constructor(nombre: String, tipo: Especialidad) {
        this.nombre = nombre
        this.tipo = tipo
    }

    fun aniadirPruebaalHistorial(p:Prueba){
        historial.add(p)
    }

    override fun toString(): String {
        return "Heroe(nombre='$nombre', capacidad=$capacidad, fuerza=$fuerza, tipo=$tipo, historial=$historial)"
    }

}

enum class Especialidad{
    Magia, Fuerza, Habilidad
}