
import java.util.Scanner;

public class SumOfASequenceTheSequel {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        System.out.println("First number?");
        int f = Integer.valueOf(scanner.nextLine());
        System.out.println("Last number?");
        int l = Integer.valueOf(scanner.nextLine());
        while (f <= l) {
            sum += f;
            f++;
        }
        System.out.println("The sum is " + sum);
    }
}
