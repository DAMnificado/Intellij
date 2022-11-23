package libro.multiplostres;

import java.util.Scanner;

public class Main {
    public static int contarMultiplos(int num) {
        int aux = 1, contMult = 0;
        while(aux <= num) {
            if (aux % 3 == 0) {
                System.out.println(aux);
                contMult++;
            }
            aux++;
        }
        return contMult;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca un número");
        System.out.println("Se han encontrado " + contarMultiplos(sc.nextInt()) + " múltiplos de 3.");
    }
}
