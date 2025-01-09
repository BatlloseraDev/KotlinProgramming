class Gato {
    var color : String = ""
    var raza : String = ""
    var edad : Int = 0
    var sexo : String = ""
    var peso : Int = 0
    var nombre : String = ""

    constructor(nombre: String, color: String, raza: String, edad: Int, sexo: String, peso: Int) {
        this.nombre = nombre
        this.color = color
        this.raza = raza
        this.edad = edad
        this.sexo = sexo
        this.peso = peso
    }

    fun maullar() {
        println("Miauuu")
    }
    fun ronronear() {
        println("mrrrr")
    }
    fun comer(comida: String) {
        if (comida == "pescado") {
            println("¡Gracias por el pescado!")
        } else {
            println("No quiero esa comida.")
        }
    }
    /* HORROR HORROR HORROR MODULAR
    fun pelear(sexo1: String, sexo2: String) {
        if (sexo1.equals(sexo2)) {
            println("Garfield y Tom se pelean.")
        }
    }*/
    fun pelear(g: Gato) {
        if (this.sexo == "macho" && g.sexo == "macho") {
            println("${this.nombre} se pelea con ${g.nombre}.")
        }
        else {
            println("No se pelean.")
        }
    }

    fun pelear(g: String) {
        if (this.sexo == "macho" && g == "macho") {
            println("${this.nombre} se pelea.")
        }
        else {
            println("No se pelean.")
        }
    }
}