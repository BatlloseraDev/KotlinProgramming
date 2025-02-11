class ConjuntodeGatos {
    var conjunto = ArrayList<Gato> ()

    constructor(g:Gato){
        conjunto.add(g)
    }

    override fun toString(): String {
        return conjunto[0].toString()
    }
}