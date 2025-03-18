/**
 * Data class usada en FileHelper para que el método correspondiente devuelva la información de un archivo.
 * @see FileHelper.obtenerInformacionFichero
 */
data class FileInfo(
    val nombre: String,
    val ruta: String,
    val tamano: Long,
    val esDirectorio: Boolean,
    val sePuedeLeer: Boolean,
    val sePuedeEscribir: Boolean,
    val existe: Boolean
)