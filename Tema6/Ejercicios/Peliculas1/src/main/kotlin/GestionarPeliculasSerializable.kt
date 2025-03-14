import java.io.*
import java.util.*


class GestionarPeliculasSerializable {
    private val archivo = "peliculas1.lolo"

    fun agregarPelicula(pelicula: Pelicula) {
        //https://old.chuidiang.org/java/ficheros/ObjetosFichero.php
        val fileOutputStream = FileOutputStream(archivo, true)
        val objectOutputStream = ObjectOutputStream(fileOutputStream)
        objectOutputStream.writeObject(pelicula)
        //objectOutputStream.writeObject(pelicula)
        objectOutputStream.close()
        fileOutputStream.close()
        println("Película agregada correctamente.")
    }

    fun borrarPelicula(titulo: String) {
        val peliculas = leerPeliculas()
        val tituloBuscado = titulo.lowercase(Locale.getDefault())
        var encontrada = false
        val nuevasPeliculas = arrayListOf<Pelicula>()
        for (pelicula in peliculas) {
            if (pelicula.titulo.toLowerCase().startsWith(tituloBuscado)) {
                encontrada = true
            } else {
                nuevasPeliculas.add(pelicula)
            }
        }
        if (encontrada) {
            guardarPeliculas(nuevasPeliculas)
            println("Película borrada correctamente.")
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
                println("${index + 1}. ${pelicula.titulo} - ${pelicula.director} (${pelicula.año}), ${pelicula.duracion}")
                index++
            }
        } else {
            println("No hay películas para mostrar.")
        }
    }

    private fun leerPeliculas(): List<Pelicula> {
        val peliculas = arrayListOf<Pelicula>()
        val archivo = File(archivo)
        var p = Pelicula("","","",0);
        if (archivo.exists()) {
            var objectInputStream: ObjectInputStream? = null
            try {

                objectInputStream = ObjectInputStream(FileInputStream(archivo))
                while (true) {
                    p = objectInputStream.readObject() as Pelicula
                    println(p)
                    peliculas.add(p)
                }
            } catch (e: EOFException) {
                // Se alcanzó el final del archivo
            } finally {
                objectInputStream?.close()
            }
        }
        return peliculas
    }

    private fun guardarPeliculas(peliculas: List<Pelicula>) {
        val fileOutputStream = FileOutputStream(archivo)
        val objectOutputStream = ObjectOutputStream(fileOutputStream)
        for (pelicula in peliculas) {
            objectOutputStream.writeObject(pelicula)
        }
        objectOutputStream.close()
    }
}