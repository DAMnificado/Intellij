package libro.area;

import java.util.Scanner;

public class Main {
    private static float calcularArea(float base, float altura) {
        return base*altura/2;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzca la base del triángulo:");
        float b = sc.nextFloat();

        System.out.println("Introduzca la altura del triángulo:");
        float a = sc.nextFloat();

        System.out.println("El área es: " + calcularArea(b, a));
    }
}
