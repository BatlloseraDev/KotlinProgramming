import java.io.*
import java.util.*

class GestionPeliculasFileWriteReader {

    private val archivo = Constantes.archivo

    fun agregarPelicula(titulo: String, director: String, duracion: String, año: Int) {
        val pelicula = "$titulo, $director, $duracion, $año\n"
        val fileWriter = FileWriter(archivo, true)  //abrimos el fichero en modo añadir
        fileWriter.write(pelicula)
        fileWriter.close()


        /** En Kotlin, puedes definir funciones de orden superior utilizando funciones regulares o lambdas.
         * La estructura use en Kotlin es una función de extensión de la clase Closeable. Se utiliza para asegurarse de que los recursos se cierren correctamente cuando ya no se necesitan. La función use garantiza que un recurso Closeable se cierre automáticamente al salir del bloque use, incluso si ocurre una excepción dentro del bloque.
         * En el contexto de FileWriter(archivo, true).use { ... }, use es un método de extensión que se aplica a cualquier clase que implemente la interfaz Closeable. En este caso, FileWriter es una subclase de OutputStreamWriter, que a su vez implementa Closeable.
         * Entonces, cuando utilizamos FileWriter(archivo, true).use { ... }, estamos creando un nuevo objeto FileWriter, y este objeto se cierra automáticamente al salir del bloque use, asegurando que los recursos asociados con él (como el descriptor del archivo) se liberen adecuadamente. Esto es importante para prevenir pérdidas de memoria y posibles problemas de manejo de archivos.
         * En resumen, la estructura use es una forma conveniente y segura de manejar recursos que deben cerrarse explícitamente en Kotlin, y se utiliza comúnmente con clases que implementan la interfaz Closeable.

        FileWriter(archivo, true).use {
            it.write(pelicula)
        }
        println("Película agregada correctamente.")
        **/
    }

    fun borrarPelicula(titulo: String) {
        val peliculas = leerPeliculas()
        val tituloBuscado = titulo.lowercase(Locale.getDefault())
        var encontrada = false
        val nuevasPeliculas = arrayListOf<String>()
        for (pelicula in peliculas) {
            if (pelicula.lowercase().startsWith(tituloBuscado)) {
                encontrada = true
            } else {
                nuevasPeliculas.add(pelicula)
            }
        }
        if (encontrada) {
            val fileWriter = FileWriter(archivo)
            try {
                fileWriter.write(nuevasPeliculas.joinToString("\n")) //combierte a cadena con un salto de linea cada elemento del array
                println("Película borrada correctamente.")
            } finally {
                fileWriter.close()
            }
        } else {
            println("No se encontró ninguna película con ese título.")
        }
    }

    fun mostrarTodas() {
        val peliculas = leerPeliculas()
        if (peliculas.isNotEmpty()) {
            println("Listado de películas:")
            var index = 0
            for (pelicula in peliculas) {
                println("${index + 1}. $pelicula")
                index++
            }
        } else {
            println("No hay películas para mostrar.")
        }
    }

    private fun leerPeliculas(): List<String> {
        val peliculas = arrayListOf<String>()
        val archivo = File(archivo)
        if (archivo.exists()) {
            var bufferedReader: BufferedReader? = null
            try {
                bufferedReader = BufferedReader(FileReader(archivo))
                var linea: String? = bufferedReader.readLine()
                while (linea != null) {
                    peliculas.add(linea)
                    linea = bufferedReader.readLine()
                }
            } finally {
                bufferedReader?.close()
            }
        }
        return peliculas

    }

}