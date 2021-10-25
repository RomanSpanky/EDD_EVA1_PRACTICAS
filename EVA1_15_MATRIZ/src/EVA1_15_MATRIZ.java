
public class EVA1_15_MATRIZ {

    public static void main(String[] args) {

        //Crear un arreglo de dos dimensiones 5 filas x 3 columnas (puros enteros)
        int iMatriz[][] = new int[5][3];
        //ACcceder a un ejemplo
        iMatriz[0][0] = 1000;//Primer posición
        iMatriz[4][2] = 1000;//Última
        System.out.println("TAMAÑO DEL ARREGLO: " + iMatriz.length);
        //Ciclo por cada dimensión
        //Ciclos anidados
        for (int i = 0; i < iMatriz.length; i++) { //FILAS iMatriz.length
            for (int j = 0; j < 3; j++) {//COLUMNAS
                System.out.print("[" + iMatriz[i][j] + "]");

            }
            System.out.println("");
        }
    }

}