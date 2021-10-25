
public class EVA1_20_DIMENSIONES {

    public static void main(String[] args) {

        int[][][][] iTese = new int[5][3][2][6];
            // Enteros --> 180
        for (int i = 0; i < iTese.length; i++) { //Primer dimensión
            for (int j = 0; j < iTese[i].length; j++) {//Segunda dimensión
                for (int k = 0; k < iTese[i][j].length; k++) {//Tercera dimensión
                    for (int l = 0; l < iTese[i][j][k].length; l++) {//Cuarta dimensión
                        iTese[i][j][k][l] = 100;
                    }
                }
            }
        }
    }
    
}