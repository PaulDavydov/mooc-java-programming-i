import java.lang.reflect.Array;
import java.util.ArrayList;

public class Grades {
    private ArrayList<Integer> grades;

    public Grades() {
        this.grades = new ArrayList<>();
    }

    public int getNum(int number) {
        return grades.get(number);
    }
    public void addNumber(int input) {
        this.grades.add(input);
    }
    public int sum() {
        int sum = 0;
        for(Integer i : grades) {
            sum += i;
        }
        return sum;
    }
    public int size() {
        return grades.size();
    }
    public double average() {
        double average = 1.0 * sum() / grades.size();
        return average;
    }
}
