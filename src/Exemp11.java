import java.util.Locale;
import java.util.Scanner;

public class Exemp11 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        // ENTRADA E VÁRIAVEIS
        String cargo;
        double salario;
        cargo = sc.nextLine();
        salario = sc.nextDouble();

        // ESTRUTURA CONDICIONAL
        if (cargo.equalsIgnoreCase("Gerente")){
            salario += salario * 10 / 100;
        }
        else if (cargo.equalsIgnoreCase("Supervisor")){
            salario += salario * 7 / 100;
        }
        else if (cargo.equalsIgnoreCase("Operador")){
            salario += salario * 5 / 100;
        }
        else if (cargo.equalsIgnoreCase("Outros")){
            salario += salario * 3 / 100;
        }
        else {
            System.out.println("Cargo inválido");
        }

        System.out.printf("Novo salario: R$ %.2f\n", salario); // SAÍDA DE DADOS DO RESULTADO

        sc.close();
    }
}
