package libro.fechas;

import java.util.Scanner;

/**
 *
 * @author nccasares
 */
public class Main {

    public static void comprobarFecha(int d, int m, int a) {
        String mes="";
        if (d > 31 || d < 1 || m < 1 || m > 12 || a < 0) {
            System.out.println("Fecha no válida");
        } else if ((m == 4 || m == 6 || m == 9 || m == 11) && d > 30) {
            System.out.println("Error de día");
        } else if (m == 2 && d > 28) {
            System.out.println("Febrero no puede tener más de 28 días");
        } else {
            switch (m) {
                case 1:
                    mes = "Enero";
                    break;
                case 2:
                    mes = "Febrero";
                    break;
                case 3:
                    mes = "Marzo";
                    break;
                case 4:
                    mes = "Abril";
                    break;
                case 5:
                    mes = "Mayo";
                    break;
                case 6:
                    mes = "Junio";
                    break;
                case 7:
                    mes = "Julio";
                    break;
                case 8:
                    mes = "Agosto";
                    break;
                case 9:
                    mes = "Septiembre";
                    break;
                case 10:
                    mes = "Octubre";
                    break;
                case 11:
                    mes = "Noviembre";
                    break;
                case 12:
                    mes = "Diciembre";
                    break;
            }
            System.out.println(d + " de " + mes + " de " + a);
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzca el día:");
        int dia = sc.nextInt();

        System.out.println("Introduzca el mes:");
        int mes = sc.nextInt();

        System.out.println("Introduzca el año:");
        int anho = sc.nextInt();

        comprobarFecha(dia, mes, anho);
    }
}