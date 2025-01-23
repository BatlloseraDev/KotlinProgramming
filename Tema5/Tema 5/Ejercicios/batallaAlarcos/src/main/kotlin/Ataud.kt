class Ataud {
    var muertos = ArrayList<Soldado>()

    fun soldadoMuerto(s:Soldado){
        muertos.add(s)
    }

    fun listarMuertos(){
        println("-------Orden de Muerte ---------")
        for (i in 0 .. (muertos.size-1)){
            println("Muerto ${i+1}: ${muertos[i]}")
        }
    }
}