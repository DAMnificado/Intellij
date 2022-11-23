package libro.divisionmayormenor;

import java.util.Scanner;

/**
 *
 * @author nccasares
 */
public class Main {

    public static float dividirMayorMenor(float num1, float num2) {
        float res;
        if (num2 > num1)
            res = num2 / num1;
        else
            res = num1 / num2;
        return res;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzca el primer número:");
        float n1 = sc.nextFloat();

        System.out.println("Introduzca el segundo número:");
        float n2 = sc.nextFloat();

        System.out.println("La división es: " + dividirMayorMenor(n1, n2));
    }
}
