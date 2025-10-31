import java.util.Locale;
import java.util.Scanner;

public class Exemp08 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        // VARIÁVEIS E ENTRADA DE DADOS
        int codigo, desconto;
        double valorProduto;
        System.out.print("Digite o codigo do produto: ");
        codigo = sc.nextInt();
        System.out.print("Digite o valor do produto: ");
        valorProduto = sc.nextDouble();

        switch (codigo) {
            case 1:
                desconto = 10;
                valorProduto -= valorProduto * desconto / 100;
                System.out.printf("Desconto: %d%%\n", desconto);
                System.out.printf("Valor final: R$ %.2f\n", valorProduto);
                break;

                case 2:
                    desconto = 20;
                    valorProduto -= valorProduto * desconto / 100;
                    System.out.printf("Desconto: %d%%\n", desconto);
                    System.out.printf("Valor final: R$ %.2f\n", valorProduto);
                    break;

                    case 3:
                        desconto = 5;
                        valorProduto -= valorProduto * desconto / 100;
                        System.out.printf("Desconto: %d%%\n", desconto);
                        System.out.printf("Valor final: R$ %.2f\n", valorProduto);
                        break;

                        default:
                            System.out.println("Código inválido");
        }

        sc.close();
    }
}
