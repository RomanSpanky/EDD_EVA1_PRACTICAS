
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author RomanSpanky
 */
public class EVA1_23_NUMEROS_PRIMOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int iVal = input.nextInt();
        boolean bPrimo = true;
        for (int i = 2; i < iVal; i++) {
            //División: iVal / i
            //Si la división es exacta -- Terminamos
            //Si terminamos en no exacto: Primo
            if (iVal % i == 0) {
                bPrimo = false;
                System.out.println("El número " + iVal + " no es primo");
                break;
            } else {
                System.out.println("El número " + iVal + " es primo");
                break;
            }
        }

    }

}
