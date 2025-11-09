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

        int i = menor + 1;

        while (i < maior) {
            if (i % 2 != 0){
                soma += i;
            }
            i++;
        }
        System.out.println(soma);

        sc.close();
    }
}
