package libro.contarpares;

import java.util.Scanner;

/**
 *
 * @author nccasares
 */
public class Main {

    public static void contarParesFor() {
        Scanner sc = new Scanner(System.in);
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                System.out.println("Número par: " + i);
            }
        }
    }

    public static void main(String args[]) {
        contarParesFor();
    }
}
