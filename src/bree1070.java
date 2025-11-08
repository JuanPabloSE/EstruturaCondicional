import java.util.Locale;
import java.util.Scanner;

public class bree1070 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int X = sc.nextInt();
        int contador = 0;

        if (X % 2 == 0){
            X++;
        }

        while (contador < 6) {
            if (X % 2 != 0){
                System.out.println(X);
                X += 2;
            }
            contador++;
        }




        sc.close();
    }
}
