import kotlin.math.round
import kotlin.math.roundToLong

fun main(args: Array<String>) {
    val radio = pedirRadio()
    println("El Area de la circunferencia es ${areaCircunferencia(radio)}")
    println("El Perimetro de la circunferencia es ${perimetroCircunferencia(radio)}")

}
fun pedirRadio(): Double {
    var x: Double? = null
    do {
        println("Introduce el radio:")
        x = readln().toDoubleOrNull()
    }while(x == null)
    return x
}
fun areaCircunferencia(r:Double):Long{
    /* +++++++++++++++++++++++++++++++++++++++++++++
    *
    *  MIRAR DIFERENCIA
    * */
    return Math.round(Math.PI * r * r)
    //return (Math.PI * r * r).roundToLong()
}
fun perimetroCircunferencia(r:Double):Double{
    return (Math.PI * 2 * r)
}