
import java.util.Scanner;

public class SecondsInADay {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        System.out.println("How many days would you like to convert to seconds?");
        int numOfDays = Integer.valueOf(scanner.nextLine());
        System.out.println(numOfDays * 24 * 60 * 60);
    }
}
