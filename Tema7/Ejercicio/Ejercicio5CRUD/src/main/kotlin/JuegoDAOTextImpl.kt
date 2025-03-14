import java.io.*

class JuegoDAOTextImpl(private val filePath: String) : JuegoDAO {
    override fun existeJuegoPorIdUsuario(userId: Int): Boolean {
        val file = File(filePath)
        if (!file.exists()) return false

        BufferedReader(FileReader(filePath)).use { reader ->
            var line: String?
            while (reader.readLine().also { line = it } != null) {
                val fields = line!!.split(",")
                if (fields[0].toInt() == userId) {
                    return true
                }
            }
        }
        return false
    }

    override fun actualizarGanado(userId: Int) {
        val tempFile = File.createTempFile("tempfile", ".tmp")
        BufferedReader(FileReader(filePath)).use { reader ->
            BufferedWriter(FileWriter(tempFile)).use { writer ->
                var line: String?
                while (reader.readLine().also { line = it } != null) {
                    val fields = line!!.split(",")
                    if (fields[0].toInt() == userId) {
                        val updatedLine = "${fields[0]},${fields[1].toInt() + 1},${fields[2].toInt() + 1}"
                        writer.write(updatedLine)
                    } else {
                        writer.write(line!!)
                    }
                    writer.newLine()
                }
            }
        }
        tempFile.renameTo(File(filePath))
    }

    override fun actualizarPerdido(userId: Int) {
        val tempFile = File.createTempFile("tempfile", ".tmp")
        BufferedReader(FileReader(filePath)).use { reader ->
            BufferedWriter(FileWriter(tempFile)).use { writer ->
                var line: String?
                while (reader.readLine().also { line = it } != null) {
                    val fields = line!!.split(",")
                    if (fields[0].toInt() == userId) {
                        val updatedLine = "${fields[0]},${fields[1].toInt() + 1},${fields[2]}"
                        writer.write(updatedLine)
                    } else {
                        writer.write(line!!)
                    }
                    writer.newLine()
                }
            }
        }
        tempFile.renameTo(File(filePath))
    }

    override fun insertarEstadisticasJuego(userId: Int, partidas: Int, ganadas: Int) {
        BufferedWriter(FileWriter(filePath, true)).use { writer ->
            val newLine = "$userId,$partidas,$ganadas"
            writer.write(newLine)
            writer.newLine()
        }
    }
}
