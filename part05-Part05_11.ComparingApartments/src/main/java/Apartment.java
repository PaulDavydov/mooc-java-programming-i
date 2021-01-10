
public class Apartment {

    private int rooms;
    private int squares;
    private int pricePerSquare;

    public Apartment(int rooms, int squares, int pricePerSquare) {
        this.rooms = rooms;
        this.squares = squares;
        this.pricePerSquare = pricePerSquare;
    }
    public boolean largerThan(Apartment compared) {
        if (this.squares > compared.squares ) {
            return true;
        } else {
            return false;
        }
    }
    public int priceDifference(Apartment compared) {
        int abs = (this.squares * this.pricePerSquare) - (compared.squares * compared.pricePerSquare);
        if (abs < 0) {
            return abs *-1;
        }
        return abs;
    }
    public boolean moreExpensiveThan(Apartment compared) {
        if ((this.squares * this.pricePerSquare) > (compared.squares * compared.pricePerSquare)) {
            return true;
        }
        return false;
    }

}
