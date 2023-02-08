
import java.util.Scanner;

public class NumberAndSumOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sumOfNumbers = 0;
        int numOfNumbers = 0;
        while (true) {
            System.out.println("Give a number:");
            int num = scanner.nextInt();

            if (num == 0) {
                break;
            }

            sumOfNumbers += num;
            numOfNumbers++;

        }
        System.out.println("Number of numbers: " + numOfNumbers);
        System.out.println("Sum of the numbers: " + sumOfNumbers);
    }
}
