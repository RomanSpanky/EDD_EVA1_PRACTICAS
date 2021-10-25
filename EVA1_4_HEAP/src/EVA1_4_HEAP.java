
public class EVA1_4_HEAP {

    public static void main(String[] args) {

        MiClase obj = new MiClase();
        System.out.println(obj.getMensaje());
        System.out.println(obj);//Imprimir referencia al objeto heap
        MiClase obj2 = new MiClase();
        System.out.println(obj2);//Imprimir referencia al objeto heap
        EVA1_4_HEAP objHeap = new EVA1_4_HEAP();
        System.out.println(objHeap);//Imprimir referencia al objeto heap
    }

}

class MiClase {//NUEVO TIPO DE DATO ---> TIPOS DE DATOS ABSTRACTOS

    private String mensaje;//ATRIBUTOS -> COMPORTAMIENTO

    public MiClase() {//MÉTODOS -> COMPORTAMIENTO
        mensaje = "Hola Mundo";
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }
}
