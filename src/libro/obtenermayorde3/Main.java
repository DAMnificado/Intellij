package libro.obtenermayorde3;

import java.util.Scanner;

/**
 *
 * @author nccasares
 */
public class Main {

    public static void obtenerMayor(int num1, int num2, int num3) {
        if (num1 > num2 && num1 > num3) {
            System.out.println("El mayor es: " + num1);
        } else if (num2 > num1 && num2 > num3){
            System.out.println("El mayor es: " + num2);
        } else {
            System.out.println("El mayor es: " + num3);
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzca el primer número:");
        int n1 = sc.nextInt();

        System.out.println("Introduzca el segundo número:");
        int n2 = sc.nextInt();

        System.out.println("Introduzca el tercer número:");
        int n3 = sc.nextInt();

        obtenerMayor(n1, n2, n3);
    }
}