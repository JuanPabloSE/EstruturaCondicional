import java.util.Locale;
import java.util.Scanner;

public class Exemp15 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int consumo = sc.nextInt();
        sc.nextLine(); // QUEBRA DE LINHA PENDENTE
        String opcao = sc.next();

        double valorPagar;

        //Switch Case
        switch (opcao.toUpperCase()) {
            case "R":
                if (consumo <= 500) {
                    valorPagar = consumo * 0.40;
                    System.out.printf("Valor a pagar: R$ %.2f\n", valorPagar);
                } else {
                    valorPagar = consumo * 0.65;
                    System.out.printf("Valor a pagar: R$ %.2f\n", valorPagar);
                }
                break;

            case "C":
                if (consumo <= 1000) {
                    valorPagar = consumo * 0.55;
                    System.out.printf("Valor a pagar: R$ %.2f\n", valorPagar);
                } else {
                    valorPagar = consumo * 0.60;
                    System.out.printf("Valor a pagar: R$ %.2f\n", valorPagar);
                }
                break;

            case "I":
                if (consumo <= 5000) {
                    valorPagar = consumo * 0.55;
                    System.out.printf("Valor a pagar: R$ %.2f\n", valorPagar);
                }
                else {
                    valorPagar = consumo * 0.60;
                    System.out.printf("Valor a pagar: R$ %.2f\n", valorPagar);
                }
                break;

            default:
                System.out.println("Tipo de instalação inválida. Use R, C ou I.");

        }

        sc.close();
    }
}
