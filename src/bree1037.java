import java.util.Locale;
import java.util.Scanner;

public class bree1037 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        // ENTRADA E VARIÁVEL
        double x = sc.nextDouble();

        // ESTRUTURA CONDICIONAL

        if (x >= 0 && x <= 25.0){
            System.out.println("Intervalo [0,25]"); // [0,25] → inclui 0 e 25
        }
        else if (x > 25.0 && x <= 50.0){
            System.out.println("Intervalo (25,50]"); // (25,50] → maior que 25 até 50
        }
        else if (x > 50.0 && x <= 75.0){
            System.out.println("Intervalo (50,75]"); // (50,75] → maior que 50 até 75
        }
        else if (x > 75.0 && x <= 100.0){
            System.out.println("Intervalo (75,100]"); // (75,100] → maior que 75 até 100
        }
        else {
            System.out.println("Fora de intervalo");
        }

        sc.close();
    }
}
