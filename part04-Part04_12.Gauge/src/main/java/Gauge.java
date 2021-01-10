public class Gauge {
    private int value;

    public Gauge() {
        this.value = 0;
    }

    public void increase() {
        this.value +=1;
        if (this.value > 5) {
            this.value = 5;
        }
    }
    public void decrease() {
        this.value -=1;
        if(this.value < 0) {
            this.value = 0;
        }
    }
    public int value() {
        return this.value;
    }
    public boolean full() {
        if(this.value == 5) {
            return true;
        }
        return false;
    }
}
