public class Timer {
    private ClockHand hSec;
    private ClockHand sec;
    public Timer() {
        this.hSec = new ClockHand(100);
        this.sec = new ClockHand(60);
    }
    public void advance() {
        this.hSec.advance();
        if (this.hSec.value() == 0) {
            this.sec.advance();
        }
    }
    public String toString() {
        return sec + ":" + hSec;
    }

}
