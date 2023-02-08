
import java.util.Scanner;

public class AVClub {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while(true) {
            
            String stringInput = scanner.nextLine();
            
            if (stringInput.equals("")) {
                break;
            }
            
            for(String stringPart:stringInput.split(" ")) {
                if(stringPart.contains("av")) {
                    System.out.println(stringPart);
                }
            }
        }
    }
}
