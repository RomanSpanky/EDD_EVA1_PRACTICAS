
import java.util.Scanner;

public class EVA1_21_ARREGLO_OBJETOS {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Persona[] aPersonas = new Persona[10]; //Arreglo que almacena objetos tipo persona (10)
        //Para usar objeto, primero se debe crear
        //Para crear objeto se usa new
        //SIi no es creado, no existe
        for (int i = 0; i < aPersonas.length; i++) {
            //System.out.println("Nombre: " + aPersonas[i].getNombre());
            aPersonas[i] = new Persona(); //Se crea un objeto persona en cada posición del arreglo
            System.out.println("Introduce un Nombre: ");
            String nombre = input.nextLine();
            aPersonas[i].setNombre(nombre);
        }
        for (int i = 0; i < aPersonas.length; i++) {
            System.out.println("Nombre: " + aPersonas[i].getNombre());
        }
    }

}

class Persona {

    private String nombre;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

}