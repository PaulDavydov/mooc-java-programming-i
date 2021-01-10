
import java.util.Scanner;

public class FromWhereToWhere {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Where to?");
        int high = Integer.valueOf(scanner.nextLine());
        System.out.println("Where from?");
        int low = Integer.valueOf(scanner.nextLine());
        while (low <= high) {
            System.out.println(low);
            low++;
        }
    }
}
