/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libro.tratarnotas;

import java.util.Scanner;

/**
 *
 * @author nccasares
 */
public class Main {

    public static void capturaNotas() {
        Scanner sc = new Scanner(System.in);
        int mayorNotaNum = 0;
        int nota = 0;
        String notaCad = "";
        String mayorNotaCad = "";
        
        while(nota!=999) {
            System.out.println("Introduzca nota (999 para salir):");
            nota = sc.nextInt();
            switch (nota) {
                case 1:
                case 2:
                case 3:
                case 4:
                    notaCad = "Insuficiente";
                    break;
                case 5:
                    notaCad = "Suficiente";
                    break;
                case 6:
                    notaCad = "Bien";
                    break;
                case 7:
                case 8:
                    notaCad = "Notable";
                    break;
                case 9:
                case 10:
                    notaCad = "Sobresaliente";
                    break;
            }
            if (nota != 999) {
                System.out.println(nota + ": " + notaCad);
                if (nota > mayorNotaNum) {
                    mayorNotaNum = nota;
                    mayorNotaCad = notaCad;
                }
            }           
        }
        System.out.println("La mayor nota fue: " + mayorNotaNum + ": " + mayorNotaCad);
    }

    public static void main(String args[]) {
        capturaNotas();
    }
}
