import java.util.Locale;
import java.util.Scanner;

public class bree1060 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double valores1 = sc.nextDouble();
        double valores2 = sc.nextDouble();
        double valores3 = sc.nextDouble();
        double valores4 = sc.nextDouble();
        double valores5 = sc.nextDouble();
        double valores6 = sc.nextDouble();
        int positivo = 0;

        if (valores1 >= 0){
            positivo++;}
        if (valores2 >= 0){
            positivo++;
        }
        if (valores3 >= 0){
            positivo++;
        }
        if (valores4 >= 0){
            positivo++;
        }
        if (valores5 >= 0){
            positivo++;
        }
        if (valores6 >= 0){
            positivo++;
        }
        System.out.println(positivo + " valores positivos");


        sc.close();
    }
}
