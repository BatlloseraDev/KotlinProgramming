import java.util.*
import kotlin.random.Random

class Reconocimiento : Ordenes {

    var area= 0
    var encontrado=TipoAllazgo.Null

    constructor(fecha: String, fila: Int, columna: Int) : super(fecha, fila, columna) {
        this.area= Constantes.devolverNumArea()
        numOrdenes++
    }


    override fun mostrarInfo(): String {
        return super.mostrarInfo()+"\n\tTipo: Reconocimiento\n\tArea reconocimiento: $area, Allazgo: ${encontrado.toString().lowercase()
            .replaceFirstChar { if (it.isLowerCase()) it.titlecase(Locale.getDefault()) else it.toString() }}"
    }

    override fun toString(): String {
        return super.toString()+"\nTipo: Reconocimiento\nArea reconocimiento: $area\nAllazgo: ${encontrado.toString().lowercase()
            .replaceFirstChar { if (it.isLowerCase()) it.titlecase(Locale.getDefault()) else it.toString() }}"
    }

    fun cambiarEncontrado(tA: TipoAllazgo)
    {
        encontrado= tA
    }
}