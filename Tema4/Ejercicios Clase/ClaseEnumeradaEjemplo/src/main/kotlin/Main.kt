fun main(args: Array<String>) {
    val díaHoy = DiaDeLaSemana.LUNES

    println("Hoy es ${díaHoy.name}.")
    println("Número de día: ${díaHoy.numeroDeDia}")
    println("¿Es día laborable? ${díaHoy.esDiaLaborable()}")
    println("¿Es fin de semana? ${díaHoy.esFinDeSemana()}")


    var díaBuscado = DiaDeLaSemana.SÁBADO
    if (díaBuscado != null) {
        println("El día ${díaBuscado.name}.")
    }

    println(DiaDeLaSemana.DOMINGO.name)
    println(DiaDeLaSemana.DOMINGO.ordinal)
    println(DiaDeLaSemana.valueOf("LUNES"))
    println(DiaDeLaSemana.entries.first)
    println(DiaDeLaSemana.entries.last)
    println(DiaDeLaSemana.entries.size)
    println(DiaDeLaSemana.values())
    println(DiaDeLaSemana.entries.toTypedArray())

}


