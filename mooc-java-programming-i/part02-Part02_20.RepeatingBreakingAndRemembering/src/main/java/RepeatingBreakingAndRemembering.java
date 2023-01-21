
import java.util.Scanner;

public class RepeatingBreakingAndRemembering {

    public static void main(String[] args) {
        
        // This exercise is worth five exercise points, and it is 
        // gradually extended part by part.
        
        // If you want, you can send this exercise to the server
        // when it's just partially done. In that case the server will complain about 
        // the parts you haven't done, but you'll get points for the finished parts.
        
        Scanner scanner = new Scanner(System.in);
        
        int sumOfTheNumbers = 0;
        int numberOfNumbers = 0;
        int numberOfOdd = 0;
        int numberOfEven = 0;
        
        System.out.println("Give numbers:");
        while(true) {
            int number = scanner.nextInt();
            
            if (number == -1) {
                break;
            }
            
            if (number % 2 == 0) {
                numberOfEven++;
            } else {
                numberOfOdd++;
            }
            
            sumOfTheNumbers += number;
            numberOfNumbers++;
        }
        
        System.out.println("Thx bye!");
        System.out.println("Sum: " + sumOfTheNumbers);
        System.out.println("Numbers: " + numberOfNumbers);
        System.out.println("Average: " + ((double) sumOfTheNumbers / numberOfNumbers ));
        System.out.println("Even: " + numberOfEven);
        System.out.println("Odd: " + numberOfOdd);

    }
}
