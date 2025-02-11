class Soldado {
    var miGeneral = General()
    var nombre="Desconocido"
    constructor()
    {

    }

    constructor(g:General)
    {
        this.miGeneral=g
    }

    constructor(g: General, n: String) {
        this.miGeneral = g
        this.nombre = n
    }

    override fun toString(): String {
        return "hola $nombre mi general ${miGeneral.nombre}"
    }

}