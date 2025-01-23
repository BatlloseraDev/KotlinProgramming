class Prueba {
    var tipo:Especialidad= Especialidad.entries.toTypedArray().random()
    var esfuerzo=0

    constructor(esfuerzo:Int){
        this.esfuerzo = esfuerzo
    }

    override fun toString(): String {
        return "Prueba(tipo=$tipo, esfuerzo=$esfuerzo)"
    }

}