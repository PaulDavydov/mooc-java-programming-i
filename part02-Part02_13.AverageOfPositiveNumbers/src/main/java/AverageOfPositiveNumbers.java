
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double i = 0;
        double sum = 0;
        while (true) {
            int num = Integer.valueOf(scanner.nextLine());
            if (num == 0) {
                break;
            } else if (num > 0){
                i++;
                sum+=num;
                continue;
            }else {
                continue;
            }
        }
        if (sum == 0) {
            System.out.println("Cannot calculate the average");
        } else {
            double av = sum/i;
            System.out.println(av);
        }

    }
}
