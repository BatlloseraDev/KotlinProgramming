fun main(args: Array<String>) {
    println("Bienvenido a gestión de películas.")
    //val g = GestionPeliculas()
    //val g = GestionPeliculasFileWriteReader()
    val g=GestionarPeliculasSerializable() //1
    var seguir: Boolean = true
    while (seguir) {
        println("\nElige una opción:")
        println("1. Añadir una película")
        println("2. Borrar una película")
        println("3. Mostrar todas las películas")
        println("4. Salir")

        when (readLine()?.toIntOrNull()) {
            1 -> {
                println("Introduce el título:")
                val titulo = readLine() ?: "" //Esta es una expresión de elvis (?:). Si readLine() devuelve null, lo cual podría suceder si ocurre un error de entrada/salida o si el usuario cierra la entrada estándar (por ejemplo, presionando Ctrl+D en la terminal), entonces la expresión "" (una cadena vacía) se utiliza como valor predeterminado.
                println("Introduce el director:")
                val director = readLine() ?: ""
                println("Introduce la duración:")
                val duracion = readLine() ?: ""
                println("Introduce el año:")
                val año = readLine()?.toIntOrNull() ?: 0
                //g.agregarPelicula(titulo, director, duracion, año)
                val pelicula = Pelicula(titulo, director, duracion, año) //1
                g.agregarPelicula(pelicula) //1
            }
            2 -> {
                println("Introduce el título de la película que deseas borrar:")
                val titulo = readLine() ?: ""
                g.borrarPelicula(titulo)
            }
            3 -> g.mostrarTodas()
            4 -> {
                println("Fin")
                seguir = false
            }
            else -> println("Opción no válida, por favor elige un número del 1 al 4.")
        }
    }
}