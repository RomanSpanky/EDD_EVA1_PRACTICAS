
/*
 *
 * @author RomanSpanky
 */
public class EVA1_6_PASOXVAL_PASOXREF {

    public static void main(String[] args) {
        // Demostracion paso por valor (No se va a aumentar 1, ya que la funcion incrementa usa una copia de iValOrig)
        int iValOrig = 5;
        System.out.println("iValOrig en el main = " + iValOrig);
        incrementa(iValOrig);
        //iValOrig = incrementa1(iValOrig);
        System.out.println("iValOrig despues de llamar a incrementa = " + iValOrig);

        // Demostracion paso por referencia
        Prueba objPrueba = new Prueba();
        System.out.println("Valor de la x = " + objPrueba.x);
        System.out.println("objPrueba en el main = " + objPrueba);
        incrementaObj(objPrueba);
        System.out.println("Valor de la x despues de incremente = " + objPrueba.x);
    }

    //PASO POR VALOR --> PASAMOS UNA COPIA DEL VALOR EN UNA VARIABLE
    public static void incrementa(int val) { // <---Funcion
        val++;// val = val + 1; val i=1;
        System.out.println("iValOrig en incrementa = " + val);

    }
//PASO POR REFERENCIA --> PASAN LA DIRECCION EN MEMORIA DEL OBJETO (OBJETOS)

    public static void incrementaObj(Prueba val) {
        System.out.println("Objeto en incrementaObj = " + val);

    }

}

class Prueba {

    public int x = 10;
}
