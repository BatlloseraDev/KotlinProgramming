class Dado {
    private var numeroCaras : Int
    constructor(numeroCaras : Int) {
        this.numeroCaras = numeroCaras
    }

    fun lanzarDado() : Int {
        return (6..numeroCaras).random()
    }
}