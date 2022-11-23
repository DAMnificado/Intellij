package libro.sueldos;

import java.util.Scanner;

public class Main {
    public static void calculoSueldo(int s) {
        double descuento;
        if (s <= 1000) {
            descuento = s * 0.1;
        } else {
            if (s>1000 && s<=2000) {
                descuento = 1000 * 0.1 + (s-1000) * 0.05;
            } else {
                descuento = 1000 * 0.1 + (s-1000) * 0.05 + (s-2000) * 0.03;
            }
        }
        System.out.println("Descuento: " + descuento);
        System.out.println("Sueldo neto: " + (s-descuento));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca sueldo");
        calculoSueldo(sc.nextInt());
    }
}
