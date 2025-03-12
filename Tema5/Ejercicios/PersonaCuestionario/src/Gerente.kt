class Gerente(nombre: String, edad: Int, puesto: String, val departamento: String) : Empleado(nombre, edad, puesto) {

    fun gestionar(): String {

        return "$nombre gestiona el departamento de ${departamento.toUpperCase()}"

    }

}