class Animal {
    var nombre=""
    var tipo = ""
    var edad= 0
    companion object
    {
        var cantidadDeAnimalesCreados = 0
    }

    constructor(){
        cantidadDeAnimalesCreados++
    }

    constructor(nombre:String,tipo:String,edad:Int)
    {
        this.nombre = nombre
        this.tipo= tipo
        this.edad= edad
        cantidadDeAnimalesCreados++
    }
    constructor(nombre: String)
    {
        this.nombre = nombre
        cantidadDeAnimalesCreados++
    }

    override fun toString(): String {
        return "Animal(nombre='$nombre', tipo='$tipo')"
    }
    fun setNombre1(nombre: String)
    {
        this.nombre=nombre
    }
    fun getNombre1():String
    {
        return nombre
    }

    fun setTipo1(tipo: String)
    {
        this.tipo=tipo
    }
    fun getTipo1():String
    {
        return tipo
    }

    fun setEdad1(edad: Int)
    {
        this.edad=edad
    }
    fun getEdad1():Int
    {
        return edad
    }
}