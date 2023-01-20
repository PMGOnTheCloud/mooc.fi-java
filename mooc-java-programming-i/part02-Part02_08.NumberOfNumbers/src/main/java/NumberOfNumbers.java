
import java.util.Scanner;

public class NumberOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numOfNumbers = 0;
        while(true) {
            System.out.println("Give a number:");
            if (scanner.nextInt() == 0) {
                break;
            }
            numOfNumbers++;
        }
        System.out.println("Number of numbers: " + numOfNumbers);
    }
}
