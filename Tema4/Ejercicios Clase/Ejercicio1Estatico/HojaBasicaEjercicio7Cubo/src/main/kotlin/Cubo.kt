class Cubo {
    var capacidad: Int  =0 //litros maximos
    var color: String = ""
    var material: Material
    var asa: Boolean = true
    var litros: Int =0



    constructor(capacidad:Int,color:String,material:Material,asa:Boolean,litros:Int){
        this.capacidad = capacidad
        this.color=color
        this.material = material
        this.asa = asa
        this.litros = litros
    }

    fun llenar (){
        this.litros = this.capacidad
    }
    fun vaciar(){
        this.litros = 0
    }

    fun volcarAlCubo (c:Cubo){
        //vamos a calcular cuanto le entra a mi cubo
        var falta = capacidad - litros
        if (falta != 0){
            if (falta <= c.litros){
                litros = capacidad
                c.litros = c.litros-falta
            }else{
                litros = litros + c.litros
                c.litros=0
            }
        }
    }

    override fun toString(): String {
        return "Cubo(capacidad=$capacidad, color='$color', material='$material', asa=$asa, litros=$litros)"
    }

}