import java.util.Locale;
import java.util.Scanner;

public class bree1074 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(); // QUANTAS NÚMEROS DESEJA

        int contador = 1;
        while (contador <= N){
            int numeros = sc.nextInt();
            if (numeros % 2 == 0 && numeros > 0){
                System.out.println("EVEN POSITIVE");
            }
            else if (numeros % 2 == 0 && numeros < 0){
                System.out.println("EVEN NEGATIVE");
            }
            else if (numeros % 2 != 0 && numeros > 0){
                System.out.println("ODD POSITIVE");
            }
            else if (numeros % 2 != 0 && numeros < 0){
                System.out.println("ODD NEGATIVE");
            }
            else if (numeros == 0){
                System.out.println("NULL");
            }
            contador++;
        }

        sc.close();
    }
}
