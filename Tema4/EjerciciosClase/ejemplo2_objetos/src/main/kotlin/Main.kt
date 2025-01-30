fun main() {

    val coche1 = Coche("Toyota", "Corolla", 2022, 180, "Azul")
    println(coche1)
    coche1.acelerar()


    val coche2 = Coche("Honda", "Civic", 2023, 200, "Rojo")
    println(coche2)
    // Intentar asignar valores no válidos
    coche2.velocidadMaxima = -50
    coche2.color = ""
    println(coche2)
}