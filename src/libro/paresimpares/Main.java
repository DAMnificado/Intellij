package libro.paresimpares;

import java.util.Scanner;

public class Main {
    public static void sumaParesImpares () {
        Scanner sc = new Scanner(System.in);
        int sumaPares = 0, contPares = 0, suma = 0;
        double sumaImpares = 0, contImpares = 0;

        for (int aux = 1; aux<=10; aux++){
            System.out.println("Introduzca un número");
            int num = sc.nextInt();

            suma += num;
            if (num % 2 == 0) {
                sumaPares += num;
                contPares++;
            } else {
                sumaImpares += num;
                contImpares++;
            }
        }
        System.out.println("Media impares: " + sumaImpares/contImpares);
        System.out.println("Suma pares: " + sumaPares);
        System.out.println("Se han introducido " + contPares + " números pares.");
        System.out.println("La suma total es: " + suma);
    }
    public static void main(String[] args) {
        sumaParesImpares();
    }
}
