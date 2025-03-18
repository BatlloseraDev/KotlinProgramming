import java.io.File
import java.io.FileInputStream
import java.io.FileOutputStream
import java.util.*

/**
 * Gestionará un archivo de propiedades editable ubicado en ./src/main.
 */
object PropertiesEditable {
    private const val CONFIG = "./src/main/config.properties"
    private val properties = Properties()
    private val file = File(CONFIG)

    init {
        if (file.exists()) {
            FileInputStream(file).use { properties.load(it) }
        }
    }
    /**
     * Si realmente necesitas modificar el archivo de propiedades en tiempo de ejecución,
     * debes almacenarlo en una ruta accesible para escritura, como la carpeta user.dir
     * o una ubicación específica en el sistema de archivos. Esto lo crea en el directorio ./src/main.
     */
    fun setProperty(key: String, value: String) {
        properties.setProperty(key, value)
        FileOutputStream(file).use { properties.store(it, null) }
    }

    fun getProperty(key: String): String {
        return properties.getProperty(key)
    }

}