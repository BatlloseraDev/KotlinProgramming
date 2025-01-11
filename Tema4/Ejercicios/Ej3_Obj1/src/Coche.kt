class Coche {

    var marca=""
    var modelo=""
    var color=""
    var matricula=""

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
        estadoMotor: Boolean
    ) {
        this.marca = marca
        this.modelo = modelo
        this.color = color
        this.matricula = matricula
        this.velocidad = velocidad
        this.marchaActual = marchaActual
        this.estadoMotor = estadoMotor
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

    }

}