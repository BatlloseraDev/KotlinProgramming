open class Empleado(nombre: String, edad: Int, val puesto: String) : Persona(nombre, edad), Trabajador {

    override fun trabajar(): String {

        return "$nombre trabaja como $puesto."
    }

    fun obtenerIniciales(): String {

        return nombre.substring(0, 1) + puesto.substring(0, 1)
    }

}
