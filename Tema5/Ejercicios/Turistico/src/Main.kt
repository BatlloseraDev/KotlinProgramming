val CANTIDADGUIAS = 2

fun main() {

    var simulacion = ArrayList<GuiasTuristicos>()

    for(i in 0 until CANTIDADGUIAS)
    {
        simulacion.add(Factoria.GenerarGuia())
        println(simulacion[i])
    }



}