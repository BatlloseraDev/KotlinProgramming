
import java.io.*
import java.util.*

//****************************** Accediendo a los archivos almacenados en './src/main/files' ****************************
//**************** Escribir en un fichero de texto: FORMA 1, usando FileReader/BufferedReader ***************************
fun muestraFichero(nombreFichero: String?) : ArrayList<String> {
    val contenidoFichero = ArrayList<String>()
    var fr: FileReader? = null
    var br: BufferedReader? = null

    try {
        val archivo = File(nombreFichero)
        fr = FileReader(archivo)
        br = BufferedReader(fr)

        var linea: String?
        while (br.readLine().also { linea = it } != null) {
            contenidoFichero.add(linea!!)
        }

    } catch (e: FileNotFoundException) {
        e.printStackTrace()
    } catch (e: IOException) {
        e.printStackTrace()
    } finally {
        try {
            br?.close()
            fr?.close()
        } catch (e: IOException) {
            e.printStackTrace()
        }
    }

    return contenidoFichero
}

//**************** Escribir en un fichero de texto: FORMA 2, usando Scanner ***************************
fun muestraFichero2(nombreFichero: String?) : ArrayList<String> {
    val f = File(nombreFichero)
    var contenidoFichero = ArrayList<String>()
    try {
        val sc = Scanner(f)
        while (sc.hasNextLine()) {
            val cad: String = sc.nextLine()
            contenidoFichero.add(cad)
        }
    } catch (ex: FileNotFoundException) {
        ex.printStackTrace()
    }
    return contenidoFichero
}

//**************** Escribir en un fichero de texto: FORMA 3, usando use, use cierra Scanner y BufferedReader automáticamente. ***************************
fun muestraFichero3(nombreFichero: String): ArrayList<String>  {
    val archivo = File(nombreFichero)
    var contenidoFichero = ArrayList<String>()
    try {
        archivo.useLines { lines -> lines.forEach { contenidoFichero.add(it) } }
    } catch (e: IOException) {
        e.printStackTrace()
    }
    return contenidoFichero
}

//************************************************* Accediendo a los archivos almacenados en resources **************************************************
//**************** Escribir en un fichero de texto: FORMA 4, usando use, use cierra Scanner y BufferedReader automáticamente. ***************************
fun muestraFichero4(nombreFichero: String): ArrayList<String> {
    val contenidoFichero = ArrayList<String>()

    val inputStream = object {}.javaClass.getResourceAsStream("/$nombreFichero")
    if (inputStream != null) {
        val reader = BufferedReader(InputStreamReader(inputStream))
        reader.use { br ->
            var linea: String?
            while (br.readLine().also { linea = it } != null) {
                contenidoFichero.add(linea!!)
            }
        }
    } else {
        println("❌ No se encontró el archivo en resources.")
    }

    return contenidoFichero
}

//**************** Escribir en un fichero de texto: FORMA 5, usando Scanner ***************************
fun muestraFichero5(nombreFichero: String): ArrayList<String> {
    val contenidoFichero = ArrayList<String>()

    val inputStream = object {}.javaClass.getResourceAsStream("/$nombreFichero")
    if (inputStream != null) {
        Scanner(inputStream).use { sc ->
            while (sc.hasNextLine()) {
                contenidoFichero.add(sc.nextLine())
            }
        }
    } else {
        println("❌ No se encontró el archivo en resources.")
    }

    return contenidoFichero
}

//**************** Escribir en un fichero de texto: FORMA 6, usando use, use cierra Scanner y BufferedReader automáticamente. ***************************
fun muestraFichero6(nombreFichero: String): ArrayList<String> {
    val contenidoFichero = ArrayList<String>()

    val inputStream = object {}.javaClass.getResourceAsStream("/$nombreFichero")
    if (inputStream != null) {
        InputStreamReader(inputStream).buffered().useLines { lines ->
            contenidoFichero.addAll(lines)
        }
    } else {
        println("❌ No se encontró el archivo en resources.")
    }

    return contenidoFichero
}
