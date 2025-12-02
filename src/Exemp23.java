import java.util.Scanner;
import java.util.Locale;

public class Exemp23 {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        for (int i = 1; i <= 10; i++){
            System.out.println(N + " x " + i + " = " + N * i);
        }

        sc.close();
    }
}
