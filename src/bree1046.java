import java.util.Locale;
import java.util.Scanner;

public class bree1046 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        // VARIÁVEIS E ENTRADAS DE HORAS
        int horaInicial = sc.nextInt();
        int horaFinal = sc.nextInt();
        int duracao;

        // ESTRUTURA CONDICIONAL
        if (horaInicial < horaFinal) {
            duracao = horaFinal - horaInicial;
        }
        else {
            duracao = 24 - horaInicial + horaFinal;
        }

        System.out.printf("O JOGO DUROU %d HORA(S)\n", duracao);

        sc.close();
    }
}
