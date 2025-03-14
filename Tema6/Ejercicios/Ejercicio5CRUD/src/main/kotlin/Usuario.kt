class Usuario{
    var email: String =""
    var nombre: String=""
    var apellido: String =""
    var edad: Int=0
    var password: String=""
    var rol: Rol = Rol.ESTANDAR


    constructor(email:String,nombre:String,apellido:String,edad:Int,password:String){
        this.email = email
        this.nombre = nombre
        this.apellido = apellido
        this.edad = edad
        this.password = password
    }
    constructor(email:String,nombre:String,apellido:String,edad:Int,password:String,rol:Rol){
        this.email = email
        this.nombre = nombre
        this.apellido = apellido
        this.edad = edad
        this.password = password
        this.rol = rol
    }

    override fun toString(): String {
        return "Usuario(email='$email', nombre='$nombre', apellido='$apellido', edad=$edad, password='$password', rol=$rol)"
    }

}