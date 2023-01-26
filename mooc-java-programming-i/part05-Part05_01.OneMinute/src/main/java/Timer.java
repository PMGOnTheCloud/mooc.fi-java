public class Timer {
    private ClockHand hundrethsOfASecond;
    private ClockHand seconds;
    
    public Timer() {
        this.hundrethsOfASecond = new ClockHand(100);
        this.seconds = new ClockHand(60);
    }
    
    public void advance() {
        
        if (this.hundrethsOfASecond.value() == 99) {
            this.hundrethsOfASecond.advance();
            this.seconds.advance();
        } else {
            this.hundrethsOfASecond.advance();
        }
        
    }
    
    @Override
    public String toString() {
        return this.seconds + ":" + this.hundrethsOfASecond;
    }
}
