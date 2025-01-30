open class Hombre(nombre: String, edad: Int) : Persona(nombre, edad) {
    var estupidez: Int = 0

    override fun frase(){
        println("Hola, tengo genero y soy hombre")
    }

    fun gustos(){
        println("Me gustan las cosas de hombre")
    }
}