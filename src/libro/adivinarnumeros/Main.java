/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libro.adivinarnumeros;

import java.util.Scanner;

/**
 *
 * @author nccasares
 */
public class Main {

    public static void adivinarNumero() {
        int solucion = (int) (Math.random() * 101);
        System.out.println("---" + solucion);
        int numIntentos = 1;

        Scanner sc = new Scanner(System.in);
        int num = -1;
        do {
            System.out.println("Introduzca un número entre 1 y 100: ");
            num = sc.nextInt();

            if (num > solucion) {
                System.out.println("El número introducido es mayor que la solución");
            } else if (num < solucion) {
                System.out.println("El número introducido es menor que la solución");
            } else {
                System.out.println("Ha acertado la solución!!!");
            }
            numIntentos++;
        } while (num != solucion && numIntentos <= 10);

        if (num == solucion) {
            System.out.println("Lo has adivinado en " + --numIntentos + " intentos.");
        } else {
            System.out.println("El número a adivinar era " + solucion);
        }
    }

    public static void main(String args[]) {
        adivinarNumero();
    }
}
