package herenciaPrimaria

class Enfermera:Persona {
    var especialidad: String =""
    var hospital: String =""

    constructor(especialidad:String, hospital:String, nombre:String, edad:Int, altura:Double):super(nombre,edad,altura){
        this.especialidad = especialidad
        this.hospital = hospital

    }
}