import java.util.Locale;
import java.util.Scanner;

public class Exemp26 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();

        int maior = Math.max(Math.max(A, B), C);

        System.out.println(maior);

        sc.close();
    }
}
