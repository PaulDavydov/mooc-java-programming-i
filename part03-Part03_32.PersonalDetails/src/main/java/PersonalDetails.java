
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int count = 0;
        int longest = 0;
        String name = null;
        while (true) {
            String input = scanner.nextLine();
            if (input.isBlank()) {
                break;
            }
            String[] p = input.split(",");
            if (longest < p[0].length()) {
                longest = p[0].length();
                name = p[0];
            }
            sum += Integer.valueOf(p[1]);
            count++;
        }

        if (count > 0) {
            double average = 1.0 * sum/count;
            System.out.println("Longest name: " + name);
            System.out.println("Average of the birth years: "+ average);
        }
    }
}
