package array.mio.bidimensionalAleatoria;

import java.util.Scanner;

public class Main {
    final static int FILAS = 4;
    final static int COLUMNAS = 4;


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] matriz = new int[FILAS][COLUMNAS];

        for (int i = 0; i < matriz.length; i++) {

            for (int j = 0; j < matriz[i].length; j++) {
                System.out.println("Dame un valor para la fila " + i + " y otro para la columna " + j);
                matriz[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < matriz.length; i++) {

            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println("");
        }




    }


    public static int sumafilas(int[][] matriz) {
        System.out.println(matriz);
        int suma;
        int columnasuma=0;
        for (int i = 0; i < FILAS; i++) {
            suma = 0;
            for (int j = 0; j < COLUMNAS; j++) {
                suma += matriz[i][j];

                columnasuma+= suma;
            }



        }
        System.out.println("S:" + columnasuma);
        return 0;
    }

}
