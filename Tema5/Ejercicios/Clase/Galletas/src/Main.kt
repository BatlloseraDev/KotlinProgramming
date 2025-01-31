fun main() {

    var contenedorGalletas = ArrayList<GalletaBase>()


    for(i in 1.. 100)
    {
        contenedorGalletas.add(FactoriaGalletas.crearGalletaAleatoria())
    }
    //contenedorGalletas.forEach{println(it)}

    var numGalleta= 0
    while (numGalleta !in 1..100)
    {
        numGalleta = ControlErrores.pedirPorTecladoInt("Ingresa un numero de 1 a 100", "aprende a introducir numeros") -1
    }




    println(contenedorGalletas[numGalleta])

}