import java.util.Locale;
import java.util.Scanner;

public class bree1051 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        // SALÁRIO - LER
        double salario;
        salario = sc.nextDouble();
        double imposto, diferenca;

        // ESTRUTURA CONDICIONAL
        if (salario <= 2000.00) {
            System.out.println("Isento");}

        else if (salario <= 3000.00) {
            diferenca = salario - 2000.00;
            imposto = diferenca * 0.08;
            System.out.printf("R$ %.2f\n", imposto);}

        else if (salario <= 4500.00) {
            diferenca = (salario - 3000.00) * 0.18;
            imposto = 1000 * 0.08 + diferenca;
            System.out.printf("R$ %.2f\n", imposto);}

        else {
            diferenca = (salario - 4500.00) * 0.28;
            imposto = (1000.00 * 0.08) + (1500.00 * 0.18) + diferenca;
            System.out.printf("R$ %.2f\n", imposto);}


        sc.close();
    }
}
