
import java.util.ArrayList;

public class GradeRegister {

    private ArrayList<Integer> grades;
    private ArrayList<Integer> pointsToGrade;

    public GradeRegister() {

        this.grades = new ArrayList<>();
        this.pointsToGrade = new ArrayList<>();
    }

    public void addGradeBasedOnPoints(int points) {
        this.pointsToGrade.add(points);
        this.grades.add(pointsToGrade(points));
    }

    public int numberOfGrades(int grade) {
        int count = 0;
        for (int received : this.grades) {
            if (received == grade) {
                count++;
            }
        }

        return count;
    }

    public static int pointsToGrade(int points) {

        int grade = 0;
        if (points < 50) {
            grade = 0;
        } else if (points < 60) {
            grade = 1;
        } else if (points < 70) {
            grade = 2;
        } else if (points < 80) {
            grade = 3;
        } else if (points < 90) {
            grade = 4;
        } else {
            grade = 5;
        }

        return grade;
    }
    public double averageOfGrades() {
        if (grades.isEmpty()) {
            return -1;
        }
        double sum = 0;
        for (Integer i : grades) {
            sum = sum + i;
        }
        double average = 1.0* sum / grades.size();
        return average;
    }
    public double averageOfPoints() {
        if (pointsToGrade.isEmpty()) {
            return -1;
        }
        int sum = 0;
        for (int i = 0; i < pointsToGrade.size(); i++) {
            sum = sum + pointsToGrade.get(i);
        }
        double average = 1.0* sum / pointsToGrade.size();
        return average;
    }
}
