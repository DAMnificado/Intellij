package libro.segundoshoras;

import java.util.Scanner;

public class Main {
    public static void segundos_Horas(int segundos) {
        int horas, minutos;
        System.out.println(segundos);
        horas = segundos / 3600;
        segundos = segundos % 3600;
        minutos = segundos / 60;
        segundos = segundos % 60;
        System.out.println("Horas:" + horas + " Minutos:" + minutos + " Segundos:" + segundos);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca los segundos a convertir:");
        segundos_Horas(sc.nextInt());
    }
}
