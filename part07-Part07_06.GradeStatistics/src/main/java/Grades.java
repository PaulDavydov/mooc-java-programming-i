import java.lang.reflect.Array;
import java.nio.file.Paths;
import java.util.ArrayList;

public class Grades {
    private ArrayList<Integer> grades;
    private ArrayList<Integer> points;

    public Grades() {
        this.grades = new ArrayList<>();
        this.points = new ArrayList<>();
    }

    public int getNum(int number) {
        return grades.get(number);
    }
    public ArrayList<Integer> returnList() {
        return this.grades;
    }
    public void addNumber(int input) {
        this.grades.add(input);
        this.points.add(addPoints(input));
    }
    public static int addPoints(int input) {
        int grade = 0;
        if (input >= 90 && grade <= 100) {
            grade = 5;
        }else if (input >= 80 && input < 90) {
            grade = 4;
        } else if (input >= 70 && input < 80) {
            grade = 3;
        } else if (input >= 60 && input < 70) {
            grade = 2;
        }else if (input >= 50 && input < 60) {
            grade = 1;
        } else {
            grade = 0;
        }

        return grade;
    }
    public int sum(ArrayList<Integer> grade) {
        int sum = 0;
        for(Integer i : grade) {
            sum += i;
        }
        return sum;
    }
    public int size(ArrayList<Integer> grade) {
        return grade.size();
    }
    public double average() {
        double average = 1.0 * sum(grades) / grades.size();
        return average;
    }
    public ArrayList<Integer> passingG() {
        ArrayList<Integer> passing = new ArrayList<>();
        int sum = 0;
        for(int i = 0; i < grades.size(); i++) {
            if(getNum(i) >= 50) {
                passing.add(getNum(i));
                sum += getNum(i);
            }
        }
        return passing;
    }
    public double averageP () {
        double average = 1.0 * sum(passingG()) / passingG().size();
        return average;
    }
    public double percentile() {
        double p =  100.0 * passingG().size()/ grades.size();
        return p;
    }
    public int numberOfGrades(int grade) {
        int count = 0;
        for(int i : this.points) {
            if(i == grade)
                count++;
        }
        return count;
    }

}
