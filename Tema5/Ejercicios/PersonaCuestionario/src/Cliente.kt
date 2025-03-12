open class Cliente(nombre: String, edad: Int, val email: String) : Persona(nombre, edad) {

    fun obtenerDominio(): String {

        return email.substring(email.indexOf("@") + 1)

    }

}