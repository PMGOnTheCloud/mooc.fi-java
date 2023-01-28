
public class PaymentTerminal {

    private double money;  // amount of cash
    private int affordableMeals; // number of sold affordable meals
    private int heartyMeals;  // number of sold hearty meals

    public PaymentTerminal() {
        // register initially has 1000 euros of money
        this.money = 1000;
    }

    public boolean eatAffordably(PaymentCard paymentCard) {
        double costOfMeal = 2.5;

        if (paymentCard.takeMoney(costOfMeal)) {
            this.affordableMeals++;
            return true;
        } else {
            return false;
        }
    }
    
    public boolean eatHeartily(PaymentCard paymentCard) {
        double costOfMeal = 4.3;
        
        if (paymentCard.takeMoney(costOfMeal)) {
            this.heartyMeals++;
            return true;
        } else {
            return false;
        }       
    }
    
    public double eatAffordably(double payment) {
        double costOfMeal = 2.5;
        if (payment >= costOfMeal) {
            this.affordableMeals++;
            this.money = this.money + costOfMeal;
            double change = payment - costOfMeal;
            return change;
        }
        return payment;
    }
    
    public double eatHeartily(double payment) {
        double costOfMeal = 4.3;
        if (payment >= costOfMeal) {
            this.heartyMeals++;
            this.money = this.money + costOfMeal;
            double change = payment - costOfMeal;
            return change;
        }
        return payment;
    }   
    
    public void addMoneyToCard(PaymentCard card, double sum) {
        if (sum >= 0) {
            this.money = this.money + sum;
            card.addMoney(sum);
        }
    }

    @Override
    public String toString() {
        return "money: " + this.money + ", number of sold affordable meals: " + this.affordableMeals + ", number of sold hearty meals: " + this.heartyMeals;
    }
}
