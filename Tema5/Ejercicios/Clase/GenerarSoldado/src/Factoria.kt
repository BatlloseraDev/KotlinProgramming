class Factoria {
    companion object{

        fun crearGeneralConEjercito(nommbre:String, cantidadSoldado: Int): General
        {
            var nazi1=General(nommbre)
            for (i in 1..cantidadSoldado)
            {
                nazi1.aniadirSoldado(Soldado(nazi1,"PEPE${i}"))
            }
            return nazi1
        }

    }

}