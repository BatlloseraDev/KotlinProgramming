class Parque: LugarTuristico {

    var numAtracciones =0
    var numJuegos = 0

    constructor()
    {

    }
    constructor(numAtracciones: Int, numJuegos: Int) {
        this.numAtracciones = numAtracciones
        this.numJuegos = numJuegos
    }
    constructor(
        nombre: String,
        precioEntrada: Int,
        tipo: TipoLugar,
        valoracion: Int,
        numAtracciones: Int,
        numJuegos: Int
    ) : super(nombre, precioEntrada, tipo, valoracion) {
        this.numAtracciones = numAtracciones
        this.numJuegos = numJuegos
    }


    override fun mediaCalidad(): Int
    {
        return try{
            numAtracciones/valoracion
        }
        catch (e:Exception)
        {
            0
        }
    }

    override fun toString(): String {
        return "${super.toString()}, Numero Atracciones=$numAtracciones, Numero Juegos=$numJuegos"
    }
}