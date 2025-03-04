class Quest {

    var esfuerzo= 0
    var tipoPrueba: TipoHabilidad
    var completada=false


    constructor(esfuerzo: Int, tipoPrueba:TipoHabilidad)
    {
        this.esfuerzo= esfuerzo
        this.tipoPrueba= tipoPrueba
    }

    override fun toString(): String {
        return "La prueba es de tipo: $tipoPrueba y de coste $esfuerzo"
    }

    fun completar()
    {
        completada=true
    }
}