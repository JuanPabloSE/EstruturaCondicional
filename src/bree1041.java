import java.util.Locale;
import java.util.Scanner;

public class bree1041 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        // VARIÁVEIS E ENTRADAS
        double x = sc.nextDouble();
        double y = sc.nextDouble();

        // ESTRUTURA CONDICIONAL - REGRAS QUE DEFINEM O QUADRANTE

        if (x > 0.0 && y > 0.0){
            System.out.println("Q1");
        }
        else if (x < 0.0 && y > 0.0){
            System.out.println("Q2");
        }
        else if (x < 0.0 && y < 0.0){
            System.out.println("Q3");
        }
        else if (x > 0.0 && y < 0.0){
            System.out.println("Q4");
        }
        else if (x == 0.0 && y == 0.0){
            System.out.println("Origem");
        }
        else if (y == 0.0) {
            System.out.println("Eixo X");
        }
        else {
            System.out.println("Eixo Y");
        }


        sc.close();
    }
}
