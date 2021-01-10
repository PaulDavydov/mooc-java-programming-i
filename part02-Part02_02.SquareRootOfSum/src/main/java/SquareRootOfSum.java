
import java.util.Scanner;

public class SquareRootOfSum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = Integer.valueOf(scanner.nextLine());
        int n = Integer.valueOf(scanner.nextLine());
        int sum = i + n;
        double sr = Math.sqrt(sum);
        System.out.println(sr);
    }
}
