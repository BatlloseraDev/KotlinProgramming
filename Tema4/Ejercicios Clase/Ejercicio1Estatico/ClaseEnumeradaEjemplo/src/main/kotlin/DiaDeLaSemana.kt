enum class DiaDeLaSemana(var numeroDeDia:Int) {
    LUNES(1),
    MARTES(2),
    MIÉRCOLES(3),
    JUEVES(4),
    VIERNES(5),
    SÁBADO(6),
    DOMINGO(7);


    fun esDiaLaborable(): Boolean {
        return this != SÁBADO && this != DOMINGO
    }

    fun esFinDeSemana(): Boolean {
        return this == SÁBADO || this == DOMINGO
    }



}