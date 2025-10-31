import java.util.Locale;
import java.util.Scanner;

public class Exemp06 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        // VARIÁVEL E ENTRADA
        double saldo, desconto;
        saldo = sc.nextDouble();

        int taxa;
        // ESTRUTURA CONDICIONAL
        if (saldo < 1000.00){                            // TAXA PARA SALDO MENOR QUE R$ 1000.00
            taxa = 5;
        }
        else if (saldo >= 1000.00 && saldo <= 5000.00){       // TAXA  PARA SALDO MAIOR OU IGUAL A R$1000.00 E MENOR OU IGUAL A R$ 5000.00
            taxa = 2;
        }
        else {                                          // TAXA PARA SALDO MAIOR QUE R$ 5000.00
            taxa = 1;
        }

        // CÁLCULO
        desconto = saldo * taxa / 100;
        saldo -= desconto;

        // SAÍDA DE DADOS
        System.out.printf("Taxa: %d%%\n", taxa);
        System.out.printf("Desconto: R$ %.2f\n", desconto);
        System.out.printf("Saldo final: R$ %.2f\n", saldo);

        sc.close();
    }
}
