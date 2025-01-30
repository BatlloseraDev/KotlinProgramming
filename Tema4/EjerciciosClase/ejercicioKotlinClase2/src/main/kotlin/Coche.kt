class Coche() {
    var marca: String = ""

    var modelo: String = ""
        set(value) {
            field = value.trim()
        }
        get() {
            return field
        }

    var año: Int = 0
        set(value) {
            field = if (value < 1900) 1900 else value
        }

    // Constructor secundario para inicializar los atributos
    constructor(marca: String, modelo: String, año: Int) {
        this.marca = marca
        this.modelo = modelo
        this.año = año
    }

    // Función para acelerar el coche
    fun acelerar(velocidad: Int) {
        println("Acelerando a $velocidad km/h")
    }

    // Función para frenar el coche
    fun frenar() {
        println("Frenando el coche")
    }

    // Función para obtener la antigüedad del coche
    fun obtenerAntiguedad(): Int {
        val añoActual = 2023 // Cambia esto al año actual
        return añoActual - año
    }
}


