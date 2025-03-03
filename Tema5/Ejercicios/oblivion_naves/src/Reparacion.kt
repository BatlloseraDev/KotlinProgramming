class Reparacion: Ordenes {

    var dron: Nave

    constructor(fecha: String, fila: Int, columna: Int, nave: Nave) : super(fecha, fila, columna) {
        this.dron = nave
        numOrdenes++
    }

    override fun mostrarInfo():String
    {
        return super.mostrarInfo()+"\n\tTipo: reparacion\n\tID Dron afectado:${dron.id} Estado: ${dron.operativo}"
    }

    override fun toString(): String {
        return super.toString()+"\nTipo: reparacion\nDron afectado:${dron.id}\nEstado: ${dron.operativo}"
    }
}