open class Mujer(nombre: String, edad: Int, inteligencia:Int) : Persona(nombre, edad) {
    var altura:Int = 0


    override fun frase(){
        println("Hola, tengo genero y soy mujer ")
    }

    fun gustos(){
        println("Me gustan las cosas de mujer")
    }
}