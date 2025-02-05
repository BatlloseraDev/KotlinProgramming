class Monumento: LugarTuristico
{
    var fechaConstruccion = ""
    var arquitecto = ""

    constructor()
    {

    }
    constructor(fechaConstruccion: String, arquitecto: String) : super() {
        this.fechaConstruccion = fechaConstruccion
        this.arquitecto = arquitecto
    }

    constructor(
        nombre: String,
        precioEntrada: Int,
        tipo: TipoLugar,
        valoracion: Int,
        fechaConstruccion: String,
        arquitecto: String
    ) : super(nombre, precioEntrada, tipo, valoracion) {
        this.fechaConstruccion = fechaConstruccion
        this.arquitecto = arquitecto
    }

    override fun mediaCalidad(): Int
    {
        return try{
            precioEntrada/valoracion
        }
        catch (e:Exception)
        {
            1
        }
    }
    override fun toString(): String {
        return "${super.toString()}, fecha construccion=$fechaConstruccion, arquitecto=$arquitecto"
    }
}