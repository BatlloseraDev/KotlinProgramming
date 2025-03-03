open class Ordenes {
    var fecha= ""
    var fila= 0
    var columna= 0
    var completada=false

    companion object{
        var numOrdenes= 0
    }

    constructor(fecha: String, fila: Int, columna: Int) {
        this.fecha = fecha
        this.fila = fila
        this.columna = columna
        numOrdenes++
    }

    fun cambiarEstado(){
        if(!completada)completada!=completada
    }

    open fun mostrarInfo():String{
        return "Orden con fecha: $fecha para fila y columna: $fila$columna"
    }

    override fun toString(): String {
        return "Orden con fecha: $fecha\npara fila y columna: $fila$columna"
    }

}