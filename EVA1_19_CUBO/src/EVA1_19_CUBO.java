
public class EVA1_19_CUBO {

    public static void main(String[] args) {

        //Arreglo de 3 dimensiones
        int[][][] aiCubo = new int[3][4][2];
        //¿Cuantos enteros son?
        //24 enteros (3 x 4 x2)
        for (int i = 0; i < aiCubo.length; i++) {
            for (int j = 0; j < aiCubo[i].length; j++) {
                for (int k = 0; k < aiCubo[i][j].length; k++) {
                    aiCubo[i][j][k] = 100;
                }

            }
        }
    }

}