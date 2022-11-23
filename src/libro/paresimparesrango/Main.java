package libro.paresimparesrango;

import java.util.Scanner;
public class Main {
    public static void paresImparesRango (int num1, int num2) {
        int prodImpares = 1, contPares = 0, cont = 0;
        for (int aux = num1+1; aux<=num2-1; aux++) {
            cont++;
            if (aux%2==0)
                contPares++;
            else
                prodImpares*=aux;
            System.out.println(aux);
        }
        System.out.println("Producto impares: " + prodImpares);
        System.out.println("Se han encontrado " + contPares + " números pares en ese rango");
        System.out.println("Se han encontrado " + cont + " números en ese rango.");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca número 1:");
        int num1 = sc.nextInt();
        System.out.println("Introduzca número 2:");
        int num2 = sc.nextInt();
        paresImparesRango(num1, num2);
    }
}
