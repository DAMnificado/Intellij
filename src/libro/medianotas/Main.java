package libro.medianotas;

import java.util.Scanner;

/**
 *
 * @author nccasares
 */
public class Main {

    public static void obtenerMediaNotas() {
        Scanner sc = new Scanner(System.in);
        int sumaNotas = 0;
        int nota;
        for (int i = 1; i <= 7; i++) {
            System.out.println("Introduzca nota:");
            nota = sc.nextInt();
            sumaNotas += nota;
        }
        System.out.println("La nota media de la asignatura es: " + sumaNotas/7);
    }

    public static void main(String args[]) {
        obtenerMediaNotas();
    }
}
