
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Record> archive = new ArrayList<>();
        
        while(true) {
            
            System.out.println("Identifier? (empty will stop)");
            String identifier = scanner.nextLine();
            
            if (identifier.isEmpty()) {
                break;
            }
            
            System.out.println("Name? (empty will stop)");
            String name = scanner.nextLine();
            
            if (name.isEmpty()) {
                break;
            }
            
            Record record = new Record(identifier, name);
            
            if (!archive.contains(record)) {
                archive.add(record);
            }
            
        }
        
        System.out.println("==Items==");
        archive.forEach((record) -> {
            System.out.println(record.getIdentifier() + ": " + record.getName());
        });

    }
}
