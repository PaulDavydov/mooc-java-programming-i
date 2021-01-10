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
         System.out.println("Enter point totals, -1 stops:");
         readInput();
         System.out.println("Point average (all): " +grades.average());
         System.out.println("Point average (passing): " + grades.averageP());
         System.out.println("Pass percentage: " + grades.percentile());
         printGradeDistri();
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
     public static void printsStars(int stars) {
        while (stars > 0) {
            System.out.print("*");
            stars--;
        }
    }
    public void printGradeDistri() {
        int grade = 5;
        System.out.println("Grade distribution:");
        while (grade >= 0) {
            int stars = grades.numberOfGrades(grade);
            System.out.print(grade + ": ");
            printsStars(stars);
            System.out.println("");
            grade = grade -1;
        }
    }
}
