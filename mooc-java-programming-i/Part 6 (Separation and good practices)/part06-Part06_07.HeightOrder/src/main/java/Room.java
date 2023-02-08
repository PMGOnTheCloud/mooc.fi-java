
import java.util.ArrayList;

public class Room {
    private ArrayList<Person> persons;
    
    public Room() {
        this.persons = new ArrayList<>();
    }
    
    public void add(Person person) {
        this.persons.add(person);
    }
    
    public boolean isEmpty() {
        return (this.persons.isEmpty());
    }
    
    public ArrayList<Person> getPersons() {
        return this.persons;
    }
    
    public Person shortest() {
        if (this.persons.isEmpty()) {
            return null;
        }
        
        Person person = persons.get(0);
        
        for(int i = 1; i < this.persons.size(); i++) {
            if (this.persons.get(i).getHeight() < person.getHeight()) {
                person = this.persons.get(i);
            }
        }
        
        return person;
    }
    
    public Person take() {
        Person person = this.shortest();
        this.persons.remove(person);
        return person;
    }
}
