
import java.util.Scanner;

public class SumOfASequenceTheSequel {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("First number?");
        int numFirst = scanner.nextInt();
        System.out.println("Last number?");
        int numLast = scanner.nextInt();
        
        int sumFactorial = 0;
        for (int i=numFirst; i<=numLast ;i++) {
            sumFactorial += i;
        }
        System.out.println("The sum is: " + sumFactorial);
    }
}
