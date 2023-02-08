public class PaymentCard {
    private double balance;

    public PaymentCard(double number) {
        this.balance = number;
    }
    
    public void eatAffordably() {
        
        double price = 2.6;
        
        if (this.balance >= price) {
            this.balance = this.balance - price;
        }
    }
    
    public void eatHeartily() {
        
        double price = 4.6;
                
        if (this.balance >= price) {
            this.balance = this.balance - price;
        }
    }
    
    public void addMoney(double number) {
        
        if (number >= 0) {
            double preSumBalance = this.balance + number;
            this.balance = (preSumBalance < 150) ? preSumBalance : 150;
        }
    }
    
    @Override
    public String toString() {
        return "The card has a balance of " + this.balance + " euros";
    }
}
