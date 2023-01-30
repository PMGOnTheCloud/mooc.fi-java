
public class Container {
    
    private int actualLiters;
    private int limit;
    
    public Container() {
        this.actualLiters = 0;
        this.limit = 100;
    }

    public int getActualLiters() {
        return actualLiters;
    }
    
    public int contains() {
        return this.actualLiters;
    }
    
    public void add(int amount) {
        if(this.checkIfNotFull(amount) && checkIfPositive(amount)) {
            this.actualLiters += amount;
        } else {
            this.actualLiters = this.limit;
        }
    }
    
    public void remove(int amount) {
        if (this.actualLiters >= amount) {
            this.actualLiters -= amount;
        } else {
            this.actualLiters = 0;
        }
    }
    
    public boolean checkIfNotFull(int amount) {
        return ((this.actualLiters + amount) <= this.limit);
    }
    
    public boolean checkIfPositive(int amount) {
        return (amount >= 0);
    }
    
    @Override
    public String toString() {
        return this.actualLiters + "/" + this.limit;
    }
}
