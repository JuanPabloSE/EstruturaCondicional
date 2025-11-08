import java.util.Locale;
import java.util.Scanner;

public class bree1066 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int valor1 = sc.nextInt();
        int valor2 = sc.nextInt();
        int valor3 = sc.nextInt();
        int valor4 = sc.nextInt();
        int valor5 = sc.nextInt();
        int pares = 0;
        int impares = 0;
        int positivos = 0;
        int negativos = 0;

        // PARES OU IMPARES
        if (valor1 % 2 == 0){
            pares++;}
        else {
            impares++;
        }

        if (valor2 % 2 == 0){
            pares++;
        }
        else {
            impares++;
        }
        if (valor3 % 2 == 0){
            pares++;
        }
        else {
            impares++;
        }
        if (valor4 % 2 == 0){
            pares++;
        }
        else {
            impares++;
        }
        if (valor5 % 2 == 0){
            pares++;
        }
        else {
            impares++;
        }

        // POSITIVOS OU NEGATIVOS
        if (valor1 > 0){
            positivos++;
        }
        else if (valor1 < 0 && valor1 != 0) {
            negativos++;
        }
        if (valor2 > 0){
            positivos++;
        }
        else if (valor2 < 0 && valor2 != 0) {
            negativos++;
        }
        if (valor3 > 0){
            positivos++;
        }
        else if (valor3 < 0 && valor3 != 0) {
            negativos++;
        }
        if (valor4 > 0){
            positivos++;
        }
        else if (valor4 < 0 && valor4 != 0) {
            negativos++;
        }
        if (valor5 > 0){
            positivos++;
        }
        else if (valor5 < 0 && valor5 != 0) {
            negativos++;
        }

        System.out.println(pares + " valor(es) par(es)");
        System.out.println(impares + " valor(es) impar(es)");
        System.out.println(positivos + " valor(es) positivo(s)");
        System.out.println(negativos + " valor(es) negativo(s)");

        sc.close();
    }
}
