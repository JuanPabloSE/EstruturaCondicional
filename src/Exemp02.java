import java.util.Locale;
import java.util.Scanner;

public class Exemp02 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        // Variáveis e Entrada de Dados
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if  (a < b && a < c){
            System.out.printf("MENOR = %d\n", a);
        }

        else if (b < c){
            System.out.printf("MENOR = %d\n", b);
        }

        else {
            System.out.printf("MENOR = %d\n", c);
        }

        sc.close();
    }

}
