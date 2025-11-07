import java.util.Locale;
import java.util.Scanner;

public class bree1050 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int X = sc.nextInt();
        String local;

        switch (X) {
            case 61:
                local = "Brasilia";
                System.out.println(local);
                break;
            case 71:
                local = "Salvador";
                System.out.println(local);
                break;
            case 11:
                local = "Sao Paulo";
                System.out.println(local);
                break;
            case 21:
                local = "Rio de Janeiro";
                System.out.println(local);
                break;
            case 32:
                local = "Juiz de Fora";
                System.out.println(local);
                break;
            case 19:
                local = "Campinas";
                System.out.println(local);
                break;
            case 27:
                local = "Vitoria";
                System.out.println(local);
                break;
            case 31:
                local = "Belo Horizonte";
                System.out.println(local);
                break;
            default:
                System.out.println("DDD nao cadastrado");
                break;
        }

        sc.close();
    }
}
