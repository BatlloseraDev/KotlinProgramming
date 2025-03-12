
class VIP(nombre: String, edad: Int, email: String, val nivel: String) : Cliente(nombre, edad, email) {

    fun nivelVIP(): String {

        return "Cliente VIP de nivel ${nivel.toLowerCase()}"

    }

}