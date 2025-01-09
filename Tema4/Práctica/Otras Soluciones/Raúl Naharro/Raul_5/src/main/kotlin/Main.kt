fun main() { // Raúl Naharro Fernández
    var pass = Password()
    pass.generar()

    pass = Password(11, "", false)
    pass.generar()
}