public class EVA1_2_STACK {

    public static void main(String[] args) {

        System.out.println("INICIA MAIN");
        A();
        System.out.println("Termina main");
    }

    public static void A() {
        System.out.println("Inicia A");
        B();
        System.out.println("Termina A");
    }

    public static void B() {
        System.out.println("Inicia B");
        int i = 0;
        double d = 0.0;
        System.out.println("Termina B");
    }

}
