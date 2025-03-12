
fun main() {

    val gerente = Gerente("Carlos", 40, "Gerente", "Ventas")
    val clienteVIP = VIP("Laura", 35, "laura@email.com", "PLATINUM")


    println(gerente.descripcion())
    println(gerente.trabajar())
    println(gerente.gestionar())
    println("Iniciales: ${gerente.obtenerIniciales()}")
    println("Dominio del correo: ${clienteVIP.obtenerDominio()}")
    println(clienteVIP.nivelVIP())

    val empleados = HashSet<Empleado>()
    empleados.add(gerente)
    empleados.add(Empleado("Sofia", 28, "Analista"))
    empleados.add(Empleado("Miguel", 33, "Desarrollador"))

    println("Empleados únicos: ")

    for (empleado in empleados) {
        println(empleado.trabajar())
    }

}

