
import java.util.Scanner;

public class AverageOfPositiveNumbers {

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

            if (num > 0) {
                sumOfNumbers += num;
                numOfNumbers++;
            }

        }
        if (numOfNumbers > 0) {
            System.out.println("Average of the numbers: " + ((double) sumOfNumbers/numOfNumbers));
        } else {
            System.out.println("Cannot calculate the average");
        }
    }
}
