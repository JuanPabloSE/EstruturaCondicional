import java.util.Locale;
import java.util.Scanner;

public class Exemp19 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        // Classificação de Nota com Switch

        System.out.print("Digite a nota: ");
        int nota = sc.nextInt();
        String conceito;

        if (nota >= 9) {
            conceito = "A";
        }
        else if (nota >= 7) {
            conceito = "B";
        }
        else if (nota >= 5) {
            conceito = "C";
        }
        else {
            conceito = "D";
        }

        System.out.println("Conceito: " + conceito);

        sc.close();
    }
}
