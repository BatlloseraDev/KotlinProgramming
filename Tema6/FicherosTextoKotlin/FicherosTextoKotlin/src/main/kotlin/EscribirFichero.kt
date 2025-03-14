import java.io.BufferedWriter
import java.io.File
import java.io.FileWriter
import java.io.IOException


//**************** Escribir en un fichero de texto: FORMA 1, usando FileWriter ***************************
fun addFichero(nombreFichero : String, info : String , sobreescribir: Boolean){
    var fichero: File? = null //Un objeto de la clase FILE, representa el
    //nombre de un fichero o de un directorio.
    //Sus métodos servirán para interrogar al
    //sistema sobre todas las características del mismo.
    var fs: FileWriter? = null
    //Un flujo de la clase 'FileWriter', permite escribir
    //caracteres en un fichero.
    //Constructores posibles:
    //  - FileWriter(nombre:String);
    //  - FileWriter(nombre:String, añadir:Boolean);
    //      --> Si añadir == true => permite añadir elementos al fichero.
    //  - FileWriter(File fichero);
    try{
        if (sobreescribir) {
            fs = FileWriter(nombreFichero)
            fs.write(info+ "\r\n")//Recordamos que en Güindous el fin de línea es ENTER + SALTO DE LINEA
        } else  //Si no queremos sobreescribir se añade al final.
        {
            fs = FileWriter(nombreFichero, true) //Añadimos al final (true).
            fs.write(info+ "\r\n")
        }
        fs.close()
    } catch (e: IOException) {
        e.printStackTrace()
    }
}

//**************** Escribir en un fichero de texto: FORMA 2, Uso de writeText() y appendText() en lugar de FileWriter. ***************************
fun addFichero2(nombreFichero : String, info : String , sobreescribir: Boolean){
    val fichero = File(nombreFichero)

    try {
        if (sobreescribir) {
            fichero.writeText(info + System.lineSeparator())
        } else {
            fichero.appendText(info + System.lineSeparator()) //Añadir contenido sin reescribir
        }
    } catch (e: IOException) {
        println("Error al escribir en el fichero: ${e.message}")
    }
}


//********************************* Usando el fichero incluido en 'resources' ****************************************

/**
 * Para acceder a archivos dentro de resources en un proyecto Kotlin, necesitas cargarlos correctamente
 * usando classLoader.getResource o getResourceAsStream. Sin embargo, los archivos dentro de resources
 * generalmente no son modificables en tiempo de ejecución, ya que están dentro del classpath. Si realmente
 * necesitas escribir en ellos, debes copiar el archivo a un directorio accesible (temp, home, etc.) y modificarlo ahí.
 */
//**************** Escribir en un fichero de texto: FORMA 3, usando FileWriter (resources) ***************************
fun addFichero3(nombreFichero: String, info: String, sobreescribir: Boolean) {
    try {
        val resourceURL = object {}.javaClass.classLoader.getResource(nombreFichero)
        val file = File(resourceURL.toURI())  // Convertimos la URL en un archivo
        val fw = FileWriter(file, !sobreescribir)  //true para append, false para sobrescribir

        BufferedWriter(fw).use { bw ->
            bw.write(info + System.lineSeparator())  // Uso de System.lineSeparator() para compatibilidad
        }
    } catch (e: IOException) {
        e.printStackTrace()
    }
}


//**************** Escribir en un fichero de texto: FORMA 4, Uso de writeText() y appendText() en lugar de FileWriter. ***************************
fun addFichero4(nombreFichero: String, info: String, sobreescribir: Boolean) {
    try {
        val resourceURL = object {}.javaClass.classLoader.getResource(nombreFichero)
        val file = File(resourceURL.toURI())
        if (sobreescribir) {
            file.writeText(info + System.lineSeparator())
        } else {
            file.appendText(info + System.lineSeparator())
        }
    } catch (e: IOException) {
        e.printStackTrace()
    }
}

