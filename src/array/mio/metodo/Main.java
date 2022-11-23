package array.mio.metodo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("De cúantos números quieres que se componga el array?");
        int n = sc.nextInt();
        int suma = 0;
        int[] array = new int[n];


        for (int i = 0; i < array.length; i++) {

            System.out.println("introduzca el contenido en la posicion " + (i + 1));
            array[i] = sc.nextInt();
            suma += array[i];
        }
        int media=suma/n;
        System.out.println("La media de los numeros introducidos en la array es " + media);
        System.out.print("El numero completo de la array es ");

        for (int j = 0; j < array.length; j++) {
            System.out.print(+array[j]);
        }
        negativos(array);
        mayormedia(array,media);
    }
    public static void negativos(int []array) {
        int contN = 0;

        for (int p = 0; p < array.length; p++){

            if (array[p] < 0) {
                contN++;
            }
        }
        System.out.println();
        System.out.println("El recuento de negativos " +contN);
    }

    public static void mayormedia (int []array, int media) {
        int contM = 0;
        for(int m=0;m< array.length;m++){
            if(array[m]>media){
                contM++;
                System.out.println("El " + array[m] + " es mayor a " + media);
                System.out.println("La suma de los numeros mayores a la media es " + contM);
            }
        }
    }
}