package array.mio.primero;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("De cúantos números quieres que se componga el array?");
        int n = sc.nextInt();
        int suma = 0;
        int media = 0;
        int []array = new int [n];

        for(int i=0; i<array.length; i++) {

            System.out.println("introduzca el contenido en la posicion " +(i+1));
            array[i] = sc.nextInt();
            suma+=i;

        }
        System.out.println("La media de los numeros introducidos en la array es " + suma/n);
        System.out.print("El numero completo de la array es ");
        for (int j=0;j<array.length;j++) {
            System.out.print(+ array[j]);
        }
    }
}