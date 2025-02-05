open class LugarTuristico {
    var nombre =""
    var precioEntrada = 0 //0-100
    var tipo= TipoLugar.None
    var valoracion = 0 //0-10

    constructor()
    {
    }

    constructor(nombre: String, precioEntrada: Int, tipo: TipoLugar, valoracion: Int) {
        this.nombre = nombre
        this.precioEntrada = precioEntrada
        this.tipo = tipo
        this.valoracion = valoracion
    }


    open fun mediaCalidad(): Int
    {
        //Insertar control de excepciones


        return try{
            precioEntrada/valoracion
        }
        catch (e:Exception)
        {
            0
        }
    }

    override fun toString(): String {
        return "nombre:$nombre, precio:$precioEntrada, tipo:$tipo, valoracion:$valoracion"
    }
}