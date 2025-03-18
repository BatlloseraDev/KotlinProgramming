package org.example
import org.example.DB.Database
import org.example.Helpers.Colores
import org.example.Modelo.Factoria


// 🏁 Función principal para probar el código
fun main() {

    // 📝 Crear y guardar datos en el archivo binario
    val personaGuardar = Factoria.generaPersona()

    if (Database.guardarPersona(personaGuardar,true)){
        println("✅ ${Colores.GREEN}Datos generados y guardados correctamente: ${personaGuardar}${Colores.RESET}")
    } else {
        println("❌${Colores.RED} Error al escribir en el archivo.${Colores.RESET}")
    }

    // 🔄 Cargar datos desde el archivo binario
    val personasCargadas = Database.cargarPersona()
    if (personasCargadas.isNotEmpty()) {
        println("📂 ${Colores.BLUE}Datos cargados desde el archivo: ${Colores.CYAN}${Database.ARCHIVO_BIN}")
        personasCargadas.forEachIndexed() { index , personaCargada ->
            println("${Colores.MAGENTA}🟢 Persona $index${Colores.RESET}")
            println("\t👤 ${Colores.GREEN}Nombre: ${Colores.YELLOW}${personaCargada.nombre}")
            println("\t🎂 ${Colores.GREEN}Edad: ${Colores.YELLOW}${personaCargada.edad}")
            println("\t✅ ${Colores.GREEN}Activo: ${Colores.YELLOW}${personaCargada.activo}${Colores.RESET}")
        }
    } else {
        println("❌${Colores.RED} No hay datos guardados.${Colores.RESET}")
    }
}
