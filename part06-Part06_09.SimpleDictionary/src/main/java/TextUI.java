import java.util.Scanner;

public class TextUI {
    private SimpleDictionary simpleDictionary;
    private Scanner scanner;
    public TextUI(Scanner scanner, SimpleDictionary simpleDictionary) {
        this.simpleDictionary = simpleDictionary;
        this.scanner = scanner;
    }
    public void start() {

        while(true) {
            System.out.println("Command:");
            String input = scanner.nextLine();
            if (input.equals("end")) {
                System.out.println("Bye bye!");
                break;
            }
            if(input.equals("add")) {
                System.out.println("Word:");
                String input1 = scanner.nextLine();
                simpleDictionary.translate(input1);
                System.out.println("Translation:");
                String input2 = scanner.nextLine();
                simpleDictionary.add(input1,input2);
                continue;
            }
            if(input.equals("search")) {
                System.out.println("To be translated:");
                String i = scanner.nextLine();
                if(simpleDictionary.translate(i) == null){
                    System.out.println("Word " + i + " was not found" );
                    continue;
                }
                System.out.println("Translation:");
                System.out.println(simpleDictionary.translate(i));
                continue;
            }
            System.out.println("Unknown command");
        }
        }

}
