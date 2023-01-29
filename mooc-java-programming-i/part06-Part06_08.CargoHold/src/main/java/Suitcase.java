
import java.util.ArrayList;


public class Suitcase {

    private ArrayList<Item> items;
    private int maxWeight;

    public Suitcase(int maxWeight) {
        this.items = new ArrayList<>();
        this.maxWeight = maxWeight;
    }

    public void addItem(Item item) {

        if ((this.totalWeight() + item.getWeight()) <= this.maxWeight) {
            this.items.add(item);
        }
    }

    public int totalWeight() {
        int totalWeight = 0;

        for (Item item : items) {
            totalWeight += item.getWeight();
        }

        return totalWeight;
    }
    
    public Item heaviestItem() {
        if (this.items.isEmpty()) {
            return null;
        }
        
        Item item = items.get(0);
        
        for(int i = 1; i < items.size(); i++) {
            if (this.items.get(1).getWeight() > item.getWeight()) {
                item = this.items.get(1);
            }
        }
        
        return item;
    }
    
    public void printItems() {
        for(Item item: items) {
            System.out.println(item);
        }
    }

    @Override
    public String toString() {
        if (this.items.isEmpty()) {
            return "no items (0 kg)";
        }
        return this.items.size() + ((this.items.size() == 1) ? "item" : "items") + " (" + this.totalWeight() + " kg)";
    }
}
