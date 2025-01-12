class Reloj {

    var hora= 0
        set(value)
        {
            if (value>=24)field=value%24
            else field=value
        }
    var min = 0
        set(value)
        {
            if(value>=60)
            {
                field=value%60
                hora++
            }else field=value
        }
    var seg= 0
        set(value)
        {
            if(value>=60)
            {
                field=value%60
                min++
            }
            else field=value
        }
    var pila= 0

    constructor(){}
    constructor( hora:Int, min:Int, seg:Int, pila:Int)
    {
        this.hora= hora
        this.min= min
        this.seg= seg
        this.pila = pila
    }

    override fun toString(): String {
        return "Son la/s $hora:$min:$seg (una menos en canarias)"
    }

    fun recargarPila(porcentaje:Int)
    {
        pila= porcentaje
    }
}