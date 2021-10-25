
import java.util.Scanner;

public class EVA1_18_PROMEDIOS {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int[][] aiGrupos;
        //Preguntar por los grupos al usuario
        System.out.println("¿Cuantos grupos son? ");
        int iNoGrupos = input.nextInt();
        //Son representados en filas
        aiGrupos = new int[iNoGrupos][];
        for (int i = 0; i < aiGrupos.length; i++) {
            System.out.println("Para el grupo " + i + " ¿Cuantos estudiantes son?");
            int iNoEstu = input.nextInt();
            aiGrupos[i] = new int[iNoEstu];
        }
        //Se preguntan las edades
        for (int i = 0; i < aiGrupos.length; i++) { //Primera dimensión --> Grupos (Filas)
            for (int j = 0; j < aiGrupos[i].length; j++) { //Segunda dimensión --> Cantidad alumnos (Columnas)
                System.out.print("[" + "]"); //print (Misma linea)
            }
            System.out.println(""); //println (Imprime y salto de linear)
        }

    }

}