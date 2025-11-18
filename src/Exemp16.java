import java.util.Locale;
import java.util.Scanner;

public class Exemp16 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor da conta: ");
        double conta = sc.nextDouble();

        int porcentagem = 10;
        double gorjeta = conta * porcentagem / 100.0;

        System.out.printf("A gorjeta é: R$ %.2f\n", gorjeta);

        sc.close();
    }
}
