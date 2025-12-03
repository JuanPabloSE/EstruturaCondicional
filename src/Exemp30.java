import java.util.Locale;
import java.util.Scanner;

public class Exemp30 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        String senha = sc.nextLine();

        while(!senha.equals("2002")){
            System.out.println("Senha Invalida");
            senha = sc.nextLine();
        }

        System.out.println("Acesso Permitido");

        sc.close();
    }
}
