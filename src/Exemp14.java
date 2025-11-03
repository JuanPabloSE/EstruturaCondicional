import java.util.Locale;
import java.util.Scanner;

public class Exemp14 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        // VARIÁVEIS E ENTRADAS
        int consumo = sc.nextInt();
        String instalacao = sc.next(); // R == Residencial, C == Comercial e I == Industrial
        double valorPagar;

        // INSTALAÇÃO R
       if(instalacao.equalsIgnoreCase("R")) {
           if(consumo <= 500){
               valorPagar = consumo * 0.40;
           }
           else {
               valorPagar = consumo * 0.65;
           }
           System.out.printf("R$ %.2f\n", valorPagar);
        }

       // INSTALAÇÃO C
       if(instalacao.equalsIgnoreCase("C")) {
           if(consumo <= 1000){
               valorPagar = consumo * 0.55;
           }
           else {
               valorPagar = consumo * 0.60;
           }
           System.out.printf("R$ %.2f\n", valorPagar);
       }

       if (instalacao.equalsIgnoreCase("I")) {
           if(consumo <= 5000){
               valorPagar = consumo * 0.55;
           }
           else {
               valorPagar = consumo * 0.60;
           }
           System.out.printf("R$ %.2f\n", valorPagar);
       }


        sc.close();
    }
}
