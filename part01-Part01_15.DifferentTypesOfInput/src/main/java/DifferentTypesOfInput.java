
import java.util.Scanner;

public class DifferentTypesOfInput {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Give a string:");
        String line = scan.nextLine();
        System.out.println("Give an integer:");
        int integer = Integer.valueOf(scan.nextLine());
        System.out.println("Give a double:");
        double d = Double.valueOf(scan.nextLine());
        System.out.println("Give a boolean:");
        boolean b = Boolean.valueOf(scan.nextLine());
        System.out.println("You gave the string " + line);
        System.out.println("You gave the integer " + integer);
        System.out.println("You gave the double " + d);
        System.out.println("You gave the boolean " + b);

    }
}
