fun main() {
    val RED = "\u001B[31m"
    val GREEN = "\u001B[32m"
    val YELLOW = "\u001B[33m"
    val BLUE = "\u001B[34m"
    val MAGENTA = "\u001B[35m"
    val CYAN = "\u001B[36m"
    val WHITE = "\u001B[37m"
    val RESET = "\u001B[0m"  //Restablecer color a normal

    var borrado : Boolean = true
    var pathOtro = "./src/main/files/otro.txt"
    var path = "./src/main/files"
    var pathCopiado = "./src/main/files/copiado.txt"
    var pathNuevo = "./src/main/files/nuevo.txt"

    println("${BLUE}**************** Propiedades del sistema *****************${RESET}")
    println("${YELLOW}🏗️  Versión del SO: ${BLUE}${System.getProperty("os.name")}")
    println("${YELLOW}🏗️  Versión del SO: ${BLUE}${System.getProperty("os.version")}")
    println("${YELLOW}🏗️  Arquitectura del SO: ${BLUE}${System.getProperty("os.arch")}")
    println("${YELLOW}👤 Usuario: ${BLUE}${System.getProperty("user.name")}")
    println("${YELLOW}🏠 Carpeta de usuario: ${BLUE}${System.getProperty("user.home")}")
    println("${YELLOW}📂 Directorio de trabajo: ${BLUE}${System.getProperty("user.dir")}")
    println("${YELLOW}🔗 Separador de archivos: ${BLUE}${System.getProperty("file.separator")}")
    println("${YELLOW}🔗 Separador de línea: ${BLUE}${System.getProperty("line.separator")}")
    println("${YELLOW}🌍 Idioma del sistema: ${BLUE}${System.getProperty("user.language")}")
    println("${YELLOW}⚙️  Codificación predeterminada: ${BLUE}${System.getProperty("file.encoding")}")
//    println("${YELLOW}🕒 Zona horaria: ${BLUE}${System.getProperty("user.timezone")}")
//    println("${YELLOW}☕ Versión de Java: ${BLUE}${System.getProperty("java.version")}")
//    println("${YELLOW}🏢 Proveedor de Java: ${BLUE}${System.getProperty("java.vendor")}")
//    println("${YELLOW}📂 Directorio de instalación de Java: ${BLUE}${System.getProperty("java.home")}${RESET}")
    //Para ver todas las propiedades del sistema:
    //System.getProperties().forEach { (key, value) -> println("$key = $value") }

    println()
    println()
    println("${BLUE}**************** Manipulación de ficheros *****************${RESET}")
    if (FileHelper.crearArchivo(pathOtro)) {
        println("${GREEN}📝 Archivo creado con éxito: $pathOtro ✅${RESET}")
    } else {
        println("${RED}❌ Fallo al crear el archivo: $pathOtro${RESET}")
    }

    val lista = FileHelper.leerDirectorio(path)
    println("${BLUE}📁 Archivos en $path:${RESET}")
    lista.forEach {
        println("\t${GREEN}📄 $it${RESET}")
    }

    if (FileHelper.eliminarFicheroPath(pathOtro)) {
        println("${GREEN}🟢 El archivo $pathOtro ha sido eliminado correctamente.${RESET}")
    } else {
        println("${RED}🔴 El archivo $pathOtro no existe.${RESET}")
    }

    if (FileHelper.eliminarFichero(pathOtro)) {
        println("${GREEN}🟢 El archivo $pathOtro ha sido eliminado correctamente.${RESET}")
    } else {
        println("${RED}🔴 El archivo $pathOtro no existe.${RESET}")
    }


    val infoFile = FileHelper.obtenerInformacionFichero(pathCopiado)
    if (infoFile != null) println("${CYAN}📝 $infoFile${RESET}")

    if (FileHelper.copiar(pathNuevo, pathCopiado) == 0){
        println("${GREEN}🟢 El archivo $pathNuevo ha sido copiado correctamente en $pathCopiado.${RESET}")
    } else {
        println("${RED}🔴 Ha habido algún error al copiar $pathNuevo en $pathCopiado.${RESET}")
    }

    var usuario = PropertiesReader.getProperty("user")
    var puerto = PropertiesReader.getProperty("port")
    println("${BLUE}Usuario: ${GREEN} $usuario${RESET}")
    println("${BLUE}Puerto: ${GREEN} $puerto${RESET}")
    PropertiesEditable.setProperty("user","DAW2")
    PropertiesEditable.setProperty("port","8080")
    usuario = PropertiesEditable.getProperty("user")
    puerto = PropertiesEditable.getProperty("port")
    println("${BLUE}Usuario: ${GREEN} $usuario${RESET}")
    println("${BLUE}Puerto: ${GREEN} $puerto${RESET}")

}