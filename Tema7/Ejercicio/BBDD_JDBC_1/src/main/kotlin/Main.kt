import java.sql.*

fun main(args: Array<String>) {
    val url = "jdbc:mysql://localhost/supermercado"
    val user = "root"
    val password = ""
    var conn: Connection? = null
    var preparedStatement: PreparedStatement?=null
    try {
        // Cargar el driver JDBC
        Class.forName("com.mysql.cj.jdbc.Driver")

        // Establecer la conexión
        conn = DriverManager.getConnection(url, user, password)

        // Crear la sentencia SQL
        val sql = "SELECT cod_grupo, descripcion FROM categorias"

        // Crear el objeto Statement
        val stmt = conn.createStatement()

        // Ejecutar la consulta y obtener los resultados
        val rs = stmt.executeQuery(sql)

        // Procesar los resultados
        while (rs.next()) {
            val cod_grupo = rs.getString("cod_grupo")
            val descripcion = rs.getString("descripcion")
            println("Código de grupo: $cod_grupo, Descripción: $descripcion")
        }
        //ejemplo de PreparedStatement
        // Creamos una sentencia preparada (PreparedStatement) para insertar datos en la tabla
        val query = "INSERT INTO categorias (cod_grupo, descripcion) VALUES (?, ?)"
        preparedStatement = conn.prepareStatement(query)

       // Luego, asignamos los valores que queremos insertar a los parámetros de la sentencia preparada

        preparedStatement.setInt(1, 5) //Cada vez que lo cambies cambia el número, para no producir error
        preparedStatement.setString(2, "Alimentos")

// Ejecutamos la sentencia preparada para insertar los datos en la tabla
        preparedStatement.executeUpdate()

// Finalmente, cerramos la conexión a la base de datos y la sentencia preparada


    } catch (ex: SQLException) {
        ex.printStackTrace()
    } finally {
        // Cerrar la conexión
        try {
            preparedStatement?.close()
            conn?.close()
        } catch (ex: SQLException) {
            ex.printStackTrace()
        }
    }
}
