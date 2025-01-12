class Ordenador {
    var id = 0
    var procesador= ""
    var ram = 0 //GB
    var almacenamiento = 0 //GB
    var sistemaOperativo = ""

    override fun toString(): String {
        return "ID: $id\nProcesador: $procesador\nRam: ${ram}GB\nAlmacenamiento: ${almacenamiento}GB\nSistema Operativo: $sistemaOperativo"
    }
    constructor(id:Int)
    {
        this.id= id
    }
    constructor(id: Int, procesador: String, ram: Int, almacenamiento: Int, sistemaOperativo: String) {
        this.id = id
        this.procesador = procesador
        this.ram = ram
        this.almacenamiento = almacenamiento
        this.sistemaOperativo = sistemaOperativo
    }

}