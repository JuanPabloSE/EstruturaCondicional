import java.util.Locale;
import java.util.Scanner;

public class Exemp13 {
    public static void main(String [] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        // ENTRADA E VARIÁVEIS
        double investimento = sc.nextDouble();
        double lucro = sc.nextDouble();
        double percentual;

        percentual = (lucro/investimento) * 100;

        if(lucro < 0.0){
            System.out.println("Prejuízo");
        }

        else if(percentual <= 10.0){
            System.out.printf("Percentual de lucro: %.2f%%\n", percentual);
            System.out.println("Lucro baixo");
        }
        else if(percentual <= 20.0) {
            System.out.printf("Percentual de lucro: %.2f%%\n", percentual);
            System.out.println("Bom lucro");
        }
        else {
            System.out.printf("Percentual de lucro: %.2f%%\n", percentual);
            System.out.println("Excelente desempenho");
        }

        sc.close();
    }
}
