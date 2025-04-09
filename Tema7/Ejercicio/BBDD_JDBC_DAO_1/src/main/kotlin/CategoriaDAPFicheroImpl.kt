import java.io.BufferedReader
import java.io.File

class CategoriaDAOImpl :CategoriaDAO {

    var nombreFichero= "./src/main/kotlin/categorias.txt"
    var file= crearFichero(nombreFichero)

    fun crearFichero(ruta: String): File
    {
        var file= File(ruta)
        if(!file.exists()){
            file.createNewFile()
        }
        return file
    }



    override fun getCategoriaByCodigo(codigo: Int): Categoria?{

        val categorias = getAllCategorias()
        var categoriaDeseada : Categoria? = null
        categorias.forEach {
            if(it.codigo == codigo){
                categoriaDeseada = it
            }
        }
       return categoriaDeseada
    }
    override fun getAllCategorias(): List<Categoria>{
        val f= file
        var contenidoFichero= ArrayList<Categoria>()
        val bufferedReader: BufferedReader = f.bufferedReader()
        bufferedReader.readLines().forEach {
            lines -> var cotenido = lines.split(",")
            contenidoFichero.add(Categoria(cotenido[0].toInt(), cotenido[1]))
        }

        return contenidoFichero
    }

    override fun insertCategoria(categoria: Categoria): Boolean{
        val f= file
        var linea : String=""
        var categorias = getAllCategorias()
        var encotrada = false
        categorias.forEach {
           if(it.codigo == categoria.codigo) encotrada = true
        }
        if(!encotrada){

            linea+="${categoria.codigo},${categoria.descripcion}"
            f.appendText(linea  + System.lineSeparator());
        }

        return !encotrada
    }
    override fun updateCategoria(categoria: Categoria): Boolean{
        val f= file
        var nuevoContenidoFichero= ArrayList<String>()
        var encotrada = false
        val bufferedReader: BufferedReader = f.bufferedReader()
        bufferedReader.readLines().forEach {
                lines -> var contenido = lines.split(",")
            if(contenido[0].toInt()==categoria.codigo){

                nuevoContenidoFichero.add("${categoria.codigo},${categoria.descripcion}")
                encotrada = true
            }
            else{
                nuevoContenidoFichero.add(lines)
            }
        }

        for (i in nuevoContenidoFichero.indices){
            if(i==0) f.writeText(nuevoContenidoFichero[i] + System.lineSeparator())
            else f.appendText(nuevoContenidoFichero[i]  + System.lineSeparator())
        }


        return encotrada
    }



    override fun deleteCategoria(codigo: Int): Boolean{
        val f= file
        var nuevoContenidoFichero= ArrayList<String>()
        var encotrada = false
        val bufferedReader: BufferedReader = f.bufferedReader()
        bufferedReader.readLines().forEach {
                lines -> var contenido = lines.split(",")
            if(contenido[0].toInt()==codigo){

                encotrada = true
            }
            else{
                nuevoContenidoFichero.add(lines)
            }
        }

        for (i in nuevoContenidoFichero.indices){
            if(i==0) f.writeText(nuevoContenidoFichero[i] + System.lineSeparator())
            else f.appendText(nuevoContenidoFichero[i]  + System.lineSeparator())
        }


        return encotrada
    }


}