import java.util.Locale;
import java.util.Scanner;

public class Exemp28 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int codigo = sc.nextInt();
        int quantidade = sc.nextInt();

        double valorFinal = 0.0;

        // Seleciona o preço com base no código do produto
        switch (codigo){
            case 1:
                valorFinal = quantidade * 4.00;
                break;
            case 2:
                valorFinal = quantidade * 4.50;
                break;
            case 3:
                valorFinal = quantidade * 5.00;
                break;
            case 4:
                valorFinal = quantidade * 2.00;
                break;
            case 5:
                valorFinal = quantidade * 1.50;
                break;
        }

        // Mostra o valor final formatado
        System.out.printf("%.2f%n", valorFinal);

        sc.close();
    }
}
