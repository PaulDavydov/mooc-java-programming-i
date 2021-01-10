
import java.util.Scanner;

public class OnlyPositives {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Give a number:");
            int i = Integer.valueOf(scanner.nextLine());
            if (i == 0) {
                break;
            } else if ( i < 0) {
                System.out.println("Unsuitable number");
            }else {
                int result = i * i;
                System.out.println(result);
            }
        }
    }
}
