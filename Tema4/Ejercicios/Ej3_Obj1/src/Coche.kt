class Coche {

    var marca=""
    var modelo=""
    var color=""
    var matricula=""
    //var velocidadMaxima= 120
    var velocidad= 0
    var marchaActual=0 // 0 punto muerto, -1 reversa
        set(value)
        {
            if(value>5||value<-1)
            {
                field = 0
            }
            else
            {
                field= value
            }
        }
    var estadoMotor= false // false es apagaado

    constructor(){}
    constructor(
        marca: String,
        modelo: String,
        color: String,
        matricula: String,
        velocidad: Int,
        marchaActual: Int,
        estadoMotor: Boolean,
        //velocidadMaxima:Int
    ) {
        this.marca = marca
        this.modelo = modelo
        this.color = color
        this.matricula = matricula
        this.velocidad = velocidad
        this.marchaActual = marchaActual
        this.estadoMotor = estadoMotor
        //this.velocidadMaxima= velocidadMaxima
    }


    fun reposo()
    {
        this.velocidad= 0
        this.marchaActual= 0
        this.estadoMotor=false
    }
    fun arranca()
    {
        this.estadoMotor=true
        this.velocidad= 0
        this.marchaActual= 0
    }
    fun acelerar(velocidad: Int)
    {
        if(this.estadoMotor)
        {
            if(velocidad<this.velocidad)
            {
                while(velocidad<this.velocidad)
                {
                    this.velocidad--
                    println("velocidad: ${this.velocidad}")
                    cambiarMarcha()
                }
            }
            else
            {
                while(velocidad>this.velocidad)
                {
                    this.velocidad++
                    println("velocidad: ${this.velocidad}")
                    cambiarMarcha()
                }
            }
        }else println("Motor Apagado")
    }


    private fun cambiarMarcha() {
        when (this.velocidad) {
            in 0..30 -> this.marchaActual = 1
            in 31..50 -> this.marchaActual = 2
            in 51..70 -> this.marchaActual = 3
            in 71..100 -> this.marchaActual = 4
            in 101..Int.MAX_VALUE -> this.marchaActual = 5
        }
    }

}