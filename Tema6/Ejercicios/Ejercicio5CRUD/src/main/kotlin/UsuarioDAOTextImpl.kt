import java.io.*

class UsuarioDAOTextImpl(private val filePath: String) : UsuarioDAO {

    override fun getUsuarioByEmail(email: String): Usuario? {
        val file = File(filePath)
        if (!file.exists()) return null

        BufferedReader(FileReader(filePath)).use { reader ->
            var line: String?
            while (reader.readLine().also { line = it } != null) {
                val fields = line!!.split(",")
                if (fields[0] == email) {
                    val rol = when (fields[5]) {
                        "ESTANDAR" -> Rol.ESTANDAR
                        "ADMINISTRADOR" -> Rol.ADMINISTRADOR
                        "AMBOS" -> Rol.AMBOS
                        else -> throw IllegalArgumentException("Rol desconocido: ${fields[5]}")
                    }
                    return Usuario(fields[0], fields[1], fields[2], fields[3].toInt(), fields[4], rol)
                }
            }
        }
        return null
    }

    override fun getIdByEmail(email: String): Int? {
        val file = File(filePath)
        if (!file.exists()) return null

        BufferedReader(FileReader(filePath)).use { reader ->
            var line: String?
            while (reader.readLine().also { line = it } != null) {
                val fields = line!!.split(",")
                if (fields[0] == email) {
                    return fields[0].toInt()
                }
            }
        }
        return null
    }

    override fun getAllUsuarios(): List<Usuario> {
        val usuarios = mutableListOf<Usuario>()
        val file = File(filePath)
        if (!file.exists()) return usuarios

        BufferedReader(FileReader(filePath)).use { reader ->
            var line: String?
            while (reader.readLine().also { line = it } != null) {
                val fields = line!!.split(",")
                val rol = when (fields[5]) {
                    "ESTANDAR" -> Rol.ESTANDAR
                    "ADMINISTRADOR" -> Rol.ADMINISTRADOR
                    "AMBOS" -> Rol.AMBOS
                    else -> throw IllegalArgumentException("Rol desconocido: ${fields[5]}")
                }
                usuarios.add(Usuario(fields[0], fields[1], fields[2], fields[3].toInt(), fields[4], rol))
            }
        }
        return usuarios
    }

    override fun insertUsuario(usuario: Usuario): Boolean {
        BufferedWriter(FileWriter(filePath, true)).use { writer ->
            val rolString = when (usuario.rol) {
                Rol.ESTANDAR -> "ESTANDAR"
                Rol.ADMINISTRADOR -> "ADMINISTRADOR"
                Rol.AMBOS -> "AMBOS"
            }
            val newUserLine = "${usuario.email},${usuario.nombre},${usuario.apellido},${usuario.edad},${usuario.password},$rolString"
            writer.write(newUserLine)
            writer.newLine()
        }
        return true
    }

    override fun updateUsuario(usuario: Usuario): Boolean {
        val tempFile = File.createTempFile("tempfile", ".tmp")
        BufferedReader(FileReader(filePath)).use { reader ->
            BufferedWriter(FileWriter(tempFile)).use { writer ->
                var line: String?
                while (reader.readLine().also { line = it } != null) {
                    val fields = line!!.split(",")
                    if (fields[0] == usuario.email) {
                        val updatedUserLine = "${usuario.email},${usuario.nombre},${usuario.apellido},${usuario.edad},${usuario.password},${usuario.rol}"
                        writer.write(updatedUserLine)
                    } else {
                        writer.write(line!!)
                    }
                    writer.newLine()
                }
            }
        }
        tempFile.renameTo(File(filePath))
        return true
    }
    override fun updateRole(usuario: Usuario): Boolean {
        val tempFile = File.createTempFile("tempfile", ".tmp")
        BufferedReader(FileReader(filePath)).use { reader ->
            BufferedWriter(FileWriter(tempFile)).use { writer ->
                var line: String?
                while (reader.readLine().also { line = it } != null) {
                    val fields = line!!.split(",")
                    if (fields[0] == usuario.email) {
                        val updatedUserLine = "${fields[0]},${fields[1]},${fields[2]},${fields[3]},${fields[4]},${usuario.rol}"
                        writer.write(updatedUserLine)
                    } else {
                        writer.write(line!!)
                    }
                    writer.newLine()
                }
            }
        }
        tempFile.renameTo(File(filePath))
        return true
    }
    override fun deleteUsuario(usuario: Usuario): Boolean {
        val tempFile = File.createTempFile("tempfile", ".tmp")
        BufferedReader(FileReader(filePath)).use { reader ->
            BufferedWriter(FileWriter(tempFile)).use { writer ->
                var line: String?
                while (reader.readLine().also { line = it } != null) {
                    val fields = line!!.split(",")
                    if (fields[0] != usuario.email) {
                        writer.write(line!!)
                        writer.newLine()
                    }
                }
            }
        }
        tempFile.renameTo(File(filePath))
        return true
    }
}
