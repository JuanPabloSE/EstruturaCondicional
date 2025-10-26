import java.util.Locale;
import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        // VARIÁVEIS
        double nota1, nota2, resultadoFinal;

        // ENTRADA DE DADOS
        nota1 = sc.nextDouble();
        nota2 = sc.nextDouble();

        // CÁLCULO
        resultadoFinal = nota1 + nota2;
        System.out.printf("NOTA FINAL = %.1f\n", resultadoFinal);

        // ESTRUTURA CONDICIONAL

        if (resultadoFinal < 60.00) {
            System.out.println("REPROVADO");
        }

        sc.close();
    }
}
