
import java.util.Scanner;

public class LastWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while(true) {
            String inputString = scanner.nextLine();
            if (inputString.equals("")) {
                break;
            }
            
            String[] splittedString = inputString.split(" ");
            
            System.out.println(splittedString[splittedString.length - 1]);
        }
    }
}
