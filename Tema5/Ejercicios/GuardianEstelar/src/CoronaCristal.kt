import kotlin.random.Random

open class CoronaCristal : Entidades{

    var id=1
    var cristales=ArrayList<Cristal>()
    //como solo tengo una corona de cristal lo manejo aqui
    companion object{
        var numCristales= 0
        var numCristalesPurpura= 0
    }

    constructor()
    {
        this.tipo=TipoEntidad.ARTEFACTO
    }



    fun generarCristal():Cristal
    {
        var randomNum = Random.nextFloat()
        var cristal:Cristal
        if(randomNum<=0.02  && numCristalesPurpura<6)
        {
            numCristales++
            numCristalesPurpura++
            cristal= Factoria.generarCristalPurpura(this)

        }
        else{
            numCristales++
            cristal=Factoria.generarCristalBasico(this)
        }
        cristales.add(cristal)

        return cristal
    }


    fun encontrarCristalesPurpura(): ArrayList<Cristal>
    {
        var cPurpuras = ArrayList<Cristal>()

        for(cristal in cristales)
        {
            if(cristal.cr_color==Colores.PURPURA) cPurpuras.add(cristal)
        }

        return cPurpuras
    }

    fun encontrarNCristalesBasicos(n: Int): ArrayList<Cristal>
    {
        var c = ArrayList<Cristal>()
        var i= 0
        var j = 0
        while(i in 0..<cristales.size && j <n)
        {
            if(cristales[i].cr_color!=Colores.PURPURA)
            {
                c.add(cristales[i])
                j++
            }
            i++
        }

        return c
    }


}