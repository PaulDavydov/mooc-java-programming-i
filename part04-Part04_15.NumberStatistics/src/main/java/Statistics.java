
public class Statistics {
    private int count;
    private int sum;
    public Statistics() {
        this.count = 0;
        this.sum = 0;
    }

    public void addNumber(int number) {
        this.sum += number;
        this.count += 1;
    }
    public int sum() {
        return this.sum;
    }
    public int getCount() {
        return this.count;
    }
    public double average() {
        if (count == 0) {
            return 0;
        }
        double avg= 1.0 * this.sum/this.count;
        return avg;
    }

}
