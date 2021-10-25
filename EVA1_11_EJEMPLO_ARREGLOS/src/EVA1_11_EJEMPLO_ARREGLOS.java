
import java.util.Scanner;

public class EVA1_11_EJEMPLO_ARREGLOS {

    public static void main(String[] args) {
        //Preguntar tamaño del grupo:
        Scanner input = new Scanner(System.in);
        System.out.println("Indica el tamaño del grupo: ");
        int iSize = input.nextInt();
        int[] aiEdades = new int[iSize]; //Declarar un arreglo, tamaño iTama
        for (int i = 0; i < aiEdades.length; i++) { //Desde el primer elemento (0) al ultimo (N-1)
            System.out.println("Edad: ");
            aiEdades[i] = input.nextInt();

        }

        //Acumulador
        int iAcum = 0;
        for (int i = 0; i < aiEdades.length; i++) { //desde el primer elemento (CERO) al ultimo (N-1) 
            System.out.println("[" + aiEdades[i] + "]");
            iAcum = iAcum + aiEdades[i];
        }
        double dProm = (double) iAcum / (double) iSize;  //aiEdades.length;
        System.out.println("Promedio: " + dProm);
    }
}