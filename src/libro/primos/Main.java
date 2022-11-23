package libro.primos;

public class Main {
    public static void numerosPrimos () {
       int cont = 0;
       int divisores = 0;

       for (int primo = 1; primo <= 100; primo++) {
           divisores=0;
           cont=1;
           while (cont <= primo) {
               if (primo % cont == 0) {
                   divisores++;
               }
               cont++;
           }
           if (divisores<=2){
               System.out.println(primo);
           }
       }
    }

    public static void main(String[] args) {
        numerosPrimos();
    }
}
