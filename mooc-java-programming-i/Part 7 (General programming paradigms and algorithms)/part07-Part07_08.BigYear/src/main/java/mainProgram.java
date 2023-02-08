
import java.util.Scanner;

public class mainProgram {

    public static void main(String[] args) {
        // NB! Do not create other scanner objects than the one below
        // if and when you create other classes, pass the scanner to them
        // as a parameter

        Scanner scanner = new Scanner(System.in);
        
        Database birdDatabase = new Database();
        
        while(true) {
            System.out.println("?");
            String command = scanner.nextLine();
                    
            if (command.equals("Quit")) {
                break;
            }
            
            if (command.equals("Add")) {
                
                System.out.println("Name: ");
                String name = scanner.nextLine();
                System.out.println("Name in Latin: ");
                String latinName = scanner.nextLine();
                
                Bird bird = new Bird(name, latinName);
                birdDatabase.addBird(bird);
                
            } else if (command.equals("Observation")) {
                
                System.out.println("Bird?");
                String bird = scanner.nextLine();
                
                birdDatabase.observation(bird);
                
            } else if (command.equals("All")) {
                
                System.out.println(birdDatabase);                
            } else if (command.equals("One")) {
                
                System.out.println("Bird?");
                String bird = scanner.nextLine();
                
                birdDatabase.searchOne(bird);
            }
            
        }
    }

}
