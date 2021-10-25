
public class EVA1_13_ARREGLOS {

    static void main(String[] args) {

        int[] iArreglo = new int[3]; //12 bytes --> 3 enteros x 4 bytes
        System.out.println("Direccion del arreglo = " + iArreglo);
        iArreglo[0] = 1000;
        iArreglo[1] = 2000;
        iArreglo[2] = 3000;
        // iArreglo[3] = 3; error ArrayIndexOutOfBound --> Nos pasamos de los limites del Arreglo
        for (int i = 0; i < iArreglo.length; i++) {
            System.out.println("Cuenta (iArreglo) " + i + " = $" + iArreglo[i]);
        }
        //CREAMOS UNA NUEVA VARIABLE DE TIPO ARREGLO
        int[] iCopia = iArreglo;
        System.out.println("Direccion de iCopia = " + iCopia);
        for (int i = 0; i < iCopia.length; i++) {
            System.out.println("Cuenta (iCopia) " + i + " = $" + iCopia[i]);
        }
        iArreglo = new int[2];
        System.out.println("Direccion del Arreglo modificado = " + iArreglo);
        for (int i = 0; i < iArreglo.length; i++) {
            System.out.println("CUENTA MODIFICADA " + i + " = $" + iArreglo[i]);
        }
        System.out.println("Direccion de iCopia = " + iCopia);
        for (int i = 0; i < iCopia.length; i++) {
            System.out.println("Cuenta (iCopia) " + i + " = $" + iCopia[i]);
        }
    }

}