class Adversario: Entidades {

    var maestro= false
    var cristales= ArrayList<Cristal>()

    companion object{
        var num_adversarios= 0
    }

    constructor(){
        this.tipo=TipoEntidad.CRIATURA_ALIENIGENA;
        num_adversarios++
    }

    fun devolverNumCristales():Int{
        return cristales.size
    }

    fun aniadirCristal(c:Cristal){

        if(c.esPurpura())maestro=true
        cristales.add(c)
    }

    fun quitarCristal():Cristal?
    {
        var c:Cristal?=null
        var n= 0
        for(cristal in cristales)
        {
            if(cristal.esPurpura())
            {
                c= cristal
                n++
            }
        }

        if(n==1)
        {
            maestro=false
        }
        if(c!=null)
        {
            cristales.remove(c)
        }
        return c
    }
}