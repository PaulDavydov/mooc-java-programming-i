import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        // implement here the program that allows the user to enter 
        // book information and to examine them
        Scanner scanner = new Scanner(System.in);
        ArrayList<Book> books = new ArrayList<>();

        while(true) {
            System.out.println("Title:");
            String n = scanner.nextLine();
            if (n.isEmpty()) {
                break;
            }
            System.out.println("Pages:");
            int pagesNum = Integer.valueOf(scanner.nextLine());
            System.out.println("Publication year:");
            int pubYear = Integer.valueOf(scanner.nextLine());

            books.add(new Book(n, pagesNum,pubYear));
        }
        System.out.println("What information will be printed?");
        String input = scanner.nextLine();
        for (Book i: books) {
            if (input.equals("everything")) {
                System.out.println(i);
            } else if (input.equals("name")) {
                System.out.println(i.getName());
            }
        }
    }
}
