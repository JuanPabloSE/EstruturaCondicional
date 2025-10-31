import java.util.Locale;
import java.util.Scanner;

public class Exemp09 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        // VARIÁVEIS E ENTRADA DE DADOS
        double salario, valorEmprestimo, valorParcelas, limite;
        int parcelas;
        System.out.print("Informe seu salário: ");
        salario = sc.nextDouble();
        System.out.print("Informe o valor do empréstimo: ");
        valorEmprestimo = sc.nextDouble();
        System.out.print("Informe a quantidade de parcelas: ");
        parcelas = sc.nextInt();
        System.out.println();

        // CÁLCULO - DESCOBRIR VALOR DAS PARCELAS
        valorParcelas = valorEmprestimo / parcelas;
        limite = salario * 0.40; // 40% DE LIMITE DO SALÁRIO PARA APROVAÇÃO

        // ESTRUTURA CONDICIONAL
        if (valorParcelas <= limite) {
         System.out.printf("Valor das Parcelas: R$ %.2f\n", valorParcelas);
         System.out.printf("Quantidade de parcelas: %d\n", parcelas);
         System.out.println("Empréstimo aprovado");
        }
        else {
            System.out.println("Empréstimo negado: parcela acima do limite permitido");
        }



        sc.close();
    }
}
