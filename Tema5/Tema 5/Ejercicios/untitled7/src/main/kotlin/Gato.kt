class Gato: serVivo, animal {
    override var vivo: Boolean = true
    var nombre: String = "Sin nombre"

    override fun estaVivo(valor: Int): Boolean {
       return true
    }

    override fun nace() {

    }

    override fun crece() {

    }

    override fun muere() {

    }

    override fun toString(): String {
        return ("Mi nombre es ${nombre}")
    }

}