public class Container {
    private int c;
    public Container() {
        this.c = 0;
    }
    public int contains() {
        return this.c;
    }
    public void add(int amount) {
        if (amount < 0) {
            amount = 0;
        }
        this.c += amount;
        if (this.c > 100) {
            this.c = 100;
        }
    }
    public void remove(int amount) {
        if(amount < 0) {
            amount = 0;
        }
        this.c -= amount;
        if (this.c < 0) {
            this.c = 0;
        }
    }
    public String toString() {
        return this.c + "/100";
    }
}
