import java.util.Locale;
import java.util.Scanner;

public class Exemp04 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        // Variável e Entrada de Dados
        System.out.print("Digite o primeiro número: ");
        double primeiro = sc.nextDouble();
        System.out.print("Digite o segundo número: ");
        double segundo = sc.nextDouble();
        double resultado;

        // ESCOLHA DA OPERAÇÃO
        System.out.println(); // QUEBRA DE LINHA
        System.out.println("Escolha a operação:");
        System.out.println("1 - Soma");
        System.out.println("2 - Subtração");
        System.out.println("3 - Multiplicação");
        System.out.println("4 - Divisão");
        System.out.println(); // QUEBRA DE LINHA
        System.out.print("Qual operação desejada: ");
        int operacao = sc.nextInt();

        // SWITCH CASE
        switch (operacao) {
            case 1:
                resultado = primeiro + segundo;
                     System.out.printf("Resultado: %.1f\n", resultado);
                break;

                case 2:
                resultado = primeiro - segundo;
                    System.out.printf("Resultado: %.1f\n", resultado);
                break;

                case 3:
                resultado = primeiro * segundo;
                    System.out.printf("Resultado: %.1f\n", resultado);
                break;

                case 4:
                resultado = primeiro / segundo;
                    System.out.printf("Resultado: %.1f\n", resultado);
                break;

            default:
                System.out.println("Opção inválida");
        }

        sc.close();
    }
}
