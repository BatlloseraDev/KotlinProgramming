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

        if(c is CristalPurpura)maestro=true
        cristales.add(c)
    }

    fun quitarCristal(): Cristal?
    {
        var c:Cristal?=null
        var n= 0
        for(cristal in cristales)
        {
            if(cristal is CristalPurpura)
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

    fun devolverEnergia():Int
    {
        var sum= 0
        for (cristal in cristales)
        {
            if(cristal is CristalPurpura) sum+=cristal.energia
        }
        return sum
    }

    fun devolverNCristalesPurpuras():Int{//Simplemente curiosidad por si se da el caso
        var i = 0
        for(cristal in cristales)
        {
            if(cristal is CristalPurpura)
            {
                i++
            }
        }
        return i
    }

    fun quitarCristalNoPurpura()
    {
        var elimino= false
        var cristal: Cristal?=null
        for(c in cristales)
        {
            if(c !is CristalPurpura && !elimino)
            {
                cristal= c
                elimino=true
            }
        }
        if(elimino && cristal!=null)
        {
            cristales.remove(cristal)

        }
    }

    override fun toString(): String {
        return " maestro:$maestro , cristales:\n\t"+
                "${cristales.joinToString("\n\t") }"
    }
}