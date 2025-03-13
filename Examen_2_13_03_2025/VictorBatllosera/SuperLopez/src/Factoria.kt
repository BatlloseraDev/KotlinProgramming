class Factoria {

    companion object{

        fun generarChupeteNegro(id:Int):Chupete
        {
            return ChupeteNegro(id)
        }

        fun generarChupeteBasico(id:Int):Chupete
        {
            var color: ColorChupete= ColorChupete.Azul
            do{
                var colorRandom = ColorChupete.values().random()
                if(colorRandom!=ColorChupete.Negro){
                    color= colorRandom
                }

            }while (colorRandom==ColorChupete.Negro)//no es eficiente usuaria el it para generar uno descartando el negro pero creo que no se puede usar en el examen

            return Chupete(color,id)
        }


        fun generarVillano():Villano
        {
            return Villano()
        }

        fun generarSuperLopez():SuperLopez{
            return SuperLopez()
        }

        fun generarChupeteUnico():ChupeteUnico
        {
            return ChupeteUnico()
        }

    }



}