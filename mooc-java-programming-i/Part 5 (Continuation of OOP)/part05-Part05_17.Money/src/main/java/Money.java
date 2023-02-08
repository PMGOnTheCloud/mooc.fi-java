
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        int total = (euros * 100) + cents;
        
        if (total > 0) {
            euros = total / 100;
            cents = total % 100;
        } else {
            euros = 0;
            cents = 0;
        }       

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return this.euros;
    }

    public int cents() {
        return this.cents;
    }
    
    public Money plus(Money addition) {
        Money money = new Money(this.euros + addition.euros, this.cents + addition.cents);
        
        return money;
    }
    
    public boolean lessThan(Money compared) {
        return ((this.euros * 100 + this.cents) < (compared.euros * 100 + compared.cents));
    }
    
    public Money minus(Money decreaser) {
        
        Money money = new Money(this.euros - decreaser.euros, this.cents - decreaser.cents);
        
        return money;
    }

    @Override
    public String toString() {
        String zero = "";
        if (this.cents < 10) {
            zero = "0";
        }

        return this.euros + "." + zero + this.cents + "e";
    }

}
