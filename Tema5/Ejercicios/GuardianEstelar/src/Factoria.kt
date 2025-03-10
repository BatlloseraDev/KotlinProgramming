class Factoria {

    companion object{


        fun generarCristalPurpura(Padre:CoronaCristal):Cristal
        {
            var id = Padre.id+Padre.cristales.size
            return CristalPurpura(id,Padre,Costantes.generar_Energia())
        }

        fun generarCristalBasico(Padre: CoronaCristal): Cristal
        {
            var id = Padre.id+Padre.cristales.size
            return Cristal(id, Padre,Costantes.generar_ColorBasico())
        }

        fun generarAdversario(): Adversario
        {
            return Adversario()
        }

        fun generarGuardian():GuardianEstelar
        {
            return GuardianEstelar()
        }

        fun generarCorona():CoronaCristal
        {
            return CoronaCristal()
        }
    }
}