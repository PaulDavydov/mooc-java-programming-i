import java.nio.file.Paths;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class UserInterface {
    private Scanner scanner;
    public UserInterface(Scanner scanner) {
        this.scanner = scanner;
    }
    public void start() {
        System.out.println("File to read: ");
        String file = scanner.nextLine();
        ArrayList<CookBook> recipes = readFile(file);
        System.out.println("Commands:\n" + "list - lists the recipes\n" + "stop - stops the program");
        System.out.println("");
        while (true) {
            System.out.println("Enter command: ");
            String input = scanner.nextLine();
            if (input.equals("stop")) {
                break;
            }
            if(input.equals("list")) {
                System.out.println(recipes);
                continue;
            }
            
        }
    }
    public void specificRecipe(String input) {

    }
    public static ArrayList<CookBook> readFile(String file) {
        //Scanner scanner = new Scanner(System.in);
        ArrayList<CookBook> recipes = new ArrayList<>();
        ArrayList<String> recipeParts = new ArrayList<>();
        String recipeName;
        int cookTime;
        try (Scanner scan = new Scanner(Paths.get(file))) {
            while (scan.hasNextLine()) {
                String line = scan.nextLine();
                if(!line.isEmpty()) {
                    recipeParts.add(line);
                }  else{
                    recipeName = recipeParts.get(0);
                    cookTime = Integer.valueOf(recipeParts.get(1));
                    recipeParts.remove(0);
                    recipeParts.remove(0);
                    recipes.add(new CookBook(recipeName,cookTime,recipeParts));
                    recipeParts.clear();
                }

            }
            if (!recipeParts.isEmpty()) {
                recipeName = recipeParts.get(0);
                cookTime = Integer.valueOf(recipeParts.get(1));
                recipeParts.remove(0);
                recipeParts.remove(0);
                recipes.add(new CookBook(recipeName,cookTime,recipeParts));
                recipeParts.clear();
            }
        } catch(Exception e) {
            System.out.println(e.getMessage());
        }
        return recipes;
    }
}
