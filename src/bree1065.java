import java.util.Locale;
import java.util.Scanner;

public class bree1065 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double valor1 = sc.nextDouble();
        double valor2 = sc.nextDouble();
        double valor3 = sc.nextDouble();
        double valor4 = sc.nextDouble();
        double valor5 = sc.nextDouble();
        int pares = 0;

        if (valor1 % 2 == 0){
            pares++;
        }
        if (valor2 % 2 == 0){
            pares++;
        }
        if (valor3 % 2 == 0){
            pares++;
        }
        if (valor4 % 2 == 0){
            pares++;
        }
        if (valor5 % 2 == 0){
            pares++;
        }

        System.out.println(pares + " valores pares");

        sc.close();
    }
}
