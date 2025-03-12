open class Entidad(var nombre: String, var x: Int, var y: Int) {

    constructor() : this("Desconocido", 0, 0)

    constructor(nombre: String) : this(nombre, 0, 0)



    open fun mostrarPosicion() {

        println("\$nombre está en (\$x, \$y)")

    }

}
