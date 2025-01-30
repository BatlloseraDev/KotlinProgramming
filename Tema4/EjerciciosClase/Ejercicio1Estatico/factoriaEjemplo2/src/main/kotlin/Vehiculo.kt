class Vehiculo {
    var tipo: Tipo =Tipo.SINDEFINIR
    var modelo = Modelo.SINMODELO
    var velocidad : Int = 0

    constructor(tipo:Tipo, modelo:Modelo, velocidad:Int){
        this.tipo = tipo
        this.modelo = modelo
        this.velocidad = velocidad
    }

    override fun toString(): String {
        return "$tipo(modelo=$modelo, velocidad=$velocidad)"
    }
}