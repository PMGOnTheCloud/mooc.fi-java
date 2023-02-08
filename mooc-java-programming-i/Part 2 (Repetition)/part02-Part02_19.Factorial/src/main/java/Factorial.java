
import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.println("Give a number:");
        int numberToBeFactorial = Math.abs(scanner.nextInt()); 
        
        int factorialResult = 1;
        for (int i = 1; i <= numberToBeFactorial; i++) {
            factorialResult = factorialResult * i;
        }
        
        System.out.println("Factorial: " + factorialResult);
        
    }
}
