class Constantes {

    companion object{

        val ENERGIA_MAX= 50
        val ENERGIA_MIN= 1
        val MAX_CHUPETES_NEGROS= 6
        val PROB_ENCONTRAR_CHUPETE = 65
        val PROB_ENCONTRAR_CHUPETE_NEGRO = PROB_ENCONTRAR_CHUPETE+2
        val MIN_GEN_VILLANOS = 1
        val MAX_GEN_VILLANOS= 3
        val MAX_VILLANOS =100
        val MAX_CHUPETES_VILLANOS= 5


        fun devolverEnergiaRandom():Int
        {
            return (ENERGIA_MIN..ENERGIA_MAX).random()
        }


        fun devolverRandomEncontrarChuepete(): Int
        {
            return (0..100).random()
        }



        fun devolverNumVillanos():Int
        {
            return (MIN_GEN_VILLANOS..MAX_GEN_VILLANOS).random()
        }
    }

}