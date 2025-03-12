class Robot(nombre: String, x: Int, y: Int) : Entidad(nombre, x, y), Movible {

    constructor(nombre: String) : this(nombre, 0, 0)


    override fun mover(direccion: String) {

        when (direccion.lowercase()) {
            "arriba" -> y -= 1
            "abajo" -> y += 1
            "izquierda" -> x -= 1
            "derecha" -> x += 1
        }
        println(" $nombre se movió hacia $direccion a ($x, $y)")

    }



    override fun mostrarPosicion() {

        println("[Robot] $nombre está en ($x, $y)")

    }

}