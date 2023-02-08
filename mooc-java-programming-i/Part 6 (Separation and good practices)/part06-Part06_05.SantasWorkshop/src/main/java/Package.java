
import java.util.ArrayList;

public class Package {
    private ArrayList<Gift> arrayGifts;
    
    public Package() {
        this.arrayGifts = new ArrayList();
    }
    
    public void addGift(Gift gift) {
        this.arrayGifts.add(gift);
    }
    
    public int totalWeight() {
        int totalWeight = 0;
        
        for(Gift gift: arrayGifts) {
            totalWeight += gift.getWeight();
        }
        
        return totalWeight;
    }
}
