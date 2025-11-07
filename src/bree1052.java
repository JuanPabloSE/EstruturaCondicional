import java.util.Locale;
import java.util.Scanner;

public class bree1052 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        String mes;

        switch (x) {
            case 1:
                mes = "January";
                System.out.println(mes);
                break;
            case 2:
                mes = "February";
                System.out.println(mes);
                break;
            case 3:
                mes = "March";
                System.out.println(mes);
                break;
            case 4:
                mes = "April";
                System.out.println(mes);
                break;
            case 5:
                mes = "May";
                System.out.println(mes);
                break;
            case 6:
                mes = "June";
                System.out.println(mes);
                break;
            case 7:
                mes = "July";
                System.out.println(mes);
                break;
            case 8:
                mes = "August";
                System.out.println(mes);
                break;
            case 9:
                mes = "September";
                System.out.println(mes);
                break;
            case 10:
                mes = "October";
                System.out.println(mes);
                break;
            case 11:
                mes = "November";
                System.out.println(mes);
                break;
            case 12:
                mes = "December";
                System.out.println(mes);
                break;
        }



        sc.close();
    }
}
