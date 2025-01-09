fun main(args: Array<String>) {

    val contraseniaFuerte = Contrasenia(true)
    contraseniaFuerte.generar()
    println("Contraseña fuerte: ${contraseniaFuerte.contrasenia}")

    val contraseniaNormal = Contrasenia(10)
    contraseniaNormal.generar()
    println("Contraseña normal: ${contraseniaNormal.contrasenia}")
}