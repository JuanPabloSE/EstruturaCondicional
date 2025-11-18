import java.util.Locale;
import java.util.Scanner;

public class Exemp20 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite seu peso: ");
        double peso = sc.nextDouble();
        System.out.print("Digite sua altura: ");
        double altura = sc.nextDouble();

        while (peso <= 0){
            System.out.println("Por favor, informe um peso válido");

            System.out.print("Digite seu peso: ");
            peso = sc.nextDouble();}

        System.out.println(); // QUEBRA DE LINHA

        while (altura <= 0){
            System.out.println("Por favor, informe uma altura válida");

            System.out.print("Digite sua altura: ");
            altura = sc.nextDouble();}

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
