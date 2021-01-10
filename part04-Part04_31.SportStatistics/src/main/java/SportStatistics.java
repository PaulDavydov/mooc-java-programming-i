
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("File:");
        String file = scan.nextLine();
        System.out.println("Team:");
        String input = scan.nextLine();
        int count = 0;
        int win = 0;
        int loss = 0;
        try (Scanner scanner = new Scanner(Paths.get(file))) {

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] parts = line.split(",");
                String name1 = parts[0];
                String name2 = parts[1];
                int num1 = Integer.valueOf(parts[2]);
                int num2 = Integer.valueOf(parts[3]);
                if (name1.contains(input)) {
                    count++;
                    if (num1 > num2) {
                        win++;
                    }else {
                        loss++;
                    }
                } else if (name2.contains(input)) {
                    count++;
                    if (num1 < num2) {
                        win++;
                    } else {
                        loss++;
                    }
                }
            }
        } catch(Exception e ) {
            System.out.println(e.getMessage());
        }
        System.out.println("Games: " + count);
        System.out.println("Wins: " + win);
        System.out.println("Losses: " + loss);
    }

}
