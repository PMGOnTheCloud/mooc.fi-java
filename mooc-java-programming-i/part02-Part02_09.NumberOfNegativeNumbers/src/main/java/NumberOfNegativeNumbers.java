
import java.util.Scanner;

public class NumberOfNegativeNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numOfNegativeNumbers = 0;
        while (true) {
            System.out.println("Give a number:");
            int num = scanner.nextInt();
            
            if (num == 0) {
                break;
            }
            
            if (num < 0) {
                numOfNegativeNumbers++;
            }
        }
        System.out.println("Number of negative numbers: " + numOfNegativeNumbers);
    }
}
