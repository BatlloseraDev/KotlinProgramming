
open class Persona(val nombre: String, val edad: Int) {

    open fun descripcion(): String {

        return "Nombre: ${nombre}, Edad: ${edad}"

    }

}
