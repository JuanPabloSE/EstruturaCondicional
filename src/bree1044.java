import java.util.Locale;
import java.util.Scanner;

public class bree1044 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt(); // LENDO VALOR A
        int B = sc.nextInt(); // LENDO VALOR B

        if (A % B == 0 || B % A == 0){
            System.out.println("Sao Multiplos");
        }
        else {
            System.out.println("Nao sao Multiplos");
        }

        sc.close();

    }
}
