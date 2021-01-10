import sun.jvm.hotspot.types.CIntegerField;

import java.sql.SQLOutput;
import java.util.Scanner;

public class UserInterface {
    private TodoList todoList;
    private Scanner scanner;

    public UserInterface(TodoList todoList, Scanner scanner) {
        this.todoList = todoList;
        this.scanner = scanner;
    }
    public void start() {
        while(true) {
            System.out.println("Command:");
            String input = scanner.nextLine();
            if (input.equals("stop")) {
                break;
            }
            if(input.equals("add")) {
                System.out.println("To add:");
                String input1 = scanner.nextLine();
                todoList.add(input1);
                continue;
            }
            if(input.equals("list")) {
                todoList.print();
                continue;
            }
            if(input.equals("remove")) {
                System.out.println("Which one is removed?");
                int i = Integer.valueOf(scanner.nextLine());
                todoList.remove(i);
                continue;
            }
            System.out.println("Unknown command");
        }
    }
}
