import java.util.Locale;
import java.util.Scanner;

public class bree1047 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        // Entrada de Dados
        int horaInicial = sc.nextInt();
        int minutoInicial = sc.nextInt();
        int horaFinal = sc.nextInt();
        int minutoFinal = sc.nextInt();
        int inicio, fim, duracao;

        // CÁLCULO DURAÇÃO
        inicio = horaInicial * 60 + minutoInicial; // CONVERSÃO PARA MINUTOS
        fim = horaFinal * 60 + minutoFinal; // CONVERSÃO PARA MINUTOS

        // ESTRUTURA CONDICIONAL
        if (inicio < fim) {
            duracao = fim - inicio; // SE TERMINOU NO MESMO DIA.
        }
        else {
            duracao = (24 * 60 - inicio) + fim; // SE PASSOU DA MEIA NOITE
        }

        int duracaoHoras = duracao / 60;
        int duracaoMinutos = duracao % 60;

        System.out.printf("O JOGO DUROU %d HORA(S) E %d MINUTO(S)", duracaoHoras, duracaoMinutos);

        sc.close();
    }
}
