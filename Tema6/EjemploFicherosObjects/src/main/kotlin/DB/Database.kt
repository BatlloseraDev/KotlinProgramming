package org.example.DB

import org.example.Helpers.PropertiesReader
import org.example.Modelo.Persona
import java.io.*
import java.util.*
import kotlin.collections.ArrayList


object Database {
    //📌 Nombre del archivo binario. Esto debería parametrizarse, por eso lo comentamos y usamos la propiedad de config.properties de resources.
    //const val ARCHIVO_BIN = "./src/main/datos.dat"
    val ARCHIVO_BIN = PropertiesReader.getProperty("ARCHIVO_BIN")

    /**
     * Si append es true se abrirá el archivo para añadir al final, si es falso se sobreescribirá.
     * Pero cuando se añaden varios elementos en diferentes sesiones las cabeceras de los registros son diferentes
     * y fallará la lectura posterior.
     */
    fun guardarPersona(persona: Persona, append: Boolean):Boolean {
        var conseguido = true
        try {
            ObjectOutputStream(FileOutputStream(ARCHIVO_BIN, append)).use { output ->
                output.writeObject(persona) // Guardamos toda la lista de una vez
            }
        } catch (e: IOException) {
            conseguido = false

        }
        return conseguido
    }

    /**
     * Lo corregimos usando la clase que hemos definido abajo, que le quita las cabeceras de scritura.
     */
    fun guardarPersonaCorregido(persona: Persona, append: Boolean):Boolean {
        var conseguido = true
        val archivo = File(ARCHIVO_BIN)
        val append = archivo.exists() && archivo.length() > 0  //Verifica si ya hay datos

        try {
            val outputStream = if (append) {
                ObjectOutputStreamSinCabecera(FileOutputStream(archivo, true)) //Usa la clase personalizada
            } else {
                ObjectOutputStream(FileOutputStream(archivo)) //Primera vez, usa el normal
            }

            outputStream.use { output ->
                output.writeObject(persona)  //Guarda la persona
            }
        } catch (e: IOException) {
            conseguido = false
        }
        return conseguido
    }

    /**
     * Esto devuelve la lista de personas. Lee el archivo registro a registro, pero en los archivos DataObject se pueden guardar objetos
     * por lo que sería más eficiente guardar todo el ArrayList y recuperarlo todo a la vez. Sería como el ejercicio 1; tendríamos un
     * arraylist en esta clase Database que iríamos leyendo, manipulando y guardando de una tacada.
     * Esto, además daría error para el segundo elemento porque ObjectOutputStream agrega un código de cabecera al archivo cada vez que
     * se usa para escribir, lo que hace que la lectura falle si el archivo contiene varias cabeceras de ObjectOutputStream.
     */
    fun cargarPersonas(): ArrayList<Persona> {
        val archivo = File(ARCHIVO_BIN)
        var listaPersonas = ArrayList<Persona>()
        if (archivo.exists()) {
            try {
                ObjectInputStream(FileInputStream(archivo)).use { input ->
                    var salir = false
                    while (!salir) {
                        try {
                            val persona = input.readObject() as Persona //Lee un objeto y lo castea a Persona
                            listaPersonas.add(persona) //Agrega la persona a la lista
                        } catch (e: EOFException) {
                            salir = true //Si llega al final del archivo, salimos del bucle
                        }
                    }
                }
            } catch (e: IOException) {
                e.printStackTrace()
            }
        }
        return listaPersonas
    }

}


/**
 * NEcesaria para corregir lo de las cabeceras.
 */
class ObjectOutputStreamSinCabecera(stream: OutputStream) : ObjectOutputStream(stream) {
    override fun writeStreamHeader() {
        //No escribir la cabecera si ya hay datos en el archivo
        reset()
    }
}