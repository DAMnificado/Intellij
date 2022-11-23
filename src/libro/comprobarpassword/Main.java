package libro.comprobarpassword;

import java.util.Scanner;

/**
 *
 * @author nccasares
 */
public class Main {
    public static boolean comprobarPassword() {
        Scanner sc = new Scanner(System.in);
        boolean check = false;
        int numIntentos = 1;
        String pass = "";
        do {
            System.out.println("Introduzca la contraseña: ");
            pass = sc.next();
            numIntentos++;
        } while (!pass.equals("333") && !pass.equals("222") && !pass.equals("111") && numIntentos <= 3);

        if (pass.equals("333") || pass.equals("222") || pass.equals("111"))
            check = true;

        return check;
    }

    public static void main(String args[]) {
        if (comprobarPassword()) {
            System.out.println("Contraseña correcta");
        } else {
            System.out.println("Demasiados intentos fallidos");
        }
    }
}

