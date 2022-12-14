package array.mio.primos;

public class Main {

    static boolean primo;
    static int[] arrayNum = new int[30];
    static int[] arrayPrimo = new int[30];

    public static void llenarArray() {
        for (int aux = 0; aux < arrayNum.length; aux++) {
            arrayNum[aux] = (int) (Math.random() * 100);
        }
    }

    public static void encontrarPrimo() {
        for (int aux = 0; aux < arrayNum.length; aux++) {
            int contador = 0;

            for (int i = 1; i <= arrayNum[i]; i++) {
                if (arrayNum[aux] % i == 0) {
                    contador++;
                }
            }

            primo = contador == 2;

            if (primo) {
                arrayPrimo[aux] = arrayNum[aux];
            }

        }
    }

    public static void mostrarResultado() {
        for (int num : arrayPrimo) {
            if (num != 0) {
                System.out.println(num);
            }
        }
    }

    public static void main(String[] args) {
        llenarArray();
        encontrarPrimo();
        mostrarResultado();
    }
}
