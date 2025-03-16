package Helpers


data class Pelicula(
    var titulo: String,
    var director: String,
    var duracion: Int,
    var anio: Int

)

enum class PeliculaAtrib(var value:Any){
    TITULO("Titulo"),
    DIRECTOR("Director"),
    DURACION(0),
    ANIO(0)
}

