import java.util.Locale;
import java.util.Scanner;

public class bree1042 {
    public static void main(String[] args) {

            Locale.setDefault(Locale.US);
            Scanner sc = new Scanner(System.in);

            int A, B, C, menor, medio, maior;
            A = sc.nextInt();
            B = sc.nextInt();
            C = sc.nextInt();

            if (A < B && A < C){            // DESCOBRINDO O MENOR
                menor = A;
            }
            else if (B < C){
                menor = B;
            }
            else {
                menor = C;
            }

            if (A > B && A > C){            // DESCOBRINDO O MAIOR
                maior = A;
            }
            else if (B > C){
                maior = B;
            }
            else {
                maior = C;
            }

            // CÁLCULO DO MÉDIO
            medio = (A + B + C) - menor - maior;

            // SAÍDA - ORDEM CRESCENTE.
            System.out.println(menor);
            System.out.println(medio);
            System.out.println(maior);

            System.out.println(); // QUEBRA DE LINHA

            // SAÍDA - ORDEM DE ENTRADA
            System.out.println(A);
            System.out.println(B);
            System.out.println(C);

            sc.close();
        }
    }

