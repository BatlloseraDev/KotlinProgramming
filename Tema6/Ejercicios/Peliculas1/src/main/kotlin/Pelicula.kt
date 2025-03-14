import java.io.Serializable

/**
Una data class en Kotlin es una clase especial que está diseñada principalmente para almacenar datos.
Kotlin genera automáticamente ciertas funciones comunes para las propiedades declaradas en una data class,
lo que hace que trabajar con estos objetos sea más conveniente y conciso.
 */

class Pelicula(val titulo: String, val director: String, val duracion: String, val año: Int):Serializable

