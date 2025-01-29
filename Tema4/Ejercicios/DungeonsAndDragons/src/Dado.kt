import kotlin.random.Random


class Dado {
    var nCaras=6


    companion object
    {
        var minCaras= 6;
        var maxCaras= 12;
    }

    constructor() //como el dado es el que decide en su momento de creacion el nCaras hago un random
    {
        this.nCaras=Random.nextInt(minCaras, maxCaras+1);
    }

    constructor(nCaras: Int)
    {
        this.nCaras=nCaras
    }


    fun tirarDado():Int
    {
        return Random.nextInt(1,nCaras+1)
    }

    override fun toString(): String {
        return nCaras.toString()
    }
}