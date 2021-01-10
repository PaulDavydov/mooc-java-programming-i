import java.util.ArrayList;
import java.util.Scanner;

public class UserInterface {
    private Grades grades;
    private Scanner scanner;

    public UserInterface(Grades grades, Scanner scanner) {
        this.grades = grades;
        this.scanner = scanner;
    }
     public void start() {
         System.out.println("hi");
         readInput();
         System.out.println(grades.average());
         System.out.println(passingG());
     }
     public void readInput() {
        while (true) {
            String input = scanner.nextLine();
            int num = Integer.valueOf(input);
            if (num == -1) {
                break;
            }
            if(num < 0 || num > 100) {
                continue;
            }
            grades.addNumber(num);
        }
     }

     public double passingG() {
         ArrayList<Integer> passing = new ArrayList<>();
         int sum = 0;
        for(int i = 0; i < grades.size(); i++) {
            if(grades.getNum(i) > 50) {
                passing.add(i);
                sum += grades.getNum(i);
            }
        }
        double average = 1.0*sum/passing.size();
        return average;
     }
}
