
import java.util.Scanner;

public class ComparingNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = Integer.valueOf(scanner.nextLine());
        int n = Integer.valueOf(scanner.nextLine());

        if ( i < n ) {
            System.out.println(i + " is smaller than " + n + ".");
        } else if (i > n) {
            System.out.println(i + " is greater than " + n + ".");
        } else {
            System.out.println(i + " is equal to " + n + ".");
        }
    }
}
