import java.util.*

/**
 * Leerá la configuración de /resources. Esta carpeta no se podrá modificar en tiempo de ejecución.
 * Si necesitamos parámetros editables se puede hacer como se indica en PropertiesEditable.
 */
object PropertiesReader {
    private val CONFIG = "config.properties"
    private val properties = Properties()

    init {
        val file = this::class.java.classLoader.getResourceAsStream(CONFIG)
        properties.load(file)
    }

    fun getProperty(key: String): String = properties.getProperty(key)

}