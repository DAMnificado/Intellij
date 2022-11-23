package libro.mayormenorserie;

import java.util.Scanner;

public class Main {
    public static void mayorMenorSerie() {
        Scanner sc = new Scanner(System.in);
        int numMayor = 0, numMenor = 99999999, num = 0;
        while (num != -1) {
            System.out.println("Introduzca número:");
            num = sc.nextInt();
            if (num != -1) {
                if (num > numMayor)
                    numMayor = num;
                else {
                    if (num < numMenor)
                        numMenor = num;
                }
            }
            System.out.println("El mayor es: " + numMayor + " y el menor: " + numMenor);
        }
    }
    public static void main(String[] args) {mayorMenorSerie();
    }
}
