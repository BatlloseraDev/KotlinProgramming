import java.io.File
import java.io.IOException
import java.nio.file.Files
import java.nio.file.Path
import java.nio.file.Paths
import java.nio.file.StandardCopyOption
import kotlin.io.path.Path

/**
 * Métodos para probar la clase File que contiene métodos que me permiten tratar los archivos a nivel de sistema operativo
 * sin importar su formato ni su contenido.
 */
object FileHelper {
    /**
     * El siguiente ejemplo, comprueba si un determinado archivo existe y en caso de no existir, lo crea.
     */
    fun crearArchivo(pathName: String):Boolean {
        var codError = true
        val file = File(pathName)
        if (!file.exists()){
            file.createNewFile()
        } else {
            codError = false
        }
        return codError
    }

    /**
     * El siguiente ejemplo, comprueba si un determinado archivo existe, y en el caso de que exista, comprueba si es o no un directorio. En el caso que sea un directorio muestra por pantalla un listado con todos los archivos que contiene un directorio:
     */
    fun leerDirectorio(pathName: String) : ArrayList<String> {
        var listado = ArrayList<String>()
        val file = File(pathName)
        if (file.exists() && file.isDirectory) {
            val listaArchivos = file.list()
            for (nombreArchivo in listaArchivos) {
                listado.add(nombreArchivo)
            }
        }
        return listado
    }

    /**
     * El siguiente programa de ejemplo comprueba si un determinado archivo existe o no mediante exists() y, en caso de que exista, lo elimina mediante delete(). Si intentáramos borrar un archivo que no existe obtendríamos un error.
     */
    fun eliminarFichero(pathName: String) : Boolean {
        val fichero = File(pathName)
        var codError = true
        if (fichero.exists()) {
            codError = fichero.delete()
        } else {
            codError = false
        }
        return codError
    }

    /**
     * Podemos ver otra implementación usando la clase Path, la cual es una clase que representa una ruta en el sistema de archivos. Proporciona métodos para manipular y examinar la ruta, y es utilizado por las clases que operan en el sistema de archivos, como Files.
     * La clase Files proporciona métodos estáticos para trabajar con ficheros y directorios.
     */
    fun eliminarFicheroPath(pathName: String) : Boolean {
        var target = Path(pathName)
        var booEliminado = Files.deleteIfExists(target)
        return booEliminado
    }


    /**
     * El siguiente método de ejemplo, muestra como copiar un fichero de un directorio a otro:
     */
    fun copiar(sourcePathName: String, targetPathName: String) : Int{
        try {
            var source: Path = Paths.get(sourcePathName)
            var target= Paths.get(targetPathName)

            Files.copy(source, target, StandardCopyOption.REPLACE_EXISTING)
            return 0
        } catch (ex: IOException) {
            return -1
        }

    }

    /**
     * Obtenemos información detallada del fichero que nos pasen en el argumento, si existe.
     */
    fun obtenerInformacionFichero(ruta: String):FileInfo? {
        val file = File(ruta)
        var info = null
        if (file.exists()) {
            return FileInfo(
                nombre = file.name,
                ruta = file.absolutePath,
                tamano = file.length(),
                esDirectorio = file.isDirectory,
                sePuedeLeer = file.canRead(),
                sePuedeEscribir = file.canWrite(),
                existe = file.exists()
            )
        }
        return info

    }
}
