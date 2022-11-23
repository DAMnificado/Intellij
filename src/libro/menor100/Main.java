package libro.menor100;

import java.util.Scanner;

/**
 *
 * @author nccasares
 */
public class Main {

    public static void numMenor100DoWhile() {
        Scanner sc = new Scanner(System.in);
        int num;
        do {
            System.out.println("Introduzca un número menor que 100:");
            num = sc.nextInt();
        } while (num >= 100);
        System.out.println("FIN DEL PROCESO, NÚMERO MENOR QUE 100 ENCONTRADO");
    }

    public static void main(String args[]) {
        numMenor100DoWhile();
    }
}