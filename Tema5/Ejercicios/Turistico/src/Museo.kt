class Museo: LugarTuristico
{
    var tematica =TematicaMuseo.None
    var numSalas = 0

    constructor()
    {
    }

    constructor(tematica: TematicaMuseo, numSalas: Int) {
        this.tematica = tematica
        this.numSalas = numSalas
    }

    constructor(
        nombre: String,
        precioEntrada: Int,
        tipo: TipoLugar,
        valoracion: Int,
        tematica: TematicaMuseo,
        numSalas: Int
    ) : super(nombre, precioEntrada, tipo, valoracion) {
        this.tematica = tematica
        this.numSalas = numSalas
    }


    override fun mediaCalidad():Int
    {
        return try{
            precioEntrada/numSalas
        }
        catch (e:Exception)
        {
            0
        }
    }
    override fun toString(): String {
        return "${super.toString()}, tematica=$tematica, salas=$numSalas"
    }

}