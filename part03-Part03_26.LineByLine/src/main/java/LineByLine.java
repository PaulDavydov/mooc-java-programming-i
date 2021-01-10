
import java.util.Scanner;

public class LineByLine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true ){
            String words = scanner.nextLine();
            if (words.isBlank()) {
                return;
            }
            String[] pieces = words.split(" ");
            for (String i: pieces) {
                System.out.println(i);
            }
        }

    }
}
