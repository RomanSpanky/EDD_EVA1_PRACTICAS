
/**
 *
 * @author RomanSpanky
 */
public class EVA1_10_LENGTH {

    public static void main(String[] args) {
        // TODO code application logic here
        int[] aiDatos = new int[100]; //Declare el arreglo y almacene en memoria 100 variables int
        System.out.println("Tamano del arreglo: " + aiDatos.length);
        for (int i = 0; i < aiDatos.length; i++) {
            aiDatos[i] = (int) (Math.random() * 100);
            System.out.println(aiDatos);// Nos muestra que es un arreglo, que es tipo int y la direccion
            System.out.println(args);
            double[] algo = new double[100];
            System.out.println(algo);

        }
        for (int i = 0; i < aiDatos.length; i++) {
            System.out.println("[" + aiDatos[i] + "]");
        }

    }
}
