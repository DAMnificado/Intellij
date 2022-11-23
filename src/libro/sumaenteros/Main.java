package libro.sumaenteros;

import java.util.Scanner;

/**
 *
 * @author nccasares
 */
public class Main {

    public static int calcularSumaDoWhile(int n) {
        int suma = 0;
        int i = 0;
        do {
            suma += i;
            //suma = suma + i;
            i++;
        } while (i <= n);

        return suma;
    }

    public static int calcularSumaWhile(int n) {
        int suma = 0;
        int i = 0;
        while (i <= n) {
            suma += i;
            i++;
        }
        return suma;
    }

    public static int calcularSumaFor(int n) {
        int suma = 0;
        for (int i = 0; i <= n; i++) {
            suma += i;
        }
        return suma;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzca el número:");
        int num = sc.nextInt();

        System.out.println("La suma de los " + num + " primeros números enteros es: " + calcularSumaDoWhile(num));
    }
}