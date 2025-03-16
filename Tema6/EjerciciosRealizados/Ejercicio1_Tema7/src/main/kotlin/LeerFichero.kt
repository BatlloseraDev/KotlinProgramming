import java.io.File
import java.io.FileNotFoundException
import java.util.Scanner


fun muestraFichero(nombreFichero: String?): ArrayList<String>
{
    val f= File(nombreFichero)
    var contenidoFichero= ArrayList<String>()
    try {
        val sc= Scanner(f)
        while(sc.hasNextLine())
        {
            val cad: String= sc.nextLine()
            contenidoFichero.add(cad)
        }

    }catch (ex: FileNotFoundException){
        ex.printStackTrace()
    }
    return contenidoFichero
}