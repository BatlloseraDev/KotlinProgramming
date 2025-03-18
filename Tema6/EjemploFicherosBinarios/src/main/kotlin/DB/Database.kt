package org.example.DB

import org.example.Helpers.PropertiesReader
import org.example.Modelo.Persona
import java.io.*

object Database {
    //📌 Nombre del archivo binario. Esto debería parametrizarse, por eso lo comentamos y usamos la propiedad de config.properties de resources.
    //const val ARCHIVO_BIN = "./src/main/datos.dat"
    val ARCHIVO_BIN = PropertiesReader.getProperty("ARCHIVO_BIN")


    /**
     * Si append es true se abrirá el archivo para añadir al final, si es falso se sobreescribirá.
     */
    fun guardarPersona(persona: Persona, append: Boolean):Boolean {
        var conseguido = true
        try {
            DataOutputStream(FileOutputStream(ARCHIVO_BIN, append)).use { output ->
                output.writeUTF(persona.nombre)  //Guarda el nombre (String)
                output.writeInt(persona.edad)    //Guarda la edad (Int)
                output.writeBoolean(persona.activo)  //Guarda el estado (Boolean)
            }

        } catch (e: IOException) {
            conseguido = false

        }
        return conseguido
    }

    fun cargarPersona(): ArrayList<Persona> {
        val archivo = File(ARCHIVO_BIN)
        var listaPersonas = ArrayList<Persona>()
        if (archivo.exists()) {
            try {
                DataInputStream(FileInputStream(ARCHIVO_BIN)).use { input ->
                    while (input.available() > 0) {
                        val nombre = input.readUTF()  //Lee el nombre (String) del archivo.
                        val edad = input.readInt()    //Lee la edad (Int) del archivo.
                        val activo = input.readBoolean()  //Lee el estado (Boolean) del archivo.
                        val p = Persona(nombre, edad, activo)
                        listaPersonas.add(p)
                    }
                }
            } catch (e: IOException) {
                e.printStackTrace()
            }
        }
        return listaPersonas
    }

}