class Factoria {

    companion object{


        fun generarCristalPurpura(Padre:CoronaCristal):Cristal
        {
            var id = Padre.id+Cristal.num_cristales
            return Cristal(id,Padre,Colores.PURPURA,Costantes.generar_Energia())
        }

        fun generarCristalBasico(Padre: CoronaCristal): Cristal
        {
            var id = Padre.id+Cristal.num_cristales
            return Cristal(id, Padre,Costantes.generar_ColorBasico())
        }


    }
}