import java.util.Locale;
import java.util.Scanner;

public class Exemp20 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double peso, altura;

        while (true){
            System.out.print("Digite seu peso: ");
             peso = sc.nextDouble();
            System.out.print("Digite sua altura: ");
             altura = sc.nextDouble();

           if (peso > 0 && altura > 0){
               break;
           }
            System.out.println("Valores inválidos! Digite números positivos.");
        }

        double imc = peso / Math.pow(altura, 2.0);
        String classificacao;

         if (imc < 18.5) {
            classificacao = "Abaixo do peso";
        }

        else if (imc <= 24.9) {
            classificacao = "Normal";
        }

        else {
            classificacao = "Sobrepeso";}


        System.out.printf("IMC: %.2f\n", imc);
        System.out.println("Classificação: " + classificacao);

        sc.close();
    }
}
