class CristalPurpura:Cristal {

    var energia= 0

    constructor(id: Int, origen: CoronaCristal, energia: Int) : super(id, origen, Colores.PURPURA)
    {
        this.energia= energia
    }

    override fun toString(): String {
        return super.toString() +" y energía: $energia"
    }
}