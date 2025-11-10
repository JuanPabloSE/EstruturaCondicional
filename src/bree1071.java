import java.util.Locale;
import java.util.Scanner;

public class bree1071 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int X = sc.nextInt();
        int Y = sc.nextInt();
        int soma = 0;

        int maior = Math.max(X, Y);
        int menor = Math.min(X, Y);

        int contador = menor + 1;

        while (contador < maior) {
            if (contador % 2 != 0){
                soma += contador;
            }
            contador++;
        }
        System.out.println(soma);

        sc.close();
    }
}
