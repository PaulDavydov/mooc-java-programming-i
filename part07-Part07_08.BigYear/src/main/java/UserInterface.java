import java.util.ArrayList;
import java.util.Scanner;

public class UserInterface {
    private Scanner scanner;
    private Bird birds;
    public UserInterface(Scanner scanner) {
        this.scanner = scanner;
    }
    public void start() {
        readCommands();
    }

//    public static ArrayList<Bird> addObject() {
//        ArrayList<Bird> birds = new ArrayList<>();
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Name:");
//        String birdName = scanner.nextLine();
//        System.out.println("Name in Latin:");
//        String latinName = scanner.nextLine();
//        birds.add(new Bird(birdName,latinName));
//        return birds;
//    }

    public static void readCommands() {
        ArrayList<Bird> birds = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        while(true) {
            System.out.println("Command?");
            String command = scanner.nextLine();
            if(command.equals("Quit")) {
                break;
            }
            if(command.equals("Add")) {
                System.out.println("Name:");
                String birdName = scanner.nextLine();
                System.out.println("Name in Latin:");
                String latinName = scanner.nextLine();
                birds.add(new Bird(birdName,latinName));
            }
            if(command.equals("Observation")) {
                System.out.println("Bird?");
                String nameInput= scanner.nextLine();
                if(birds.size()==0) {
                    System.out.println("No birds in databse.");
                }
                for (Bird i : birds) {
                    if (i.containsName(nameInput)) {
                        i.increaseObs();
                    }
                }
            }
            if(command.equals("All")) {
                for(Bird i : birds) {
                    System.out.println(i);
                }
            }
            if(command.equals("One")) {
                System.out.println("Bird?");
                String nameInput = scanner.nextLine();
                for (Bird i : birds) {
                    if(i.containsName(nameInput)) {
                        System.out.println(i);
                    }
                }
            }
        }
    }

}
