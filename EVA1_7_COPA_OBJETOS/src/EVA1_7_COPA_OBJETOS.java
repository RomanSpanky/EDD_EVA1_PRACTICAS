
/**
 *
 * @author RomanSpanky
 */
public class EVA1_7_COPA_OBJETOS {

    public static void main(String[] args) {
        // TODO code application logic here
        Prueba obj1 = new Prueba();
        System.out.println(obj1);
        System.out.println(obj1);
        Prueba obj2 = obj1; //
        System.out.println(obj2);
        System.out.println("Valor de la x = " + obj1.x);
        obj2.x++;
        System.out.println("Valor de la x = " + obj1.x);
    }

}

class Prueba {

    int x = 10;
}
