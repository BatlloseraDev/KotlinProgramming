fun main() {

    var contenedorGalletas = ArrayList<GalletaBase>()


    for(i in 1.. 100)
    {
        contenedorGalletas.add(FactoriaGalletas.crearGalletaAleatoria())
    }
    println("Termine de crear galletas")

}