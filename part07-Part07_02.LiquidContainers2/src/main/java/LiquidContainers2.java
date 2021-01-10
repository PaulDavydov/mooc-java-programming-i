
import java.util.Scanner;

public class  LiquidContainers2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Container first = new Container();
        Container second = new Container();

        while (true) {
            System.out.println("First: " + first.contains() + "/100");
            System.out.println("Second: " + second.contains() + "/100");
            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }
            String[] splits = input.split(" ");
            String word = splits[0];
            int amount = Integer.valueOf(splits[1]);

            if (input.equals("add "+amount)) {
                first.add(amount);
            }
            if (input.equals("move " + amount)) {
                //first.remove(amount);
                if((first.contains() - amount) < 0) {
                    second.add(first.contains());
                    first.remove(amount);
                } else {
                    first.remove(amount);
                    second.add(amount);
                }
            }
            if(input.equals("remove " + amount)) {
                second.remove(amount);
            }

        }

    }

}
