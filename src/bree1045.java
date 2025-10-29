import java.util.Locale;
import java.util.Scanner;

public class bree1045 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        // ENTRADA DE VALORES
        double l1 = sc.nextDouble();
        double l2 = sc.nextDouble();
        double l3 = sc.nextDouble();

        // LADOS
        double A, B, C;

        // MAIOR LADO - (A)
        if (l1 > l2 && l1 > l3) {
            A = l1;
            if (l2 > l3) {                      // (2) MAIOR LADO
                B = l2;
                C = l3;
            } else {
                B = l3;
                C = l2;
            }
        }

        else if (l2 > l3){
            A = l2;
            if (l1 > l3) {                       // (2) MAIOR LADO
                B = l1;
                C = l3;
            }
            else {
                B = l3;
                C = l1;
            }
        }

        else {
            A = l3;
            if (l1 > l2) {                       // (2) MAIOR LADO
                B = l1;
                C = l2;
            }
            else {
                B = l2;
                C = l1;
            }
        }

        // TRIÂNGULO

        if (A >= B + C){
            System.out.println("NAO FORMA TRIANGULO");
        }
        // TESTE - ÂNGULOS DO TRIÂNGULO
        else if (Math.pow(A, 2) == Math.pow(B, 2) + Math.pow(C, 2)){
            System.out.println("TRIANGULO RETANGULO");
        }
        else if (Math.pow(A, 2) > Math.pow(B, 2) + Math.pow(C, 2)){
            System.out.println("TRIANGULO OBTUSANGULO");
        }
        else {
            System.out.println("TRIANGULO ACUTANGULO");
        }

        // VERIFICAR SE LADOS DO TRIÂNGULO
        if (A == B && B == C){
            System.out.println("TRIANGULO EQUILATERO");
        }

        else if (A == B || A == C || B == C){
            System.out.println("TRIANGULO ISOSCELES");

        }

        sc.close();
    }
}
