package libro.nomina;

import java.util.Scanner;

public class Main {
    public static void calculoNominas(int horasTrabajo) {
        final int TARIFA = 30;
        int dif_horas;
        double sueldo, salario_extra, impuesto, sueldo_total, tarifa_extra;

        if (horasTrabajo <= 35) {
            sueldo = horasTrabajo * TARIFA;
        } else {
            dif_horas =  horasTrabajo - 35;
            tarifa_extra = TARIFA * 1.5;
            salario_extra = tarifa_extra * dif_horas;
            sueldo = (35*TARIFA) + salario_extra;
        }
        impuesto = 0;
        if(sueldo > 1000) {
            impuesto = sueldo*0.2;
            sueldo_total = sueldo - impuesto;
            System.out.println("Tu sueldo al mes es: " + sueldo +", Valor de Impuesto: " + impuesto +", El salario Neto es: "+ sueldo_total);
        } else {
            System.out.println("Tu sueldo neto es: " + sueldo);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce las horas de trabajo");
        int horas = sc.nextInt();
        calculoNominas(horas);
    }
}
