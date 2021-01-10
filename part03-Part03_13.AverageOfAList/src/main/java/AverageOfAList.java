
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfAList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();
        while (true) {
            int number = Integer.valueOf(scanner.nextLine());
            if (number == -1) {
                break;
            }
            list.add(number);
        }
        System.out.println("");
        int sum = 0;
        int count = 0;
        for (int i: list ) {
            sum += i;
            count++;
        }
        double average = 1.0* sum/count;
        System.out.println("Average: " + average);
    }
}
