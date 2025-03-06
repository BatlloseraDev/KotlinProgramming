class GuardianEstelar:Entidades {

    var historialEnergia= ArrayList<Int>()
    var cristales= ArrayList<Cristal>()
    var resistencia:Int

    constructor():super(){
        this.tipo=TipoEntidad.PERSONAJE_PRINCIPAL
        this.resistencia= 500
    }


    fun aniadirEnergia(n:Int)
    {
        historialEnergia.add(n)
    }
    fun aniadirCristal(c:Cristal)//siempre va a ser un cristal purpura
    {
        cristales.add(c);
    }
    fun revisarAdversarios(adversarios:ArrayList<Adversario>):Adversario?
    {
        var n= 0
        var maestro:Adversario?= null
        while ((n<=adversarios.size/2 && maestro!=null) || n<adversarios.size && maestro==null ) //al menos siempre mirara la mitad aunque ya haya encontrado a un maestro
        {
            if(adversarios[n].maestro)
            {
                maestro=adversarios[n]
            }
            n++
        }
        return maestro
    }

    fun restarResistencia(n:Int){
        resistencia-=n
    }
    fun devolverNumCristales():Int
    {
        return  cristales.size
    }


}