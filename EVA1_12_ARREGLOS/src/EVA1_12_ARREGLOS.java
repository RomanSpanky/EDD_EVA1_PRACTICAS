
public class EVA1_12_ARREGLOS {

    public static void main(String[] args) {

        int[] iArreglo = new int[3]; //12 bytes --> 3 enteros x 4 bytes
        System.out.println("Direccion del arreglo = " + iArreglo);
        iArreglo[0] = 1000;
        iArreglo[1] = 2000;
        iArreglo[2] = 3000;
       // iArreglo[3] = 3; ArrayIndexOutOfBound
        for (int i = 0; i < iArreglo.length; i++) {
            System.out.println("Cuenta " + i + " = $" + iArreglo[i]);
        }
        iArreglo = new int[2];
        System.out.println("Direccion del Arreglo modificado = " + iArreglo);
        for (int i = 0; i < iArreglo.length; i++) {
            System.out.println("CUENTA MODIFICADA " + i + " = $" + iArreglo[i]);
        }
        
    }
    
}
