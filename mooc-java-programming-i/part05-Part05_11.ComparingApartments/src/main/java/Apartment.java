
public class Apartment {

    private int rooms;
    private int squares;
    private int princePerSquare;

    public Apartment(int rooms, int squares, int pricePerSquare) {
        this.rooms = rooms;
        this.squares = squares;
        this.princePerSquare = pricePerSquare;
    }
    
    public int getSquares() {
        return this.squares;
    }
    
    public int getPrincePerSquare() {
        return this.princePerSquare;
    }
    
    public int calculateCost() {
        return this.squares * this.princePerSquare;
    }
    
    public boolean largerThan(Apartment compared) {
        return (this.getSquares() > compared.getSquares());
    }
    
    public int priceDifference(Apartment compared) {
        return Math.abs(this.calculateCost() - compared.calculateCost());
    }
    
    public boolean moreExpensiveThan(Apartment compared) {
        return (this.calculateCost() > compared.calculateCost());
    }

}
