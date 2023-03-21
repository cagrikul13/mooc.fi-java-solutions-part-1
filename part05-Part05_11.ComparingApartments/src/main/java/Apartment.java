
public class Apartment {

    private int rooms;
    private int squares;
    private int princePerSquare;

    public Apartment(int rooms, int squares, int pricePerSquare) {
        this.rooms = rooms;
        this.squares = squares;
        this.princePerSquare = pricePerSquare;
    }

    public int getRooms() {
        return rooms;
    }

    public int getSquares() {
        return squares;
    }

    public int getPrincePerSquare() {
        return princePerSquare;
    }

    public boolean largerThan(Apartment compared) {
        return this.squares > compared.getSquares();
    }

    public int priceDifference(Apartment compared) {
        int priceDifference = (this.squares * this.princePerSquare) - (compared.getSquares() * compared.getPrincePerSquare());
        if (priceDifference < 0) {
            return priceDifference * -1;
        }
        return priceDifference;
    }

    public boolean moreExpensiveThan(Apartment compared) {
        int price = this.squares * this.princePerSquare;
        int comparedPrice = compared.getSquares() * compared.getPrincePerSquare();

        return price > comparedPrice;
    }
}
