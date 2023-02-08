
import java.util.Scanner;

public class LineByLine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while(true) {
            String inputString = scanner.nextLine();
            
            if (inputString.equals("")) {
                break;
            }
            
            String[] splitedString = inputString.split(" ");
            
            for(String stringPart: splitedString) {
                if (!stringPart.equals(" ") && !stringPart.equals("")) {
                    System.out.println(stringPart);
                }
            }
        }
        
    }
}
