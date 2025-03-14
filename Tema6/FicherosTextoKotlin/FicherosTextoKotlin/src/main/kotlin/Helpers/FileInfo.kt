package Helpers

data class FileInfo(
    val nombre: String,
    val ruta: String,
    val tamano: Long,
    val esDirectorio: Boolean,
    val sePuedeLeer: Boolean,
    val sePuedeEscribir: Boolean,
    val existe: Boolean
)