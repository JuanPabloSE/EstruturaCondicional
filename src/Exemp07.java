import java.util.Locale;
import java.util.Scanner;

public class Exemp07 {

    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        // VARIÁVEIS E ENTRADA DE DADOS
        float nota;
        nota = sc.nextFloat();

        // ESTRURA CONDICIONAL

        if (nota >= 0.0f && nota <=4.9){
            System.out.println("REPROVADO");
        }
        else if(nota >= 5.0f && nota <=6.9){
            System.out.println("RECUPERAÇÃO");
        }
        else if(nota >= 7.0f && nota <=10.0f){
            System.out.println("APROVADO");
        }
        else {
            System.out.println("NOTA INVÁLIDA");
        }


        sc.close();
    }
}
