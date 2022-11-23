package libro.sumadigitos;

import java.util.Scanner;

public class Main {
    public static int sumarDigitos(int num){
        int suma = 0, resto;
        while (num != 0) {
            resto = num - (num/10) * 10;
            suma = suma + resto;
            num = num/10;
        }
        return suma;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca número");
        int n = sc.nextInt();
        System.out.println("La suma de los dígitos de " + n + " es: " + sumarDigitos(n));
    }
}
