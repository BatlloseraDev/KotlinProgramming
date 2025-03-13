open class Monigote {

    var tipoMonigote = TipoMonigote.PersonajeSecundario //por defecto todos son esto

    open fun pintarse(){
        println("Hola soy un $tipoMonigote")
    }
}