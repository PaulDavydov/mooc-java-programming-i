
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int oldest = 0;
        String old = null;
        while (true) {
            String input = scanner.nextLine();
            if (input.isBlank()) {
                break;
            }
            String[] pieces = input.split(",");
            if (oldest < Integer.valueOf(pieces[1])) {
                oldest = Integer.valueOf(pieces[1]);
                old = pieces[0];
            }
        }

        System.out.println("Name of the oldest: " + old);

    }
}
