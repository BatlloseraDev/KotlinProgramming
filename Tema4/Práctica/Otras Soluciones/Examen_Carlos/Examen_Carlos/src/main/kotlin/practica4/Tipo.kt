package practica4

enum class Tipo {
    DRAGON("Dragon"),
    HEROE("Heroe"),
    LUGAR("Lugar");

    val nombre : String

    constructor(nombre : String) {
        this.nombre = nombre
    }

    override fun toString(): String {
        return this.nombre
    }
}