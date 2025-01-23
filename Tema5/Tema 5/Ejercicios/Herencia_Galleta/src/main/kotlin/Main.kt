fun main(){
    val cantidadGalletas = 5

    println("Creando galletas de forma aleatoria:")
    for (i in 1..cantidadGalletas) {

        val tipoGalleta = (0..3).random()
        val galleta = when (tipoGalleta) {
            0 -> FabricaGalletas.crearGalleta()
            1 -> FabricaGalletas.crearGalletaEspecial()
            2 -> FabricaGalletas.crearGalletaRellena()
            else -> FabricaGalletas.crearGalletaRellenaParticular()
        }

        //faltan metodo string
        println("Galleta $i: $galleta")
    }
}