
import java.util.Scanner;

public class TextUI {

    private Scanner scanner;
    private SimpleDictionary simpleDictionary;

    public TextUI(Scanner scanner, SimpleDictionary simpleDictionary) {
        this.scanner = scanner;
        this.simpleDictionary = simpleDictionary;
    }

    public void start() {

        while (true) {
            System.out.println("Command:");
            String command = this.scanner.nextLine();

            if (command.equals("end")) {
                System.out.println("Bye bye!");
                break;
            } else if (command.equals("add")) {
                System.out.println("Word:");
                String word = scanner.nextLine();
                System.out.println("Translation:");
                String translation = scanner.nextLine();

                simpleDictionary.add(word, translation);
            } else if (command.equals("search")) {
                System.out.println("To be searched:");
                String toBeSearched = scanner.nextLine();
                String translation = this.simpleDictionary.translate(toBeSearched);
                System.out.println(((translation != null) ? translation : "Word " + toBeSearched + " was not found"));

            } else {
                System.out.println("Unknown command");    
            }
        }
    }
}
