import java.io.File
import java.io.IOException


//Escribir en un fichero una sola line
fun addFichero(nombreFichero:String, texto:String, sobreescribir:Boolean){

    val fichero= File(nombreFichero)

    try{
        if(sobreescribir){
            fichero.writeText(texto+System.lineSeparator()) //sobreescribe
        }
        else{
            fichero.appendText(texto+System.lineSeparator()) //añade al final
        }
    }catch (e: IOException){
        println("Error al escribir en el fichero")
    }

}

fun addFichero(nombreFichero:String, texto:ArrayList<String>, sobreescribir:Boolean) {
    val fichero = File(nombreFichero)
    try {

        for(i in texto.indices)
        {
            if(i==0 && sobreescribir) fichero.writeText(texto[i] + System.lineSeparator())
            else fichero.appendText(texto[i] + System.lineSeparator())

        }

    }catch (e:IOException){
        println("Error al escribir en el fichero")

    }
}