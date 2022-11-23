package libro.factorial;

import java.util.Scanner;
/**
 *
 * @author nccasares
 */
public class Main {

    public static int calcularFactorialWhile(int n) {
        int fact = 1;
        int i = 1;
        while (i <= n) {
            fact *= i;
            i++;
        }
        return fact;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzca el número:");
        int num = sc.nextInt();

        System.out.println("El factorial de " + num + " es: " + calcularFactorialWhile(num));
    }
}

