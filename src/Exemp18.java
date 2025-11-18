import java.util.Locale;
import java.util.Scanner;

public class Exemp18 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        // CALCULADORA DE DESCONTO COM CONDIÇÃO

        System.out.print("Digite o valor da compra: ");
        double valorCompra = sc.nextDouble();

        // PORCENTAGEM DE DESCONTO CASO VALOR FOR MAIOR QUE (R$ 100.00)
        int desconto = 20;

        // CÁLCULO DESCONTO
        double valorDesconto = valorCompra * desconto / 100.0;
        double valorTotal = valorCompra - valorDesconto;

        if (valorCompra > 100) {
            System.out.printf("Valor final com desconto: R$ %.2f\n", valorTotal);
        }
        else {
            System.out.printf("Valor final sem desconto: R$ %.2f\n", valorCompra);
        }


        sc.close();
    }
}
