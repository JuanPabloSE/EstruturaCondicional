import java.util.Locale;
import java.util.Scanner;

public class Exemp31 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double X = sc.nextDouble();
        double Y = sc.nextDouble();
        String quadrante;

        if (X > 0 && Y > 0) {
            quadrante = "Q1";
        }
        else if (X < 0 && Y > 0) {
            quadrante = "Q2";
        }
        else if (X < 0 && Y < 0) {
            quadrante = "Q3";
        }

        else {
            quadrante = "Q4";
        }
        System.out.println(quadrante);

        sc.close();
    }
}
