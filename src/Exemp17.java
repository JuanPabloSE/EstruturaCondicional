import java.util.Locale;
import java.util.Scanner;

public class Exemp17 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        // VERIFICAÇÃO DE IDADE PARA ENTRADA EM FILME

        System.out.print("Digite sua idade: ");
        int idade = sc.nextInt();

        if (idade >= 18) {
            System.out.println("Entrada permitida");
        }
        else {
            System.out.println("Entrada negada");
        }

        sc.close();
    }
}
