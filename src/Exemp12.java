import java.util.Locale;
import java.util.Scanner;

public class Exemp12 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        // ENTRADA E VARIÁVEL
        double valorTotal;
        valorTotal = sc.nextDouble();
        int desconto = 0;
        // ESTRUTURA CONDICIONAL

        if (valorTotal <= 100){
            System.out.println("Sem desconto");
        }
        else if (valorTotal <= 500){
            desconto = 5;
            valorTotal -= valorTotal * 5 / 100;
            System.out.printf("Desconto: %d%%\n", desconto);
        }
        else {
            desconto = 10;
            valorTotal -= valorTotal * 10 / 100;
            System.out.printf("Desconto: %d%%\n", desconto);
        }

        System.out.printf("Valor final: R$ %.2f\n", valorTotal);

        sc.close();
    }

}
