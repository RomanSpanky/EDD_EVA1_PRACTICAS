
/**
 *
 * @author RomanSpanky
 */
public class EVA1_9_USANDO_ARREGLOS {

    public static void main(String[] args) {
        // TODO code application logic here
        // 1. UN ARREGLO DE ENTEROS
        int[] aiDatos;
        aiDatos = new int[10];

        // 2. LLENAR CON VALORES
        //Arreglo: Estructura de acceso aleatorio
        //Indice:
        //Primer elemento del arreglo: posición 0
        //Ultimo elemento del arreglo: n-1 (N es el tamaño del arreglo, en éste caso 10 -1 = posicion final 9)
        //Acceso a los valores:
        for (int i = 0; i < 10; i++) {//Donde va a empezar/Hasta donde va a llegar/Incremento o decremento
            //Casting -> Convertimos double a int
            aiDatos[i] = (int) (Math.random() * 100); //Random -> son valores entre 0.0 y 1.0 * 100 valores entre 0 y 100

        }

        // 3. IMPRIMIR VALORES
        for (int i = 0; i < 10; i++) {
            System.out.println("[" + aiDatos[i] + "]");
        }
    }

}
