

import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Grades grades = new Grades();
        // Write your program here -- consider breaking the program into 
        // multiple classes.
        UserInterface ui = new UserInterface(grades,scanner);
        ui.start();

    }
//    public static void printsStars(int stars) {
//        while (stars > 0) {
//            System.out.print("*");
//            stars--;
//        }
//    }
}
