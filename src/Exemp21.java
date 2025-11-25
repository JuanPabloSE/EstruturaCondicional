import java.util.Locale;
import java.util.Scanner;

public class Exemp21 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double saldo = 2000.00;

        System.out.println("Operação desejada (1 - Saque, 2 - Depósito, 3 - Consultar Saldo)");
        int opcao = sc.nextInt();

        switch (opcao) {
            case 1:
                System.out.println("Qual valor deseja sacar ?");
                double valorSaque = sc.nextDouble();

                while (valorSaque > saldo){                                           // ENQUANTO SALDO FOR MENOR QUE VALOR DO SAQUE
                    System.out.println("Saldo insuficiente, digite um novo valor para saque:");
                    valorSaque = sc.nextDouble();
                }
                if (valorSaque <= saldo){
                    saldo -= valorSaque;
                    System.out.printf("Saque realizado com sucesso no valor de: R$ %.2f\n", valorSaque);
                    System.out.println();
                    System.out.printf("Seu novo saldo é de R$ %.2f\n", saldo);
                }
                break;

            case 2:
                    System.out.println("Qual valor deseja depositar ?");
                    double valorDepositar = sc.nextDouble();

                    while (valorDepositar <= 0){
                        System.out.println("Não é possível depositar esse valor, tente novamente: ");
                        valorDepositar = sc.nextDouble();
                    }

                    saldo += valorDepositar;
                    System.out.printf("Deposito realizado com sucesso, seu novo saldo é de R$ %.2f\n", saldo);
                    break;

            case 3:
                System.out.printf("Seu saldo atual é de R$ %.2f\n", saldo);
                break;
                }

        sc.close();
    }
}