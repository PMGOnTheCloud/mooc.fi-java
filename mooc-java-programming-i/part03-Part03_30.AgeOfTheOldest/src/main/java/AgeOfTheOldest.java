
import java.util.Scanner;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    
        Integer oldest = null;
        
        while(true) {
            String inputString = scanner.nextLine();
            if (inputString.equals("")) {
                break;
            }
            
            Integer ageSplitted = Integer.valueOf(inputString.split(",")[1]);
            
            
            oldest = (oldest == null || oldest < ageSplitted) ? ageSplitted : oldest;
        }
        System.out.println("Age of the oldest: " + oldest);
    }
}
