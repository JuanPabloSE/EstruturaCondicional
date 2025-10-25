import javax.swing.*;
import java.util.Locale;
import java.util.Scanner;

public class Exemp01 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        // VARIÁVEIS
        String aluno, matricula;
        double nota1, nota2, nota3;
        int peso1 = 5, peso2 = 3, peso3 = 3;
        double resultadoFinal;

        // ENTRADA DE DADOS
        aluno = JOptionPane.showInputDialog("Digite o nome do aluno: ");
        matricula = JOptionPane.showInputDialog("Digite o número do matricula: ");
        System.out.print("Digite a PRIMEIRA NOTA do aluno: ");
        nota1 = sc.nextDouble();
        System.out.print("Digite a SEGUNDA NOTA do aluno: ");
        nota2 = sc.nextDouble();
        System.out.print("Digite a TERCEIRA NOTA do aluno: ");
        nota3 = sc.nextDouble();

        System.out.println(""); // QUEBRA DE LINHA

        // CÁLCULO
        resultadoFinal = (nota1 * peso1 + nota2 * peso2 + nota3 * peso3) / (peso1 + peso2 + peso3);

        // SAÍDA DE DADOS
        System.out.printf("Nome do aluno: %s\n", aluno);
        System.out.printf("Matricula: %s\n", matricula);
        System.out.printf("Primeira NOTA do aluno: %.2f\n", nota1);
        System.out.printf("Segunda NOTA do aluno: %.2f\n", nota2);
        System.out.printf("Terceira do aluno: %.2f\n", nota3);

        System.out.println(""); // QUEBRA DE LINHA

        // CONDIÇÕES
        if (resultadoFinal >= 7){
            System.out.println("___________________________________");
            System.out.println("O aluno foi aprovado!");
            System.out.println("___________________________________");
        }

        else if (resultadoFinal >= 4){
            System.out.println("___________________________________");
            System.out.println("O aluno está na recuperação!");
            System.out.println("___________________________________");

        }

        else {
            System.out.println("___________________________________");
            System.out.println("O aluno foi reprovado!");
            System.out.println("___________________________________");
        }

        sc.close();

    }

}
