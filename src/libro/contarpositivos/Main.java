package libro.contarpositivos;

import java.util.Scanner;

/**
 *
 * @author nccasares
 */
public class Main {

    public static void contarPositivosFor() {
        Scanner sc = new Scanner(System.in);
        int total = 0;
        int num;
        for (int i = 0; i <= 10; i++) {
            System.out.println("Introduzca número:");
            num = sc.nextInt();
            if (num>0)
                total += 1;
        }
        System.out.println("Se han introducido " + total + " números positivos.");
    }

    public static void main(String args[]) {
        contarPositivosFor();
    }
}