
public class EVA1_14_COPIA_ARREGLOS {

    public static void main(String[] args) {
        // TODO code application logic here
        int[] iArreglo = new int[3]; //12 bytes --> 3 enteros x 4 bytes
        System.out.println("Direccion del arreglo = " + iArreglo);
        iArreglo[0] = 1000;
        iArreglo[1] = 2000;
        iArreglo[2] = 3000;
       // iArreglo[3] = 3; error ArrayIndexOutOfBound
        for (int i = 0; i < iArreglo.length; i++) {
            System.out.println("Cuenta " + i + " = $" + iArreglo[i]);
        }
        //COPIA DE LOS DATOS DEL ARREGLO
       // int[] iCopia = iArreglo; //No Funciona
       int[] iCopia = new int[3];
        System.out.println("Direccion de iCopia = " + iCopia);
        for (int i = 0; i < iArreglo.length; i++) {
            iCopia[i] = iArreglo[i];
        }
        iCopia[0] = 1000000;
        for (int i = 0; i < iArreglo.length; i++) {
            System.out.println("Cuanta (iCopia) " + i + " = $" +iCopia[i]);
        }
        for (int i = 0; i < iArreglo.length; i++) {
            System.out.println("Cuanta (iArreglo) " + i + " = $" +iArreglo[i]);
        }
    }
    
}