import java.util.Locale;
import java.util.Scanner;

public class Exemp25 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        float n1 = sc.nextFloat();
        float n2 = sc.nextFloat();

        float mediaFinal = (n1 + n2) / 2f;

        System.out.printf("Media final: %.2f\n", mediaFinal);

        sc.close();
    }
}
