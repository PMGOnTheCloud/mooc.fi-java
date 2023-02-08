
import java.util.Scanner;

public class SquareRootOfSum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNumber = scanner.nextInt();
        int secondNumber = scanner.nextInt();
        
        int sumOfNumbers = firstNumber + secondNumber;
        
        if (!(sumOfNumbers < 0)) {
            System.out.println(Math.sqrt(sumOfNumbers));
        }
    }
}
