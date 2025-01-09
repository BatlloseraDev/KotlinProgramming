class Nombre {
    var nombre:String=""
    var apellido1:String=""
    var apellido2 = ""

    constructor(nombre:String, ap1:String, ap2:String){
        this.nombre = nombre
        this.apellido1 = ap1
        apellido2 = ap2
    }

    override fun toString(): String {
        return "EEEEEEE ->Nombre(nombre='$nombre', apellido1='$apellido1', apellido2='$apellido2')"
    }


}