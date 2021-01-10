import java.util.ArrayList;

public class TodoList {
    private ArrayList<String> list;
    public TodoList() {
        list = new ArrayList<>();
    }
    public void add (String task) {
        this.list.add(task);
    }
    public void print() {
        int count = 1;
        for (String i : list) {
            System.out.println(count + ": " +i);
            count++;
        }
    }
    public void remove (int number) {
        this.list.remove(number-1);
    }
}
