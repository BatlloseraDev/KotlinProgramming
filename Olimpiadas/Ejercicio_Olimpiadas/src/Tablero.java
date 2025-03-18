public class Tablero {

    String[][] matrixTablero;
    int tamanioTablero= 0;

    public Tablero(int tamanioTablero) {
        this.tamanioTablero = tamanioTablero;
        this.matrixTablero = new String[tamanioTablero][tamanioTablero];
        indexacionInicial();
    }

    private void indexacionInicial(){
        for(int i=0; i<tamanioTablero; i++){
            for(int j=0; j<tamanioTablero; j++){
                matrixTablero[i][j] = " ";
            }
        }
    }

    public void imprimirTablero(){
        for(int j= 0; j<tamanioTablero+2; j++){
            System.out.print("-");
        }
        System.out.println();

        for(int i =0; i<tamanioTablero-1;i++){
            System.out.print("|"); //borde derecho
            for(int j=0; j<tamanioTablero-1;j++){
                System.out.print(matrixTablero[i][j]+"\t");
            }
            System.out.print("|"); //borde izquierdo
            System.out.println();
        }

        for(int j= 0;j<tamanioTablero+2; j++)
        {
            System.out.print("-");
        }
    }


 /*   public void imprimirTablero() {

        for(int i = 0; i < matrixTablero.length; i++){
            for(int j=0; j<matrixTablero[i].length;j++){

                System.out.print(matrixTablero[i][j]);
            }
            System.out.println();
        }
    }*/
}
