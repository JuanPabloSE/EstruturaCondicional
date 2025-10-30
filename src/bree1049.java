import java.util.Locale;
import java.util.Scanner;

public class bree1049 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        // Entrada de Dados
        String p1 = sc.nextLine();
        String p2 = sc.nextLine();
        String p3 = sc.nextLine();

        // Estrutura Condicional - VERTEBRADO

        if (p1.equals("vertebrado")) {  // IF PRINCIPAL (VERTEBRADO)
            if (p2.equals("ave")) {
                if (p3.equals("carnivoro")) {
                    System.out.println("aguia");
                }
                else {
                    System.out.println("pomba");
                }
            }
        else if (p2.equals("mamifero")) {
                if (p3.equals("onivoro")) {
                    System.out.println("homem");
                }
                else {
                    System.out.println("vaca");
                }
            }
        }

        // Estrutura Condicional - INVERTEBRADO
        if (p1.equals("invertebrado")) {
            if (p2.equals("inseto")){
                if (p3.equals("hematofago")) {
                    System.out.println("pulga");
                }
                else {
                    System.out.println("lagarta");
                }
            }
            else if (p2.equals("anelideo")){
                if (p3.equals("hematofago")) {
                    System.out.println("sanguessuga");
                }
                else {
                    System.out.println("minhoca");
                }
            }
        }





        sc.close();
    }
}
