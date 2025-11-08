import java.util.Locale;
import java.util.Scanner;

public class bree1067 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int X = sc.nextInt();
        int contador = 1;

        while (contador <= X){
            if (contador % 2 != 0){
                System.out.println(contador);
            }
            contador++;
        }

        sc.close();
    }
}
