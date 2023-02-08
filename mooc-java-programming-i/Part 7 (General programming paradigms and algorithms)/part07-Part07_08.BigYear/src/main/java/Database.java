
import java.util.ArrayList;

public class Database {
    private ArrayList<Bird> birdCollection;
    
    public Database() {
        this.birdCollection = new ArrayList<>();
    }
    
    public void addBird(Bird bird) {
        if (!this.birdCollection.contains(bird)) {
            this.birdCollection.add(bird);
        }
    }
    
    public void observation(String name) {
        
        boolean spotted = false;
        
        for(Bird bird: birdCollection) {
            if (bird.getName().equals(name)) {
                
                bird.addObservation();
                spotted = true;
                break;
            } 
        }
        
        if (!spotted) {
            System.out.println("Not a bird!");
        }
    }
    
    public void searchOne(String name) {
        for(Bird bird: birdCollection) {
            if (bird.getName().equals(name)) {
                System.out.println(bird);
                break;
            } 
        }
    }
    
    @Override
    public String toString() {
        
        String returnedString = "";
        
        for(Bird bird: this.birdCollection) {
            returnedString = returnedString + bird + "\n";
        }
        
        return returnedString;
    }
}
