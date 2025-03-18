package org.example.Modelo

import kotlin.random.Random

object Factoria {

    fun generaPersona() : Persona {
        val nombres = arrayListOf("DAM1","DAW1","ASIR1","SMR1","DAW2","DAM2","ASIR2","SMR2")
        val edad = Random.nextInt(18,100)
        val activo = Random.nextBoolean()
        return Persona(nombres.random(), edad, activo)
    }
}