import java.util.Locale;
import java.util.Scanner;

public class Exemp27 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int salario = sc.nextInt();
        double horas = sc.nextDouble();

        double salarioFinal = salario * horas;

        System.out.printf("%.2f", salarioFinal);

        sc.close();
    }
}
