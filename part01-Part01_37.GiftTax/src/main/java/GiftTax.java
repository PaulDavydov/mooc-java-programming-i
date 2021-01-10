
import java.util.Scanner;

public class GiftTax {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Value of the gift?");
        int g = Integer.valueOf(scan.nextLine());
        if (g >= 5000 && g < 25000) {
            double tax =(100 + (g-5000) * 0.08);
            System.out.println("Tax: " + tax);
        } else if (g>= 25000 && g < 55000) {
            double tax =(1700 + (g-25000) * 0.10);
            System.out.println("Tax: " + tax);
        } else if (g >= 55000 && g < 200000) {
            double tax =(4700 + (g-55000) * 0.12);
            System.out.println("Tax: " + tax);
        } else if (g >= 200000 && g < 1000000) {
            double tax =(22100 + (g-200000) * 0.15);
            System.out.println("Tax: " + tax);
        } else if (g >= 1000000) {
            double tax =(142100 + (g-1000000) * 0.17);
            System.out.println("Tax: " + tax);
        } else {
            System.out.println("No tax!");
        }


    }
}
