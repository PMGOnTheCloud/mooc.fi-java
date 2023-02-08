
import java.util.ArrayList;

public class Stack {
    private ArrayList arrayList;
    
    public Stack() {
        this.arrayList = new ArrayList<String>();
    }
    
    public boolean isEmpty() {
        return this.arrayList.isEmpty();
    }
    
    public void add(String value) {
        this.arrayList.add(value);
    }
    
    public ArrayList<String> values() {
        return this.arrayList;
    }
    
    public String take() {
        String value = (String) this.arrayList.get(this.arrayList.size() - 1);
        this.arrayList.remove(this.arrayList.size() - 1);
        return value;
    }
}
