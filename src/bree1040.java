import java.util.Locale;
import java.util.Scanner;

public class bree1040 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        // VARIÁVEIS E ENTRADA DE NOTAS
        float n1 = sc.nextFloat();
        float n2 = sc.nextFloat();
        float n3 = sc.nextFloat();
        float n4 = sc.nextFloat();
        // PESOS DA NOTAS
        int p1 = 2;
        int p2 = 3;
        int p3 = 4;
        int p4 = 1;

        // CÁLCULO DE NOTAS
        float media = (n1 * p1 + n2 * p2 + n3 * p3 + n4 * p4) / (p1 + p2 + p3 + p4);
        System.out.printf("Media: %.1f%n", media);
        float mediaFinal;

        // ESTRUTURA CONDICIONAL
        if (media >= 7.0f) {
            System.out.println("Aluno aprovado.");}

        else if (media < 5.0f) {
            System.out.println("Aluno reprovado."); }

        else {
            System.out.println("Aluno em exame.");
            float notaExame = sc.nextFloat();
            System.out.printf("Nota do exame: %.1f%n", notaExame);
            mediaFinal = (notaExame + media) / 2f;

            if (mediaFinal >= 5.0f) {
                System.out.println("Aluno aprovado.");}

            else {
                System.out.printf("Nota do exame: %.1f%n", notaExame);
                System.out.println("Aluno reprovado.");

            }

            System.out.printf("Media final: %.1f%n", mediaFinal);

        }

        sc.close();
    }
}
