import java.util.Locale;
import java.util.Scanner;

public class bree1073 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        if (N % 2 != 0){
            N++;
        }

        int contador = 1;
        double resultado = 0;

        while (contador <= N){
            if (contador % 2 == 0){
                resultado = Math.pow(contador, 2);
                System.out.printf("%d^2 = %.0f\n", contador, resultado);
            }
            contador++;
        }

        sc.close();
    }
}
