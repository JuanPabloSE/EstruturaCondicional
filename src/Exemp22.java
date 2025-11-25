import java.util.Locale;
import java.util.Scanner;

public class Exemp22 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);


        // ENTRADA DE NOTAS
        System.out.print("Digite a primeira nota: ");
        float nota1 = sc.nextFloat();
        System.out.print("Digite a segunda nota: ");
        float nota2 = sc.nextFloat();
        System.out.print("Digite a terceira nota: ");
        float nota3 = sc.nextFloat();
        System.out.print("Digite a quarta nota: ");
        float nota4 = sc.nextFloat();

        // CÁLCULO DA MÉDIA
        float media = (nota1 + nota2 + nota3 + nota4) / 4f;
        String conceito;

        if (media >= 9.0f) {
            conceito = "A";
        }
        else if (media >= 7.0f) {
            conceito = "B";
        }
        else if (media >= 5.0f) {
            conceito = "C";
        }
        else {
            conceito = "D";
        }

        System.out.println(); // QUEBRA DE LINHA

        System.out.printf("Média calculada: %.1f\n", media);
        System.out.printf("Conceito correspondente: %s\n", conceito);
        if (conceito.equals("A") || conceito.equals("B") || conceito.equals("C")) {
            System.out.println("Aprovado");
        }
        else {
            System.out.println("Reprovado");
        }


        sc.close();
    }
}
