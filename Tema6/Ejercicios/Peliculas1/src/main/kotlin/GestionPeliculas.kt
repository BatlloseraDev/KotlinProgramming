import java.io.File

class GestionPeliculas {

    private val archivo = "peliculas.txt"



    fun agregarPelicula(titulo: String, director: String, duracion: String, año: Int) {
        val pelicula = "$titulo, $director, $duracion, $año"
        File(archivo).appendText("$pelicula\n")
        println("Película agregada correctamente.")
    }

    fun borrarPelicula(titulo: String) {
        val peliculas = leerPeliculas()
        val peliculaBorrada = peliculas.find { it.startsWith(titulo, ignoreCase = true) }
        if (peliculaBorrada != null) {
            val nuevasPeliculas = peliculas.filterNot { it == peliculaBorrada }
            File(archivo).writeText(nuevasPeliculas.joinToString("\n"))
            println("Película borrada correctamente.")
        } else {
            println("No se encontró ninguna película con ese título.")
        }
    }

    fun mostrarTodas() {
        val peliculas = leerPeliculas()
        if (peliculas.isNotEmpty()) {
            println("Listado de películas:")
            peliculas.forEachIndexed { index, pelicula ->
                println("${index + 1}. $pelicula")
            }
        } else {
            println("No hay películas para mostrar.")
        }
    }

    private fun leerPeliculas(): List<String> {
        return if (File(archivo).exists()) {
            File(archivo).readLines()
        } else {
            emptyList()
        }
    }
}