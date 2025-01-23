import java.time.LocalDateTime
import java.time.format.DateTimeFormatter

class Ordenes {
    companion object{
        var total:Int=0
    }
    val dateTime = LocalDateTime.now().format(DateTimeFormatter.ofPattern("MMM dd yyyy, hh:mm:ss a"))
    var completada: Boolean = false
    var x: Int = 0
    var y: Int = 0
    var reparacion = IntArray(2, { 0 }) //posicion 1 numero de dron, posicion 2 estado 0 false 1 true
    var reconocimiento  = IntArray(2, { 0 }) //indicando el área a reconocer – un nº entre 1 y 20 y un campo que indique que se ha encontrado en ese área: animales-->1, vegetales--> o radiación-->3).

    constructor(x:Int, y:Int, numero:Int, e: Int){
        this.x = x
        this.y= y
        reparacion[0]= numero
        reparacion[1]=e
        total ++
    }
    constructor(x:Int, y:Int,a:Int){
        reconocimiento[0]=a
        total++
    }
    fun setReparacion(p:Int, e:Int){
        reparacion[0]=p
        reparacion[1]=e
    }
    fun setReconocimiento(a:Int){
        reconocimiento[1]=a
    }
    fun getDronOrden():Int{
        return reparacion[0]
    }

    override fun toString(): String {
        return "Ordenes(dateTime='$dateTime', completada=$completada, x=$x, y=$y, reparacion=${reparacion.contentToString()}, reconocimiento=${reconocimiento.contentToString()})"
    }

}