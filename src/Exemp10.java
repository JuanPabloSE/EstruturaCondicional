import java.util.Locale;
import java.util.Scanner;

public class Exemp10 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        // ENTRADA DE DADOS
        String usuario;
        String senha;
        usuario = sc.nextLine();
        senha = sc.nextLine();

        // ESTRUTURA CONDICIONAL
        if (usuario.equals("admin")) {
            if (senha.equals("1234")) {
                System.out.println("Acesso permitido");
            }
            else {
                System.out.println("Senha incorreta");
            }
        }
        else {
            System.out.println("Usuário incorreto");
        }

        sc.close();
    }
}
