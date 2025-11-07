import java.util.Locale;
import java.util.Scanner;

public class bree1043 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double A, B, C;
        A = sc.nextDouble();
        B = sc.nextDouble();
        C = sc.nextDouble();

        double perimetroTriangulo;
        double areaTrapezio;
        // PARA FORMAR TRIÂNGULO
        if (A + B > C && A + C > B && B + C > A){ // A SOMA DAS 3 MEDIDAS DEVEM SER VERDADEIRAS.
            perimetroTriangulo = A + B + C ;
            System.out.printf("Perimetro = %.1f\n", perimetroTriangulo);
        }

        else {
            areaTrapezio = ((A + B) * C) / 2;
            System.out.printf("Area = %.1f\n", areaTrapezio);
        }

        sc.close();
    }
}
