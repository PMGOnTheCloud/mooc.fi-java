
import java.util.Scanner;

public class NumberOfStrings {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countString = 0;
        
        while(true) {
            String input = scanner.nextLine();
            
            if (input.equals("end")) {
                break;
            }
            
            countString++;
        }
        
        System.out.println(countString);
    }
}
