class Sabor {

    var nombre:String= ""
    var gradoDulzura: Double = 0.0
    var precioCoste: Double = 0.0

    constructor(nombre: String, gradoDulzura: Double, precioCoste:Double)
    {
        this.nombre = nombre
        this.gradoDulzura = gradoDulzura
        this.precioCoste = precioCoste
    }
    constructor()
    {

    }

    override fun toString(): String {
        return "nombre: $nombre, grado dulzura: $gradoDulzura, precio coste: $precioCoste"
    }
}